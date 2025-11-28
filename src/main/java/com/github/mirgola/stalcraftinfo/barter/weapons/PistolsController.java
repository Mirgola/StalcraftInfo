package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class PistolsController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private PistolsCount pistolsCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label;

    @FXML
    private TextField p1601Field, p1602Field, p1603Field, p1604Field, p1605Field, p1606Field, p1607Field, p1608Field, p1609Field, p1610Field,
                      p1611Field, p1612Field, p1613Field, p1614Field, p1615Field, p1616Field, p1617Field;

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
            l2label.setText("Ставка Атамана | 3 Уровень");
            l3label.setText("Пожарная часть | 1 Уровень");
            l4label.setText("Пожарная часть | 5 Уровень");
            l5label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 2 Уровень");
                l7label.setText("База «Рубежа» | 6 Уровень");
                l8label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 2 Уровень");
                l7label.setText("База «Зари» | 6 Уровень");
                l8label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 2 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 3 Уровень");
            l3label.setText("Сельская школа | 1 Уровень");
            l4label.setText("Сельская школа | 5 Уровень");
            l5label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 2 Уровень");
                l7label.setText("Лагерь «Наемников» | 6 Уровень");
                l8label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Лагерь «Завета» | 2 Уровень");
                l7label.setText("Лагерь «Завета» | 6 Уровень");
                l8label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 2 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(PistolsCount pistolsCount) {
        this.pistolsCount = pistolsCount;
        System.out.println(pistolsCount.getNicknamePerson());
        p1601Field.setText(Integer.toString(pistolsCount.getP1601()));
        p1602Field.setText(Integer.toString(pistolsCount.getP1602()));
        p1603Field.setText(Integer.toString(pistolsCount.getP1603()));
        p1604Field.setText(Integer.toString(pistolsCount.getP1604()));
        p1605Field.setText(Integer.toString(pistolsCount.getP1605()));
        p1606Field.setText(Integer.toString(pistolsCount.getP1606()));
        p1607Field.setText(Integer.toString(pistolsCount.getP1607()));
        p1608Field.setText(Integer.toString(pistolsCount.getP1608()));
        p1609Field.setText(Integer.toString(pistolsCount.getP1609()));
        p1610Field.setText(Integer.toString(pistolsCount.getP1610()));
        p1611Field.setText(Integer.toString(pistolsCount.getP1611()));
        p1612Field.setText(Integer.toString(pistolsCount.getP1612()));
        p1613Field.setText(Integer.toString(pistolsCount.getP1613()));
        p1614Field.setText(Integer.toString(pistolsCount.getP1614()));
        p1615Field.setText(Integer.toString(pistolsCount.getP1615()));
        p1616Field.setText(Integer.toString(pistolsCount.getP1616()));
        p1617Field.setText(Integer.toString(pistolsCount.getP1617()));
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
        double scrollSensitivity = 0.001;

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
    private void handleP1601Field() throws SQLException {
        if(p1601Field.isEditable()){
            pistolsCount.setP1601(Integer.parseInt(p1601Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1601Field.setEditable(false);
        } else {
            p1601Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1602Field() throws SQLException {
        if(p1602Field.isEditable()){
            pistolsCount.setP1602(Integer.parseInt(p1602Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1602Field.setEditable(false);
        } else {
            p1602Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1603Field() throws SQLException {
        if(p1603Field.isEditable()){
            pistolsCount.setP1603(Integer.parseInt(p1603Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1603Field.setEditable(false);
        } else {
            p1603Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1604Field() throws SQLException {
        if(p1604Field.isEditable()){
            pistolsCount.setP1604(Integer.parseInt(p1604Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1604Field.setEditable(false);
        } else {
            p1604Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1605Field() throws SQLException {
        if(p1605Field.isEditable()){
            pistolsCount.setP1605(Integer.parseInt(p1605Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1605Field.setEditable(false);
        } else {
            p1605Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1606Field() throws SQLException {
        if(p1606Field.isEditable()){
            pistolsCount.setP1606(Integer.parseInt(p1606Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1606Field.setEditable(false);
        } else {
            p1606Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1607Field() throws SQLException {
        if(p1607Field.isEditable()){
            pistolsCount.setP1607(Integer.parseInt(p1607Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1607Field.setEditable(false);
        } else {
            p1607Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1608Field() throws SQLException {
        if(p1608Field.isEditable()){
            pistolsCount.setP1608(Integer.parseInt(p1608Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1608Field.setEditable(false);
        } else {
            p1608Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1609Field() throws SQLException {
        if(p1609Field.isEditable()){
            pistolsCount.setP1609(Integer.parseInt(p1609Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1609Field.setEditable(false);
        } else {
            p1609Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1610Field() throws SQLException {
        if(p1610Field.isEditable()){
            pistolsCount.setP1610(Integer.parseInt(p1610Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1610Field.setEditable(false);
        } else {
            p1610Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1611Field() throws SQLException {
        if(p1611Field.isEditable()){
            pistolsCount.setP1611(Integer.parseInt(p1611Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1611Field.setEditable(false);
        } else {
            p1611Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1612Field() throws SQLException {
        if(p1612Field.isEditable()){
            pistolsCount.setP1612(Integer.parseInt(p1612Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1612Field.setEditable(false);
        } else {
            p1612Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1613Field() throws SQLException {
        if(p1613Field.isEditable()){
            pistolsCount.setP1613(Integer.parseInt(p1613Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1613Field.setEditable(false);
        } else {
            p1613Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1614Field() throws SQLException {
        if(p1614Field.isEditable()){
            pistolsCount.setP1614(Integer.parseInt(p1614Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1614Field.setEditable(false);
        } else {
            p1614Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1615Field() throws SQLException {
        if(p1615Field.isEditable()){
            pistolsCount.setP1615(Integer.parseInt(p1615Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1615Field.setEditable(false);
        } else {
            p1615Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1616Field() throws SQLException {
        if(p1616Field.isEditable()){
            pistolsCount.setP1616(Integer.parseInt(p1616Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1616Field.setEditable(false);
        } else {
            p1616Field.setEditable(true);
        }
    }

    @FXML
    private void handleP1617Field() throws SQLException {
        if(p1617Field.isEditable()){
            pistolsCount.setP1617(Integer.parseInt(p1617Field.getText()));
            SciDB.updatePistolsCount(person, pistolsCount);
            p1617Field.setEditable(false);
        } else {
            p1617Field.setEditable(true);
        }
    }
}
