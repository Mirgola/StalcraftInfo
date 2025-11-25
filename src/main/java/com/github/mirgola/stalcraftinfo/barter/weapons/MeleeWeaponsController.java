package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class MeleeWeaponsController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private MeleeWeaponsCount meleeWeaponsCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label, l9label;

    @FXML
    private TextField mw1701Field, mw1702Field, mw1703Field, mw1704Field, mw1705Field, mw1706Field, mw1707Field, mw1708Field, mw1709Field, mw1710Field,
                      mw1711Field, mw1712Field, mw1713Field, mw1714Field, mw1715Field, mw1716Field;

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
            l3label.setText("Ставка Атамана | 5 Уровень");
            l4label.setText("Пожарная часть | 5 Уровень");
            l5label.setText("Бар | 4 Уровень");
            l6label.setText("Бар | 5 Уровень");
            l7label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l8label.setText("База «Рубежа» | 4 Уровень");
                l9label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l8label.setText("База «Зари» | 4 Уровень");
                l9label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l8label.setText("Фракции Севера | 4 Уровень");
                l9label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 3 Уровень");
            l3label.setText("Лодочная станция | 5 Уровень");
            l4label.setText("Сельская школа | 5 Уровень");
            l5label.setText("Бар | 4 Уровень");
            l6label.setText("Бар | 5 Уровень");
            l7label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l8label.setText("Лагерь «Наемников» | 4 Уровень");
                l9label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l8label.setText("Лагерь «Завета» | 4 Уровень");
                l9label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l8label.setText("Фракции Севера | 4 Уровень");
                l9label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(MeleeWeaponsCount meleeWeaponsCount) {
        this.meleeWeaponsCount = meleeWeaponsCount;
        System.out.println(meleeWeaponsCount.getNicknamePerson());
        mw1701Field.setText(Integer.toString(meleeWeaponsCount.getMw1701()));
        mw1702Field.setText(Integer.toString(meleeWeaponsCount.getMw1702()));
        mw1703Field.setText(Integer.toString(meleeWeaponsCount.getMw1703()));
        mw1704Field.setText(Integer.toString(meleeWeaponsCount.getMw1704()));
        mw1705Field.setText(Integer.toString(meleeWeaponsCount.getMw1705()));
        mw1706Field.setText(Integer.toString(meleeWeaponsCount.getMw1706()));
        mw1707Field.setText(Integer.toString(meleeWeaponsCount.getMw1707()));
        mw1708Field.setText(Integer.toString(meleeWeaponsCount.getMw1708()));
        mw1709Field.setText(Integer.toString(meleeWeaponsCount.getMw1709()));
        mw1710Field.setText(Integer.toString(meleeWeaponsCount.getMw1710()));
        mw1711Field.setText(Integer.toString(meleeWeaponsCount.getMw1711()));
        mw1712Field.setText(Integer.toString(meleeWeaponsCount.getMw1712()));
        mw1713Field.setText(Integer.toString(meleeWeaponsCount.getMw1713()));
        mw1714Field.setText(Integer.toString(meleeWeaponsCount.getMw1714()));
        mw1715Field.setText(Integer.toString(meleeWeaponsCount.getMw1715()));
        mw1716Field.setText(Integer.toString(meleeWeaponsCount.getMw1716()));
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
    private void handleMw1701Field() throws SQLException {
        if(mw1701Field.isEditable()){
            meleeWeaponsCount.setMw1701(Integer.parseInt(mw1701Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1701Field.setEditable(false);
        } else {
            mw1701Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1702Field() throws SQLException {
        if(mw1702Field.isEditable()){
            meleeWeaponsCount.setMw1702(Integer.parseInt(mw1702Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1702Field.setEditable(false);
        } else {
            mw1702Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1703Field() throws SQLException {
        if(mw1703Field.isEditable()){
            meleeWeaponsCount.setMw1703(Integer.parseInt(mw1703Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1703Field.setEditable(false);
        } else {
            mw1703Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1704Field() throws SQLException {
        if(mw1704Field.isEditable()){
            meleeWeaponsCount.setMw1704(Integer.parseInt(mw1704Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1704Field.setEditable(false);
        } else {
            mw1704Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1705Field() throws SQLException {
        if(mw1705Field.isEditable()){
            meleeWeaponsCount.setMw1705(Integer.parseInt(mw1705Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1705Field.setEditable(false);
        } else {
            mw1705Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1706Field() throws SQLException {
        if(mw1706Field.isEditable()){
            meleeWeaponsCount.setMw1706(Integer.parseInt(mw1706Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1706Field.setEditable(false);
        } else {
            mw1706Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1707Field() throws SQLException {
        if(mw1707Field.isEditable()){
            meleeWeaponsCount.setMw1707(Integer.parseInt(mw1707Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1707Field.setEditable(false);
        } else {
            mw1707Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1708Field() throws SQLException {
        if(mw1708Field.isEditable()){
            meleeWeaponsCount.setMw1708(Integer.parseInt(mw1708Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1708Field.setEditable(false);
        } else {
            mw1708Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1709Field() throws SQLException {
        if(mw1709Field.isEditable()){
            meleeWeaponsCount.setMw1709(Integer.parseInt(mw1709Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1709Field.setEditable(false);
        } else {
            mw1709Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1710Field() throws SQLException {
        if(mw1710Field.isEditable()){
            meleeWeaponsCount.setMw1710(Integer.parseInt(mw1710Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1710Field.setEditable(false);
        } else {
            mw1710Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1711Field() throws SQLException {
        if(mw1711Field.isEditable()){
            meleeWeaponsCount.setMw1711(Integer.parseInt(mw1711Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1711Field.setEditable(false);
        } else {
            mw1711Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1712Field() throws SQLException {
        if(mw1712Field.isEditable()){
            meleeWeaponsCount.setMw1712(Integer.parseInt(mw1712Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1712Field.setEditable(false);
        } else {
            mw1712Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1713Field() throws SQLException {
        if(mw1713Field.isEditable()){
            meleeWeaponsCount.setMw1713(Integer.parseInt(mw1713Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1713Field.setEditable(false);
        } else {
            mw1713Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1714Field() throws SQLException {
        if(mw1714Field.isEditable()){
            meleeWeaponsCount.setMw1714(Integer.parseInt(mw1714Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1714Field.setEditable(false);
        } else {
            mw1714Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1715Field() throws SQLException {
        if(mw1715Field.isEditable()){
            meleeWeaponsCount.setMw1715(Integer.parseInt(mw1715Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1715Field.setEditable(false);
        } else {
            mw1715Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1716Field() throws SQLException {
        if(mw1716Field.isEditable()){
            meleeWeaponsCount.setMw1716(Integer.parseInt(mw1716Field.getText()));
            SciDB.updateMeleeWeaponsCount(person, meleeWeaponsCount);
            mw1716Field.setEditable(false);
        } else {
            mw1716Field.setEditable(true);
        }
    }
}
