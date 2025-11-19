package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DevicesController {
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

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 1 Уровень");
            l2label.setText("Пожарная часть | 1 Уровень");
            l3label.setText("Пожарная часть | 3 Уровень");
            l4label.setText("Пожарная часть | 4 Уровень");
            l5label.setText("Бар | 1 Уровень");
            l6label.setText("Бар | 3 Уровень");
            l7label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l8label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l8label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Сельская школа | 1 Уровень");
            l3label.setText("Сельская школа | 3 Уровень");
            l4label.setText("Сельская школа | 4 Уровень");
            l5label.setText("Бар | 1 Уровень");
            l6label.setText("Бар | 3 Уровень");
            l7label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l8label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l8label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
