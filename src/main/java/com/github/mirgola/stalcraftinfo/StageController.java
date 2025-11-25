package com.github.mirgola.stalcraftinfo;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StageController {
    private double xOffset;
    private double yOffset;
    private Stage stage;
    private Scene scene;

    public void setSciApplication(SciApplication sciApplication) {
        stage = sciApplication.getPrimaryStage();
        scene = sciApplication.getScene();
    }

    // Закрытие приложения
    @FXML
    private void closeButton() {
        stage.close();
    }

    // Сворачяивание окна
    @FXML
    private void minimizeButton() {
        stage.setIconified(true);
    }

    // Перемещение окна приложения при нажатии лкм
    @FXML
    private void getOnMousePressed() {
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = stage.getX() - event.getScreenX();
                yOffset = stage.getY() - event.getScreenY();
            }
        });
    }

    // Фиксация положения окна приложения при отжатии лкм
    @FXML
    private void getOnMouseDragged() {
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() + xOffset);
                stage.setY(event.getScreenY() + yOffset);
            }
        });
    }
}
