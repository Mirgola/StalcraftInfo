package com.github.mirgola.stalcraftinfo.barter.suits;

import com.github.mirgola.stalcraftinfo.MenuBarBarterController;
import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.sql.SQLException;

public class ScientistController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private ScientistCount scientistCount;
    private MenuBarBarterController barterController;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label;

    @FXML
    private Label s4303_s4304Label, s4307_s4308Label, s4310_s4311_s4312_s4313Label;

    @FXML
    private TextField s4301Field, s4302Field, s4303_s4304Field, s4305Field, s4306Field, s4307_s4308Field, s4309Field, s4310_s4311_s4312_s4313Field;

    @FXML
    private ImageView s4303_s4304ImageView, s4307_s4308ImageView, s4310_s4311_s4312_s4313ImageView;
    
    @FXML
    private Pane s4310_s4311_s4312_s4313Pane;

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
            l3label.setText("Пожарная часть | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            s4303_s4304Label.setText("«Аврора-Б»");
            s4303_s4304ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/lyj2k.png")));
            s4307_s4308Label.setText("«Уран»");
            s4307_s4308ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/g4ym6.png")));
            if (fraction.equals("Рубеж")) {
                l6label.setText("База «Рубежа» | 3 Уровень");
                l7label.setText("База «Рубежа» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Ковчег»»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/g434p.png")));
            }
            if (fraction.equals("Заря")) {
                l6label.setText("База «Зари» | 3 Уровень");
                l7label.setText("База «Зари» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Орион»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/5l1l0.png")));
            }
            if (fraction.equals("Сталкеры")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                s4310_s4311_s4312_s4313Pane.setVisible(false);
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 1 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 2 Уровень");
            l4label.setText("Бар | 2 Уровень");
            l5label.setText("Бар | 6 Уровень");
            s4303_s4304Label.setText("«Бандитский костюм с баллонами»");
            s4303_s4304ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/ok0m6.png")));
            s4307_s4308Label.setText("«Жнец»");
            s4307_s4308ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/zzy2y.png")));
            if (fraction.equals("Наемники")) {
                l6label.setText("Лагерь «Наемников» | 3 Уровень");
                l7label.setText("Лагерь «Наемников» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Навигатор»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/7lzl7.png")));
            }
            if (fraction.equals("Завет")) {
                l6label.setText("Обитель «Завета» | 3 Уровень");
                l7label.setText("Обитель «Завета» | 7 Уровень");
                s4310_s4311_s4312_s4313Label.setText("Комбинезон «Пересвет»");
                s4310_s4311_s4312_s4313ImageView.setImage(new Image(getClass().getResourceAsStream("/com/github/mirgola/stalcraftinfo/icons/suits/scientist/wj4lp.png")));
            }
            if (fraction.equals("Бандиты")) {
                l6label.setText("Фракции Севера | 3 Уровень");
                l7label.setText("Фракции Севера | 7 Уровень");
                s4310_s4311_s4312_s4313Pane.setVisible(false);
            }
        }
    }

    public void setField(ScientistCount scientistCount, String fraction) {
        this.scientistCount = scientistCount;
        System.out.println(scientistCount.getNicknamePerson());
        s4301Field.setText(Integer.toString(scientistCount.getS4301()));
        s4302Field.setText(Integer.toString(scientistCount.getS4302()));

        s4305Field.setText(Integer.toString(scientistCount.getS4305()));
        s4306Field.setText(Integer.toString(scientistCount.getS4306()));

        s4309Field.setText(Integer.toString(scientistCount.getS4309()));

        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            s4303_s4304Field.setText(Integer.toString(scientistCount.getS4303()));
            s4307_s4308Field.setText(Integer.toString(scientistCount.getS4307()));
            if (fraction.equals("Рубеж")) {
                s4310_s4311_s4312_s4313Field.setText(Integer.toString(scientistCount.getS4310()));
            }
            if (fraction.equals("Заря")) {
                s4310_s4311_s4312_s4313Field.setText(Integer.toString(scientistCount.getS4311()));
            }
        }
        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            s4303_s4304Field.setText(Integer.toString(scientistCount.getS4304()));
            s4307_s4308Field.setText(Integer.toString(scientistCount.getS4308()));
            if (fraction.equals("Наемники")) {
                s4310_s4311_s4312_s4313Field.setText(Integer.toString(scientistCount.getS4312()));
            }
            if (fraction.equals("Завет")) {
                s4310_s4311_s4312_s4313Field.setText(Integer.toString(scientistCount.getS4313()));
            }
        }
    }

    @FXML
    private void handleCombined() throws IOException {
        barterController.handleCombined();
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
    private void handleS4301Field() throws SQLException {
        if(s4301Field.isEditable()){
            scientistCount.setS4301(Integer.parseInt(s4301Field.getText()));
            SciDB.updateScientistCount(person, scientistCount);
            s4301Field.setEditable(false);
        } else {
            s4301Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4302Field() throws SQLException {
        if(s4302Field.isEditable()){
            scientistCount.setS4302(Integer.parseInt(s4302Field.getText()));
            SciDB.updateScientistCount(person, scientistCount);
            s4302Field.setEditable(false);
        } else {
            s4302Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4303_s4304Field() throws SQLException {
        if(s4303_s4304Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                scientistCount.setS4303(Integer.parseInt(s4303_s4304Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                scientistCount.setS4304(Integer.parseInt(s4303_s4304Field.getText()));
            }
            SciDB.updateScientistCount(person, scientistCount);
            s4303_s4304Field.setEditable(false);
        } else {
            s4303_s4304Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4305Field() throws SQLException {
        if(s4305Field.isEditable()){
            scientistCount.setS4305(Integer.parseInt(s4305Field.getText()));
            SciDB.updateScientistCount(person, scientistCount);
            s4305Field.setEditable(false);
        } else {
            s4305Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4306Field() throws SQLException {
        if(s4306Field.isEditable()){
            scientistCount.setS4306(Integer.parseInt(s4306Field.getText()));
            SciDB.updateScientistCount(person, scientistCount);
            s4306Field.setEditable(false);
        } else {
            s4306Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4307_s4308Field() throws SQLException {
        if(s4307_s4308Field.isEditable()){
            if (person.getFraction().equals("Рубеж") || person.getFraction().equals("Заря") || person.getFraction().equals("Сталкеры")) {
                scientistCount.setS4307(Integer.parseInt(s4307_s4308Field.getText()));
            }
            if (person.getFraction().equals("Наемники") || person.getFraction().equals("Завет") || person.getFraction().equals("Бандиты")) {
                scientistCount.setS4308(Integer.parseInt(s4307_s4308Field.getText()));
            }
            SciDB.updateScientistCount(person, scientistCount);
            s4307_s4308Field.setEditable(false);
        } else {
            s4307_s4308Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4309Field() throws SQLException {
        if(s4309Field.isEditable()){
            scientistCount.setS4309(Integer.parseInt(s4309Field.getText()));
            SciDB.updateScientistCount(person, scientistCount);
            s4309Field.setEditable(false);
        } else {
            s4309Field.setEditable(true);
        }
    }

    @FXML
    private void handleS4310_s4311_s4312_s4313Field() throws SQLException {
        if(s4310_s4311_s4312_s4313Field.isEditable()){
            if (person.getFraction().equals("Рубеж")) {
                scientistCount.setS4310(Integer.parseInt(s4310_s4311_s4312_s4313Field.getText()));
            }
            if (person.getFraction().equals("Заря")) {
                scientistCount.setS4311(Integer.parseInt(s4310_s4311_s4312_s4313Field.getText()));
            }
            if (person.getFraction().equals("Наемники")) {
                scientistCount.setS4312(Integer.parseInt(s4310_s4311_s4312_s4313Field.getText()));
            }
            if (person.getFraction().equals("Завет")) {
                scientistCount.setS4313(Integer.parseInt(s4310_s4311_s4312_s4313Field.getText()));
            }
            SciDB.updateScientistCount(person, scientistCount);
            s4310_s4311_s4312_s4313Field.setEditable(false);
        } else {
            s4310_s4311_s4312_s4313Field.setEditable(true);
        }
    }
}
