/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rec1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Matheus Muniz - 1212B
 */
public class TertieryController {

    @FXML
    private TextField getemail; 

    @FXML
    private void recuperar() {
        String email = getemail.getText(); 

        if(email.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Preencha o Email!");
            alert.showAndWait();
        } 
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Tudo certo!");
            alert.setContentText("Informações enviadas!");
            alert.showAndWait();
        }
    }

    @FXML
    private void fechar() throws IOException {
        App.setRoot("primary");
    }

}
