package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class SubmachineGunsController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private SubmachineGunsCount submachineGunsCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label;

    @FXML
    private TextField sg1201Field, sg1202Field, sg1203Field, sg1204Field, sg1205Field, sg1206Field, sg1207Field, sg1208Field, sg1209Field, sg1210Field,
                      sg1211Field, sg1212Field, sg1213Field, sg1214Field, sg1215Field, sg1216Field, sg1217Field, sg1218Field, sg1219Field, sg1220Field,
                      sg1221Field;

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
            l2label.setText("Ставка Атамана | 4 Уровень");
            l3label.setText("Пожарная часть | 3 Уровень");
            l4label.setText("Бар | 3 Уровень");
            l5label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 4 Уровень");
                l7label.setText("База «Рубежа» | 6 Уровень");
                l8label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 4 Уровень");
                l7label.setText("База «Зари» | 6 Уровень");
                l8label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 4 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
                l8label.setText("Фракции Севера | 7 Уровень");
              }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 3 Уровень");
            l4label.setText("Бар | 3 Уровень");
            l5label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 4 Уровень");
                l7label.setText("Лагерь «Наемников» | 6 Уровень");
                l8label.setText("Лагерь «Наемников» | 7 Уровень");
                 }
            if (fraction.equals("Завет")) {
                l6label.setText("Лагерь «Завета» | 4 Уровень");
                l7label.setText("Лагерь «Завета» | 6 Уровень");
                l8label.setText("Лагерь «Завета» | 7 Уровень");
              }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 4 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(SubmachineGunsCount submachineGunsCount) {
        this.submachineGunsCount = submachineGunsCount;
        System.out.println(submachineGunsCount.getNicknamePerson());
        sg1201Field.setText(Integer.toString(submachineGunsCount.getSg1201()));
        sg1202Field.setText(Integer.toString(submachineGunsCount.getSg1202()));
        sg1203Field.setText(Integer.toString(submachineGunsCount.getSg1203()));
        sg1204Field.setText(Integer.toString(submachineGunsCount.getSg1204()));
        sg1205Field.setText(Integer.toString(submachineGunsCount.getSg1205()));
        sg1206Field.setText(Integer.toString(submachineGunsCount.getSg1206()));
        sg1207Field.setText(Integer.toString(submachineGunsCount.getSg1207()));
        sg1208Field.setText(Integer.toString(submachineGunsCount.getSg1208()));
        sg1209Field.setText(Integer.toString(submachineGunsCount.getSg1209()));
        sg1210Field.setText(Integer.toString(submachineGunsCount.getSg1210()));
        sg1211Field.setText(Integer.toString(submachineGunsCount.getSg1211()));
        sg1212Field.setText(Integer.toString(submachineGunsCount.getSg1212()));
        sg1213Field.setText(Integer.toString(submachineGunsCount.getSg1213()));
        sg1214Field.setText(Integer.toString(submachineGunsCount.getSg1214()));
        sg1215Field.setText(Integer.toString(submachineGunsCount.getSg1215()));
        sg1216Field.setText(Integer.toString(submachineGunsCount.getSg1216()));
        sg1217Field.setText(Integer.toString(submachineGunsCount.getSg1217()));
        sg1218Field.setText(Integer.toString(submachineGunsCount.getSg1218()));
        sg1219Field.setText(Integer.toString(submachineGunsCount.getSg1219()));
        sg1220Field.setText(Integer.toString(submachineGunsCount.getSg1220()));
        sg1221Field.setText(Integer.toString(submachineGunsCount.getSg1221()));
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
    private void handleSg1201Field() throws SQLException {
        if(sg1201Field.isEditable()){
            submachineGunsCount.setSg1201(Integer.parseInt(sg1201Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1201Field.setEditable(false);
        } else {
            sg1201Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1202Field() throws SQLException {
        if(sg1202Field.isEditable()){
            submachineGunsCount.setSg1202(Integer.parseInt(sg1202Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1202Field.setEditable(false);
        } else {
            sg1202Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1203Field() throws SQLException {
        if(sg1203Field.isEditable()){
            submachineGunsCount.setSg1203(Integer.parseInt(sg1203Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1203Field.setEditable(false);
        } else {
            sg1203Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1204Field() throws SQLException {
        if(sg1204Field.isEditable()){
            submachineGunsCount.setSg1204(Integer.parseInt(sg1204Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1204Field.setEditable(false);
        } else {
            sg1204Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1205Field() throws SQLException {
        if(sg1205Field.isEditable()){
            submachineGunsCount.setSg1205(Integer.parseInt(sg1205Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1205Field.setEditable(false);
        } else {
            sg1205Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1206Field() throws SQLException {
        if(sg1206Field.isEditable()){
            submachineGunsCount.setSg1206(Integer.parseInt(sg1206Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1206Field.setEditable(false);
        } else {
            sg1206Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1207Field() throws SQLException {
        if(sg1207Field.isEditable()){
            submachineGunsCount.setSg1207(Integer.parseInt(sg1207Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1207Field.setEditable(false);
        } else {
            sg1207Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1208Field() throws SQLException {
        if(sg1208Field.isEditable()){
            submachineGunsCount.setSg1208(Integer.parseInt(sg1208Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1208Field.setEditable(false);
        } else {
            sg1208Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1209Field() throws SQLException {
        if(sg1209Field.isEditable()){
            submachineGunsCount.setSg1209(Integer.parseInt(sg1209Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1209Field.setEditable(false);
        } else {
            sg1209Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1210Field() throws SQLException {
        if(sg1210Field.isEditable()){
            submachineGunsCount.setSg1210(Integer.parseInt(sg1210Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1210Field.setEditable(false);
        } else {
            sg1210Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1211Field() throws SQLException {
        if(sg1211Field.isEditable()){
            submachineGunsCount.setSg1211(Integer.parseInt(sg1211Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1211Field.setEditable(false);
        } else {
            sg1211Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1212Field() throws SQLException {
        if(sg1212Field.isEditable()){
            submachineGunsCount.setSg1212(Integer.parseInt(sg1212Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1212Field.setEditable(false);
        } else {
            sg1212Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1213Field() throws SQLException {
        if(sg1213Field.isEditable()){
            submachineGunsCount.setSg1213(Integer.parseInt(sg1213Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1213Field.setEditable(false);
        } else {
            sg1213Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1214Field() throws SQLException {
        if(sg1214Field.isEditable()){
            submachineGunsCount.setSg1214(Integer.parseInt(sg1214Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1214Field.setEditable(false);
        } else {
            sg1214Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1215Field() throws SQLException {
        if(sg1215Field.isEditable()){
            submachineGunsCount.setSg1215(Integer.parseInt(sg1215Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1215Field.setEditable(false);
        } else {
            sg1215Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1216Field() throws SQLException {
        if(sg1216Field.isEditable()){
            submachineGunsCount.setSg1216(Integer.parseInt(sg1216Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1216Field.setEditable(false);
        } else {
            sg1216Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1217Field() throws SQLException {
        if(sg1217Field.isEditable()){
            submachineGunsCount.setSg1217(Integer.parseInt(sg1217Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1217Field.setEditable(false);
        } else {
            sg1217Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1218Field() throws SQLException {
        if(sg1218Field.isEditable()){
            submachineGunsCount.setSg1218(Integer.parseInt(sg1218Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1218Field.setEditable(false);
        } else {
            sg1218Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1219Field() throws SQLException {
        if(sg1219Field.isEditable()){
            submachineGunsCount.setSg1219(Integer.parseInt(sg1219Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1219Field.setEditable(false);
        } else {
            sg1219Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1220Field() throws SQLException {
        if(sg1220Field.isEditable()){
            submachineGunsCount.setSg1220(Integer.parseInt(sg1220Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1220Field.setEditable(false);
        } else {
            sg1220Field.setEditable(true);
        }
    }

    @FXML
    private void handleSg1221Field() throws SQLException {
        if(sg1221Field.isEditable()){
            submachineGunsCount.setSg1221(Integer.parseInt(sg1221Field.getText()));
            SciDB.updateSubmachineGunsCount(person, submachineGunsCount);
            sg1221Field.setEditable(false);
        } else {
            sg1221Field.setEditable(true);
        }
    }
}
