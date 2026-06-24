package com.mycompany.rec1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 *
 * @author Matheus Muniz - 1212B
 */
public class PrimaryController {

    @FXML
    private TextField getemail;

    @FXML
    private TextField getcodigo;

    @FXML
    private void entrar() throws IOException {
        String email = getemail.getText();
        String codigo = getcodigo.getText();

        if(email.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Preencha o campo Email!");
            alert.showAndWait();

        }
        else if(codigo.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Preencha o campo Código!");
            alert.showAndWait();

        } 
        else {
            boolean encontrado = false; 

            for(Leitor l : Lista.lista) { 
                if(l.getEmail().equals(email) &&
                   l.getCodigo().equals(codigo)) {
                    encontrado = true; 
                }
            }

            if(encontrado) { 
                App.setRoot("quartenary");

            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR); 
                alert.setTitle("Erro!");
                alert.setContentText("Email ou código inválidos!");
                alert.showAndWait();
            }
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
