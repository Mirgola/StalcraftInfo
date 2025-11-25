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

public class SniperRiflesController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private SniperRiflesCount sniperRiflesCount;
    MenuBarBarterController barterController;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label;

    @FXML
    private TextField sr1401Field, sr1402Field, sr1403Field, sr1404Field, sr1405Field, sr1406Field, sr1407Field, sr1408Field, sr1409Field, sr1410Field,
                      sr1411Field, sr1412Field, sr1413Field, sr1414Field, sr1415Field, sr1416Field, sr1417Field, sr1418Field, sr1419Field, sr1420Field,
                      sr1421Field, sr1422Field;

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
            l3label.setText("Пожарная часть | 3 Уровень");
            l4label.setText("Бар | 3 Уровень");
            l5label.setText("Бар | 7 Уровень");
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 4 Уровень");
                l7label.setText("База «Рубежа» | 6 Уровень");
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 4 Уровень");
                l7label.setText("База «Зари» | 6 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 4 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
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
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Лагерь «Завета» | 4 Уровень");
                l7label.setText("Лагерь «Завета» | 6 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 4 Уровень");
                l7label.setText("Фракции Севера | 6 Уровень");
            }
        }
    }

    public void setField(SniperRiflesCount sniperRiflesCount) {
        this.sniperRiflesCount = sniperRiflesCount;
        System.out.println(sniperRiflesCount.getNicknamePerson());
        sr1401Field.setText(Integer.toString(sniperRiflesCount.getSr1401()));
        sr1402Field.setText(Integer.toString(sniperRiflesCount.getSr1402()));
        sr1403Field.setText(Integer.toString(sniperRiflesCount.getSr1403()));
        sr1404Field.setText(Integer.toString(sniperRiflesCount.getSr1404()));
        sr1405Field.setText(Integer.toString(sniperRiflesCount.getSr1405()));
        sr1406Field.setText(Integer.toString(sniperRiflesCount.getSr1406()));
        sr1407Field.setText(Integer.toString(sniperRiflesCount.getSr1407()));
        sr1408Field.setText(Integer.toString(sniperRiflesCount.getSr1408()));
        sr1409Field.setText(Integer.toString(sniperRiflesCount.getSr1409()));
        sr1410Field.setText(Integer.toString(sniperRiflesCount.getSr1410()));
        sr1411Field.setText(Integer.toString(sniperRiflesCount.getSr1411()));
        sr1412Field.setText(Integer.toString(sniperRiflesCount.getSr1412()));
        sr1413Field.setText(Integer.toString(sniperRiflesCount.getSr1413()));
        sr1414Field.setText(Integer.toString(sniperRiflesCount.getSr1414()));
        sr1415Field.setText(Integer.toString(sniperRiflesCount.getSr1415()));
        sr1416Field.setText(Integer.toString(sniperRiflesCount.getSr1416()));
        sr1417Field.setText(Integer.toString(sniperRiflesCount.getSr1417()));
        sr1418Field.setText(Integer.toString(sniperRiflesCount.getSr1418()));
        sr1419Field.setText(Integer.toString(sniperRiflesCount.getSr1419()));
        sr1420Field.setText(Integer.toString(sniperRiflesCount.getSr1420()));
        sr1421Field.setText(Integer.toString(sniperRiflesCount.getSr1421()));
        sr1422Field.setText(Integer.toString(sniperRiflesCount.getSr1422()));
    }

    // Вызов окна Автоматы
    @FXML
    private void handleAssaultRifles() throws IOException {
        barterController.handleAssaultRifles();
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
    private void handleSr1401Field() throws SQLException {
        if(sr1401Field.isEditable()){
            sniperRiflesCount.setSr1401(Integer.parseInt(sr1401Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1401Field.setEditable(false);
        } else {
            sr1401Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1402Field() throws SQLException {
        if(sr1402Field.isEditable()){
            sniperRiflesCount.setSr1402(Integer.parseInt(sr1402Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1402Field.setEditable(false);
        } else {
            sr1402Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1403Field() throws SQLException {
        if(sr1403Field.isEditable()){
            sniperRiflesCount.setSr1403(Integer.parseInt(sr1403Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1403Field.setEditable(false);
        } else {
            sr1403Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1404Field() throws SQLException {
        if(sr1404Field.isEditable()){
            sniperRiflesCount.setSr1404(Integer.parseInt(sr1404Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1404Field.setEditable(false);
        } else {
            sr1404Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1405Field() throws SQLException {
        if(sr1405Field.isEditable()){
            sniperRiflesCount.setSr1405(Integer.parseInt(sr1405Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1405Field.setEditable(false);
        } else {
            sr1405Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1406Field() throws SQLException {
        if(sr1406Field.isEditable()){
            sniperRiflesCount.setSr1406(Integer.parseInt(sr1406Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1406Field.setEditable(false);
        } else {
            sr1406Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1407Field() throws SQLException {
        if(sr1407Field.isEditable()){
            sniperRiflesCount.setSr1407(Integer.parseInt(sr1407Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1407Field.setEditable(false);
        } else {
            sr1407Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1408Field() throws SQLException {
        if(sr1408Field.isEditable()){
            sniperRiflesCount.setSr1408(Integer.parseInt(sr1408Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1408Field.setEditable(false);
        } else {
            sr1408Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1409Field() throws SQLException {
        if(sr1409Field.isEditable()){
            sniperRiflesCount.setSr1409(Integer.parseInt(sr1409Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1409Field.setEditable(false);
        } else {
            sr1409Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1410Field() throws SQLException {
        if(sr1410Field.isEditable()){
            sniperRiflesCount.setSr1410(Integer.parseInt(sr1410Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1410Field.setEditable(false);
        } else {
            sr1410Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1411Field() throws SQLException {
        if(sr1411Field.isEditable()){
            sniperRiflesCount.setSr1411(Integer.parseInt(sr1411Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1411Field.setEditable(false);
        } else {
            sr1411Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1412Field() throws SQLException {
        if(sr1412Field.isEditable()){
            sniperRiflesCount.setSr1412(Integer.parseInt(sr1412Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1412Field.setEditable(false);
        } else {
            sr1412Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1413Field() throws SQLException {
        if(sr1413Field.isEditable()){
            sniperRiflesCount.setSr1413(Integer.parseInt(sr1413Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1413Field.setEditable(false);
        } else {
            sr1413Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1414Field() throws SQLException {
        if(sr1414Field.isEditable()){
            sniperRiflesCount.setSr1414(Integer.parseInt(sr1414Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1414Field.setEditable(false);
        } else {
            sr1414Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1415Field() throws SQLException {
        if(sr1415Field.isEditable()){
            sniperRiflesCount.setSr1415(Integer.parseInt(sr1415Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1415Field.setEditable(false);
        } else {
            sr1415Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1416Field() throws SQLException {
        if(sr1416Field.isEditable()){
            sniperRiflesCount.setSr1416(Integer.parseInt(sr1416Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1416Field.setEditable(false);
        } else {
            sr1416Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1417Field() throws SQLException {
        if(sr1417Field.isEditable()){
            sniperRiflesCount.setSr1417(Integer.parseInt(sr1417Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1417Field.setEditable(false);
        } else {
            sr1417Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1418Field() throws SQLException {
        if(sr1418Field.isEditable()){
            sniperRiflesCount.setSr1418(Integer.parseInt(sr1418Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1418Field.setEditable(false);
        } else {
            sr1418Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1419Field() throws SQLException {
        if(sr1419Field.isEditable()){
            sniperRiflesCount.setSr1419(Integer.parseInt(sr1419Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1419Field.setEditable(false);
        } else {
            sr1419Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1420Field() throws SQLException {
        if(sr1420Field.isEditable()){
            sniperRiflesCount.setSr1420(Integer.parseInt(sr1420Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1420Field.setEditable(false);
        } else {
            sr1420Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1421Field() throws SQLException {
        if(sr1421Field.isEditable()){
            sniperRiflesCount.setSr1421(Integer.parseInt(sr1421Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1421Field.setEditable(false);
        } else {
            sr1421Field.setEditable(true);
        }
    }

    @FXML
    private void handleSr1422Field() throws SQLException {
        if(sr1422Field.isEditable()){
            sniperRiflesCount.setSr1422(Integer.parseInt(sr1422Field.getText()));
            SciDB.updateSniperRiflesCount(person, sniperRiflesCount);
            sr1422Field.setEditable(false);
        } else {
            sr1422Field.setEditable(true);
        }
    }
}
