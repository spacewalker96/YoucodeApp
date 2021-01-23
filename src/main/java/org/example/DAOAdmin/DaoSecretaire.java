package org.example.DAOAdmin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Secretaire;

import java.sql.*;
import java.util.List;
import java.util.Optional;

import static org.example.utilities.DBconnection.getMyConnexion;

public class DaoSecretaire  implements DAO<Secretaire>{
    @Override
    public Optional<Secretaire> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Secretaire> getAll() throws SQLException, ClassNotFoundException {

        ObservableList<Secretaire> secretaireslist = FXCollections.observableArrayList();
        Connection connection = getMyConnexion();
        String query = "SELECT * FROM sectretaire";
        Statement statement;
        ResultSet rs;

        try{
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            Secretaire secretaire;
            while(rs.next()){

                secretaire = new Secretaire(rs.getInt("sectretaire_id"),
                        rs.getString("secretaire_firstname"),
                        rs.getString("secretaire_lastname"),
                        rs.getString("secretaire_email"));
                secretaireslist.add(secretaire);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return secretaireslist;

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
