package com.empresa.javafxscenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class HelloController {
    @FXML
    private TextField emailField, passwordField, confirmPasswordField;
    @FXML
    private DatePicker registrationDate;
    @FXML
    private CheckBox privacyCheckbox;
    @FXML
    private Label statusLabel;

    @FXML
    public void onRegisterButtonClick() {
        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            statusLabel.setText("Las contraseñas no coinciden.");
            return;
        }
        if (privacyCheckbox.isSelected()) {
            statusLabel.setText("Usuario registrado.");
        } else {
            statusLabel.setText("Debe aceptar la política de privacidad.");
        }
    }

    @FXML
    public void onLoginButtonClick() {
        if (emailField.getText().equals("admin@gmail.com") && passwordField.getText().equals("123")) {
            statusLabel.setText("Inicio correcto.");
        } else {
            statusLabel.setText("Datos incorrectos.");
        }
    }
}
