package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CosmeticsController {
    @FXML
    private Label l1label;
    @FXML
    private Label l2label;

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            if (fraction.equals("Рубеж")) {
                l1label.setText("База «Рубежа» | 5 Уровень");
                l2label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l1label.setText("База «Зари» | 5 Уровень");
                l2label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l1label.setText("Фракции Севера | 5 Уровень");
                l2label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            if (fraction.equals("Наемники")) {
                l1label.setText("Лагерь «Наемников» | 5 Уровень");
                l2label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l1label.setText("Лагерь «Завета» | 5 Уровень");
                l2label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l1label.setText("Фракции Севера | 5 Уровень");
                l2label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
