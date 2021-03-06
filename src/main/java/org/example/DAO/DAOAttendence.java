package org.example.DAO;

import org.example.modele.Attendence;
import org.example.modele.Student;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface DAOAttendence {
    public List<Attendence> getAllAttendence() throws ClassNotFoundException, SQLException;

    public String getByDate(Date date) throws ClassNotFoundException, SQLException;

    public Long getByIdAttendence(Long id_Attendence) throws ClassNotFoundException, SQLException;

    public Long getByIdStudent(Long id_Student) throws ClassNotFoundException, SQLException;

    public Student ajoutJustification(Long  id_student, Long id_attendence,Date date) throws ClassNotFoundException, SQLException;


}
