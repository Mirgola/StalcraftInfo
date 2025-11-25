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

public class MachineGunsController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private MachineGunsCount machineGunsCount;
    private MenuBarBarterController barterController;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label;

    @FXML
    private TextField mg1301Field, mg1302Field, mg1303Field, mg1304Field, mg1305Field, mg1306Field;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    /*
    @FXML
    public void initialize() {
        setupDragHandlers();
    }
    */

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setBarterController(MenuBarBarterController barterController) {
        this.barterController = barterController;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Пожарная часть | 2 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l4label.setText("База «Рубежа» | 4 Уровень");
                l5label.setText("База «Рубежа» | 6 Уровень");
            }
            if (fraction.equals("Заря")) {
                l4label.setText("База «Зари» | 4 Уровень");
                l5label.setText("База «Зари» | 6 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l4label.setText("Фракции Севера | 4 Уровень");
                l5label.setText("Фракции Севера | 6 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 2 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l4label.setText("Лагерь «Наемников» | 4 Уровень");
                l5label.setText("Лагерь «Наемников» | 6 Уровень");
            }
            if (fraction.equals("Завет")) {
                l4label.setText("Лагерь «Завета» | 4 Уровень");
                l5label.setText("Лагерь «Завета» | 6 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l4label.setText("Фракции Севера | 4 Уровень");
                l5label.setText("Фракции Севера | 6 Уровень");
            }
        }
    }

    public void setField(MachineGunsCount machineGunsCount) {
        this.machineGunsCount = machineGunsCount;
        System.out.println(machineGunsCount.getNicknamePerson());
        mg1301Field.setText(Integer.toString(machineGunsCount.getMg1301()));
        mg1302Field.setText(Integer.toString(machineGunsCount.getMg1302()));
        mg1303Field.setText(Integer.toString(machineGunsCount.getMg1303()));
        mg1304Field.setText(Integer.toString(machineGunsCount.getMg1304()));
        mg1305Field.setText(Integer.toString(machineGunsCount.getMg1305()));
        mg1306Field.setText(Integer.toString(machineGunsCount.getMg1306()));
    }

    // Вызов окна Автоматы
    @FXML
    private void handleAssaultRifles() throws IOException {
        barterController.handleAssaultRifles();
    }

    /*
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
    */

    @FXML
    private void handleMg1301Field() throws SQLException {
        if(mg1301Field.isEditable()){
            machineGunsCount.setMg1301(Integer.parseInt(mg1301Field.getText()));
            SciDB.updateMachineGunsCount(person, machineGunsCount);
            mg1301Field.setEditable(false);
        } else {
            mg1301Field.setEditable(true);
        }
    }

    @FXML
    private void handleMg1302Field() throws SQLException {
        if(mg1302Field.isEditable()){
            machineGunsCount.setMg1302(Integer.parseInt(mg1302Field.getText()));
            SciDB.updateMachineGunsCount(person, machineGunsCount);
            mg1302Field.setEditable(false);
        } else {
            mg1302Field.setEditable(true);
        }
    }

    @FXML
    private void handleMg1303Field() throws SQLException {
        if(mg1303Field.isEditable()){
            machineGunsCount.setMg1303(Integer.parseInt(mg1303Field.getText()));
            SciDB.updateMachineGunsCount(person, machineGunsCount);
            mg1303Field.setEditable(false);
        } else {
            mg1303Field.setEditable(true);
        }
    }

    @FXML
    private void handleMg1304Field() throws SQLException {
        if(mg1304Field.isEditable()){
            machineGunsCount.setMg1304(Integer.parseInt(mg1304Field.getText()));
            SciDB.updateMachineGunsCount(person, machineGunsCount);
            mg1304Field.setEditable(false);
        } else {
            mg1304Field.setEditable(true);
        }
    }

    @FXML
    private void handleMg1305Field() throws SQLException {
        if(mg1305Field.isEditable()){
            machineGunsCount.setMg1305(Integer.parseInt(mg1305Field.getText()));
            SciDB.updateMachineGunsCount(person, machineGunsCount);
            mg1305Field.setEditable(false);
        } else {
            mg1305Field.setEditable(true);
        }
    }

    @FXML
    private void handleMg1306Field() throws SQLException {
        if(mg1306Field.isEditable()){
            machineGunsCount.setMg1306(Integer.parseInt(mg1306Field.getText()));
            SciDB.updateMachineGunsCount(person, machineGunsCount);
            mg1306Field.setEditable(false);
        } else {
            mg1306Field.setEditable(true);
        }
    }
}
