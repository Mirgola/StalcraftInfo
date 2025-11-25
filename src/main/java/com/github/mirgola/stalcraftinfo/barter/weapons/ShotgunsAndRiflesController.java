package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class ShotgunsAndRiflesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private ShotgunsAndRiflesCount shotgunsAndRiflesCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label, l9label, l10label, l11label, l12label, l13label;

    @FXML
    private TextField sar1501Field, sar1502Field, sar1503Field, sar1504Field, sar1505Field, sar1506Field, sar1507Field, sar1508Field, sar1509Field, sar1510Field,
                      sar1511Field, sar1512Field, sar1513Field, sar1514Field, sar1515Field;

    @FXML
    public void initialize() {
        setupDragHandlers();
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 1 Уровень");
            l2label.setText("Ставка Атамана | 2 Уровень");
            l3label.setText("Ставка Атамана | 3 Уровень");
            l4label.setText("Пожарная часть | 1 Уровень");
            l5label.setText("Пожарная часть | 2 Уровень");
            l6label.setText("Пожарная часть | 3 Уровень");
            l7label.setText("Бар | 2 Уровень");
            l8label.setText("Бар | 5 Уровень");
            l9label.setText("Бар | 6 Уровень");
            l10label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l11label.setText("База «Рубежа» | 3 Уровень");
                l12label.setText("База «Рубежа» | 6 Уровень");
                l13label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l11label.setText("База «Зари» | 3 Уровень");
                l12label.setText("База «Зари» | 6 Уровень");
                l13label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l11label.setText("Фракции Севера | 3 Уровень");
                l12label.setText("Фракции Севера | 6 Уровень");
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 2 Уровень");
            l3label.setText("Лодочная станция | 3 Уровень");
            l4label.setText("Сельская школа | 1 Уровень");
            l5label.setText("Сельская школа | 2 Уровень");
            l6label.setText("Сельская школа | 3 Уровень");
            l7label.setText("Бар | 2 Уровень");
            l8label.setText("Бар | 5 Уровень");
            l9label.setText("Бар | 6 Уровень");
            l10label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l11label.setText("Лагерь «Наемников» | 3 Уровень");
                l12label.setText("Лагерь «Наемников» | 6 Уровень");
                l13label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l11label.setText("Лагерь «Завета» | 3 Уровень");
                l12label.setText("Лагерь «Завета» | 6 Уровень");
                l13label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l11label.setText("Фракции Севера | 3 Уровень");
                l12label.setText("Фракции Севера | 6 Уровень");
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(ShotgunsAndRiflesCount shotgunsAndRiflesCount) {
        this.shotgunsAndRiflesCount = shotgunsAndRiflesCount;
        System.out.println(shotgunsAndRiflesCount.getNicknamePerson());
        sar1501Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1501()));
        sar1502Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1502()));
        sar1503Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1503()));
        sar1504Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1504()));
        sar1505Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1504()));
        sar1506Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1506()));
        sar1507Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1507()));
        sar1508Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1508()));
        sar1509Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1509()));
        sar1510Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1510()));
        sar1511Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1511()));
        sar1512Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1512()));
        sar1513Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1513()));
        sar1514Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1514()));
        sar1515Field.setText(Integer.toString(shotgunsAndRiflesCount.getSar1515()));
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
        double scrollSensitivity = 0.0007;

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
    private void handleSar1501Field() throws SQLException {
        if(sar1501Field.isEditable()){
            shotgunsAndRiflesCount.setSar1501(Integer.parseInt(sar1501Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1501Field.setEditable(false);
        } else {
            sar1501Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1502Field() throws SQLException {
        if(sar1502Field.isEditable()){
            shotgunsAndRiflesCount.setSar1502(Integer.parseInt(sar1502Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1502Field.setEditable(false);
        } else {
            sar1502Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1503Field() throws SQLException {
        if(sar1503Field.isEditable()){
            shotgunsAndRiflesCount.setSar1503(Integer.parseInt(sar1503Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1503Field.setEditable(false);
        } else {
            sar1503Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1504Field() throws SQLException {
        if(sar1504Field.isEditable()){
            shotgunsAndRiflesCount.setSar1504(Integer.parseInt(sar1504Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1504Field.setEditable(false);
        } else {
            sar1504Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1505Field() throws SQLException {
        if(sar1505Field.isEditable()){
            shotgunsAndRiflesCount.setSar1505(Integer.parseInt(sar1505Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1505Field.setEditable(false);
        } else {
            sar1505Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1506Field() throws SQLException {
        if(sar1506Field.isEditable()){
            shotgunsAndRiflesCount.setSar1506(Integer.parseInt(sar1506Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1506Field.setEditable(false);
        } else {
            sar1506Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1507Field() throws SQLException {
        if(sar1507Field.isEditable()){
            shotgunsAndRiflesCount.setSar1507(Integer.parseInt(sar1507Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1507Field.setEditable(false);
        } else {
            sar1507Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1508Field() throws SQLException {
        if(sar1508Field.isEditable()){
            shotgunsAndRiflesCount.setSar1508(Integer.parseInt(sar1508Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1508Field.setEditable(false);
        } else {
            sar1508Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1509Field() throws SQLException {
        if(sar1509Field.isEditable()){
            shotgunsAndRiflesCount.setSar1509(Integer.parseInt(sar1509Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1509Field.setEditable(false);
        } else {
            sar1509Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1510Field() throws SQLException {
        if(sar1510Field.isEditable()){
            shotgunsAndRiflesCount.setSar1510(Integer.parseInt(sar1510Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1510Field.setEditable(false);
        } else {
            sar1510Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1511Field() throws SQLException {
        if(sar1511Field.isEditable()){
            shotgunsAndRiflesCount.setSar1511(Integer.parseInt(sar1511Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1511Field.setEditable(false);
        } else {
            sar1511Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1512Field() throws SQLException {
        if(sar1512Field.isEditable()){
            shotgunsAndRiflesCount.setSar1512(Integer.parseInt(sar1512Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1512Field.setEditable(false);
        } else {
            sar1512Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1513Field() throws SQLException {
        if(sar1513Field.isEditable()){
            shotgunsAndRiflesCount.setSar1513(Integer.parseInt(sar1513Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1513Field.setEditable(false);
        } else {
            sar1513Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1514Field() throws SQLException {
        if(sar1514Field.isEditable()){
            shotgunsAndRiflesCount.setSar1514(Integer.parseInt(sar1514Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1514Field.setEditable(false);
        } else {
            sar1514Field.setEditable(true);
        }
    }

    @FXML
    private void handleSar1515Field() throws SQLException {
        if(sar1515Field.isEditable()){
            shotgunsAndRiflesCount.setSar1515(Integer.parseInt(sar1515Field.getText()));
            SciDB.updateShotgunsAndRiflesCount(person, shotgunsAndRiflesCount);
            sar1515Field.setEditable(false);
        } else {
            sar1515Field.setEditable(true);
        }
    }
}
