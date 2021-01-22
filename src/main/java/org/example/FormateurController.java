package org.example;

import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import org.example.DAO.DAOstudentImpl;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.modele.Student;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class FormateurController {
    @FXML
    private TableView<Student> tableView;

/*    @FXML
    private TableColumn<Student, Integer> id;*/

    @FXML
    private TableColumn<Student, String> colFirstName;

    @FXML
    private TableColumn<Student, String> colLastName;

    @FXML
    private TableColumn<Student, String> colEmail;
    @FXML
    private TableColumn<Student, String> colSpecialite;

    @FXML

        public void showStudent() {
        DAOstudentImpl dost = new DAOstudentImpl();
        try {
            dost.getBySpeciality("java");
            System.out.println();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        colFirstName.setCellValueFactory(new PropertyValueFactory<Student, String>("nom"));
            colFirstName.setCellValueFactory(new PropertyValueFactory<Student, String>("prenom"));
            colFirstName.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
            colFirstName.setCellValueFactory(new PropertyValueFactory<Student, String>("specialite"));


        try {
            tableView.setItems(dost.getAll());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

          /*  //Transfert data from class Module  to table Module
            ObservableList<Module> listModule = getModuleList();
            colCodeModule.setCellValueFactory(new PropertyValueFactory<Module, Integer>("id"));
            colNomModule.setCellValueFactory(new PropertyValueFactory<Module, String>("nom"));
            tvModule.setItems(listModule);*/

        }


  /*  @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showStudent();
    }*/

}
