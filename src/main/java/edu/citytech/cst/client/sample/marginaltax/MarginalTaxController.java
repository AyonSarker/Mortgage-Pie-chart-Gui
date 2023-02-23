package edu.citytech.cst.client.sample.marginaltax;

import edu.citytech.cst.client.sample.marginaltax.model.Code;
import edu.citytech.cst.client.sample.marginaltax.model.MarginalTax;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

import static edu.citytech.cst.client.sample.MortgageClientHelper.format;

public class MarginalTaxController {

    @FXML
    private Button btnCalculate;


    @FXML
    private TextField txtSalary;

    @FXML
    private PieChart pieMarginalTaxRate;

    @FXML
    private Label lblMessage;

    @FXML
    void clickCalculate(ActionEvent event) {


        Code code = source == null?  Code.getCode("SM"): Code.getCode(source.getText());
        float salary= Float.parseFloat(txtSalary.getText());

        MarginalTax results=MarginalTaxService.getTaxSummary(code,salary);
        var taxList= results.getTaxList();

        List<PieChart.Data> pieList = new ArrayList<>();

        for ( var row:taxList) {
            var fTaxPaid =format(row.getTaxPaid());
            var p1 = new PieChart.Data("rule: " + format(row.getNo(),"##") + " ) " + fTaxPaid
                    ,row.getTaxPaid());
            pieList.add(p1);
            System.out.println(p1);

        }

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(pieList);
        pieMarginalTaxRate.setData(pieChartData);

        lblMessage.setText("Tax paid: "  + format(results.getTaxPaid())  +
                " the gross amount entered : " +  format(Float.parseFloat(txtSalary.getText())));



    }

    RadioButton source =null;

    @FXML
    void codeSelectionChange(ActionEvent event) {
        var source =(RadioButton)event.getSource();
    }

}
