package org.example;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.DAO.DAOstudent;
import org.example.DAO.DAOstudentImpl;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

public class SecretaireController implements Initializable {

    @FXML
    private TableView<Student> table;
    @FXML
    private TableColumn<Student, Integer> student_id;
    @FXML
    private TableColumn<Student, String> student_firstname;
    @FXML
    private TableColumn<Student, String> student_lastname;
    @FXML
    private TableColumn<Student, String> student_email;
    @FXML
    private TableColumn<Student, String> student_password;
    @FXML
    private TableColumn<Student, String> student_annescolaire;
    @FXML
    private TableColumn<Student, Integer> id_role;
    @FXML
    private TableColumn<Student, Integer> id_specialite;
    @FXML
    private TableColumn<Student, Integer> student_presence;
    @FXML
    private TableColumn<Student, Integer> student_absence;
    @FXML
    private TextField text_search;
    public ObservableList<Student> data = FXCollections.observableArrayList();

    /*@FXML
    public void FindStudent() {
        // Wrap the ObservableList in a FilteredList (initially display all data).
        FilteredList<Student> filteredData = new FilteredList<>(data, b -> true);

        // 2. Set the filter Predicate whenever the filter changes.
        text_search.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(employee -> {
                // If filter text is empty, display all persons.

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare first name and last name of every person with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (Student.getStudent_firstname().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true; // Filter matches first name.
                } else if (Student.getStudent_lastname().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true; // Filter matches last name.
                } else if (String.valueOf(Student.getId_specialite()).indexOf(lowerCaseFilter) != -1)
                    return true;
                else
                    return false; // Does not match.
            });
        });

        // 3. Wrap the FilteredList in a SortedList.
        SortedList<Student> sortedData = new SortedList<>(filteredData);

        // 4. Bind the SortedList comparator to the TableView comparator.
        // 	  Otherwise, sorting the TableView would have no effect.
        sortedData.comparatorProperty().bind(table.comparatorProperty());

        // 5. Add sorted (and filtered) data to the table.
        table.setItems(sortedData);
    }*/

    public ObservableList<Apprenant> data = FXCollections.observableArrayList();


    @FXML
    public void getStudent(){

        searchBtn.setOnAction(e->{
            col_id.setCellValueFactory(new PropertyValueFactory<Apprenant,Integer>("id"));
            col_nom.setCellValueFactory(new PropertyValueFactory<Apprenant,String>("nom"));
            col_prenom.setCellValueFactory(new PropertyValueFactory<Apprenant,String>("prenom"));
            col_classe.setCellValueFactory(new PropertyValueFactory<Apprenant,String>("classe"));
            col_absence.setCellValueFactory(new PropertyValueFactory<Apprenant,String>("absence"));
            col_justifier.setCellValueFactory(new PropertyValueFactory<Apprenant,String>("justifier"));
            DAOstudentImpl apprenantDAO =new DAOstudentImpl();
        });

    }
}
