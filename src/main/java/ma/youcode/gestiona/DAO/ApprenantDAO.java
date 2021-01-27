package ma.youcode.gestiona.DAO;

import javafx.collections.ObservableList;
import ma.youcode.gestiona.Modeles.Student;

public interface ApprenantDAO<T> {

    public ObservableList<Student> getByName(String FirstName);
}
