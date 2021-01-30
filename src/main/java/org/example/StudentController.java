package org.example;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.DAO.DAOAttendenceimpl;
import org.example.DAO.DAOstudentImpl;
import org.example.modele.Attendence;
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
    private Label absence_Just;
    @FXML
    private Label absence_non_Just;
    @FXML
    private Label taux;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showData();
    }

    private void showData() {
        DBconnection conn;
        DAOstudentImpl implStudent =new DAOstudentImpl();

        try {
            ResultSet rs ;
            rs=implStudent.getCurrentUser();

            if(rs.next()){
                labelNom.setText(rs.getString("student_firstname"));
                labelPrenom.setText(rs.getString("student_lastname"));
                labelPromo.setText(rs.getString("student_annescolaire"));
                labelSpecialite.setText(rs.getString("specialite_name"));
                labelFormateur.setText(rs.getString("formateur_firstname"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


       DAOAttendenceimpl k =new DAOAttendenceimpl();
        ResultSet rs;

        try {
            rs =k.getAttendenceForCRT_USR();

            if(rs.next()){
                absence_Just.setText(rs.getString("absence_justifier"));
                absence_non_Just.setText(rs.getString("absence_non_justifier"));
                taux.setText(String.valueOf(Integer.parseInt(rs.getString("taux"))));

            }else{
                System.out.println("Nothing to show");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
