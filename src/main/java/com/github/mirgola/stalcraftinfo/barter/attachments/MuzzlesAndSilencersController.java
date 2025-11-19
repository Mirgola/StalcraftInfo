package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MuzzlesAndSilencersController {
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
            l1label.setText("Пожарная часть | 4 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 6 Уровень");
            if (fraction.equals("Рубеж")) {
                l4label.setText("База «Рубежа» | 2 Уровень");
                l5label.setText("База «Рубежа» | 4 Уровень");
                l6label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l4label.setText("База «Зари» | 2 Уровень");
                l5label.setText("База «Зари» | 4 Уровень");
                l6label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l4label.setText("Фракции Севера | 2 Уровень");
                l5label.setText("Фракции Севера | 4 Уровень");
                l6label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 4 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 6 Уровень");
            if (fraction.equals("Наемники")) {
                l4label.setText("Лагерь «Наемников» | 2 Уровень");
                l5label.setText("Лагерь «Наемников» | 4 Уровень");
                l6label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l4label.setText("Лагерь «Завета» | 2 Уровень");
                l5label.setText("Лагерь «Завета» | 4 Уровень");
                l6label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l4label.setText("Фракции Севера | 2 Уровень");
                l5label.setText("Фракции Севера | 4 Уровень");
                l6label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }
}
