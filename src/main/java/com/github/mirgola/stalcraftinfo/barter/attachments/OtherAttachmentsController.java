package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OtherAttachmentsController {
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
            l1label.setText("Пожарная часть | 3 Уровень");
            l2label.setText("Бар | 1 Уровень");
            l3label.setText("Бар | 2 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l5label.setText("База «Рубежа» | 1 Уровень");
            }
            if (fraction.equals("Заря")) {
                l5label.setText("База «Зари» | 1 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l5label.setText("Фракции Севера | 1 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 3 Уровень");
            l2label.setText("Бар | 1 Уровень");
            l3label.setText("Бар | 2 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l5label.setText("Лагерь «Наемников» | 1 Уровень");
            }
            if (fraction.equals("Завет")) {
                l5label.setText("Лагерь «Завета» | 1 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l5label.setText("Фракции Севера | 1 Уровень");
            }
        }
    }
}
