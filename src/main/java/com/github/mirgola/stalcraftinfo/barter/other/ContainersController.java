package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ContainersController {
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

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 2 Уровень");
            l2label.setText("Пожарная часть | 1 Уровень");
            l3label.setText("Бар | 1 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l5label.setText("База «Рубежа» | 2 Уровень");
                l6label.setText("База «Рубежа» | 5 Уровень");
            }
            if (fraction.equals("Заря")) {
                l5label.setText("База «Зари» | 2 Уровень");
                l6label.setText("База «Зари» | 5 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l5label.setText("Фракции Севера | 2 Уровень");
                l6label.setText("Фракции Севера | 5 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Сельская школа | 1 Уровень");
            l3label.setText("Бар | 1 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l5label.setText("Лагерь «Наемников» | 2 Уровень");
                l6label.setText("Лагерь «Наемников» | 5 Уровень");
            }
            if (fraction.equals("Завет")) {
                l5label.setText("Лагерь «Завета» | 2 Уровень");
                l6label.setText("Лагерь «Завета» | 5 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l5label.setText("Фракции Севера | 2 Уровень");
                l6label.setText("Фракции Севера | 5 Уровень");
            }
        }
    }
}
