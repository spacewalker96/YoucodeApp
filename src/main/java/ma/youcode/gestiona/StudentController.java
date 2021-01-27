package ma.youcode.gestiona;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ma.youcode.gestiona.ImpDAO.ApprenantDAOImp;
import ma.youcode.gestiona.Modeles.Student;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController {

    @FXML private TableView<Student> table;
    @FXML private TableColumn<Student,Integer> student_id;
    @FXML private TableColumn<Student,String> student_firstname;
    @FXML private TableColumn<Student,String> student_lastname;
    @FXML private TableColumn<Student,Integer> id_specialite;
    @FXML private TableColumn<Student,Integer> student_absence;
    @FXML private TextField txt_search;
    @FXML private Button searchBtn;

    public ObservableList<Student> data = FXCollections.observableArrayList();


    @FXML
    public void getStudent(){
            searchBtn.setOnAction(e->{
                    student_id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("student_id"));
                    student_firstname.setCellValueFactory(new PropertyValueFactory<Student,String>("student_firstname"));
                    student_lastname.setCellValueFactory(new PropertyValueFactory<Student,String>("student_lastname"));
                    id_specialite.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id_specialite"));
                    student_absence.setCellValueFactory(new PropertyValueFactory<Student,Integer>("student_absence"));
                    ApprenantDAOImp apprenantDAO =new ApprenantDAOImp();
                    table.setItems(apprenantDAO.getByName(txt_search.getText()));
    });
    }
}
