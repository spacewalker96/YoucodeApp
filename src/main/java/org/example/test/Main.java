package org.example.test;

import org.example.DAOAdmin.DAO;
import org.example.DAOAdmin.DaoFormateur;
import org.example.DAOAdmin.StudentDao;
import org.example.modele.Formateur;
import org.example.modele.Secretaire;
import org.example.modele.Student;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Secretaire secretaire = new Secretaire();
        DAO daoSecretaire = new StudentDao();

        daoSecretaire.delete( 3);
                //daoStudent.delete(1);
        System.out.println("bien delete !");
    }
}
