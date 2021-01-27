package ma.youcode.gestiona.Modeles;

public class Secretaire {
    private static int secretaire_id;
    private static String secretaire_firstname;
    private static String secretaire_lastname;
    private static String secretaire_email;
    private static String secretaire_password;
    private static int id_role;

    public Secretaire(int secretaire_id, String secretaire_firstname, String secretaire_lastname, String secretaire_email, String secretaire_password, int id_role){
        this.secretaire_id=secretaire_id;
        this.secretaire_firstname=secretaire_firstname;
        this.secretaire_lastname=secretaire_lastname;
        this.secretaire_email=secretaire_email;
        this.secretaire_password=secretaire_password;
        this.id_role=id_role;
    }
    public Secretaire(){
        super();
    }
    public static int getSecretaire_id() {
        return secretaire_id;
    }

    public static String getSecretaire_firstname() {
        return secretaire_firstname;
    }

    public static String getSecretaire_lastname() {
        return secretaire_lastname;
    }

    public static String getSecretaire_email() {
        return secretaire_email;
    }

    public static String getSecretaire_password() {
        return secretaire_password;
    }

    public static int getId_role() {
        return id_role;
    }
    public static void setSecretaire_id(int secretaire_id) {
        Secretaire.secretaire_id = secretaire_id;
    }

    public static void setSecretaire_firstname(String secretaire_firstname) {
        Secretaire.secretaire_firstname = secretaire_firstname;
    }

    public static void setSecretaire_lastname(String secretaire_lastname) {
        Secretaire.secretaire_lastname = secretaire_lastname;
    }

    public static void setSecretaire_email(String secretaire_email) {
        Secretaire.secretaire_email = secretaire_email;
    }

    public static void setSecretaire_password(String secretaire_password) {
        Secretaire.secretaire_password = secretaire_password;
    }

    public static void setId_role(int id_role) {
        Secretaire.id_role = id_role;
    }
}
