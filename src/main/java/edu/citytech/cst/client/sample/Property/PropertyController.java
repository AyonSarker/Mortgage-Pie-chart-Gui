package edu.citytech.cst.client.sample.Property;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.client.sample.Property.model.PropertySummary;
import edu.citytech.cst.client.sample.model.PropertySummaryResult;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

;

public class PropertyController implements Initializable {

    @FXML
    private TableView<PropertySummary> tvPropertySummary;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String sURL = "http://127.0.0.1:9215/jpa/propertySummary";
        PropertySummaryResult o = JSONGet.submitGet(sURL, PropertySummaryResult.class);
        var  oResult = tvPropertySummary.getItems();
        oResult.addAll(o.getProperties());

    }
}
