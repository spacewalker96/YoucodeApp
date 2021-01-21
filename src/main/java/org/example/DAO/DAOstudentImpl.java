package org.example.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.example.modele.Student;
import org.example.utilities.DBconnection;


public  class DAOstudentImpl  implements DAOstudent {
    Statement statement = null;
    private DBconnection Connexion;

    @Override
    public ResultSet getAll() throws ClassNotFoundException, SQLException {

        List<Student> students = new ArrayList<Student>();

        statement = Connexion.getMyConnexion().createStatement();
        ResultSet rs;
        String query = "Select * From student";
        rs = statement.executeQuery(query);
        while (rs.next()) {
            Long id = rs.getLong("student_id");
            String nom = rs.getString("student_firstname");
            String prenom = rs.getString("student_lastname");
            String email = rs.getString("student_email");
            String password = rs.getString("student_password");
            String specialite = rs.getString("student_specialite");
            String anneScolaire = rs.getString("student_annescolaire");
            String role = rs.getString("student_role");

            Student student = new Student(id, nom, prenom,email,password,specialite,anneScolaire,role);
            students.add(student);
        }
        return (ResultSet) students;
    }

  /*  @Override
    public ResultSet  getBySpeciality(String speciality) throws ClassNotFoundException, SQLException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="SELECT * FROM student WHERE  Student_specialite = ?";
        ResultSet rs =statement.executeQuery(query);
        return null;
    }

    @Override
    public ResultSet getById(Long id) throws ClassNotFoundException, SQLException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="SELECT * FROM student";
        ResultSet rs =statement.executeQuery(query);
        return rs;
    }

    @Override
    public Student ajoutStudent(String nom, String prenom) throws ClassNotFoundException, SQLException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="INSERT INTO student (`Student_id`, `student_firstname`,`student_lastname`,`student_email`,`student_password`,`speciality_anneScolaire`,`id_role`,`id_specialite`) VALUES (?,?);";
        ResultSet rs =statement.executeQuery(query);
        return null;
    }

    @Override
    public int updateStudent(Long id, String nom, String prenom) throws ClassNotFoundException, SQLException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="UPDATE  student SET (`Student_id`, `student_firstname`,`student_lastname`) VALUES (?,?);";
        ResultSet rs =statement.executeQuery(query);
        return 0;
    }

    @Override
    public int deleteById(Long id) throws SQLException, ClassNotFoundException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="DELETE FROM student  WHERE (`Student_id`, `student_firstname`,`student_lastname`,`student_email`) = ? ;";
        ResultSet rs =statement.executeQuery(query);
        return 0;
    }
*/

}