package ma.youcode.gestiona;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ma.youcode.gestiona.Connection.ConnectionFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class Main extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException, SQLException, ClassNotFoundException {
        Parent root =FXMLLoader.load(getClass().getResource("Student.fxml"));
        scene = new Scene(root,560,360);
        stage.setScene(scene);
        ConnectionFactory.getMyConnexion();
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}