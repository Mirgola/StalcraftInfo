package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OtherController {
    @FXML
    private Label l1label;
    @FXML
    private Label l2label;

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Бар | 1 Уровень");
            if (fraction.equals("Рубеж")) {
                l2label.setText("База «Рубежа» | 1 Уровень");
            }
            if (fraction.equals("Заря")) {
                l2label.setText("База «Зари» | 1 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l2label.setText("Фракции Севера | 1 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Бар | 1 Уровень");
            if (fraction.equals("Наемники")) {
                l2label.setText("Лагерь «Наемников» | 1 Уровень");
            }
            if (fraction.equals("Завет")) {
                l2label.setText("Лагерь «Завета» | 1 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l2label.setText("Фракции Севера | 1 Уровень");
            }
        }
    }
}
