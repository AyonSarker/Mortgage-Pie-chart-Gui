package edu.citytech.cst.client.sample.Property;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    //--module-path "D:\Developer\javafx-sdk-19\lib" --add-modules javafx.controls,javafx.fxml

public class PropertyMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        String fileName= "/fxml/PropertySummaryView.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fileName));
        Scene scene = new Scene(root);
        stage.setTitle("Query state by Sarker Ayon");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}
