package org.example.DAOAdmin;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.modele.Admin;
import org.example.DAOAdmin.DAO;
import org.example.utilities.DBconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class AdminDao  implements DAO<Admin> {


    @Override
    public Optional<Admin> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Admin> getAll() throws SQLException, ClassNotFoundException {
        ObservableList<Admin> etudiantsList = FXCollections.observableArrayList();
        Connection conn = DBconnection.getMyConnexion();
        String query = "SELECT * FROM student";
        Statement st;
        ResultSet rs;

        try{
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Admin admin;
            while(rs.next()){
                admin = new Admin(rs.getInt("colId"),
                        rs.getString("colFirtsName"),
                        rs.getString("colLastName"),
                        rs.getString("colEmail"),
                        rs.getString("colEmail"));
                etudiantsList.add(admin);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return etudiantsList;    }

    @Override
    public void save(Admin admin) {
        

    }

    @Override
    public void update(Admin admin, String[] params) {



    }

    @Override
    public void delete(Admin admin) {
       // String query = "DELETE FROM student WHERE student_id = '" + tfID.getText() + "' ";
    }


}
