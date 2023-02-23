package edu.citytech.cst.client.sample;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.client.sample.model.MortgageInformation;
import edu.citytech.cst.client.sample.model.Summary;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

public class MortgagePieChart extends Application {

    /*
       --module-path D:\Developer\javafx-sdk-19\lib --add-modules javafx.controls,javafx.fxml

     */
    final String URL = "http://localhost:9215/mortgage?loanAmount=$loanAmount&year=$year&interest=$interest";


    @Override
    public void start(Stage primaryStage) throws Exception {


        String sURL = "http://localhost:9215/mortgage?loanAmount=1000000&year=30&interest=.06";
        MortgageInformation mortgageInformation = JSONGet.submitGet(sURL, MortgageInformation.class);
        Summary summary = mortgageInformation.getMortgageSummary();

        Label lblTitle = new Label("URL" + sURL);
        HBox hbox =  new HBox();


        Label label = new Label("Enter years: ");
        TextField tfYears = new TextField("30");
        tfYears.setMaxWidth(35);
        tfYears.setAlignment(Pos.CENTER_RIGHT);


        Label labelPrincipal = new Label("principal: ");
        labelPrincipal.setMinWidth(65);
        labelPrincipal.setAlignment(Pos.CENTER_RIGHT);
        TextField tfPrincipal = new TextField();
        tfPrincipal.setMaxWidth(100);
        tfPrincipal.setAlignment(Pos.CENTER_RIGHT);
        tfPrincipal.setText("1000000");


        Label labelInterest = new Label("Interest: ");
        labelInterest.setMinWidth(65);
        labelInterest.setAlignment(Pos.CENTER_RIGHT);
        TextField tfInterest = new TextField();
        tfInterest.setMaxWidth(35);
        tfInterest.setAlignment(Pos.CENTER_RIGHT);
        tfInterest.setText(".06");

        Button btnProcess = new Button("Process");



        hbox.getChildren().add(label);
        hbox.getChildren().add(tfYears);

        hbox.getChildren().add(labelPrincipal);
        hbox.getChildren().add(tfPrincipal);

        hbox.getChildren().add(labelInterest);
        hbox.getChildren().add(tfInterest);

        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(btnProcess);

        primaryStage.setTitle("2nd JavaFX App: Sarker, Ayon " + new Date());

        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Interest", summary.getCumulativeInterest());
        PieChart.Data slice2 = new PieChart.Data("Principal"  , summary.getTotalPrincipal());
        PieChart.Data slice3 = new PieChart.Data("Repairs" , summary.getTotalPrincipal() *.12);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

        VBox vbox = new VBox(lblTitle);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().add(pieChart);
        vbox.getChildren().add(hbox);


        Scene scene = new Scene(vbox, 580, 580);

        primaryStage.setScene(scene);
        primaryStage.setHeight(585);
        primaryStage.setWidth(585);
        primaryStage.setResizable(false);

        btnProcess.setOnAction( e -> {
            System.out.println(e + " clicker event");
            String newUrl = MortgageClientHelper.drawPie(pieChart, URL, tfYears.getText(),
                    tfPrincipal.getText(),tfInterest.getText());

            lblTitle.setText(newUrl);


        });



        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}