package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.example.modele.Student;

public class InterfaceAdminController {

    //  start tab STUDENT elements--------------------------------------------------

    @FXML
  private TextField tfID;
    @FXML
  private TextField tfFirstName;
    @FXML
  private TextField tfLastName;
    @FXML
  private TextField tfEmail;
    @FXML
  private Button btnInsertEtudiant;
  @FXML
    private Button btnUpdateEtudiant;
  @FXML
    private Button btnDeleteEtudiant;

    @FXML
    private TableView<Student> tvEtudiant;

    @FXML
    private TableColumn<Student, Integer> colId;
    @FXML
    private TableColumn<Student, String> colFirtsName;

    @FXML
    private TableColumn<Student, String> colLastName;


    @FXML
    private TableColumn<Student, String> colEmail;


    //  end tab STUDENT elements--------------------------------------------------







}
