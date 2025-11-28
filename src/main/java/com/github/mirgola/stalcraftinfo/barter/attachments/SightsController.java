package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class SightsController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private SightsCount sightsCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label, l7label, l8label, l9label, l10label, l11label, l12label, l13label;

    @FXML
    private TextField s3401Field, s3402Field, s3403Field, s3404Field, s3405Field, s3406Field, s3407Field, s3408Field, s3409Field, s3410Field,
                      s3411Field, s3412Field, s3413Field, s3414Field, s3415Field, s3416Field, s3417Field, s3418Field, s3419Field, s3420Field,
                      s3421Field, s3422Field, s3423Field, s3424Field, s3425Field, s3426Field, s3427Field, s3428Field, s3429Field, s3430Field,
                      s3431Field, s3432Field, s3433Field, s3434Field, s3435Field, s3436Field;

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
            l2label.setText("Ставка Атамана | 4 Уровень");
            l3label.setText("Пожарная часть | 1 Уровень");
            l4label.setText("Пожарная часть | 2 Уровень");
            l5label.setText("Пожарная часть | 3 Уровень");
            l6label.setText("Пожарная часть | 4 Уровень");
            l7label.setText("Пожарная часть | 5 Уровень");
            l8label.setText("Бар | 1 Уровень");
            l9label.setText("Бар | 2 Уровень");
            l10label.setText("Бар | 3 Уровень");
            l11label.setText("Бар | 4 Уровень");
            l12label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l13label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l13label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Лодочная станция | 4 Уровень");
            l3label.setText("Сельская школа | 1 Уровень");
            l4label.setText("Сельская школа | 2 Уровень");
            l5label.setText("Сельская школа | 3 Уровень");
            l6label.setText("Сельская школа | 4 Уровень");
            l7label.setText("Сельская школа | 5 Уровень");
            l8label.setText("Бар | 1 Уровень");
            l9label.setText("Бар | 2 Уровень");
            l10label.setText("Бар | 3 Уровень");
            l11label.setText("Бар | 4 Уровень");
            l12label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l13label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l13label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l13label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(SightsCount sightsCount) {
        this.sightsCount = sightsCount;
        System.out.println(sightsCount.getNicknamePerson());
        s3401Field.setText(Integer.toString(sightsCount.getS3401()));
        s3402Field.setText(Integer.toString(sightsCount.getS3402()));
        s3403Field.setText(Integer.toString(sightsCount.getS3403()));
        s3404Field.setText(Integer.toString(sightsCount.getS3404()));
        s3405Field.setText(Integer.toString(sightsCount.getS3405()));
        s3406Field.setText(Integer.toString(sightsCount.getS3406()));
        s3407Field.setText(Integer.toString(sightsCount.getS3407()));
        s3408Field.setText(Integer.toString(sightsCount.getS3408()));
        s3409Field.setText(Integer.toString(sightsCount.getS3409()));
        s3410Field.setText(Integer.toString(sightsCount.getS3410()));
        s3411Field.setText(Integer.toString(sightsCount.getS3411()));
        s3412Field.setText(Integer.toString(sightsCount.getS3412()));
        s3413Field.setText(Integer.toString(sightsCount.getS3413()));
        s3414Field.setText(Integer.toString(sightsCount.getS3414()));
        s3415Field.setText(Integer.toString(sightsCount.getS3415()));
        s3416Field.setText(Integer.toString(sightsCount.getS3416()));
        s3417Field.setText(Integer.toString(sightsCount.getS3417()));
        s3418Field.setText(Integer.toString(sightsCount.getS3418()));
        s3419Field.setText(Integer.toString(sightsCount.getS3419()));
        s3420Field.setText(Integer.toString(sightsCount.getS3420()));
        s3421Field.setText(Integer.toString(sightsCount.getS3421()));
        s3422Field.setText(Integer.toString(sightsCount.getS3422()));
        s3423Field.setText(Integer.toString(sightsCount.getS3423()));
        s3424Field.setText(Integer.toString(sightsCount.getS3424()));
        s3425Field.setText(Integer.toString(sightsCount.getS3425()));
        s3426Field.setText(Integer.toString(sightsCount.getS3426()));
        s3427Field.setText(Integer.toString(sightsCount.getS3427()));
        s3428Field.setText(Integer.toString(sightsCount.getS3428()));
        s3429Field.setText(Integer.toString(sightsCount.getS3429()));
        s3430Field.setText(Integer.toString(sightsCount.getS3430()));
        s3431Field.setText(Integer.toString(sightsCount.getS3431()));
        s3432Field.setText(Integer.toString(sightsCount.getS3432()));
        s3433Field.setText(Integer.toString(sightsCount.getS3433()));
        s3434Field.setText(Integer.toString(sightsCount.getS3434()));
        s3435Field.setText(Integer.toString(sightsCount.getS3435()));
        s3436Field.setText(Integer.toString(sightsCount.getS3436()));
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
        double scrollSensitivity = 0.0005;

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
    private void handles3401Field() throws SQLException {
        if(s3401Field.isEditable()){
            sightsCount.setS3401(Integer.parseInt(s3401Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3401Field.setEditable(false);
        } else {
            s3401Field.setEditable(true);
        }
    }

    @FXML
    private void handles3402Field() throws SQLException {
        if(s3402Field.isEditable()){
            sightsCount.setS3402(Integer.parseInt(s3402Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3402Field.setEditable(false);
        } else {
            s3402Field.setEditable(true);
        }
    }

    @FXML
    private void handles3403Field() throws SQLException {
        if(s3403Field.isEditable()){
            sightsCount.setS3403(Integer.parseInt(s3403Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3403Field.setEditable(false);
        } else {
            s3403Field.setEditable(true);
        }
    }

    @FXML
    private void handles3404Field() throws SQLException {
        if(s3404Field.isEditable()){
            sightsCount.setS3404(Integer.parseInt(s3404Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3404Field.setEditable(false);
        } else {
            s3404Field.setEditable(true);
        }
    }

    @FXML
    private void handles3405Field() throws SQLException {
        if(s3405Field.isEditable()){
            sightsCount.setS3405(Integer.parseInt(s3405Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3405Field.setEditable(false);
        } else {
            s3405Field.setEditable(true);
        }
    }

    @FXML
    private void handles3406Field() throws SQLException {
        if(s3406Field.isEditable()){
            sightsCount.setS3406(Integer.parseInt(s3406Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3406Field.setEditable(false);
        } else {
            s3406Field.setEditable(true);
        }
    }

    @FXML
    private void handles3407Field() throws SQLException {
        if(s3407Field.isEditable()){
            sightsCount.setS3407(Integer.parseInt(s3407Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3407Field.setEditable(false);
        } else {
            s3407Field.setEditable(true);
        }
    }

    @FXML
    private void handles3408Field() throws SQLException {
        if(s3408Field.isEditable()){
            sightsCount.setS3408(Integer.parseInt(s3408Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3408Field.setEditable(false);
        } else {
            s3408Field.setEditable(true);
        }
    }

    @FXML
    private void handles3409Field() throws SQLException {
        if(s3409Field.isEditable()){
            sightsCount.setS3409(Integer.parseInt(s3409Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3409Field.setEditable(false);
        } else {
            s3409Field.setEditable(true);
        }
    }

    @FXML
    private void handles3410Field() throws SQLException {
        if(s3410Field.isEditable()){
            sightsCount.setS3410(Integer.parseInt(s3410Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3410Field.setEditable(false);
        } else {
            s3410Field.setEditable(true);
        }
    }

    @FXML
    private void handles3411Field() throws SQLException {
        if(s3411Field.isEditable()){
            sightsCount.setS3411(Integer.parseInt(s3411Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3411Field.setEditable(false);
        } else {
            s3411Field.setEditable(true);
        }
    }

    @FXML
    private void handles3412Field() throws SQLException {
        if(s3412Field.isEditable()){
            sightsCount.setS3412(Integer.parseInt(s3412Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3412Field.setEditable(false);
        } else {
            s3412Field.setEditable(true);
        }
    }

    @FXML
    private void handles3413Field() throws SQLException {
        if(s3413Field.isEditable()){
            sightsCount.setS3413(Integer.parseInt(s3413Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3413Field.setEditable(false);
        } else {
            s3413Field.setEditable(true);
        }
    }

    @FXML
    private void handles3414Field() throws SQLException {
        if(s3414Field.isEditable()){
            sightsCount.setS3414(Integer.parseInt(s3414Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3414Field.setEditable(false);
        } else {
            s3414Field.setEditable(true);
        }
    }

    @FXML
    private void handles3415Field() throws SQLException {
        if(s3415Field.isEditable()){
            sightsCount.setS3415(Integer.parseInt(s3415Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3415Field.setEditable(false);
        } else {
            s3415Field.setEditable(true);
        }
    }

    @FXML
    private void handles3416Field() throws SQLException {
        if(s3416Field.isEditable()){
            sightsCount.setS3416(Integer.parseInt(s3416Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3416Field.setEditable(false);
        } else {
            s3416Field.setEditable(true);
        }
    }

    @FXML
    private void handles3417Field() throws SQLException {
        if(s3417Field.isEditable()){
            sightsCount.setS3417(Integer.parseInt(s3417Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3417Field.setEditable(false);
        } else {
            s3417Field.setEditable(true);
        }
    }

    @FXML
    private void handles3418Field() throws SQLException {
        if(s3418Field.isEditable()){
            sightsCount.setS3418(Integer.parseInt(s3418Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3418Field.setEditable(false);
        } else {
            s3418Field.setEditable(true);
        }
    }

    @FXML
    private void handles3419Field() throws SQLException {
        if(s3419Field.isEditable()){
            sightsCount.setS3419(Integer.parseInt(s3419Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3419Field.setEditable(false);
        } else {
            s3419Field.setEditable(true);
        }
    }

    @FXML
    private void handles3420Field() throws SQLException {
        if(s3420Field.isEditable()){
            sightsCount.setS3420(Integer.parseInt(s3420Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3420Field.setEditable(false);
        } else {
            s3420Field.setEditable(true);
        }
    }

    @FXML
    private void handles3421Field() throws SQLException {
        if(s3421Field.isEditable()){
            sightsCount.setS3421(Integer.parseInt(s3421Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3421Field.setEditable(false);
        } else {
            s3421Field.setEditable(true);
        }
    }

    @FXML
    private void handles3422Field() throws SQLException {
        if(s3422Field.isEditable()){
            sightsCount.setS3422(Integer.parseInt(s3422Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3422Field.setEditable(false);
        } else {
            s3422Field.setEditable(true);
        }
    }

    @FXML
    private void handles3423Field() throws SQLException {
        if(s3423Field.isEditable()){
            sightsCount.setS3423(Integer.parseInt(s3423Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3423Field.setEditable(false);
        } else {
            s3423Field.setEditable(true);
        }
    }

    @FXML
    private void handles3424Field() throws SQLException {
        if(s3424Field.isEditable()){
            sightsCount.setS3424(Integer.parseInt(s3424Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3424Field.setEditable(false);
        } else {
            s3424Field.setEditable(true);
        }
    }

    @FXML
    private void handles3425Field() throws SQLException {
        if(s3425Field.isEditable()){
            sightsCount.setS3425(Integer.parseInt(s3425Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3425Field.setEditable(false);
        } else {
            s3425Field.setEditable(true);
        }
    }

    @FXML
    private void handles3426Field() throws SQLException {
        if(s3426Field.isEditable()){
            sightsCount.setS3426(Integer.parseInt(s3426Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3426Field.setEditable(false);
        } else {
            s3426Field.setEditable(true);
        }
    }

    @FXML
    private void handles3427Field() throws SQLException {
        if(s3427Field.isEditable()){
            sightsCount.setS3427(Integer.parseInt(s3427Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3427Field.setEditable(false);
        } else {
            s3427Field.setEditable(true);
        }
    }

    @FXML
    private void handles3428Field() throws SQLException {
        if(s3428Field.isEditable()){
            sightsCount.setS3428(Integer.parseInt(s3428Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3428Field.setEditable(false);
        } else {
            s3428Field.setEditable(true);
        }
    }

    @FXML
    private void handles3429Field() throws SQLException {
        if(s3429Field.isEditable()){
            sightsCount.setS3429(Integer.parseInt(s3429Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3429Field.setEditable(false);
        } else {
            s3429Field.setEditable(true);
        }
    }

    @FXML
    private void handles3430Field() throws SQLException {
        if(s3430Field.isEditable()){
            sightsCount.setS3430(Integer.parseInt(s3430Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3430Field.setEditable(false);
        } else {
            s3430Field.setEditable(true);
        }
    }

    @FXML
    private void handles3431Field() throws SQLException {
        if(s3431Field.isEditable()){
            sightsCount.setS3431(Integer.parseInt(s3431Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3431Field.setEditable(false);
        } else {
            s3431Field.setEditable(true);
        }
    }

    @FXML
    private void handles3432Field() throws SQLException {
        if(s3432Field.isEditable()){
            sightsCount.setS3432(Integer.parseInt(s3432Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3432Field.setEditable(false);
        } else {
            s3432Field.setEditable(true);
        }
    }

    @FXML
    private void handles3433Field() throws SQLException {
        if(s3433Field.isEditable()){
            sightsCount.setS3433(Integer.parseInt(s3433Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3433Field.setEditable(false);
        } else {
            s3433Field.setEditable(true);
        }
    }

    @FXML
    private void handles3434Field() throws SQLException {
        if(s3434Field.isEditable()){
            sightsCount.setS3434(Integer.parseInt(s3434Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3434Field.setEditable(false);
        } else {
            s3434Field.setEditable(true);
        }
    }

    @FXML
    private void handles3435Field() throws SQLException {
        if(s3435Field.isEditable()){
            sightsCount.setS3435(Integer.parseInt(s3435Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3435Field.setEditable(false);
        } else {
            s3435Field.setEditable(true);
        }
    }

    @FXML
    private void handles3436Field() throws SQLException {
        if(s3436Field.isEditable()){
            sightsCount.setS3436(Integer.parseInt(s3436Field.getText()));
            SciDB.updateSightsCount(person, sightsCount);
            s3436Field.setEditable(false);
        } else {
            s3436Field.setEditable(true);
        }
    }
}
