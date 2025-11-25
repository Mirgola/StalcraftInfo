package com.github.mirgola.stalcraftinfo.barter.suits;

import com.github.mirgola.stalcraftinfo.MenuBarBarterController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class CombatController {
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
    private Label combinedLabel;
    @FXML
    private Label c4105_c4106Label;
    @FXML
    private Label c4112_c4113Label;
    @FXML
    private Label c4116_c4117Label;
    @FXML
    private Label c4120_c4121Label;
    @FXML
    private Label c4122_c4123_c4124_c4125Label;
    @FXML
    private Label c4126_c4127_c4128_c4129Label;

    @FXML
    private ImageView combinedImageView;
    @FXML
    private ImageView c4105_c4106ImageView;
    @FXML
    private ImageView c4112_c4113ImageView;
    @FXML
    private ImageView c4116_c4117ImageView;
    @FXML
    private ImageView c4120_c4121ImageView;
    @FXML
    private ImageView c4122_c4123_c4124_c4125ImageView;
    @FXML
    private ImageView c4126_c4127_c4128_c4129ImageView;

    @FXML
    private Pane c4122_c4123_c4124_c4125Pane;
    @FXML
    private Pane c4126_c4127_c4128_c4129Pane;

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
            combinedLabel.setText("Костюм «Сокол»");
            combinedImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/knqvy.png")));
            c4105_c4106Label.setText("«Комбат-5М»");
            c4105_c4106ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/p6m3w.png")));
            c4112_c4113Label.setText("«Восход»");
            c4112_c4113ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/5lrn1.png")));
            c4116_c4117Label.setText("«Самсон»");
            c4116_c4117ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/7lm56.png")));
            c4120_c4121Label.setText("Экзоброня «Мул»");
            c4120_c4121ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/g43k0.png")));
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 3 Уровень");
                l7label.setText("База «Рубежа» | 7 Уровень");
                c4122_c4123_c4124_c4125Label.setText("Бронекостюм «Гранит»");
                c4122_c4123_c4124_c4125ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/1rpl6.png")));
                c4126_c4127_c4128_c4129Label.setText("Бронекостюм «Авангард»");
                c4126_c4127_c4128_c4129ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/0rn7d.png")));
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 3 Уровень");
                l7label.setText("База «Зари» | 7 Уровень");
                c4122_c4123_c4124_c4125Label.setText("Бронекостюм «Вождь»");
                c4122_c4123_c4124_c4125ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/g4310.png")));
                c4126_c4127_c4128_c4129Label.setText("Бронекостюм «Прометей»");
                c4126_c4127_c4128_c4129ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/y3q3o.png")));
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                c4122_c4123_c4124_c4125Pane.setVisible(false);
                c4126_c4127_c4128_c4129Pane.setVisible(false);
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            combinedLabel.setText("Костюм «Пересмешник»");
            combinedImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combined/qjogj.png")));
            c4105_c4106Label.setText("«Червь»");
            c4105_c4106ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/vj12r.png")));
            c4112_c4113Label.setText("«Громила»");
            c4112_c4113ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/y352k.png")));
            c4116_c4117Label.setText("«Масть»");
            c4116_c4117ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/6w0zp.png")));
            c4120_c4121Label.setText("Экзоброня «Туз»");
            c4120_c4121ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/zzjk2.png")));
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 3 Уровень");
                l7label.setText("Лагерь «Наемников» | 7 Уровень");
                c4122_c4123_c4124_c4125Label.setText("Бронекостюм «Рейтар»");
                c4122_c4123_c4124_c4125ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/96yz0.png")));
                c4126_c4127_c4128_c4129Label.setText("Бронекостюм «Ронин»");
                c4126_c4127_c4128_c4129ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/6wgwy.png")));
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Обитель «Завета» | 3 Уровень");
                l7label.setText("Обитель «Завета» | 7 Уровень");
                c4122_c4123_c4124_c4125Label.setText("Бронекостюм «Апостол»");
                c4122_c4123_c4124_c4125ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/ly3kj.png")));
                c4126_c4127_c4128_c4129Label.setText("Бронекостюм «Храмовник»");
                c4126_c4127_c4128_c4129ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/combat/1rpr1.png")));
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                c4122_c4123_c4124_c4125Pane.setVisible(false);
                c4126_c4127_c4128_c4129Pane.setVisible(false);
            }
        }
    }

    @FXML
    private void handleCombined() throws IOException {
        barterController.handleCombined();
    }
}
