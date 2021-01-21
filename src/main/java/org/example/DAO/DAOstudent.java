package org.example.DAO;

import org.example.modele.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface DAOstudent {
    public List<Student> getAll() throws ClassNotFoundException, SQLException;
<<<<<<< Updated upstream
    public String getBySpeciality(String speciality) throws ClassNotFoundException, SQLException;
=======

    public ResultSet getBySpeciality(String speciality) throws ClassNotFoundException, SQLException;

>>>>>>> Stashed changes
    public ResultSet getById(Long id) throws ClassNotFoundException, SQLException;
    public Student ajoutStudent(String nom, String prenom) throws ClassNotFoundException, SQLException;
    public int updateStudent(Long id, String nom, String prenom) throws ClassNotFoundException, SQLException;
    public int deleteById(Long id) throws SQLException, ClassNotFoundException;

}
