package com.github.mirgola.stalcraftinfo.barter.suits;

import com.github.mirgola.stalcraftinfo.MenuBarBarterController;
import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.SQLException;

public class CombatController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private CombatCount combatCount;
    private MenuBarBarterController barterController;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label;

    @FXML
    private Label combinedLabel, c4105_c4106Label, c4112_c4113Label, c4116_c4117Label,  c4120_c4121Label, c4122_c4123_c4124_c4125Label,
                  c4126_c4127_c4128_c4129Label;

    @FXML
    private ImageView combinedImageView, c4105_c4106ImageView, c4112_c4113ImageView, c4116_c4117ImageView, c4120_c4121ImageView,
                      c4122_c4123_c4124_c4125ImageView, c4126_c4127_c4128_c4129ImageView;

    @FXML
    private Pane c4122_c4123_c4124_c4125Pane,  c4126_c4127_c4128_c4129Pane;

    @FXML
    private TextField c4101Field, c4102Field, c4103Field, c4104Field, c4105_c4106Field, c4107Field, c4108Field, c4109Field, c4110Field,
                      c4111Field, c4112_c4113Field, c4114Field, c4115Field, c4116_c4117Field, c4118Field, c4119Field, c4120_c4121Field,
                      c4122_c4123_c4124_c4125Field, c4126_c4127_c4128_c4129Field;

    @FXML
    public void initialize() {
        setupDragHandlers();
    }

    public void setPerson(Person person) {
        this.person = person;
    }

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

    public void setField(CombatCount combatCount, String fraction) {
        this.combatCount = combatCount;
        System.out.println(combatCount.getNicknamePerson());
        c4101Field.setText(Integer.toString(combatCount.getC4101()));
        c4102Field.setText(Integer.toString(combatCount.getC4102()));
        c4103Field.setText(Integer.toString(combatCount.getC4103()));
        c4104Field.setText(Integer.toString(combatCount.getC4104()));

        c4107Field.setText(Integer.toString(combatCount.getC4107()));
        c4108Field.setText(Integer.toString(combatCount.getC4108()));
        c4109Field.setText(Integer.toString(combatCount.getC4109()));
        c4110Field.setText(Integer.toString(combatCount.getC4110()));
        c4111Field.setText(Integer.toString(combatCount.getC4111()));

        c4114Field.setText(Integer.toString(combatCount.getC4114()));
        c4115Field.setText(Integer.toString(combatCount.getC4115()));

        c4118Field.setText(Integer.toString(combatCount.getC4118()));
        c4119Field.setText(Integer.toString(combatCount.getC4119()));

        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            c4105_c4106Field.setText(Integer.toString(combatCount.getC4105()));
            c4112_c4113Field.setText(Integer.toString(combatCount.getC4112()));
            c4116_c4117Field.setText(Integer.toString(combatCount.getC4116()));
            c4120_c4121Field.setText(Integer.toString(combatCount.getC4120()));
            if (fraction.equals("Рубеж")) {
                c4122_c4123_c4124_c4125Field.setText(Integer.toString(combatCount.getC4122()));
                c4126_c4127_c4128_c4129Field.setText(Integer.toString(combatCount.getC4126()));
            }
            if (fraction.equals("Заря")) {
                c4122_c4123_c4124_c4125Field.setText(Integer.toString(combatCount.getC4123()));
                c4126_c4127_c4128_c4129Field.setText(Integer.toString(combatCount.getC4127()));
            }
        }
        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")){
            c4105_c4106Field.setText(Integer.toString(combatCount.getC4106()));
            c4112_c4113Field.setText(Integer.toString(combatCount.getC4113()));
            c4116_c4117Field.setText(Integer.toString(combatCount.getC4117()));
            c4120_c4121Field.setText(Integer.toString(combatCount.getC4121()));
            if (fraction.equals("Наемники")) {
                c4122_c4123_c4124_c4125Field.setText(Integer.toString(combatCount.getC4124()));
                c4126_c4127_c4128_c4129Field.setText(Integer.toString(combatCount.getC4128()));
            }
            if (fraction.equals("Завет")) {
                c4122_c4123_c4124_c4125Field.setText(Integer.toString(combatCount.getC4125()));
                c4126_c4127_c4128_c4129Field.setText(Integer.toString(combatCount.getC4129()));
            }
        }
    }

    @FXML
    private void handleCombined() throws IOException {
        barterController.handleCombined();
    }

    private void setupDragHandlers() {
        anchorPane.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown()) {
                // Запоминаем начальные позиции
                initialX = anchorPane.getLayoutX();
                initialY = anchorPane.getLayoutY();
                mouseAnchorX = event.getSceneX();
                mouseAnchorY = event.getSceneY();

                // Запоминаем начальные значения скролла
                scrollInitialHvalue = scrollPane.getHvalue();
                scrollInitialVvalue = scrollPane.getVvalue();

                // Визуальная обратная связь
                anchorPane.setStyle(anchorPane.getStyle() + "-fx-cursor: move; -fx-opacity: 0.9;");

                event.consume();
            }
        });

        anchorPane.setOnMouseDragged(event -> {
            if (event.isPrimaryButtonDown()) {
                // Вычисляем смещение мыши
                double deltaX = event.getSceneX() - mouseAnchorX;
                double deltaY = event.getSceneY() - mouseAnchorY;

                // ОБНОВЛЯЕМ СКРОЛЛПАНЕ ПРИ ПЕРЕТАСКИВАНИИ
                updateScrollOnDrag(deltaX, deltaY);

                // Также перемещаем AnchorPane (опционально)
                double newX = initialX + deltaX;
                double newY = initialY + deltaY;
                anchorPane.setLayoutX(newX);
                anchorPane.setLayoutY(newY);

                event.consume();
            }
        });

        anchorPane.setOnMouseReleased(event -> {
            // Возвращаем оригинальный стиль
            String originalStyle = anchorPane.getStyle();
            if (originalStyle.contains("-fx-opacity")) {
                originalStyle = originalStyle.replaceAll("-fx-cursor:.*?;", "")
                        .replaceAll("-fx-opacity:.*?;", "");
                anchorPane.setStyle(originalStyle);
            }
        });
    }

    private void updateScrollOnDrag(double deltaX, double deltaY) {
        // Коэффициент чувствительности скроллинга
        double scrollSensitivity = 0.002;

        // Вычисляем новые значения скролла на основе смещения мыши
        double newHvalue = scrollInitialHvalue - (deltaX * scrollSensitivity);
        double newVvalue = scrollInitialVvalue - (deltaY * scrollSensitivity);

        // Ограничиваем значения скролла в допустимых пределах [0, 1]
        newHvalue = Math.max(0, Math.min(1, newHvalue));
        newVvalue = Math.max(0, Math.min(1, newVvalue));

        // Применяем новые значения скролла
        scrollPane.setHvalue(newHvalue);
        scrollPane.setVvalue(newVvalue);
    }

    @FXML
    private void handleC4101Field() throws SQLException {
        if(c4101Field.isEditable()){
            combatCount.setC4101(Integer.parseInt(c4101Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4101Field.setEditable(false);
        } else {
            c4101Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4102Field() throws SQLException {
        if(c4102Field.isEditable()){
            combatCount.setC4102(Integer.parseInt(c4102Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4102Field.setEditable(false);
        } else {
            c4102Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4103Field() throws SQLException {
        if(c4103Field.isEditable()){
            combatCount.setC4103(Integer.parseInt(c4103Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4103Field.setEditable(false);
        } else {
            c4103Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4104Field() throws SQLException {
        if(c4104Field.isEditable()){
            combatCount.setC4104(Integer.parseInt(c4104Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4104Field.setEditable(false);
        } else {
            c4104Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4105_c4106Field() throws SQLException {
        if(c4105_c4106Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combatCount.setC4105(Integer.parseInt(c4105_c4106Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combatCount.setC4106(Integer.parseInt(c4105_c4106Field.getText()));
            }
            SciDB.updateCombatCount(person, combatCount);
            c4105_c4106Field.setEditable(false);
        } else {
            c4105_c4106Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4107Field() throws SQLException {
        if(c4107Field.isEditable()){
            combatCount.setC4107(Integer.parseInt(c4107Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4107Field.setEditable(false);
        } else {
            c4107Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4108Field() throws SQLException {
        if(c4108Field.isEditable()){
            combatCount.setC4108(Integer.parseInt(c4108Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4108Field.setEditable(false);
        } else {
            c4108Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4109Field() throws SQLException {
        if(c4109Field.isEditable()){
            combatCount.setC4109(Integer.parseInt(c4109Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4109Field.setEditable(false);
        } else {
            c4109Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4110Field() throws SQLException {
        if(c4110Field.isEditable()){
            combatCount.setC4110(Integer.parseInt(c4110Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4110Field.setEditable(false);
        } else {
            c4110Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4111Field() throws SQLException {
        if(c4111Field.isEditable()){
            combatCount.setC4111(Integer.parseInt(c4111Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4111Field.setEditable(false);
        } else {
            c4111Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4112_c4113Field() throws SQLException {
        if(c4112_c4113Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combatCount.setC4112(Integer.parseInt(c4112_c4113Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combatCount.setC4113(Integer.parseInt(c4112_c4113Field.getText()));
            }
            SciDB.updateCombatCount(person, combatCount);
            c4112_c4113Field.setEditable(false);
        } else {
            c4112_c4113Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4114Field() throws SQLException {
        if(c4114Field.isEditable()){
            combatCount.setC4114(Integer.parseInt(c4114Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4114Field.setEditable(false);
        } else {
            c4114Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4115Field() throws SQLException {
        if(c4115Field.isEditable()){
            combatCount.setC4115(Integer.parseInt(c4115Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4115Field.setEditable(false);
        } else {
            c4115Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4116_c4117Field() throws SQLException {
        if(c4116_c4117Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combatCount.setC4116(Integer.parseInt(c4116_c4117Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combatCount.setC4117(Integer.parseInt(c4116_c4117Field.getText()));
            }
            SciDB.updateCombatCount(person, combatCount);
            c4116_c4117Field.setEditable(false);
        } else {
            c4116_c4117Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4118Field() throws SQLException {
        if(c4118Field.isEditable()){
            combatCount.setC4118(Integer.parseInt(c4118Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4118Field.setEditable(false);
        } else {
            c4118Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4119Field() throws SQLException {
        if(c4119Field.isEditable()){
            combatCount.setC4119(Integer.parseInt(c4119Field.getText()));
            SciDB.updateCombatCount(person, combatCount);
            c4119Field.setEditable(false);
        } else {
            c4119Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4120_c4121Field() throws SQLException {
        if(c4120_c4121Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combatCount.setC4120(Integer.parseInt(c4120_c4121Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combatCount.setC4121(Integer.parseInt(c4120_c4121Field.getText()));
            }
            SciDB.updateCombatCount(person, combatCount);
            c4120_c4121Field.setEditable(false);
        } else {
            c4120_c4121Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4122_c4123_c4124_c4125Field() throws SQLException {
        if(c4122_c4123_c4124_c4125Field.isEditable()){
            if (person.getFraction().equals("Рубеж")) {
                combatCount.setC4122(Integer.parseInt(c4122_c4123_c4124_c4125Field.getText()));
            }
            if (person.getFraction().equals("Заря")) {
                combatCount.setC4123(Integer.parseInt(c4122_c4123_c4124_c4125Field.getText()));
            }
            if (person.getFraction().equals("Наемники")) {
                combatCount.setC4124(Integer.parseInt(c4122_c4123_c4124_c4125Field.getText()));
            }
            if (person.getFraction().equals("Завет")) {
                combatCount.setC4125(Integer.parseInt(c4122_c4123_c4124_c4125Field.getText()));
            }
            SciDB.updateCombatCount(person, combatCount);
            c4122_c4123_c4124_c4125Field.setEditable(false);
        } else {
            c4122_c4123_c4124_c4125Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4126_c4127_c4128_c4129Field() throws SQLException {
        if(c4126_c4127_c4128_c4129Field.isEditable()){
            if (person.getFraction().equals("Рубеж")) {
                combatCount.setC4126(Integer.parseInt(c4126_c4127_c4128_c4129Field.getText()));
            }
            if (person.getFraction().equals("Заря")) {
                combatCount.setC4127(Integer.parseInt(c4126_c4127_c4128_c4129Field.getText()));
            }
            if (person.getFraction().equals("Наемники")) {
                combatCount.setC4128(Integer.parseInt(c4126_c4127_c4128_c4129Field.getText()));
            }
            if (person.getFraction().equals("Завет")) {
                combatCount.setC4129(Integer.parseInt(c4126_c4127_c4128_c4129Field.getText()));
            }
            SciDB.updateCombatCount(person, combatCount);
            c4126_c4127_c4128_c4129Field.setEditable(false);
        } else {
            c4126_c4127_c4128_c4129Field.setEditable(true);
        }
    }
}
