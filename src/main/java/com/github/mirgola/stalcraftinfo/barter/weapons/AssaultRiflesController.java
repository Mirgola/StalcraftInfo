package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.BarterController;
import com.github.mirgola.stalcraftinfo.SciApplication;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AssaultRiflesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    BarterController barterController;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label l1label;
    @FXML
    private Label l2label;
    @FXML
    private Label l3label;
    @FXML
    private Label l4label;
    @FXML
    private Label l5label;
    @FXML
    private Label l6label;
    @FXML
    private Label l7label;
    @FXML
    private Label l8label;
    @FXML
    private Label l9label;

    @FXML
    public void initialize() {
        setupDragHandlers();
    }

    public void setBarterController(BarterController barterController) {
        this.barterController = barterController;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 1 Уровень");
            l2label.setText("Ставка Атамана | 4 Уровень");
            l3label.setText("Пожарная часть | 1 Уровень");
            l4label.setText("Пожарная часть | 2 Уровень");
            l5label.setText("Бар | 3 Уровень");
            l6label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l7label.setText("База «Рубежа» | 4 Уровень");
                l8label.setText("База «Рубежа» | 6 Уровень");
                l9label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l7label.setText("База «Зари» | 4 Уровень");
                l8label.setText("База «Зари» | 6 Уровень");
                l9label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l7label.setText("Фракции Севера | 4 Уровень");
                l8label.setText("Фракции Севера | 6 Уровень");
                l9label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 1 Уровень");
            l4label.setText("Сельская школа | 2 Уровень");
            l5label.setText("Бар | 3 Уровень");
            l6label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l7label.setText("Лагерь «Наемников» | 4 Уровень");
                l8label.setText("Лагерь «Наемников» | 6 Уровень");
                l9label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l7label.setText("Лагерь «Завета» | 4 Уровень");
                l8label.setText("Лагерь «Завета» | 6 Уровень");
                l9label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l7label.setText("Фракции Севера | 4 Уровень");
                l8label.setText("Фракции Севера | 6 Уровень");
                l9label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    // Вызов окна Пулеметы
    @FXML
    private void handleMachineGuns() throws IOException {
        barterController.handleMachineGuns();
    }

    // Вызов окна Снайперские винтовки
    @FXML
    private void handleSniperRifles() throws IOException {
        barterController.handleSniperRifles();
    }

    private void setupDragHandlers() {
        anchorPane.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown()) {
                // Запоминаем начальные позиции
                initialX = anchorPane.getLayoutX();
                initialY = anchorPane.getLayoutY();
                mouseAnchorX = event.getSceneX();
                mouseAnchorY = event.getSceneY();

                // Запоминаем начальные значения скролла
                scrollInitialHvalue = scrollPane.getHvalue();
                scrollInitialVvalue = scrollPane.getVvalue();

                // Визуальная обратная связь
                //anchorPane.setStyle(anchorPane.getStyle() + "-fx-cursor: move; -fx-opacity: 0.9;");

                event.consume();
            }
        });

        anchorPane.setOnMouseDragged(event -> {
            if (event.isPrimaryButtonDown()) {
                // Вычисляем смещение мыши
                double deltaX = event.getSceneX() - mouseAnchorX;
                double deltaY = event.getSceneY() - mouseAnchorY;

                // ОБНОВЛЯЕМ СКРОЛЛПАНЕ ПРИ ПЕРЕТАСКИВАНИИ
                updateScrollOnDrag(deltaX, deltaY);

                // Также перемещаем AnchorPane (опционально)
                double newX = initialX + deltaX;
                double newY = initialY + deltaY;
                anchorPane.setLayoutX(newX);
                anchorPane.setLayoutY(newY);

                event.consume();
            }
        });

        /*anchorPane.setOnMouseReleased(event -> {
            // Возвращаем оригинальный стиль
            String originalStyle = anchorPane.getStyle();
            if (originalStyle.contains("-fx-opacity")) {
                originalStyle = originalStyle.replaceAll("-fx-cursor:.*?;", "")
                        .replaceAll("-fx-opacity:.*?;", "");
                anchorPane.setStyle(originalStyle);
            }
        });*/
    }

    private void updateScrollOnDrag(double deltaX, double deltaY) {
        // Коэффициент чувствительности скроллинга
        double scrollSensitivity = 0.001;

        // Вычисляем новые значения скролла на основе смещения мыши
        double newHvalue = scrollInitialHvalue - (deltaX * scrollSensitivity);
        double newVvalue = scrollInitialVvalue - (deltaY * scrollSensitivity);

        // Ограничиваем значения скролла в допустимых пределах [0, 1]
        newHvalue = Math.max(0, Math.min(1, newHvalue));
        newVvalue = Math.max(0, Math.min(1, newVvalue));

        // Применяем новые значения скролла
        scrollPane.setHvalue(newHvalue);
        scrollPane.setVvalue(newVvalue);
    }

}
