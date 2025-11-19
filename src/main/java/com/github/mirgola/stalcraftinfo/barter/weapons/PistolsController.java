package com.github.mirgola.stalcraftinfo.barter.weapons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PistolsController {
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
            l2label.setText("Ставка Атамана | 3 Уровень");
            l3label.setText("Пожарная часть | 1 Уровень");
            l4label.setText("Пожарная часть | 5 Уровень");
            l5label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 2 Уровень");
                l7label.setText("База «Рубежа» | 6 Уровень");
                l8label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 2 Уровень");
                l7label.setText("База «Зари» | 6 Уровень");
                l8label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 2 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 3 Уровень");
            l3label.setText("Сельская школа | 1 Уровень");
            l4label.setText("Сельская школа | 5 Уровень");
            l5label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 2 Уровень");
                l7label.setText("Лагерь «Наемников» | 6 Уровень");
                l8label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Лагерь «Завета» | 2 Уровень");
                l7label.setText("Лагерь «Завета» | 6 Уровень");
                l8label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 2 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
