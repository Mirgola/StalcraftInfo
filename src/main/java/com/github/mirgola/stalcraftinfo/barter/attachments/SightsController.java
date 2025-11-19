package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SightsController {
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
    private Label l10label;
    @FXML
    private Label l11label;
    @FXML
    private Label l12label;
    @FXML
    private Label l13label;

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 2 Уровень");
            l2label.setText("Ставка Атамана | 4 Уровень");
            l3label.setText("Пожарная часть | 1 Уровень");
            l4label.setText("Пожарная часть | 2 Уровень");
            l5label.setText("Пожарная часть | 3 Уровень");
            l6label.setText("Пожарная часть | 4 Уровень");
            l7label.setText("Пожарная часть | 5 Уровень");
            l8label.setText("Бар | 1 Уровень");
            l9label.setText("Бар | 2 Уровень");
            l10label.setText("Бар | 3 Уровень");
            l11label.setText("Бар | 4 Уровень");
            l12label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l13label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l13label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 1 Уровень");
            l4label.setText("Сельская школа | 2 Уровень");
            l5label.setText("Сельская школа | 3 Уровень");
            l6label.setText("Сельская школа | 4 Уровень");
            l7label.setText("Сельская школа | 5 Уровень");
            l8label.setText("Бар | 1 Уровень");
            l9label.setText("Бар | 2 Уровень");
            l10label.setText("Бар | 3 Уровень");
            l11label.setText("Бар | 4 Уровень");
            l12label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l13label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l13label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
