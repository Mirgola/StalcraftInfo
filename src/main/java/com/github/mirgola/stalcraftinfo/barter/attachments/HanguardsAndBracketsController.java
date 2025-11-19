package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HanguardsAndBracketsController {
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

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 2 Уровень");
            l2label.setText("Пожарная часть | 1 Уровень");
            l3label.setText("Пожарная часть | 3 Уровень");
            l4label.setText("Бар | 1 Уровень");
            l5label.setText("Бар | 7 Уровень");
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Сельская школа | 1 Уровень");
            l3label.setText("Сельская школа | 3 Уровень");
            l4label.setText("Бар | 1 Уровень");
            l5label.setText("Бар | 7 Уровень");
        }
    }
}
