package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Secretaire.fxml"));
        stage.setTitle("Secretaire Interface");
        stage.setScene(new Scene(root,700,400));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}