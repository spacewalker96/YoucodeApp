package org.example.DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Student;
import org.example.utilities.DBconnection;


public  class DAOstudentImpl  implements DAOstudent {
    Statement statement = null;
    private DBconnection Connexion;

    @Override
    public ObservableList<Student> getAll() throws ClassNotFoundException, SQLException {

        ObservableList<Student> students = FXCollections.observableArrayList();
        statement = Connexion.getMyConnexion().createStatement();

        ResultSet rs;
        String query = "Select * From Student";

        rs = statement.executeQuery(query);

        while (rs.next()) {
            int student_id = rs.getInt("student_id");
            String student_firstname = rs.getString("student_firstname");
            String student_lastname = rs.getString("student_lastname");
            String student_email = rs.getString("student_email");
            String student_password = rs.getString("student_password");
            String student_annescolaire = rs.getString("student_annescolaire");
            int id_role = rs.getInt("id_role");
            int id_specialite = rs.getInt("id_specialite");
            int student_presence = rs.getInt("student_presence");
            int student_absence = rs.getInt("student_absence");
            // Créer l'objet STUDENT
            Student p = new Student(student_id, student_firstname, student_lastname,student_email,student_password,student_annescolaire,id_role,id_specialite,student_presence,student_absence);
            students.add(p);
        }
        return  students;
    }

    @Override
    public Student getById(int student_id) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public Student ajoutStudent(String student_firstname, String student_lastname) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public int updateStudent(String student_firstname, String student_lastname) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public int updateStudent(int student_id, String student_firstname, String student_lastname) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public int deleteById(int student_id) {
        return 0;
    }

}
