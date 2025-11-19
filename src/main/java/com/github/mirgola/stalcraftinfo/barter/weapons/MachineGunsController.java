package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.BarterController;
import com.github.mirgola.stalcraftinfo.SciApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

import java.io.IOException;

public class MachineGunsController {
    BarterController barterController;

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

    public void setBarterController(BarterController barterController) {
        this.barterController = barterController;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Пожарная часть | 2 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l4label.setText("База «Рубежа» | 4 Уровень");
                l5label.setText("База «Рубежа» | 6 Уровень");
            }
            if (fraction.equals("Заря")) {
                l4label.setText("База «Зари» | 4 Уровень");
                l5label.setText("База «Зари» | 6 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l4label.setText("Фракции Севера | 4 Уровень");
                l5label.setText("Фракции Севера | 6 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 2 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l4label.setText("Лагерь «Наемников» | 4 Уровень");
                l5label.setText("Лагерь «Наемников» | 6 Уровень");
            }
            if (fraction.equals("Завет")) {
                l4label.setText("Лагерь «Завета» | 4 Уровень");
                l5label.setText("Лагерь «Завета» | 6 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l4label.setText("Фракции Севера | 4 Уровень");
                l5label.setText("Фракции Севера | 6 Уровень");
            }
        }
    }

    // Вызов окна Автоматы
    @FXML
    private void handleAssaultRifles() throws IOException {
        barterController.handleAssaultRifles();
    }
}
