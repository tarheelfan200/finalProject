package com.example.classwork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gui.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setHeight(400);
            stage.setWidth(450);
            stage.setX(0);
            stage.setY(0);

            stage.setTitle("Clothing Inventory");
            stage.show();
        } catch (Exception e) {
            System.out.println("try again bucko");;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}