package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AccessoriesController {
    @FXML
    private Label l1label;

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            if (fraction.equals("Рубеж")) {
                l1label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l1label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l1label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            if (fraction.equals("Наемники")) {
                l1label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l1label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l1label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
