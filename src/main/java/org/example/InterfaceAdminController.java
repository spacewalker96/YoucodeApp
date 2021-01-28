package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.example.DAOAdmin.DAO;
import org.example.DAOAdmin.DaoFormateur;
import org.example.DAOAdmin.DaoSecretaire;
import org.example.modele.Formateur;
import org.example.modele.Secretaire;
import org.example.modele.Student;
import org.example.DAOAdmin.StudentDao;


import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class InterfaceAdminController implements Initializable {

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

    private DAO daoStudent = null;

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
  private TableView<Formateur> tvFormateur;

  @FXML
  private TableColumn<Formateur, Integer> colIdFormateur;
  @FXML
  private TableColumn<Formateur, String> colFirtsNameFormateur;

  @FXML
  private TableColumn<Formateur, String> colLastNameFormateur;

  private DAO daoformateur = null;



  @FXML
  private TableColumn<Formateur, String> colEmailFormateur;

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
  private TableView<Secretaire> tvSecretaire;

  @FXML
  private TableColumn<Secretaire, Integer> colIdSecretaire;
  @FXML
  private TableColumn<Secretaire, String> colFirtsNameSecretaire;

  @FXML
  private TableColumn<Secretaire, String> colLastNameSecretaire;


  @FXML
  private TableColumn<Secretaire, String> colEmailSecretaire;

  private DAO daoSecretaire = null;




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

         viewData();

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
      viewData();

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
                viewData();

              });





  }


  @FXML
  public void viewData() {
    ObservableList<Student> data = null;
    data = FXCollections.observableArrayList();
    ObservableList<Student> finalData = data;


      colId.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
      colFirtsName.setCellValueFactory(new PropertyValueFactory<Student,String>("first_name"));
      colLastName.setCellValueFactory(new PropertyValueFactory<Student,String>("last_name"));
      colEmail.setCellValueFactory(new PropertyValueFactory<Student, String>("email"));

    daoStudent = new StudentDao();
      List<Student> students = new ArrayList<Student>();
      try {
        students = daoStudent.getAll();
        for (Student student : students) {
          finalData.add(new Student(student.getId(), student.getFirst_name(), student.getLast_name(), student.getEmail()));
          System.out.println("id = "+student.getId());
          System.out.println("Bien");
        }
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      } catch (ClassNotFoundException classNotFoundException) {
        classNotFoundException.printStackTrace();
      }



      tvEtudiant.setItems(finalData);

  }

  int index =-1;

  @FXML
  public void getSelected(MouseEvent MouseEvent ) {

    index = tvEtudiant.getSelectionModel().getSelectedIndex();
    if (index <= -1) {

    return;
    }
    tfID.setText(colId.getCellData(index).toString());
    tfFirstName.setText(colFirtsName.getCellData(index).toString());
    tfLastName.setText(colLastName.getCellData(index).toString());
    tfEmail.setText(colEmail.getCellData(index).toString());
  }



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
      System.out.println(tfFirstName.getText());

      viewDataFormateur();

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
      viewDataFormateur();

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
              viewDataFormateur();


            }

    );






  }





  @FXML
  public void viewDataFormateur() {
  //  ObservableList<Formateur> data1 = null;
  //  data1 = FXCollections.observableArrayList();
    // ObservableList<Formateur> finalData = data1;
   // ObservableList<Formateur> finalData = null;

    ObservableList<Formateur> data1 = null;
    data1 = FXCollections.observableArrayList();
    ObservableList<Formateur> finalData1 = data1;



    colIdFormateur.setCellValueFactory(new PropertyValueFactory<Formateur, Integer>("id"));
    colFirtsNameFormateur.setCellValueFactory(new PropertyValueFactory<Formateur, String>("formateur_firstname"));
    colLastNameFormateur.setCellValueFactory(new PropertyValueFactory<Formateur, String>("formateur_lastname"));
    colEmailFormateur.setCellValueFactory(new PropertyValueFactory<Formateur, String>("formateur_email"));

    daoformateur = new DaoFormateur();

        List<Formateur> formateurs = new ArrayList<Formateur>();

    try {
      formateurs = daoformateur.getAll();
      for (Formateur formateur : formateurs) {
        finalData1.add(new Formateur(formateur.getId(), formateur.getFormateur_firstname(), formateur.getFormateur_lastname(), formateur.getFormateur_email()));
        System.out.println("id = " + formateur.getId());
        System.out.println("formate");
      }} catch(SQLException throwables){
        throwables.printStackTrace();
      } catch(ClassNotFoundException classNotFoundException){
        classNotFoundException.printStackTrace();
      }
      tvFormateur.setItems(finalData1);





  }




































  /////////////////////////// secretaire ///////////
@FXML
public void saveSecraitaire( ) throws SQLException, ClassNotFoundException {
  btnInsertSecretaire.setOnAction(e1-> {


    Secretaire secretaire = new Secretaire();
    DAO daoSecretaire = new DaoSecretaire();

    try {
      daoSecretaire.save(tfFirstNameSecretaire.getText(),tfLastNameSecretaire.getText(), tfEmailSecretaire.getText());
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    viewDataSecretaire();

  });


}


  @FXML
  public void UpdateSecraitaire() throws SQLException, ClassNotFoundException {
    btnUpdateSecretaire.setOnAction(e1-> {
      Secretaire secretaire = new Secretaire();
      DAO daoSecretaire = new DaoSecretaire();

      try {
        daoSecretaire.update(tfFirstNameSecretaire.getText(), tfLastNameSecretaire.getText(), tfEmailSecretaire.getText(), Integer.parseInt(tfIDSecretaire.getText()));

      } catch (NumberFormatException e) {
        e.printStackTrace();
      }

      viewDataSecretaire();

    });

  }


  @FXML
  public void DeleteSecretaire() throws SQLException, ClassCastException{
    btnDeleteSecretaire.setOnAction(e1->{


      Secretaire secretaire = new Secretaire();
      DAO daoSecretaire = new DaoSecretaire();

              try {
                daoSecretaire.delete(Integer.parseInt(tfIDSecretaire.getText()));


              } catch (NumberFormatException e) {
                e.printStackTrace();
              }
              viewDataSecretaire();

            });





  }






  @FXML
  public void viewDataSecretaire() {
    ObservableList<Secretaire> data2 = null;
    data2 = FXCollections.observableArrayList();
    ObservableList<Secretaire> finalData = data2;

    colIdSecretaire.setCellValueFactory(new PropertyValueFactory<Secretaire,Integer>("secretaire_id"));
    colFirtsNameSecretaire.setCellValueFactory(new PropertyValueFactory<Secretaire,String>("secretaire_firstname"));
    colLastNameSecretaire.setCellValueFactory(new PropertyValueFactory<Secretaire,String>("secretaire_lastname"));
    colEmailSecretaire.setCellValueFactory(new PropertyValueFactory<Secretaire, String>("secretaire_email"));

    //DAO daoSecretaire = new DaoSecretaire();

    daoSecretaire = new DaoSecretaire();
    List<Secretaire> secretaires = new ArrayList<Secretaire>();
    try {
      secretaires = daoSecretaire.getAll();
      for (Secretaire secretaire : secretaires) {
        finalData.add(new Secretaire(secretaire.getSecretaire_id(), secretaire.getSecretaire_firstname(), secretaire.getSecretaire_lastname(), secretaire.getSecretaire_email()));
        System.out.println("secretaire_id = "+secretaire.getSecretaire_id());
        System.out.println("Bien");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } catch (ClassNotFoundException classNotFoundException) {
      classNotFoundException.printStackTrace();
    }

    tvSecretaire.setItems(finalData);


  }








  @Override
  public void initialize(URL location, ResourceBundle resources) {
    viewData();
    viewDataFormateur();
    viewDataSecretaire();
  }

 //// onMouseClicked="#etudiant"
 // public void etudiant(MouseEvent mouseEvent) {


 // }

}






