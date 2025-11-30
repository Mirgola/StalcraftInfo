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

public class CombinedController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private CombinedCount combinedCount;
    private MenuBarBarterController barterController;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label;

    @FXML
    private Label combatLabel, c4202_c4203Label, c4204_c4205Label, c4207_c4208Label, c4216_c4217_c4218_c4219Label;

    @FXML
    private ImageView combatImageView, c4202_c4203ImageView, c4204_c4205ImageView, c4207_c4208ImageView, c4216_c4217_c4218_c4219ImageView;

    @FXML
    private Pane c4216_c4217_c4218_c4219Pane;

    @FXML
    private TextField c4201Field, c4202_c4203Field, c4204_c4205Field, c4206Field, c4207_c4208Field, c4209Field, c4210Field,
                      c4211Field, c4212Field, c4213Field, c4214Field, c4215Field, c4216_c4217_c4218_c4219Field;

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

    public void setField(CombinedCount combinedCount, String fraction) {
        this.combinedCount = combinedCount;
        System.out.println(combinedCount.getNicknamePerson());
        c4201Field.setText(Integer.toString(combinedCount.getC4201()));

        c4206Field.setText(Integer.toString(combinedCount.getC4206()));

        c4209Field.setText(Integer.toString(combinedCount.getC4209()));
        c4210Field.setText(Integer.toString(combinedCount.getC4210()));
        c4211Field.setText(Integer.toString(combinedCount.getC4211()));
        c4212Field.setText(Integer.toString(combinedCount.getC4212()));
        c4213Field.setText(Integer.toString(combinedCount.getC4213()));
        c4214Field.setText(Integer.toString(combinedCount.getC4214()));
        c4215Field.setText(Integer.toString(combinedCount.getC4215()));

        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            c4202_c4203Field.setText(Integer.toString(combinedCount.getC4202()));
            c4204_c4205Field.setText(Integer.toString(combinedCount.getC4204()));
            c4207_c4208Field.setText(Integer.toString(combinedCount.getC4207()));
            if (fraction.equals("Рубеж")) {
                c4216_c4217_c4218_c4219Field.setText(Integer.toString(combinedCount.getC4216()));
            }
            if (fraction.equals("Заря")) {
                c4216_c4217_c4218_c4219Field.setText(Integer.toString(combinedCount.getC4217()));
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            c4202_c4203Field.setText(Integer.toString(combinedCount.getC4203()));
            c4204_c4205Field.setText(Integer.toString(combinedCount.getC4205()));
            c4207_c4208Field.setText(Integer.toString(combinedCount.getC4208()));
            if (fraction.equals("Наемники")) {
                c4216_c4217_c4218_c4219Field.setText(Integer.toString(combinedCount.getC4218()));
            }
            if (fraction.equals("Завет")) {
                c4216_c4217_c4218_c4219Field.setText(Integer.toString(combinedCount.getC4219()));
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
    private void handleC4201Field() throws SQLException {
        if(c4201Field.isEditable()){
            combinedCount.setC4201(Integer.parseInt(c4201Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4201Field.setEditable(false);
        } else {
            c4201Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4202_c4203Field() throws SQLException {
        if(c4202_c4203Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combinedCount.setC4202(Integer.parseInt(c4202_c4203Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combinedCount.setC4203(Integer.parseInt(c4202_c4203Field.getText()));
            }
            SciDB.updateCombinedCount(person, combinedCount);
            c4202_c4203Field.setEditable(false);
        } else {
            c4202_c4203Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4204_c4205Field() throws SQLException {
        if(c4204_c4205Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combinedCount.setC4204(Integer.parseInt(c4204_c4205Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combinedCount.setC4205(Integer.parseInt(c4204_c4205Field.getText()));
            }
            SciDB.updateCombinedCount(person, combinedCount);
            c4204_c4205Field.setEditable(false);
        } else {
            c4204_c4205Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4206Field() throws SQLException {
        if(c4206Field.isEditable()){
            combinedCount.setC4206(Integer.parseInt(c4206Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4206Field.setEditable(false);
        } else {
            c4206Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4207_c4208Field() throws SQLException {
        if(c4207_c4208Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                combinedCount.setC4207(Integer.parseInt(c4207_c4208Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                combinedCount.setC4208(Integer.parseInt(c4207_c4208Field.getText()));
            }
            SciDB.updateCombinedCount(person, combinedCount);
            c4207_c4208Field.setEditable(false);
        } else {
            c4207_c4208Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4209Field() throws SQLException {
        if(c4209Field.isEditable()){
            combinedCount.setC4209(Integer.parseInt(c4209Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4209Field.setEditable(false);
        } else {
            c4209Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4210Field() throws SQLException {
        if(c4210Field.isEditable()){
            combinedCount.setC4210(Integer.parseInt(c4210Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4210Field.setEditable(false);
        } else {
            c4210Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4211Field() throws SQLException {
        if(c4211Field.isEditable()){
            combinedCount.setC4211(Integer.parseInt(c4211Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4211Field.setEditable(false);
        } else {
            c4211Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4212Field() throws SQLException {
        if(c4212Field.isEditable()){
            combinedCount.setC4212(Integer.parseInt(c4212Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4212Field.setEditable(false);
        } else {
            c4212Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4213Field() throws SQLException {
        if(c4213Field.isEditable()){
            combinedCount.setC4213(Integer.parseInt(c4213Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4213Field.setEditable(false);
        } else {
            c4213Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4214Field() throws SQLException {
        if(c4214Field.isEditable()){
            combinedCount.setC4214(Integer.parseInt(c4214Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4214Field.setEditable(false);
        } else {
            c4214Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4215Field() throws SQLException {
        if(c4215Field.isEditable()){
            combinedCount.setC4215(Integer.parseInt(c4215Field.getText()));
            SciDB.updateCombinedCount(person, combinedCount);
            c4215Field.setEditable(false);
        } else {
            c4215Field.setEditable(true);
        }
    }

    @FXML
    private void handleC4216_c4217_c4218_c4219Field() throws SQLException {
        if(c4216_c4217_c4218_c4219Field.isEditable()){
            if (person.getFraction().equals("Рубеж")) {
                combinedCount.setC4216(Integer.parseInt(c4216_c4217_c4218_c4219Field.getText()));
            }
            if (person.getFraction().equals("Заря")) {
                combinedCount.setC4217(Integer.parseInt(c4216_c4217_c4218_c4219Field.getText()));
            }
            if (person.getFraction().equals("Наемники")) {
                combinedCount.setC4218(Integer.parseInt(c4216_c4217_c4218_c4219Field.getText()));
            }
            if (person.getFraction().equals("Завет")) {
                combinedCount.setC4219(Integer.parseInt(c4216_c4217_c4218_c4219Field.getText()));
            }
            SciDB.updateCombinedCount(person, combinedCount);
            c4216_c4217_c4218_c4219Field.setEditable(false);
        } else {
            c4216_c4217_c4218_c4219Field.setEditable(true);
        }
    }
}
