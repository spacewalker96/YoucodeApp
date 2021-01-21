package org.example;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

<<<<<<< Updated upstream
=======
import javafx.beans.value.ObservableValue;
>>>>>>> Stashed changes
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
<<<<<<< Updated upstream
=======
import javafx.util.Callback;
>>>>>>> Stashed changes
import org.example.DAO.DAOstudentImpl;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

<<<<<<< Updated upstream
public class StudentController implements Initializable {
=======
public class StudentController  implements Initializable {
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
    private TableColumn<Student, Integer> colAbs_non_just;
    @FXML
    private TableColumn<Student, Integer> colTaux;
=======
    private Label labelNom;
    @FXML
    private Label labelPrenom;
    @FXML
    private Label labelSpecialite;
    @FXML
    private Label labelPromo;
    @FXML
    private Label labelFormateur;

    @FXML
    private TableView<Student> tableStudent;
    @FXML
    private TableColumn<Student, Integer> colAbs_justif;
    @FXML
    private TableColumn<Student, String> colAbs_non_justif;
>>>>>>> Stashed changes


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showData();
<<<<<<< Updated upstream
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
                labelSpecialite.setText(rs.getString("id_specialite"));

            }
=======

    }

    private void showData() {
        DBconnection con;
        DAOstudentImpl impl = new DAOstudentImpl();
        try {
            ResultSet  rs = impl.getById(2L);
            if(rs.next()==true){
                labelNom.setText(rs.getNString("student_firstname"));
                labelPrenom.setText(rs.getNString("student_lastname"));
                labelPromo.setText(rs.getNString("student_anneScolaire"));
                labelSpecialite.setText(rs.getString("id_specialite"));
            }

>>>>>>> Stashed changes
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
    }
}
