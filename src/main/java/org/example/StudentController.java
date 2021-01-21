package org.example;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.DAO.DAOstudentImpl;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

public class StudentController implements Initializable {

   @FXML
    private Label labelNom;
    @FXML
    private Label labelPrenom;
    @FXML
    private Label labelPromo;
    @FXML
    private Label labelSpecialite;
    @FXML
    private Label labelFormateur;
    @FXML
    private TableView<Student> tableAbsence;
    @FXML
    private TableColumn<Student, Integer> colAbs_Just;
    @FXML
    private TableColumn<Student, Integer> colAbs_non_just;
    @FXML
    private TableColumn<Student, Integer> colTaux;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showData();
    }

    private void showData() {
        DBconnection conn;
        DAOstudentImpl impl =new DAOstudentImpl();

        try {
            ResultSet rs ;
            rs=impl.getById(2l);
            System.out.println(rs);
            if(rs.next()){
                labelNom.setText(rs.getString("student_firstname"));
                labelPrenom.setText(rs.getString("student_lastname"));
                labelPromo.setText(rs.getString("student_anneScolaire"));
                labelSpecialite.setText(rs.getString("student_specialite"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
