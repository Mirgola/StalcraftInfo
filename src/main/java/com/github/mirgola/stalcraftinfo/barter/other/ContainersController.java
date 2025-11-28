package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class ContainersController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private ContainersCount containersCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label;

    @FXML
    private TextField c2201Field, c2202Field, c2203Field, c2204Field, c2205Field, c2206Field, c2207Field, c2208Field, c2209Field, c2210Field,
                      c2211Field, c2212Field, c2213Field, c2214Field, c2215Field, c2216Field, c2217Field, c2218Field, c2219Field, c2220Field,
                      c2221Field, c2222Field;

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

    public void setField(ContainersCount containersCount) {
        this.containersCount = containersCount;
        System.out.println(containersCount.getNicknamePerson());
        c2201Field.setText(Integer.toString(containersCount.getC2201()));
        c2202Field.setText(Integer.toString(containersCount.getC2202()));
        c2203Field.setText(Integer.toString(containersCount.getC2203()));
        c2204Field.setText(Integer.toString(containersCount.getC2204()));
        c2205Field.setText(Integer.toString(containersCount.getC2205()));
        c2206Field.setText(Integer.toString(containersCount.getC2206()));
        c2207Field.setText(Integer.toString(containersCount.getC2207()));
        c2208Field.setText(Integer.toString(containersCount.getC2208()));
        c2209Field.setText(Integer.toString(containersCount.getC2209()));
        c2210Field.setText(Integer.toString(containersCount.getC2210()));
        c2211Field.setText(Integer.toString(containersCount.getC2211()));
        c2212Field.setText(Integer.toString(containersCount.getC2212()));
        c2213Field.setText(Integer.toString(containersCount.getC2213()));
        c2214Field.setText(Integer.toString(containersCount.getC2214()));
        c2215Field.setText(Integer.toString(containersCount.getC2215()));
        c2216Field.setText(Integer.toString(containersCount.getC2216()));
        c2217Field.setText(Integer.toString(containersCount.getC2217()));
        c2218Field.setText(Integer.toString(containersCount.getC2218()));
        c2219Field.setText(Integer.toString(containersCount.getC2219()));
        c2220Field.setText(Integer.toString(containersCount.getC2220()));
        c2221Field.setText(Integer.toString(containersCount.getC2221()));
        c2222Field.setText(Integer.toString(containersCount.getC2222()));
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
    private void handleC2201Field() throws SQLException {
        if(c2201Field.isEditable()){
            containersCount.setC2201(Integer.parseInt(c2201Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2201Field.setEditable(false);
        } else {
            c2201Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2202Field() throws SQLException {
        if(c2202Field.isEditable()){
            containersCount.setC2202(Integer.parseInt(c2202Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2202Field.setEditable(false);
        } else {
            c2202Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2203Field() throws SQLException {
        if(c2203Field.isEditable()){
            containersCount.setC2203(Integer.parseInt(c2203Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2203Field.setEditable(false);
        } else {
            c2203Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2204Field() throws SQLException {
        if(c2204Field.isEditable()){
            containersCount.setC2204(Integer.parseInt(c2204Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2204Field.setEditable(false);
        } else {
            c2204Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2205Field() throws SQLException {
        if(c2205Field.isEditable()){
            containersCount.setC2205(Integer.parseInt(c2205Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2205Field.setEditable(false);
        } else {
            c2205Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2206Field() throws SQLException {
        if(c2206Field.isEditable()){
            containersCount.setC2206(Integer.parseInt(c2206Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2206Field.setEditable(false);
        } else {
            c2206Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2207Field() throws SQLException {
        if(c2207Field.isEditable()){
            containersCount.setC2207(Integer.parseInt(c2207Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2207Field.setEditable(false);
        } else {
            c2207Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2208Field() throws SQLException {
        if(c2208Field.isEditable()){
            containersCount.setC2208(Integer.parseInt(c2208Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2208Field.setEditable(false);
        } else {
            c2208Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2209Field() throws SQLException {
        if(c2209Field.isEditable()){
            containersCount.setC2209(Integer.parseInt(c2209Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2209Field.setEditable(false);
        } else {
            c2209Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2210Field() throws SQLException {
        if(c2210Field.isEditable()){
            containersCount.setC2210(Integer.parseInt(c2210Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2210Field.setEditable(false);
        } else {
            c2210Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2211Field() throws SQLException {
        if(c2211Field.isEditable()){
            containersCount.setC2211(Integer.parseInt(c2211Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2211Field.setEditable(false);
        } else {
            c2211Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2212Field() throws SQLException {
        if(c2212Field.isEditable()){
            containersCount.setC2212(Integer.parseInt(c2212Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2212Field.setEditable(false);
        } else {
            c2212Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2213Field() throws SQLException {
        if(c2213Field.isEditable()){
            containersCount.setC2213(Integer.parseInt(c2213Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2213Field.setEditable(false);
        } else {
            c2213Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2214Field() throws SQLException {
        if(c2214Field.isEditable()){
            containersCount.setC2214(Integer.parseInt(c2214Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2214Field.setEditable(false);
        } else {
            c2214Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2215Field() throws SQLException {
        if(c2215Field.isEditable()){
            containersCount.setC2215(Integer.parseInt(c2215Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2215Field.setEditable(false);
        } else {
            c2215Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2216Field() throws SQLException {
        if(c2216Field.isEditable()){
            containersCount.setC2216(Integer.parseInt(c2216Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2216Field.setEditable(false);
        } else {
            c2216Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2217Field() throws SQLException {
        if(c2217Field.isEditable()){
            containersCount.setC2217(Integer.parseInt(c2217Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2217Field.setEditable(false);
        } else {
            c2217Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2218Field() throws SQLException {
        if(c2218Field.isEditable()){
            containersCount.setC2218(Integer.parseInt(c2218Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2218Field.setEditable(false);
        } else {
            c2218Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2219Field() throws SQLException {
        if(c2219Field.isEditable()){
            containersCount.setC2219(Integer.parseInt(c2219Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2219Field.setEditable(false);
        } else {
            c2219Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2220Field() throws SQLException {
        if(c2220Field.isEditable()){
            containersCount.setC2220(Integer.parseInt(c2220Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2220Field.setEditable(false);
        } else {
            c2220Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2221Field() throws SQLException {
        if(c2221Field.isEditable()){
            containersCount.setC2221(Integer.parseInt(c2221Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2221Field.setEditable(false);
        } else {
            c2221Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2222Field() throws SQLException {
        if(c2222Field.isEditable()){
            containersCount.setC2222(Integer.parseInt(c2222Field.getText()));
            SciDB.updateContainersCount(person, containersCount);
            c2222Field.setEditable(false);
        } else {
            c2222Field.setEditable(true);
        }
    }
}
