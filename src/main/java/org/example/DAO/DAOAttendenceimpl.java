package org.example.DAO;

import org.example.modele.Attendence;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAOAttendenceimpl implements DAOAttendence{
    Statement statement = null;
    DBconnection Connexion;
    @Override
    public List<Attendence> getAllAttendence() throws ClassNotFoundException, SQLException {
        List<Attendence> attendences = new ArrayList<Attendence>();
        statement = Connexion.getMyConnexion().createStatement();
        ResultSet rs;
        String query = "Select * From absence";
        rs = statement.executeQuery(query);
        while(rs.next()){
            Long id = rs.getLong("absence_id");
            String date = rs.getString("absence_date");
            String justification = rs.getString("absence_justification");
            String id_student = rs.getString("id_student");
            String id_secretaire = rs.getString("id-secretaire");
        }
        return attendences;
    }

    @Override
    public String getByDate(Date date) throws ClassNotFoundException, SQLException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="SELECT * FROM absence WHERE  absence_date = ?";
        ResultSet rs =statement.executeQuery(query);
        return null;
    }

    @Override
    public Long getByIdAttendence(Long id_Attendence) throws ClassNotFoundException, SQLException {
        statement = Connexion.getMyConnexion().createStatement();
        String query ="SELECT * FROM absence WHERE  absence_id = ?";
        ResultSet rs =statement.executeQuery(query);
        return null;
    }

    @Override
    public Long getByIdStudent(Long id_Student) throws ClassNotFoundException, SQLException {
        return null;
    }


    @Override
    public Student ajoutJustification(Long id_student, Long id_attendence, Date date) throws ClassNotFoundException, SQLException {
        return null;
    }
}
