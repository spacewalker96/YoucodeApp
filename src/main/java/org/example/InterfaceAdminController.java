package org.example;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.DAOAdmin.DAO;
import org.example.DAOAdmin.DaoFormateur;
import org.example.modele.Formateur;
import org.example.modele.Student;
import org.example.DAOAdmin.StudentDao;


import java.sql.SQLException;

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

/////////////////////////////////// start tab formateur

  @FXML
  private TextField tfIDFormateur;
  @FXML
  private TextField tfFirstNameFormateur;
  @FXML
  private TextField tfLastNameFormateur;
  @FXML
  private TextField tfEmailFormateur;
  @FXML
  private Button btnInsertFormateur;
  @FXML
  private Button btnUpdateFormateur;
  @FXML
  private Button btnDeleteFormateur;

  @FXML
  private TableView<Student> tvFormateur;

  @FXML
  private TableColumn<Student, Integer> colIdFormateur;
  @FXML
  private TableColumn<Student, String> colFirtsNameFormateur;

  @FXML
  private TableColumn<Student, String> colLastNameFormateur;


  @FXML
  private TableColumn<Student, String> colEmailFormateur;

///////////////////////////// end formateur////////////////////////////////


  //////////////////////////////////////////// start Secretaire/////////////////////////////


  @FXML
  private TextField tfIDSecretaire;
  @FXML
  private TextField tfFirstNameSecretaire;
  @FXML
  private TextField tfLastNameSecretaire;
  @FXML
  private TextField tfEmailSecretaire;
  @FXML
  private Button btnInsertSecretaire;
  @FXML
  private Button btnUpdateSecretaire;
  @FXML
  private Button btnDeleteSecretaire;

  @FXML
  private TableView<Student> tvSecretaire;

  @FXML
  private TableColumn<Student, Integer> colIdSecretaire;
  @FXML
  private TableColumn<Student, String> colFirtsNameSecretaire;

  @FXML
  private TableColumn<Student, String> colLastNameSecretaire;


  @FXML
  private TableColumn<Student, String> colEmailSecretaire;



   //////////////////////////////////////////////////////// end tab Secretaire//////////////////////////////////
  //StudentDao studentDao = new StudentDao();
    @FXML
     public void saveEtudiant() throws SQLException, ClassNotFoundException {
       btnInsertEtudiant.setOnAction(e1-> {
         Student student = new Student();
         DAO daoStudent = new StudentDao();

         try {
           daoStudent.save(tfFirstName.getText(),  tfLastName.getText(), tfEmail.getText());
         } catch (SQLException throwables) {
           throwables.printStackTrace();
         } catch (ClassNotFoundException e) {
           e.printStackTrace();
         }
         //Student student = new Student(0, tfFirstName.getText(), tfLastName.getText(), tfEmail.getText());
         System.out.println(tfFirstName.getText());


       });


   }


  @FXML
  public void UpdateEtudiant() throws SQLException, ClassNotFoundException {
    btnUpdateEtudiant.setOnAction(e1-> {
              Student student = new Student();
              DAO daoStudent = new StudentDao();

              try {
                daoStudent. update(tfFirstName.getText(), tfLastName.getText(), tfEmail.getText(), Integer.parseInt(tfID.getText()));

              } catch (Exception e) {
                e.printStackTrace();
              }

      System.out.println(tfID.getText());

    });

  }

  @FXML
  public void DeleteEtudiant() throws SQLException, ClassCastException{
      btnDeleteEtudiant.setOnAction(e1->{
        Student student = new Student();
        DAO daoStudent = new StudentDao();

        try {
          daoStudent. delete(Integer.parseInt(tfID.getText()));


        } catch (NumberFormatException e) {
          e.printStackTrace();
        }
              }

              );






  }
 // TableView<Student> utilisateursTable = new TableView<Student>();
  //colomn id
 // TableColumn<Student, Integer> id = new TableColumn<>();

       //   colId.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
        //colId.setCellValueFactory(new PropertyValueFactory<>("id"));


  /*public void getAll() {

    ObservableList<Student> listEtudiant = getAll();

    colId.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
    colLastName.setCellValueFactory(new PropertyValueFactory<Student, String>("first_name"));
    colFirtsName.setCellValueFactory(new PropertyValueFactory<Student, String>("last_name"));
    colEmail.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));
    tvEtudiant.setItems(listEtudiant);

  }*/





  ///////////////////////////// formateur
  @FXML
  public void saveFormateur() throws SQLException, ClassNotFoundException {
    btnInsertFormateur.setOnAction(e1-> {
      Formateur formateur = new Formateur();
      DAO daoformateur = new DaoFormateur();

      try {
        daoformateur.save(tfFirstName.getText(),  tfLastName.getText(), tfEmail.getText());
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
      //Student student = new Student(0, tfFirstName.getText(), tfLastName.getText(), tfEmail.getText());
      System.out.println(tfFirstName.getText());


    });


  }

  @FXML
  public void UpdateFormateur() throws SQLException, ClassNotFoundException {
    btnUpdateFormateur.setOnAction(e1-> {
      Formateur formateur = new Formateur();
      DAO daoformateur = new DaoFormateur();

      try {
        daoformateur.update(tfFirstNameFormateur.getText(), tfLastNameFormateur.getText(), tfEmailFormateur.getText(), Integer.parseInt(tfIDFormateur.getText()));

      } catch (NumberFormatException e) {
        e.printStackTrace();
      }

    });

  }

  @FXML
  public void DeleteFormateur() throws SQLException, ClassCastException{
    btnDeleteFormateur.setOnAction(e1->{



      Formateur formateur = new Formateur();
      DAO daoformateur = new DaoFormateur();


              try {
                daoformateur.delete(Integer.parseInt(tfIDFormateur.getText()));


              } catch (NumberFormatException e) {
                e.printStackTrace();
              }
            }

    );






  }















}






