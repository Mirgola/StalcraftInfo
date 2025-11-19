package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MagazinesController {
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

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 2 Уровень");
            l2label.setText("Пожарная часть | 3 Уровень");
            l3label.setText("Бар | 1 Уровень");
            l4label.setText("Бар | 3 Уровень");
            l5label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 3 Уровень");
                l7label.setText("База «Рубежа» | 5 Уровень");
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 3 Уровень");
                l7label.setText("База «Зари» | 5 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 5 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Сельская школа | 2 Уровень");
            l3label.setText("Бар | 1 Уровень");
            l4label.setText("Бар | 3 Уровень");
            l5label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 3 Уровень");
                l7label.setText("Лагерь «Наемников» | 5 Уровень");
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Лагерь «Завета» | 3 Уровень");
                l7label.setText("Лагерь «Завета» | 5 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 5 Уровень");
            }
        }
    }
}
