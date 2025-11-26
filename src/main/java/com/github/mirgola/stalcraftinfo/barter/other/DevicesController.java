package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class DevicesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private DevicesCount devicesCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label;

    @FXML
    private TextField d2301Field, d2302Field, d2303Field, d2304Field, d2305Field, d2306Field, d2307Field, d2308Field, d2309Field, d2310Field,
                      d2311Field;

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
            l2label.setText("Пожарная часть | 1 Уровень");
            l3label.setText("Пожарная часть | 3 Уровень");
            l4label.setText("Пожарная часть | 4 Уровень");
            l5label.setText("Бар | 1 Уровень");
            l6label.setText("Бар | 3 Уровень");
            l7label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l8label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l8label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Сельская школа | 1 Уровень");
            l3label.setText("Сельская школа | 3 Уровень");
            l4label.setText("Сельская школа | 4 Уровень");
            l5label.setText("Бар | 1 Уровень");
            l6label.setText("Бар | 3 Уровень");
            l7label.setText("Бар | 7 Уровень");
            if (fraction.equals("Наемники")) {
                l8label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l8label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l8label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(DevicesCount devicesCount) {
        this.devicesCount = devicesCount;
        System.out.println(devicesCount.getNicknamePerson());
        d2301Field.setText(Integer.toString(devicesCount.getD2301()));
        d2302Field.setText(Integer.toString(devicesCount.getD2302()));
        d2303Field.setText(Integer.toString(devicesCount.getD2303()));
        d2304Field.setText(Integer.toString(devicesCount.getD2304()));
        d2305Field.setText(Integer.toString(devicesCount.getD2304()));
        d2306Field.setText(Integer.toString(devicesCount.getD2306()));
        d2307Field.setText(Integer.toString(devicesCount.getD2307()));
        d2308Field.setText(Integer.toString(devicesCount.getD2308()));
        d2309Field.setText(Integer.toString(devicesCount.getD2309()));
        d2310Field.setText(Integer.toString(devicesCount.getD2310()));
        d2311Field.setText(Integer.toString(devicesCount.getD2311()));
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
    private void handleD2301Field() throws SQLException {
        if(d2301Field.isEditable()){
            devicesCount.setD2301(Integer.parseInt(d2301Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2301Field.setEditable(false);
        } else {
            d2301Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2302Field() throws SQLException {
        if(d2302Field.isEditable()){
            devicesCount.setD2302(Integer.parseInt(d2302Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2302Field.setEditable(false);
        } else {
            d2302Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2303Field() throws SQLException {
        if(d2303Field.isEditable()){
            devicesCount.setD2303(Integer.parseInt(d2303Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2303Field.setEditable(false);
        } else {
            d2303Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2304Field() throws SQLException {
        if(d2304Field.isEditable()){
            devicesCount.setD2304(Integer.parseInt(d2304Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2304Field.setEditable(false);
        } else {
            d2304Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2305Field() throws SQLException {
        if(d2305Field.isEditable()){
            devicesCount.setD2305(Integer.parseInt(d2305Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2305Field.setEditable(false);
        } else {
            d2305Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2306Field() throws SQLException {
        if(d2306Field.isEditable()){
            devicesCount.setD2306(Integer.parseInt(d2306Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2306Field.setEditable(false);
        } else {
            d2306Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2307Field() throws SQLException {
        if(d2307Field.isEditable()){
            devicesCount.setD2307(Integer.parseInt(d2307Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2307Field.setEditable(false);
        } else {
            d2307Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2308Field() throws SQLException {
        if(d2308Field.isEditable()){
            devicesCount.setD2308(Integer.parseInt(d2308Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2308Field.setEditable(false);
        } else {
            d2308Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2309Field() throws SQLException {
        if(d2309Field.isEditable()){
            devicesCount.setD2309(Integer.parseInt(d2309Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2309Field.setEditable(false);
        } else {
            d2309Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2310Field() throws SQLException {
        if(d2310Field.isEditable()){
            devicesCount.setD2310(Integer.parseInt(d2310Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2310Field.setEditable(false);
        } else {
            d2310Field.setEditable(true);
        }
    }

    @FXML
    private void handleD2311Field() throws SQLException {
        if(d2311Field.isEditable()){
            devicesCount.setD2311(Integer.parseInt(d2311Field.getText()));
            SciDB.updateDevicesCount(person, devicesCount);
            d2311Field.setEditable(false);
        } else {
            d2311Field.setEditable(true);
        }
    }
}
