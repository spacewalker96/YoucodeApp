package org.example.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.Statement;

public class DBconnection {
    //String PILOTE = "com.mysql.jdbc.Driver";
    static String user = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/gestion-app-absence";
    static Connection connection=null;

    // Connexion à la base de données
    public static Connection getMyConnexion() throws ClassNotFoundException,
            SQLException {
<<<<<<< Updated upstream
      //  Class.forName("com.mysql.jdbc.Driver");
=======
        //Class.forName("com.mysql.jdbc.Driver");
>>>>>>> Stashed changes
        try {
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        }catch (Exception e){
            System.out.println("erorr at cnx database");
        }
        return  null;
    }


}
