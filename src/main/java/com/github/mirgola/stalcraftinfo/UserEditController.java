package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserEditController {
    private Stage stage;
    private boolean okClicked = false;
    private String nickname;
    private String fraction;

    @FXML
    private Label stageLabel;
    @FXML
    private TextField nicknameField;
    @FXML
    private TextField fractionField;

    public boolean isOkClicked() {
        return okClicked;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFraction() {
        return fraction;
    }

    public void setStageLabel(String stageLabel) {
        this.stageLabel.setText(stageLabel);
    }

    public void setUser(String nickname, String fraction) {
        nicknameField.setText(nickname);
        fractionField.setText(fraction);
    }

    // Вызывается, когда пользователь кликнул по кнопке Отмена
    @FXML
    private void handleCancel() {
        stage.close();
    }

    @FXML
    private void handleOk() {
        if(isInputValid()) {
            nickname = nicknameField.getText();
            fraction = fractionField.getText();

            okClicked = true;
            stage.close();
        }
    }

    private  boolean isInputValid() {
        String errorMessage = "";

        if (nicknameField.getText() == null || nicknameField.getText().length() == 0 || nicknameField.getText().equalsIgnoreCase("null")) {
            errorMessage += "Поле 'Имя' не может быть пустым!\n";
        }

        if (fractionField.getText() == null || fractionField.getText().length() == 0 || fractionField.getText().equalsIgnoreCase("null")) {
            errorMessage += "Поле 'Фракция' не может быть пустым!!\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Показываем сообщение об ошибке.
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(stage);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Пожалуйста, исправьте неверные поля");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
