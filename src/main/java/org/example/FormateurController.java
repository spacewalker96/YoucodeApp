package org.example;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.modele.Student;

public class FormateurController {
    @FXML
    private TableView<Student> tableView;

    @FXML
    private TableColumn<Student, Integer> id;

    @FXML
    private TableColumn<Student, String> lirtsName;

    @FXML
    private TableColumn<Student, String> lastName;

    @FXML
    private TableColumn<Student, String> email;

    @FXML
    private void showStudent(){

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        Student student = new Student();
        tableView.setItems((ObservableList<Student>) student);

    }

}
