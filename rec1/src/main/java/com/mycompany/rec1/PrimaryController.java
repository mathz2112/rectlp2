package com.mycompany.rec1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {

    @FXML
    private javafx.scene.control.TextField getemail;

    @FXML
    private javafx.scene.control.TextField getcodigo;

    @FXML
    private void entrar() throws IOException {

        String email = getemail.getText();
        String codigo = getcodigo.getText();

        if (email.isEmpty() || codigo.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Preencha todos os campos.");
            alert.showAndWait();
            return;
        }

        boolean encontrado = false;

        for (Leitor l : Lista.lista) {

            if (l.getEmail().equals(email)
                    && l.getCodigo().equals(codigo)) {

                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            App.setRoot("quartenary");
        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Email ou código inválidos.");
            alert.showAndWait();
        }
    }

    @FXML
    private void cadastrar() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void recuperar() throws IOException {
        App.setRoot("tertiery");
    }
}