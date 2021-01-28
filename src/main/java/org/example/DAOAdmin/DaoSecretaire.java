package org.example.DAOAdmin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Secretaire;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.utilities.DBconnection.getMyConnexion;

public class DaoSecretaire  implements DAO<Secretaire>{

    Statement statement = null;

    @Override
    public Optional<Secretaire> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Secretaire> getAll() throws SQLException, ClassNotFoundException {

        List<Secretaire> secretaires = new ArrayList<Secretaire>();


    statement = DBconnection.getMyConnexion().createStatement();
        System.out.println("création de l'objet Statement secrt");

    //- s�lectionner la table secretaire
         ResultSet resultat;
          String requete = "Select * From sectretaire";

         resultat = statement.executeQuery(requete);

        while (resultat.next()) {
        int id = resultat.getInt("sectretaire_id");
        String nom = resultat.getString("secretaire_firstname");
        String prenom = resultat.getString("secretaire_lastname");
        String email = resultat.getString("secretaire_email");
            System.out.println(prenom);

        // Cr�er l'objet secretaire
            Secretaire p = new Secretaire(id,nom,prenom,email);

            secretaires.add(p);

        }
        for (Secretaire secretaire : secretaires) {
        System.out.println("===============================");
        System.out.println("id = " + secretaire.getSecretaire_id());
        System.out.println("Name = "+ secretaire.getSecretaire_firstname());
        System.out.println("Bien");
        System.out.println("===============================");


    }

        return secretaires;
}











    @Override
    public void save(String nom, String prenom, String mail) throws SQLException, ClassNotFoundException {

        try {
            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO sectretaire(secretaire_firstname, secretaire_lastname, secretaire_email) VALUES (?,?,?)");

            preparedStatement.setString(1,nom);
            preparedStatement.setString(2,prenom);
            preparedStatement.setString(3,mail);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void update(String nom, String prenom, String mail, int id) {
        try {

            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE sectretaire SET secretaire_firstname = ?, secretaire_lastname = ?,secretaire_email = ? WHERE sectretaire_id= ?");


            preparedStatement.setString(1,nom);
            preparedStatement.setString(2,prenom);
            preparedStatement.setString(3,mail);
            preparedStatement.setInt(4,id);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {

        try {

            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM sectretaire WHERE sectretaire_id= ?");



            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            conn.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
