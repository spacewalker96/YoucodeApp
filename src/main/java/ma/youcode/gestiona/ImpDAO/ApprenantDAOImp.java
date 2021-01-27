package ma.youcode.gestiona.ImpDAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ma.youcode.gestiona.Connection.ConnectionFactory;
import ma.youcode.gestiona.DAO.ApprenantDAO;
import ma.youcode.gestiona.Modeles.Student;

import java.sql.*;

public class ApprenantDAOImp implements ApprenantDAO<Student>{
    private Student Student;
    @Override
    public ObservableList<Student> getByName(String FirstName) {
        ObservableList<Student> studentList = FXCollections.observableArrayList();
        //Connexion
        try{
            Connection cnx = ConnectionFactory.getMyConnexion();
            PreparedStatement prepared;
            String query = "SELECT * FROM student  WHERE student_firstname = '"+FirstName+"'";
            Statement st;
            ResultSet rs;
            try {
                st = cnx.createStatement();
                rs = st.executeQuery(query);
                while (rs.next()) {
                    Student = new Student(rs.getInt("student_id"),rs.getString("student_firstname"),
                    rs.getString("student_lastname"), rs.getString("student_email"),
                    rs.getString("student_password"),rs.getString("student_annescolaire"),
                    rs.getInt("id_role"), rs.getInt("id_specialite"),rs.getInt("student_presence"),rs.getInt("student_absence"));
                    studentList.add(Student);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return studentList;
    }



}
