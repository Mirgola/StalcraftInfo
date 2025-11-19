package com.github.mirgola.stalcraftinfo.barter.suits;

import com.github.mirgola.stalcraftinfo.BarterController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ScientistController {
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
    @FXML
    private Label l6label;
    @FXML
    private Label l7label;

    @FXML
    private Label s4303_s4304Label;
    @FXML
    private Label s4307_s4308Label;
    @FXML
    private Label s4310_s4311_s4312_s4313Label;

    @FXML
    private ImageView s4303_s4304ImageView;
    @FXML
    private ImageView s4307_s4308ImageView;
    @FXML
    private ImageView s4310_s4311_s4312_s4313ImageView;
    @FXML
    private Pane s4310_s4311_s4312_s4313Pane;

    public void setBarterController(BarterController barterController) {
        this.barterController = barterController;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 1 Уровень");
            l2label.setText("Ставка Атамана | 4 Уровень");
            l3label.setText("Пожарная часть | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            s4303_s4304Label.setText("«Аврора-Б»");
            s4303_s4304ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/lyj2k.png")));
            s4307_s4308Label.setText("«Уран»");
            s4307_s4308ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/g4ym6.png")));
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 3 Уровень");
                l7label.setText("База «Рубежа» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Ковчег»»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/g434p.png")));
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 3 Уровень");
                l7label.setText("База «Зари» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Орион»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/5l1l0.png")));
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                s4310_s4311_s4312_s4313Pane.setVisible(false);
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            s4303_s4304Label.setText("«Бандитский костюм с баллонами»");
            s4303_s4304ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/ok0m6.png")));
            s4307_s4308Label.setText("«Жнец»");
            s4307_s4308ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/zzy2y.png")));
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 3 Уровень");
                l7label.setText("Лагерь «Наемников» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Навигатор»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/7lzl7.png")));
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Обитель «Завета» | 3 Уровень");
                l7label.setText("Обитель «Завета» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Пересвет»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/wj4lp.png")));
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                s4310_s4311_s4312_s4313Pane.setVisible(false);
            }
        }
    }

    @FXML
    private void handleCombined() throws IOException {
        barterController.handleCombined();
    }
}
