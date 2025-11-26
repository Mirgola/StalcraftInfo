package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import com.github.mirgola.stalcraftinfo.barter.weapons.AssaultRiflesCount;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class BackpacksAndPouchesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private BackpacksAndPouchesCount backpacksAndPouchesCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label;

    @FXML
    private TextField bap2101Field, bap2102Field, bap2103Field, bap2104Field, bap2105Field, bap2106Field, bap2107Field, bap2108Field, bap2109Field, bap2110Field,
                      bap2111Field, bap2112Field, bap2113Field, bap2114Field, bap2115Field, bap2116Field, bap2117Field;

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
            l2label.setText("Пожарная часть | 1 Уровень");
            l3label.setText("Бар | 1 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l5label.setText("База «Рубежа» | 2 Уровень");
                l6label.setText("База «Рубежа» | 5 Уровень");
            }
            if (fraction.equals("Заря")) {
                l5label.setText("База «Зари» | 2 Уровень");
                l6label.setText("База «Зари» | 5 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l5label.setText("Фракции Севера | 2 Уровень");
                l6label.setText("Фракции Севера | 5 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Сельская школа | 1 Уровень");
            l3label.setText("Бар | 1 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l5label.setText("Лагерь «Наемников» | 2 Уровень");
                l6label.setText("Лагерь «Наемников» | 5 Уровень");
            }
            if (fraction.equals("Завет")) {
                l5label.setText("Лагерь «Завета» | 2 Уровень");
                l6label.setText("Лагерь «Завета» | 5 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l5label.setText("Фракции Севера | 2 Уровень");
                l6label.setText("Фракции Севера | 5 Уровень");
            }
        }
    }

    public void setField(BackpacksAndPouchesCount backpacksAndPouchesCount) {
        this.backpacksAndPouchesCount = backpacksAndPouchesCount;
        System.out.println(backpacksAndPouchesCount.getNicknamePerson());
        bap2101Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2101()));
        bap2102Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2102()));
        bap2103Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2103()));
        bap2104Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2104()));
        bap2105Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2104()));
        bap2106Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2106()));
        bap2107Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2107()));
        bap2108Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2108()));
        bap2109Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2109()));
        bap2110Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2110()));
        bap2111Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2111()));
        bap2112Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2112()));
        bap2113Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2113()));
        bap2114Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2114()));
        bap2115Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2115()));
        bap2116Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2116()));
        bap2117Field.setText(Integer.toString(backpacksAndPouchesCount.getBap2117()));
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
    private void handleBap2101Field() throws SQLException {
        if(bap2101Field.isEditable()){
            backpacksAndPouchesCount.setBap2101(Integer.parseInt(bap2101Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2101Field.setEditable(false);
        } else {
            bap2101Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2102Field() throws SQLException {
        if(bap2102Field.isEditable()){
            backpacksAndPouchesCount.setBap2102(Integer.parseInt(bap2102Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2102Field.setEditable(false);
        } else {
            bap2102Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2103Field() throws SQLException {
        if(bap2103Field.isEditable()){
            backpacksAndPouchesCount.setBap2103(Integer.parseInt(bap2103Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2103Field.setEditable(false);
        } else {
            bap2103Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2104Field() throws SQLException {
        if(bap2104Field.isEditable()){
            backpacksAndPouchesCount.setBap2104(Integer.parseInt(bap2104Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2104Field.setEditable(false);
        } else {
            bap2104Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2105Field() throws SQLException {
        if(bap2105Field.isEditable()){
            backpacksAndPouchesCount.setBap2105(Integer.parseInt(bap2105Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2105Field.setEditable(false);
        } else {
            bap2105Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2106Field() throws SQLException {
        if(bap2106Field.isEditable()){
            backpacksAndPouchesCount.setBap2106(Integer.parseInt(bap2106Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2106Field.setEditable(false);
        } else {
            bap2106Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2107Field() throws SQLException {
        if(bap2107Field.isEditable()){
            backpacksAndPouchesCount.setBap2107(Integer.parseInt(bap2107Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2107Field.setEditable(false);
        } else {
            bap2107Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2108Field() throws SQLException {
        if(bap2108Field.isEditable()){
            backpacksAndPouchesCount.setBap2108(Integer.parseInt(bap2108Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2108Field.setEditable(false);
        } else {
            bap2108Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2109Field() throws SQLException {
        if(bap2109Field.isEditable()){
            backpacksAndPouchesCount.setBap2109(Integer.parseInt(bap2109Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2109Field.setEditable(false);
        } else {
            bap2109Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2110Field() throws SQLException {
        if(bap2110Field.isEditable()){
            backpacksAndPouchesCount.setBap2110(Integer.parseInt(bap2110Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2110Field.setEditable(false);
        } else {
            bap2110Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2111Field() throws SQLException {
        if(bap2111Field.isEditable()){
            backpacksAndPouchesCount.setBap2111(Integer.parseInt(bap2111Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2111Field.setEditable(false);
        } else {
            bap2111Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2112Field() throws SQLException {
        if(bap2112Field.isEditable()){
            backpacksAndPouchesCount.setBap2112(Integer.parseInt(bap2112Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2112Field.setEditable(false);
        } else {
            bap2112Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2113Field() throws SQLException {
        if(bap2113Field.isEditable()){
            backpacksAndPouchesCount.setBap2113(Integer.parseInt(bap2113Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2113Field.setEditable(false);
        } else {
            bap2113Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2114Field() throws SQLException {
        if(bap2114Field.isEditable()){
            backpacksAndPouchesCount.setBap2114(Integer.parseInt(bap2114Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2114Field.setEditable(false);
        } else {
            bap2114Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2115Field() throws SQLException {
        if(bap2115Field.isEditable()){
            backpacksAndPouchesCount.setBap2115(Integer.parseInt(bap2115Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2115Field.setEditable(false);
        } else {
            bap2115Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2116Field() throws SQLException {
        if(bap2116Field.isEditable()){
            backpacksAndPouchesCount.setBap2116(Integer.parseInt(bap2116Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2116Field.setEditable(false);
        } else {
            bap2116Field.setEditable(true);
        }
    }

    @FXML
    private void handleBap2117Field() throws SQLException {
        if(bap2117Field.isEditable()){
            backpacksAndPouchesCount.setBap2117(Integer.parseInt(bap2117Field.getText()));
            SciDB.updateBackpacksAndPouchesCount(person, backpacksAndPouchesCount);
            bap2117Field.setEditable(false);
        } else {
            bap2117Field.setEditable(true);
        }
    }
}
