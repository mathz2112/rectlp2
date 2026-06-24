package com.mycompany.rec1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TertieryController {

    @FXML
    private TextField getemail;

    @FXML
    private void recuperar() {

        if (getemail.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Informe o email.");
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Instruções enviadas.");
            alert.showAndWait();
        }
    }

    @FXML
    private void fechar() {

        Stage stage =
                (Stage) getemail.getScene().getWindow();

        stage.close();
    }
}