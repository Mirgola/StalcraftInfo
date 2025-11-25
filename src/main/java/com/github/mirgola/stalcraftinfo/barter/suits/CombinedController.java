package com.github.mirgola.stalcraftinfo.barter.suits;

import com.github.mirgola.stalcraftinfo.MenuBarBarterController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class CombinedController {
    MenuBarBarterController barterController;

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
    private Label combatLabel;
    @FXML
    private Label c4202_c4203Label;
    @FXML
    private Label c4204_c4205Label;
    @FXML
    private Label c4207_c4208Label;
    @FXML
    private Label c4216_c4217_c4218_c4219Label;

    @FXML
    private ImageView combatImageView;
    @FXML
    private ImageView c4202_c4203ImageView;
    @FXML
    private ImageView c4204_c4205ImageView;
    @FXML
    private ImageView c4207_c4208ImageView;
    @FXML
    private ImageView c4216_c4217_c4218_c4219ImageView;

    @FXML
    private Pane c4216_c4217_c4218_c4219Pane;

    public void setBarterController(MenuBarBarterController barterController) {
        this.barterController = barterController;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 1 Уровень");
            l2label.setText("Ставка Атамана | 4 Уровень");
            l3label.setText("Пожарная часть | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            combatLabel.setText("«Восход»");
            combatImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/5lrn1.png")));
            c4202_c4203Label.setText("Костюм «Аврора» с противогазом");
            c4202_c4203ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/j5ko0.png")));
            c4204_c4205Label.setText("Костюм «Грибник»");
            c4204_c4205ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/rwn2v.png")));
            c4207_c4208Label.setText("Костюм «Сокол»");
            c4207_c4208ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/knqvy.png")));
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 3 Уровень");
                l7label.setText("База «Рубежа» | 7 Уровень");
                c4216_c4217_c4218_c4219Label.setText("Экзоброня «Следак»");
                c4216_c4217_c4218_c4219ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/zzjzn.png")));
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 3 Уровень");
                l7label.setText("База «Зари» | 7 Уровень");
                c4216_c4217_c4218_c4219Label.setText("Экзоброня «Гончий»");
                c4216_c4217_c4218_c4219ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/rwgmg.png")));
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                c4216_c4217_c4218_c4219Pane.setVisible(false);
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            combatLabel.setText("«Громила»");
            combatImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/y352k.png")));
            c4202_c4203Label.setText("Бандитский костюм с противогазом");
            c4202_c4203ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/m06my.png")));
            c4204_c4205Label.setText("Костюм «Клептоман»");
            c4204_c4205ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/n4rm1.png")));
            c4207_c4208Label.setText("Костюм «Пересмешник»");
            c4207_c4208ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/qjogj.png")));
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 3 Уровень");
                l7label.setText("Лагерь «Наемников» | 7 Уровень");
                c4216_c4217_c4218_c4219Label.setText("Экзоброня «Каратель»");
                c4216_c4217_c4218_c4219ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/m034j.png")));

            }
            if (fraction.equals("Завет")) {
                l6label.setText("Обитель «Завета» | 3 Уровень");
                l7label.setText("Обитель «Завета» | 7 Уровень");
                c4216_c4217_c4218_c4219Label.setText("Экзокостюм «Миссионер»");
                c4216_c4217_c4218_c4219ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/96y6z.png")));
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                c4216_c4217_c4218_c4219Pane.setVisible(false);
            }
        }
    }

    @FXML
    private void handleCombat() throws IOException {
        barterController.handleCombat();
    }

    @FXML
    private void handleScientist() throws IOException {
        barterController.handleScientist();
    }
}
