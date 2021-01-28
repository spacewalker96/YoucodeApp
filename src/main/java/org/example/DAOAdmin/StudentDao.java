package org.example.DAOAdmin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static org.example.utilities.DBconnection.getMyConnexion;


public class StudentDao implements DAO<Student> {
    Statement statement = null;
    @Override
    public Optional<Student> get(long id) {
        return Optional.empty();
    }

    @Override
    public  List<Student> getAll() throws SQLException, ClassNotFoundException {
        List<Student> students = new ArrayList<Student>();


        statement = DBconnection.getMyConnexion().createStatement();
      //  System.out.println("création de l'objet Statement");

        //4- s�lectionner la table student
        ResultSet resultat;
        String requete = "Select * From student";

        resultat = statement.executeQuery(requete);

        while (resultat.next()) {
            int id = resultat.getInt("student_id");
            String nom = resultat.getString("student_firstname");
            String prenom = resultat.getString("student_lastname");
            String email = resultat.getString("student_email");

            // Cr�er l'objet Student
            Student p = new Student(id,nom,prenom,email);
          //  p.setId(id);
           // p.setLast_name(nom);
           // p.setFirst_name(prenom);
           // p.setEmail(email);
            students.add(p);
        }
        for (Student student : students) {
        //   System.out.println("===============================");
         //   System.out.println("id = " + student.getId());
         //   System.out.println("Name = "+ student.getFirst_name());
         //   System.out.println("Bien");
        //   System.out.println("===============================");
        }

        return students;
    }

    @Override
    public void save(String nom, String prenom, String mail)  throws SQLException, ClassNotFoundException {


        try {


            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student(student_firstname, student_lastname, student_email) VALUES (?,?,?)");

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
