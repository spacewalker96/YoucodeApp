package org.example.DAO;

import org.example.modele.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface DAOstudent {
    public List<Student> getAll() throws ClassNotFoundException, SQLException;

    public Student getById(int student_id) throws ClassNotFoundException, SQLException;

    public Student ajoutStudent(String student_firstname, String student_lastname) throws ClassNotFoundException, SQLException;

    public int updateStudent(String student_firstname, String student_lastname) throws ClassNotFoundException, SQLException;

    int updateStudent(int student_id, String student_firstname, String student_lastname) throws ClassNotFoundException, SQLException;

    public int deleteById(int student_id);

}
