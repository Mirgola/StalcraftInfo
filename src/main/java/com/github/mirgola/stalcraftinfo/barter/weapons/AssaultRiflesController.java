package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.MenuBarBarterController;
import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.SQLException;

public class AssaultRiflesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private AssaultRiflesCount assaultRiflesCount;
    private MenuBarBarterController barterController;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label, l9label;

    @FXML
    private TextField ar1101Field, ar1102Field, ar1103Field, ar1104Field, ar1105Field, ar1106Field, ar1107Field, ar1108Field, ar1109Field, ar1110Field,
                      ar1111Field, ar1112Field, ar1113Field, ar1114Field, ar1115Field, ar1116Field, ar1117Field, ar1118Field, ar1119Field, ar1120Field,
                      ar1121Field, ar1122Field, ar1123Field, ar1124Field, ar1125Field, ar1126Field, ar1127Field, ar1128Field, ar1129Field, ar1130Field,
                      ar1131Field, ar1132Field, ar1133Field, ar1134Field;

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
            l3label.setText("Пожарная часть | 1 Уровень");
            l4label.setText("Пожарная часть | 2 Уровень");
            l5label.setText("Бар | 3 Уровень");
            l6label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l7label.setText("База «Рубежа» | 4 Уровень");
                l8label.setText("База «Рубежа» | 6 Уровень");
                l9label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l7label.setText("База «Зари» | 4 Уровень");
                l8label.setText("База «Зари» | 6 Уровень");
                l9label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l7label.setText("Фракции Севера | 4 Уровень");
                l8label.setText("Фракции Севера | 6 Уровень");
                l9label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 1 Уровень");
            l4label.setText("Сельская школа | 2 Уровень");
            l5label.setText("Бар | 3 Уровень");
            l6label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l7label.setText("Лагерь «Наемников» | 4 Уровень");
                l8label.setText("Лагерь «Наемников» | 6 Уровень");
                l9label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l7label.setText("Лагерь «Завета» | 4 Уровень");
                l8label.setText("Лагерь «Завета» | 6 Уровень");
                l9label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l7label.setText("Фракции Севера | 4 Уровень");
                l8label.setText("Фракции Севера | 6 Уровень");
                l9label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(AssaultRiflesCount assaultRiflesCount) {
        this.assaultRiflesCount = assaultRiflesCount;
        System.out.println(assaultRiflesCount.getNicknamePerson());
        ar1101Field.setText(Integer.toString(assaultRiflesCount.getAr1101()));
        ar1102Field.setText(Integer.toString(assaultRiflesCount.getAr1102()));
        ar1103Field.setText(Integer.toString(assaultRiflesCount.getAr1103()));
        ar1104Field.setText(Integer.toString(assaultRiflesCount.getAr1104()));
        ar1105Field.setText(Integer.toString(assaultRiflesCount.getAr1104()));
        ar1106Field.setText(Integer.toString(assaultRiflesCount.getAr1106()));
        ar1107Field.setText(Integer.toString(assaultRiflesCount.getAr1107()));
        ar1108Field.setText(Integer.toString(assaultRiflesCount.getAr1108()));
        ar1109Field.setText(Integer.toString(assaultRiflesCount.getAr1109()));
        ar1110Field.setText(Integer.toString(assaultRiflesCount.getAr1110()));
        ar1111Field.setText(Integer.toString(assaultRiflesCount.getAr1111()));
        ar1112Field.setText(Integer.toString(assaultRiflesCount.getAr1112()));
        ar1113Field.setText(Integer.toString(assaultRiflesCount.getAr1113()));
        ar1114Field.setText(Integer.toString(assaultRiflesCount.getAr1114()));
        ar1115Field.setText(Integer.toString(assaultRiflesCount.getAr1115()));
        ar1116Field.setText(Integer.toString(assaultRiflesCount.getAr1116()));
        ar1117Field.setText(Integer.toString(assaultRiflesCount.getAr1117()));
        ar1118Field.setText(Integer.toString(assaultRiflesCount.getAr1118()));
        ar1119Field.setText(Integer.toString(assaultRiflesCount.getAr1119()));
        ar1120Field.setText(Integer.toString(assaultRiflesCount.getAr1120()));
        ar1121Field.setText(Integer.toString(assaultRiflesCount.getAr1121()));
        ar1122Field.setText(Integer.toString(assaultRiflesCount.getAr1122()));
        ar1123Field.setText(Integer.toString(assaultRiflesCount.getAr1123()));
        ar1124Field.setText(Integer.toString(assaultRiflesCount.getAr1124()));
        ar1125Field.setText(Integer.toString(assaultRiflesCount.getAr1125()));
        ar1126Field.setText(Integer.toString(assaultRiflesCount.getAr1126()));
        ar1127Field.setText(Integer.toString(assaultRiflesCount.getAr1127()));
        ar1128Field.setText(Integer.toString(assaultRiflesCount.getAr1128()));
        ar1129Field.setText(Integer.toString(assaultRiflesCount.getAr1129()));
        ar1130Field.setText(Integer.toString(assaultRiflesCount.getAr1130()));
        ar1131Field.setText(Integer.toString(assaultRiflesCount.getAr1131()));
        ar1132Field.setText(Integer.toString(assaultRiflesCount.getAr1132()));
        ar1133Field.setText(Integer.toString(assaultRiflesCount.getAr1133()));
        ar1134Field.setText(Integer.toString(assaultRiflesCount.getAr1134()));
    }

    // Вызов окна Пулеметы
    @FXML
    private void handleMachineGuns() throws IOException {
        barterController.handleMachineGuns();
    }

    // Вызов окна Снайперские винтовки
    @FXML
    private void handleSniperRifles() throws IOException {
        barterController.handleSniperRifles();
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
    private void handleAr1101Field() throws SQLException {
        if(ar1101Field.isEditable()){
            assaultRiflesCount.setAr1101(Integer.parseInt(ar1101Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1101Field.setEditable(false);
        } else {
            ar1101Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1102Field() throws SQLException {
        if(ar1102Field.isEditable()){
            assaultRiflesCount.setAr1102(Integer.parseInt(ar1102Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1102Field.setEditable(false);
        } else {
            ar1102Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1103Field() throws SQLException {
        if(ar1103Field.isEditable()){
            assaultRiflesCount.setAr1103(Integer.parseInt(ar1103Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1103Field.setEditable(false);
        } else {
            ar1103Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1104Field() throws SQLException {
        if(ar1104Field.isEditable()){
            assaultRiflesCount.setAr1104(Integer.parseInt(ar1104Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1104Field.setEditable(false);
        } else {
            ar1104Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1105Field() throws SQLException {
        if(ar1105Field.isEditable()){
            assaultRiflesCount.setAr1105(Integer.parseInt(ar1105Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1105Field.setEditable(false);
        } else {
            ar1105Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1106Field() throws SQLException {
        if(ar1106Field.isEditable()){
            assaultRiflesCount.setAr1106(Integer.parseInt(ar1106Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1106Field.setEditable(false);
        } else {
            ar1106Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1107Field() throws SQLException {
        if(ar1107Field.isEditable()){
            assaultRiflesCount.setAr1107(Integer.parseInt(ar1107Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1107Field.setEditable(false);
        } else {
            ar1107Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1108Field() throws SQLException {
        if(ar1108Field.isEditable()){
            assaultRiflesCount.setAr1108(Integer.parseInt(ar1108Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1108Field.setEditable(false);
        } else {
            ar1108Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1109Field() throws SQLException {
        if(ar1109Field.isEditable()){
            assaultRiflesCount.setAr1109(Integer.parseInt(ar1109Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1109Field.setEditable(false);
        } else {
            ar1109Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1110Field() throws SQLException {
        if(ar1110Field.isEditable()){
            assaultRiflesCount.setAr1110(Integer.parseInt(ar1110Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1110Field.setEditable(false);
        } else {
            ar1110Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1111Field() throws SQLException {
        if(ar1111Field.isEditable()){
            assaultRiflesCount.setAr1111(Integer.parseInt(ar1111Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1111Field.setEditable(false);
        } else {
            ar1111Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1112Field() throws SQLException {
        if(ar1112Field.isEditable()){
            assaultRiflesCount.setAr1112(Integer.parseInt(ar1112Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1112Field.setEditable(false);
        } else {
            ar1112Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1113Field() throws SQLException {
        if(ar1113Field.isEditable()){
            assaultRiflesCount.setAr1113(Integer.parseInt(ar1113Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1113Field.setEditable(false);
        } else {
            ar1113Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1114Field() throws SQLException {
        if(ar1114Field.isEditable()){
            assaultRiflesCount.setAr1114(Integer.parseInt(ar1114Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1114Field.setEditable(false);
        } else {
            ar1114Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1115Field() throws SQLException {
        if(ar1115Field.isEditable()){
            assaultRiflesCount.setAr1115(Integer.parseInt(ar1115Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1115Field.setEditable(false);
        } else {
            ar1115Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1116Field() throws SQLException {
        if(ar1116Field.isEditable()){
            assaultRiflesCount.setAr1116(Integer.parseInt(ar1116Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1116Field.setEditable(false);
        } else {
            ar1116Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1117Field() throws SQLException {
        if(ar1117Field.isEditable()){
            assaultRiflesCount.setAr1117(Integer.parseInt(ar1117Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1117Field.setEditable(false);
        } else {
            ar1117Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1118Field() throws SQLException {
        if(ar1118Field.isEditable()){
            assaultRiflesCount.setAr1118(Integer.parseInt(ar1118Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1118Field.setEditable(false);
        } else {
            ar1118Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1119Field() throws SQLException {
        if(ar1119Field.isEditable()){
            assaultRiflesCount.setAr1119(Integer.parseInt(ar1119Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1119Field.setEditable(false);
        } else {
            ar1119Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1120Field() throws SQLException {
        if(ar1120Field.isEditable()){
            assaultRiflesCount.setAr1120(Integer.parseInt(ar1120Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1120Field.setEditable(false);
        } else {
            ar1120Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1121Field() throws SQLException {
        if(ar1121Field.isEditable()){
            assaultRiflesCount.setAr1121(Integer.parseInt(ar1121Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1121Field.setEditable(false);
        } else {
            ar1121Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1122Field() throws SQLException {
        if(ar1122Field.isEditable()){
            assaultRiflesCount.setAr1122(Integer.parseInt(ar1122Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1122Field.setEditable(false);
        } else {
            ar1122Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1123Field() throws SQLException {
        if(ar1123Field.isEditable()){
            assaultRiflesCount.setAr1123(Integer.parseInt(ar1123Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1123Field.setEditable(false);
        } else {
            ar1123Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1124Field() throws SQLException {
        if(ar1124Field.isEditable()){
            assaultRiflesCount.setAr1124(Integer.parseInt(ar1124Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1124Field.setEditable(false);
        } else {
            ar1124Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1125Field() throws SQLException {
        if(ar1125Field.isEditable()){
            assaultRiflesCount.setAr1125(Integer.parseInt(ar1125Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1125Field.setEditable(false);
        } else {
            ar1125Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1126Field() throws SQLException {
        if(ar1126Field.isEditable()){
            assaultRiflesCount.setAr1126(Integer.parseInt(ar1126Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1126Field.setEditable(false);
        } else {
            ar1126Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1127Field() throws SQLException {
        if(ar1127Field.isEditable()){
            assaultRiflesCount.setAr1127(Integer.parseInt(ar1127Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1127Field.setEditable(false);
        } else {
            ar1127Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1128Field() throws SQLException {
        if(ar1128Field.isEditable()){
            assaultRiflesCount.setAr1128(Integer.parseInt(ar1128Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1128Field.setEditable(false);
        } else {
            ar1128Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1129Field() throws SQLException {
        if(ar1129Field.isEditable()){
            assaultRiflesCount.setAr1129(Integer.parseInt(ar1129Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1129Field.setEditable(false);
        } else {
            ar1129Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1130Field() throws SQLException {
        if(ar1130Field.isEditable()){
            assaultRiflesCount.setAr1130(Integer.parseInt(ar1130Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1130Field.setEditable(false);
        } else {
            ar1130Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1131Field() throws SQLException {
        if(ar1131Field.isEditable()){
            assaultRiflesCount.setAr1131(Integer.parseInt(ar1131Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1131Field.setEditable(false);
        } else {
            ar1131Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1132Field() throws SQLException {
        if(ar1132Field.isEditable()){
            assaultRiflesCount.setAr1132(Integer.parseInt(ar1132Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1132Field.setEditable(false);
        } else {
            ar1132Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1133Field() throws SQLException {
        if(ar1133Field.isEditable()){
            assaultRiflesCount.setAr1133(Integer.parseInt(ar1133Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1133Field.setEditable(false);
        } else {
            ar1133Field.setEditable(true);
        }
    }

    @FXML
    private void handleAr1134Field() throws SQLException {
        if(ar1134Field.isEditable()){
            assaultRiflesCount.setAr1134(Integer.parseInt(ar1134Field.getText()));
            SciDB.updateAssaultRiflesCount(person, assaultRiflesCount);
            ar1134Field.setEditable(false);
        } else {
            ar1134Field.setEditable(true);
        }
    }
}
