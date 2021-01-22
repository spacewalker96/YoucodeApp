package org.example.DAOAdmin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Student;

import java.sql.*;
import java.util.List;
import java.util.Optional;


import static org.example.utilities.DBconnection.getMyConnexion;


public class StudentDao implements DAO<Student> {

    @Override
    public Optional<Student> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Student> getAll() throws SQLException, ClassNotFoundException {

            ObservableList<Student> etudiantsList = FXCollections.observableArrayList();
            Connection connection = getMyConnexion();
            String query = "SELECT * FROM student";
            Statement statement;
            ResultSet rs;

            try{
                statement = connection.createStatement();
                rs = statement.executeQuery(query);
                Student student;
                while(rs.next()){

                    student = new Student(rs.getInt("student_id"),
                            rs.getString("student_firstname"),
                            rs.getString("student_lastname"),
                            rs.getString("student_email"));
                    etudiantsList.add(student);
                }

            }catch(Exception ex){
                ex.printStackTrace();
            }
            return etudiantsList;    }





    @Override
    public void save(String nom, String prenom, String mail) throws SQLException, ClassNotFoundException {

        try {


            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student(student_firstname, student_lastname, student_email) VALUES (?,?,?)");

            //preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(1,nom);
            preparedStatement.setString(2,prenom);
            preparedStatement.setString(3,mail);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    @Override
    public void update(String nom, String prenom, String mail,int id) {

        try {

            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE student SET student_firstname = ?, student_lastname = ?,student_email = ? WHERE student_id= ?");



            //preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(1,nom);
            preparedStatement.setString(2,prenom);
            preparedStatement.setString(3,mail);
            preparedStatement.setInt(4,id);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }







    @Override
    public void delete(int id) {
        try {

            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM student WHERE student_id= ?");



            //preparedStatement.setInt(1,student.getId());
            //preparedStatement.setString(1,nom);
           // preparedStatement.setString(2,prenom);
           // preparedStatement.setString(3,mail);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }






    //Exuctions des Requetes
  /*  private void executeQuery(String query) throws SQLException, ClassNotFoundException {
        Connection conn = getMyConnexion();
        Statement st;
        try{
            st = conn.createStatement();
            st.executeUpdate(query);
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }*/

    private void executeQuery(String query) throws SQLException, ClassNotFoundException {
        Connection connection = getMyConnexion();
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
