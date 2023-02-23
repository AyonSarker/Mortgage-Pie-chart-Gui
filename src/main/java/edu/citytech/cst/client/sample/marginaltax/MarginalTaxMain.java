package edu.citytech.cst.client.sample.marginaltax;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MarginalTaxMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);

    }

    /*

     */
    @Override
    public void start(Stage stage) throws Exception {
        String fileName= "/fxml/MarginalTaxView.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fileName));
        Scene scene = new Scene(root);
        stage.setTitle("Marginal Tax by Sarker Ayon");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}
