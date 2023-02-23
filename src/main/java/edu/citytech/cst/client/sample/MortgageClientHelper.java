package edu.citytech.cst.client.sample;

import com.jbbwebsolutions.http.utility.JSONGet;
import  edu.citytech.cst.client.sample.model.MortgageInformation;
import edu.citytech.cst.client.sample.model.Summary;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import java.text.DecimalFormat;

public class MortgageClientHelper {

    public static String format(double amount){
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return formatter.format(amount);
    }

    public static String format(double amount,String format){
        DecimalFormat formatter = new DecimalFormat(format);
        return formatter.format(amount);
    }
    static String drawPie(PieChart pieChart, final String urlTemplate,
                          String year, String loanAmount, String interest){

        String newUrl = urlTemplate.replace("$loanAmount", loanAmount)
                .replace("$year", year)
                .replace("$interest", interest);

        MortgageInformation  mortgageInformation = JSONGet.submitGet(newUrl, MortgageInformation.class);
        Summary summary = mortgageInformation.getMortgageSummary();

        var p1 = new PieChart.Data("Interest", summary.getCumulativeInterest());
        var p2 = new PieChart.Data("Principal", summary.getTotalPrincipal());
        var p3 = new PieChart.Data("Repairs", summary.getCumulativeInterest() * .07);


        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(p1,p2,p3);
        pieChart.setData(pieChartData);


        return newUrl;
    }



}
