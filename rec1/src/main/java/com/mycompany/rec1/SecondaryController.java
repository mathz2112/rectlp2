package com.mycompany.rec1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Matheus Muniz - 1212B
 */
public class SecondaryController {
    @FXML
    private TextField getNome; 

    @FXML
    private TextField getEmail; 

    @FXML
    private TextField getCodigo; 

    @FXML
    private ComboBox<String> categoria;

    @FXML
    private CheckBox termo; 

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void salvar() throws IOException {
        String nome = getNome.getText();
        String email = getEmail.getText(); 
        String codigo = getCodigo.getText(); 
        String categorias = categoria.getValue();
        boolean termos = termo.isSelected(); 

        if(nome.isEmpty() || email.isEmpty() || codigo.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Preencha todos os campos!");
            alert.showAndWait();

        }
        else if(codigo.length() < 6) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Código deve ter pelo menos 6 caracteres!");
            alert.showAndWait();

        } 
        else if(categorias == null) { 
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Selecione uma categoria!");
            alert.showAndWait();

        }
        else if(!termos) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Erro!");
            alert.setContentText("Aceite os termos!");
            alert.showAndWait();

        }
        else {
            Lista.lista.add(
                    new Leitor(nome,email,codigo,categorias,termos)
            );

            Alert alert = new Alert(Alert.AlertType.INFORMATION); 
            alert.setTitle("Tudo certo!"); 
            alert.setContentText("Cadastro realizado!"); 
            alert.showAndWait();

            getNome.clear();
            getEmail.clear(); 
            getCodigo.clear(); 
            categoria.setValue(null);
            termo.setSelected(false);
        }
    }
}