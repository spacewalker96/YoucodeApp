package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class StudentController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
