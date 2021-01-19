package org.example.modele;

public class Admin {
    private Integer idAdmin;
    private String adminName;
    private String adminEmail;
    private String adminPassword;
    private String role;


    public Admin(Integer idAdmin, String adminName, String adminEmail, String adminPassword, String role) {
        this.idAdmin = idAdmin;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
        this.role = role;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String  getRole() {
        return role;
    }
}