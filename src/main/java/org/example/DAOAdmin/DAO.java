package org.example.DAOAdmin;

import org.example.modele.Student;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    Optional<T> get(long id);

    List<T> getAll() throws SQLException, ClassNotFoundException;

    public void save(String nom, String prenom, String mail) throws SQLException, ClassNotFoundException;

    //void update(T t, String[]params);

    //void delete(T t);


     void update(String nom, String prenom, String mail,int id);



    void delete( int id);
}
