package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class MagazinesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private MagazinesCount magazinesCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label;

    @FXML
    private TextField m3201Field, m3202Field, m3203Field, m3204Field, m3205Field, m3206Field, m3207Field, m3208Field, m3209Field, m3210Field,
                      m3211Field, m3212Field, m3213Field, m3214Field, m3215Field, m3216Field, m3217Field, m3218Field, m3219Field, m3220Field,
                      m3221Field, m3222Field, m3223Field, m3224Field, m3225Field, m3226Field, m3227Field, m3228Field, m3229Field, m3230Field,
                      m3231Field;

    @FXML
    public void initialize() {
        setupDragHandlers();
    }

    public void setPerson(Person person) {
        this.person = person;
    }

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

    public void setField(MagazinesCount magazinesCount) {
        this.magazinesCount = magazinesCount;
        System.out.println(magazinesCount.getNicknamePerson());
        m3201Field.setText(Integer.toString(magazinesCount.getM3201()));
        m3202Field.setText(Integer.toString(magazinesCount.getM3202()));
        m3203Field.setText(Integer.toString(magazinesCount.getM3203()));
        m3204Field.setText(Integer.toString(magazinesCount.getM3204()));
        m3205Field.setText(Integer.toString(magazinesCount.getM3205()));
        m3206Field.setText(Integer.toString(magazinesCount.getM3206()));
        m3207Field.setText(Integer.toString(magazinesCount.getM3207()));
        m3208Field.setText(Integer.toString(magazinesCount.getM3208()));
        m3209Field.setText(Integer.toString(magazinesCount.getM3209()));
        m3210Field.setText(Integer.toString(magazinesCount.getM3210()));
        m3211Field.setText(Integer.toString(magazinesCount.getM3211()));
        m3212Field.setText(Integer.toString(magazinesCount.getM3212()));
        m3213Field.setText(Integer.toString(magazinesCount.getM3213()));
        m3214Field.setText(Integer.toString(magazinesCount.getM3214()));
        m3215Field.setText(Integer.toString(magazinesCount.getM3215()));
        m3216Field.setText(Integer.toString(magazinesCount.getM3216()));
        m3217Field.setText(Integer.toString(magazinesCount.getM3217()));
        m3218Field.setText(Integer.toString(magazinesCount.getM3218()));
        m3219Field.setText(Integer.toString(magazinesCount.getM3219()));
        m3220Field.setText(Integer.toString(magazinesCount.getM3220()));
        m3221Field.setText(Integer.toString(magazinesCount.getM3221()));
        m3222Field.setText(Integer.toString(magazinesCount.getM3222()));
        m3223Field.setText(Integer.toString(magazinesCount.getM3223()));
        m3224Field.setText(Integer.toString(magazinesCount.getM3224()));
        m3225Field.setText(Integer.toString(magazinesCount.getM3225()));
        m3226Field.setText(Integer.toString(magazinesCount.getM3226()));
        m3227Field.setText(Integer.toString(magazinesCount.getM3227()));
        m3228Field.setText(Integer.toString(magazinesCount.getM3228()));
        m3229Field.setText(Integer.toString(magazinesCount.getM3229()));
        m3230Field.setText(Integer.toString(magazinesCount.getM3230()));
        m3231Field.setText(Integer.toString(magazinesCount.getM3231()));
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
    private void handleM3201Field() throws SQLException {
        if(m3201Field.isEditable()){
            magazinesCount.setM3201(Integer.parseInt(m3201Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3201Field.setEditable(false);
        } else {
            m3201Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3202Field() throws SQLException {
        if(m3202Field.isEditable()){
            magazinesCount.setM3202(Integer.parseInt(m3202Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3202Field.setEditable(false);
        } else {
            m3202Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3203Field() throws SQLException {
        if(m3203Field.isEditable()){
            magazinesCount.setM3203(Integer.parseInt(m3203Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3203Field.setEditable(false);
        } else {
            m3203Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3204Field() throws SQLException {
        if(m3204Field.isEditable()){
            magazinesCount.setM3204(Integer.parseInt(m3204Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3204Field.setEditable(false);
        } else {
            m3204Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3205Field() throws SQLException {
        if(m3205Field.isEditable()){
            magazinesCount.setM3205(Integer.parseInt(m3205Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3205Field.setEditable(false);
        } else {
            m3205Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3206Field() throws SQLException {
        if(m3206Field.isEditable()){
            magazinesCount.setM3206(Integer.parseInt(m3206Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3206Field.setEditable(false);
        } else {
            m3206Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3207Field() throws SQLException {
        if(m3207Field.isEditable()){
            magazinesCount.setM3207(Integer.parseInt(m3207Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3207Field.setEditable(false);
        } else {
            m3207Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3208Field() throws SQLException {
        if(m3208Field.isEditable()){
            magazinesCount.setM3208(Integer.parseInt(m3208Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3208Field.setEditable(false);
        } else {
            m3208Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3209Field() throws SQLException {
        if(m3209Field.isEditable()){
            magazinesCount.setM3209(Integer.parseInt(m3209Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3209Field.setEditable(false);
        } else {
            m3209Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3210Field() throws SQLException {
        if(m3210Field.isEditable()){
            magazinesCount.setM3210(Integer.parseInt(m3210Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3210Field.setEditable(false);
        } else {
            m3210Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3211Field() throws SQLException {
        if(m3211Field.isEditable()){
            magazinesCount.setM3211(Integer.parseInt(m3211Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3211Field.setEditable(false);
        } else {
            m3211Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3212Field() throws SQLException {
        if(m3212Field.isEditable()){
            magazinesCount.setM3212(Integer.parseInt(m3212Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3212Field.setEditable(false);
        } else {
            m3212Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3213Field() throws SQLException {
        if(m3213Field.isEditable()){
            magazinesCount.setM3213(Integer.parseInt(m3213Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3213Field.setEditable(false);
        } else {
            m3213Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3214Field() throws SQLException {
        if(m3214Field.isEditable()){
            magazinesCount.setM3214(Integer.parseInt(m3214Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3214Field.setEditable(false);
        } else {
            m3214Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3215Field() throws SQLException {
        if(m3215Field.isEditable()){
            magazinesCount.setM3215(Integer.parseInt(m3215Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3215Field.setEditable(false);
        } else {
            m3215Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3216Field() throws SQLException {
        if(m3216Field.isEditable()){
            magazinesCount.setM3216(Integer.parseInt(m3216Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3216Field.setEditable(false);
        } else {
            m3216Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3217Field() throws SQLException {
        if(m3217Field.isEditable()){
            magazinesCount.setM3217(Integer.parseInt(m3217Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3217Field.setEditable(false);
        } else {
            m3217Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3218Field() throws SQLException {
        if(m3218Field.isEditable()){
            magazinesCount.setM3218(Integer.parseInt(m3218Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3218Field.setEditable(false);
        } else {
            m3218Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3219Field() throws SQLException {
        if(m3219Field.isEditable()){
            magazinesCount.setM3219(Integer.parseInt(m3219Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3219Field.setEditable(false);
        } else {
            m3219Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3220Field() throws SQLException {
        if(m3220Field.isEditable()){
            magazinesCount.setM3220(Integer.parseInt(m3220Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3220Field.setEditable(false);
        } else {
            m3220Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3221Field() throws SQLException {
        if(m3221Field.isEditable()){
            magazinesCount.setM3221(Integer.parseInt(m3221Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3221Field.setEditable(false);
        } else {
            m3221Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3222Field() throws SQLException {
        if(m3222Field.isEditable()){
            magazinesCount.setM3222(Integer.parseInt(m3222Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3222Field.setEditable(false);
        } else {
            m3222Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3223Field() throws SQLException {
        if(m3223Field.isEditable()){
            magazinesCount.setM3223(Integer.parseInt(m3223Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3223Field.setEditable(false);
        } else {
            m3223Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3224Field() throws SQLException {
        if(m3224Field.isEditable()){
            magazinesCount.setM3224(Integer.parseInt(m3224Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3224Field.setEditable(false);
        } else {
            m3224Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3225Field() throws SQLException {
        if(m3225Field.isEditable()){
            magazinesCount.setM3225(Integer.parseInt(m3225Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3225Field.setEditable(false);
        } else {
            m3225Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3226Field() throws SQLException {
        if(m3226Field.isEditable()){
            magazinesCount.setM3226(Integer.parseInt(m3226Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3226Field.setEditable(false);
        } else {
            m3226Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3227Field() throws SQLException {
        if(m3227Field.isEditable()){
            magazinesCount.setM3227(Integer.parseInt(m3227Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3227Field.setEditable(false);
        } else {
            m3227Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3228Field() throws SQLException {
        if(m3228Field.isEditable()){
            magazinesCount.setM3228(Integer.parseInt(m3228Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3228Field.setEditable(false);
        } else {
            m3228Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3229Field() throws SQLException {
        if(m3229Field.isEditable()){
            magazinesCount.setM3229(Integer.parseInt(m3229Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3229Field.setEditable(false);
        } else {
            m3229Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3230Field() throws SQLException {
        if(m3230Field.isEditable()){
            magazinesCount.setM3230(Integer.parseInt(m3230Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3230Field.setEditable(false);
        } else {
            m3230Field.setEditable(true);
        }
    }

    @FXML
    private void handleM3231Field() throws SQLException {
        if(m3231Field.isEditable()){
            magazinesCount.setM3231(Integer.parseInt(m3231Field.getText()));
            SciDB.updateMagazinesCount(person, magazinesCount);
            m3231Field.setEditable(false);
        } else {
            m3231Field.setEditable(true);
        }
    }
}
