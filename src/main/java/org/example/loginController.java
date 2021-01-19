package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loginController {

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

  /*  @FXML
    private Button btnLogin;
    @FXML
    void login(javafx.event.ActionEvent event) {


    }*/
    @FXML
    private Button btnLogin;

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;



    @FXML
    void login(javafx.event.ActionEvent event) {

        String email = txtEmail.getText();
        String password = txtPassword.getText();
        if (email.equals("") && password.equals("")){
            JOptionPane.showMessageDialog(null,"email or password blank");
        }
        else {


            try {
                Class.forName("com.mysql.jdbc.Driver");
                //conn = DriverManager.getConnection("dbc:mysql://localhost:3306/gestion-app-absence", "root", "");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion-app-absence?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=Africa/Casablanca", "root","");
                pst = conn.prepareStatement("select * from login where email=? and password=?");

                pst.setString(1, email);
                pst.setString(2, password);

                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null,"login success");

                }
                else {
                    JOptionPane.showMessageDialog(null,"login failed");
                    txtEmail.setText("");
                    txtPassword.setText("");
                    txtEmail.requestFocus();

                }
            } catch (ClassNotFoundException ex) {
                //e.printStackTrace();
                Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null,ex);
            } catch (SQLException ex) {
                //throwables.printStackTrace();
                Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null,ex);

            }


        }
    }
}
