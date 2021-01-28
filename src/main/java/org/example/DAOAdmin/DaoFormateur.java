package org.example.DAOAdmin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Formateur;
import org.example.modele.Student;
import org.example.utilities.DBconnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.example.utilities.DBconnection.getMyConnexion;

public class DaoFormateur implements DAO<Formateur> {
    Statement statement = null;

    @Override
    public Optional<Formateur> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Formateur> getAll() throws SQLException, ClassNotFoundException {
        List<Formateur> formateurs = new ArrayList<Formateur>();


        statement = DBconnection.getMyConnexion().createStatement();
        ResultSet resultat;
        String requete = "Select * From formateur";
        resultat = statement.executeQuery(requete);
        while (resultat.next()) {
            int id = resultat.getInt("formateur_id");
            String nom = resultat.getString("formateur_firstname");
            String prenom = resultat.getString("formateur_lastname");
            String email = resultat.getString("formateur_email");



        // Cr�er l'objet Student


        Formateur p = new Formateur(id, nom, prenom, email);

        formateurs.add(p);
    }
        for(Formateur formateur : formateurs){
            System.out.println(formateur);
            System.out.println("id = " + formateur.getId());
            System.out.println("Name = "+ formateur.getFormateur_firstname());
            System.out.println("Bien");

        }

        return formateurs;

}

     //   ObservableList<Formateur> formateurlist = FXCollections.observableArrayList();
     //   Connection connection = getMyConnexion();
       // String query = "SELECT * FROM formateur";
      //  Statement statement;
       // ResultSet rs;

      /*  try{
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            Formateur formateur;
            while(rs.next()){

                formateur = new Formateur(rs.getInt("formateur_id"),
                        rs.getString("formateur_firstname"),
                        rs.getString("formateur_lastname"),
                        rs.getString("formateur_email"));
                formateurlist.add(formateur);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return formateurlist;
        */
       // }




    @Override
    public void save(String nom, String prenom, String mail) throws SQLException, ClassNotFoundException {


        try {

            Connection conn = getMyConnexion();
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO formateur(formateur_firstname, formateur_lastname, formateur_email) VALUES (?,?,?)");

            //preparedStatement.setInt(1,student.getId());
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
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE formateur SET formateur_firstname = ?, formateur_lastname = ?,formateur_email = ? WHERE formateur_id= ?");


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
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM formateur WHERE formateur_id= ?");



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
