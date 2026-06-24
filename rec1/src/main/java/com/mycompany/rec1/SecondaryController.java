package com.mycompany.rec1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
    public void initialize() {

        categoria.getItems().addAll(
                "Estudante",
                "Professor"
        );
    }

    @FXML
    private void salvar() {

        String nome = getNome.getText();
        String email = getEmail.getText();
        String codigo = getCodigo.getText();

        if (nome.isEmpty()
                || email.isEmpty()
                || codigo.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Preencha todos os campos.");
            alert.showAndWait();
            return;
        }

        if (codigo.length() < 6) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Código deve ter no mínimo 6 caracteres.");
            alert.showAndWait();
            return;
        }

        if (categoria.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Selecione uma categoria.");
            alert.showAndWait();
            return;
        }

        if (!termo.isSelected()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Aceite os termos.");
            alert.showAndWait();
            return;
        }

        Lista.lista.add(
                new Leitor(
                        nome,
                        email,
                        codigo,
                        categoria.getValue(),
                        true
                )
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Cadastro realizado com sucesso.");
        alert.showAndWait();

        getNome.clear();
        getEmail.clear();
        getCodigo.clear();
        categoria.setValue(null);
        termo.setSelected(false);
    }

    @FXML
    private void voltar() throws IOException {
        App.setRoot("primary");
    }
}