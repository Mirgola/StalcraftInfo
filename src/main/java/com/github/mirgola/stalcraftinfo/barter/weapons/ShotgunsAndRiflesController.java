package com.github.mirgola.stalcraftinfo.barter.weapons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ShotgunsAndRiflesController {
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
            l1label.setText("Ставка Атамана | 1 Уровень");
            l2label.setText("Ставка Атамана | 2 Уровень");
            l3label.setText("Ставка Атамана | 3 Уровень");
            l4label.setText("Пожарная часть | 1 Уровень");
            l5label.setText("Пожарная часть | 2 Уровень");
            l6label.setText("Пожарная часть | 3 Уровень");
            l7label.setText("Бар | 2 Уровень");
            l8label.setText("Бар | 5 Уровень");
            l9label.setText("Бар | 6 Уровень");
            l10label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l11label.setText("База «Рубежа» | 3 Уровень");
                l12label.setText("База «Рубежа» | 6 Уровень");
                l13label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l11label.setText("База «Зари» | 3 Уровень");
                l12label.setText("База «Зари» | 6 Уровень");
                l13label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l11label.setText("Фракции Севера | 3 Уровень");
                l12label.setText("Фракции Севера | 6 Уровень");
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 2 Уровень");
            l3label.setText("Лодочная станция | 3 Уровень");
            l4label.setText("Сельская школа | 1 Уровень");
            l5label.setText("Сельская школа | 2 Уровень");
            l6label.setText("Сельская школа | 3 Уровень");
            l7label.setText("Бар | 2 Уровень");
            l8label.setText("Бар | 5 Уровень");
            l9label.setText("Бар | 6 Уровень");
            l10label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l11label.setText("Лагерь «Наемников» | 3 Уровень");
                l12label.setText("Лагерь «Наемников» | 6 Уровень");
                l13label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l11label.setText("Лагерь «Завета» | 3 Уровень");
                l12label.setText("Лагерь «Завета» | 6 Уровень");
                l13label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l11label.setText("Фракции Севера | 3 Уровень");
                l12label.setText("Фракции Севера | 6 Уровень");
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
