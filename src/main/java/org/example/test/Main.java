package org.example.test;

import org.example.DAOAdmin.DAO;
import org.example.DAOAdmin.DaoFormateur;
import org.example.DAOAdmin.StudentDao;
import org.example.modele.Formateur;
import org.example.modele.Student;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Formateur formateur = new Formateur();
        DAO daoformateur = new DaoFormateur();

        daoformateur.update("my","my","dfd@fd",2);
        //daoStudent.delete(1);
        System.out.println("bien save !");
    }
}
