package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

public class MuzzlesAndSilencersController {
    private double initialX, initialY;
    private double mouseAnchorX, mouseAnchorY;
    private double scrollInitialHvalue, scrollInitialVvalue;
    private Person person;
    private MuzzlesAndSilencersCount muzzlesAndSilencersCount;

    @FXML
    private ScrollPane scrollPane;
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Label l1label, l2label, l3label, l4label, l5label, l6label;

    @FXML
    private TextField mas3101Field, mas3102Field, mas3103Field, mas3104Field, mas3105Field, mas3106Field, mas3107Field, mas3108Field, mas3109Field, mas3110Field,
                      mas3111Field, mas3112Field, mas3113Field, mas3114Field, mas3115Field, mas3116Field, mas3117Field, mas3118Field, mas3119Field, mas3120Field,
                      mas3121Field, mas3122Field, mas3123Field, mas3124Field, mas3125Field, mas3126Field, mas3127Field, mas3128Field, mas3129Field, mas3130Field,
                      mas3131Field, mas3132Field, mas3133Field, mas3134Field, mas3135Field, mas3136Field, mas3137Field, mas3138Field, mas3139Field, mas3140Field,
                      mas3141Field, mas3142Field, mas3143Field, mas3144Field, mas3145Field, mas3146Field, mas3147Field, mas3148Field, mas3149Field, mas3150Field,
                      mas3151Field, mas3152Field, mas3153Field, mas3154Field;

    @FXML
    public void initialize() {
        setupDragHandlers();
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Пожарная часть | 4 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 6 Уровень");
            if (fraction.equals("Рубеж")) {
                l4label.setText("База «Рубежа» | 2 Уровень");
                l5label.setText("База «Рубежа» | 4 Уровень");
                l6label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l4label.setText("База «Зари» | 2 Уровень");
                l5label.setText("База «Зари» | 4 Уровень");
                l6label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l4label.setText("Фракции Севера | 2 Уровень");
                l5label.setText("Фракции Севера | 4 Уровень");
                l6label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 4 Уровень");
            l2label.setText("Бар | 3 Уровень");
            l3label.setText("Бар | 6 Уровень");
            if (fraction.equals("Наемники")) {
                l4label.setText("Лагерь «Наемников» | 2 Уровень");
                l5label.setText("Лагерь «Наемников» | 4 Уровень");
                l6label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l4label.setText("Лагерь «Завета» | 2 Уровень");
                l5label.setText("Лагерь «Завета» | 4 Уровень");
                l6label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l4label.setText("Фракции Севера | 2 Уровень");
                l5label.setText("Фракции Севера | 4 Уровень");
                l6label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(MuzzlesAndSilencersCount muzzlesAndSilencersCount) {
        this.muzzlesAndSilencersCount = muzzlesAndSilencersCount;
        System.out.println(muzzlesAndSilencersCount.getNicknamePerson());
        mas3101Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3101()));
        mas3102Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3102()));
        mas3103Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3103()));
        mas3104Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3104()));
        mas3105Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3105()));
        mas3106Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3106()));
        mas3107Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3107()));
        mas3108Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3108()));
        mas3109Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3109()));
        mas3110Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3110()));
        mas3111Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3111()));
        mas3112Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3112()));
        mas3113Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3113()));
        mas3114Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3114()));
        mas3115Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3115()));
        mas3116Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3116()));
        mas3117Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3117()));
        mas3118Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3118()));
        mas3119Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3119()));
        mas3120Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3120()));
        mas3121Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3121()));
        mas3122Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3122()));
        mas3123Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3123()));
        mas3124Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3124()));
        mas3125Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3125()));
        mas3126Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3126()));
        mas3127Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3127()));
        mas3128Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3128()));
        mas3129Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3129()));
        mas3130Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3130()));
        mas3131Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3131()));
        mas3132Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3132()));
        mas3133Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3133()));
        mas3134Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3134()));
        mas3135Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3135()));
        mas3136Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3136()));
        mas3137Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3137()));
        mas3138Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3138()));
        mas3139Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3139()));
        mas3140Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3140()));
        mas3141Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3141()));
        mas3142Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3142()));
        mas3143Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3143()));
        mas3144Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3144()));
        mas3145Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3145()));
        mas3146Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3146()));
        mas3147Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3147()));
        mas3148Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3148()));
        mas3149Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3149()));
        mas3150Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3150()));
        mas3151Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3151()));
        mas3152Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3152()));
        mas3153Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3153()));
        mas3154Field.setText(Integer.toString(muzzlesAndSilencersCount.getMas3154()));
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
    private void handleMas3101Field() throws SQLException {
        if(mas3101Field.isEditable()){
            muzzlesAndSilencersCount.setMas3101(Integer.parseInt(mas3101Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3101Field.setEditable(false);
        } else {
            mas3101Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3102Field() throws SQLException {
        if(mas3102Field.isEditable()){
            muzzlesAndSilencersCount.setMas3102(Integer.parseInt(mas3102Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3102Field.setEditable(false);
        } else {
            mas3102Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3103Field() throws SQLException {
        if(mas3103Field.isEditable()){
            muzzlesAndSilencersCount.setMas3103(Integer.parseInt(mas3103Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3103Field.setEditable(false);
        } else {
            mas3103Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3104Field() throws SQLException {
        if(mas3104Field.isEditable()){
            muzzlesAndSilencersCount.setMas3104(Integer.parseInt(mas3104Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3104Field.setEditable(false);
        } else {
            mas3104Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3105Field() throws SQLException {
        if(mas3105Field.isEditable()){
            muzzlesAndSilencersCount.setMas3105(Integer.parseInt(mas3105Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3105Field.setEditable(false);
        } else {
            mas3105Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3106Field() throws SQLException {
        if(mas3106Field.isEditable()){
            muzzlesAndSilencersCount.setMas3106(Integer.parseInt(mas3106Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3106Field.setEditable(false);
        } else {
            mas3106Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3107Field() throws SQLException {
        if(mas3107Field.isEditable()){
            muzzlesAndSilencersCount.setMas3107(Integer.parseInt(mas3107Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3107Field.setEditable(false);
        } else {
            mas3107Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3108Field() throws SQLException {
        if(mas3108Field.isEditable()){
            muzzlesAndSilencersCount.setMas3108(Integer.parseInt(mas3108Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3108Field.setEditable(false);
        } else {
            mas3108Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3109Field() throws SQLException {
        if(mas3109Field.isEditable()){
            muzzlesAndSilencersCount.setMas3109(Integer.parseInt(mas3109Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3109Field.setEditable(false);
        } else {
            mas3109Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3110Field() throws SQLException {
        if(mas3110Field.isEditable()){
            muzzlesAndSilencersCount.setMas3110(Integer.parseInt(mas3110Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3110Field.setEditable(false);
        } else {
            mas3110Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3111Field() throws SQLException {
        if(mas3111Field.isEditable()){
            muzzlesAndSilencersCount.setMas3111(Integer.parseInt(mas3111Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3111Field.setEditable(false);
        } else {
            mas3111Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3112Field() throws SQLException {
        if(mas3112Field.isEditable()){
            muzzlesAndSilencersCount.setMas3112(Integer.parseInt(mas3112Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3112Field.setEditable(false);
        } else {
            mas3112Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3113Field() throws SQLException {
        if(mas3113Field.isEditable()){
            muzzlesAndSilencersCount.setMas3113(Integer.parseInt(mas3113Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3113Field.setEditable(false);
        } else {
            mas3113Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3114Field() throws SQLException {
        if(mas3114Field.isEditable()){
            muzzlesAndSilencersCount.setMas3114(Integer.parseInt(mas3114Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3114Field.setEditable(false);
        } else {
            mas3114Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3115Field() throws SQLException {
        if(mas3115Field.isEditable()){
            muzzlesAndSilencersCount.setMas3115(Integer.parseInt(mas3115Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3115Field.setEditable(false);
        } else {
            mas3115Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3116Field() throws SQLException {
        if(mas3116Field.isEditable()){
            muzzlesAndSilencersCount.setMas3116(Integer.parseInt(mas3116Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3116Field.setEditable(false);
        } else {
            mas3116Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3117Field() throws SQLException {
        if(mas3117Field.isEditable()){
            muzzlesAndSilencersCount.setMas3117(Integer.parseInt(mas3117Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3117Field.setEditable(false);
        } else {
            mas3117Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3118Field() throws SQLException {
        if(mas3118Field.isEditable()){
            muzzlesAndSilencersCount.setMas3118(Integer.parseInt(mas3118Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3118Field.setEditable(false);
        } else {
            mas3118Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3119Field() throws SQLException {
        if(mas3119Field.isEditable()){
            muzzlesAndSilencersCount.setMas3119(Integer.parseInt(mas3119Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3119Field.setEditable(false);
        } else {
            mas3119Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3120Field() throws SQLException {
        if(mas3120Field.isEditable()){
            muzzlesAndSilencersCount.setMas3120(Integer.parseInt(mas3120Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3120Field.setEditable(false);
        } else {
            mas3120Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3121Field() throws SQLException {
        if(mas3121Field.isEditable()){
            muzzlesAndSilencersCount.setMas3121(Integer.parseInt(mas3121Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3121Field.setEditable(false);
        } else {
            mas3121Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3122Field() throws SQLException {
        if(mas3122Field.isEditable()){
            muzzlesAndSilencersCount.setMas3122(Integer.parseInt(mas3122Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3122Field.setEditable(false);
        } else {
            mas3122Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3123Field() throws SQLException {
        if(mas3123Field.isEditable()){
            muzzlesAndSilencersCount.setMas3123(Integer.parseInt(mas3123Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3123Field.setEditable(false);
        } else {
            mas3123Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3124Field() throws SQLException {
        if(mas3124Field.isEditable()){
            muzzlesAndSilencersCount.setMas3124(Integer.parseInt(mas3124Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3124Field.setEditable(false);
        } else {
            mas3124Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3125Field() throws SQLException {
        if(mas3125Field.isEditable()){
            muzzlesAndSilencersCount.setMas3125(Integer.parseInt(mas3125Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3125Field.setEditable(false);
        } else {
            mas3125Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3126Field() throws SQLException {
        if(mas3126Field.isEditable()){
            muzzlesAndSilencersCount.setMas3126(Integer.parseInt(mas3126Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3126Field.setEditable(false);
        } else {
            mas3126Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3127Field() throws SQLException {
        if(mas3127Field.isEditable()){
            muzzlesAndSilencersCount.setMas3127(Integer.parseInt(mas3127Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3127Field.setEditable(false);
        } else {
            mas3127Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3128Field() throws SQLException {
        if(mas3128Field.isEditable()){
            muzzlesAndSilencersCount.setMas3128(Integer.parseInt(mas3128Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3128Field.setEditable(false);
        } else {
            mas3128Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3129Field() throws SQLException {
        if(mas3129Field.isEditable()){
            muzzlesAndSilencersCount.setMas3129(Integer.parseInt(mas3129Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3129Field.setEditable(false);
        } else {
            mas3129Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3130Field() throws SQLException {
        if(mas3130Field.isEditable()){
            muzzlesAndSilencersCount.setMas3130(Integer.parseInt(mas3130Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3130Field.setEditable(false);
        } else {
            mas3130Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3131Field() throws SQLException {
        if(mas3131Field.isEditable()){
            muzzlesAndSilencersCount.setMas3131(Integer.parseInt(mas3131Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3131Field.setEditable(false);
        } else {
            mas3131Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3132Field() throws SQLException {
        if(mas3132Field.isEditable()){
            muzzlesAndSilencersCount.setMas3132(Integer.parseInt(mas3132Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3132Field.setEditable(false);
        } else {
            mas3132Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3133Field() throws SQLException {
        if(mas3133Field.isEditable()){
            muzzlesAndSilencersCount.setMas3133(Integer.parseInt(mas3133Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3133Field.setEditable(false);
        } else {
            mas3133Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3134Field() throws SQLException {
        if(mas3134Field.isEditable()){
            muzzlesAndSilencersCount.setMas3134(Integer.parseInt(mas3134Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3134Field.setEditable(false);
        } else {
            mas3134Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3135Field() throws SQLException {
        if(mas3135Field.isEditable()){
            muzzlesAndSilencersCount.setMas3135(Integer.parseInt(mas3135Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3135Field.setEditable(false);
        } else {
            mas3135Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3136Field() throws SQLException {
        if(mas3136Field.isEditable()){
            muzzlesAndSilencersCount.setMas3136(Integer.parseInt(mas3136Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3136Field.setEditable(false);
        } else {
            mas3136Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3137Field() throws SQLException {
        if(mas3137Field.isEditable()){
            muzzlesAndSilencersCount.setMas3137(Integer.parseInt(mas3137Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3137Field.setEditable(false);
        } else {
            mas3137Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3138Field() throws SQLException {
        if(mas3138Field.isEditable()){
            muzzlesAndSilencersCount.setMas3138(Integer.parseInt(mas3138Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3138Field.setEditable(false);
        } else {
            mas3138Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3139Field() throws SQLException {
        if(mas3139Field.isEditable()){
            muzzlesAndSilencersCount.setMas3139(Integer.parseInt(mas3139Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3139Field.setEditable(false);
        } else {
            mas3139Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3140Field() throws SQLException {
        if(mas3140Field.isEditable()){
            muzzlesAndSilencersCount.setMas3140(Integer.parseInt(mas3140Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3140Field.setEditable(false);
        } else {
            mas3140Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3141Field() throws SQLException {
        if(mas3141Field.isEditable()){
            muzzlesAndSilencersCount.setMas3141(Integer.parseInt(mas3141Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3141Field.setEditable(false);
        } else {
            mas3141Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3142Field() throws SQLException {
        if(mas3142Field.isEditable()){
            muzzlesAndSilencersCount.setMas3142(Integer.parseInt(mas3142Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3142Field.setEditable(false);
        } else {
            mas3142Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3143Field() throws SQLException {
        if(mas3143Field.isEditable()){
            muzzlesAndSilencersCount.setMas3143(Integer.parseInt(mas3143Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3143Field.setEditable(false);
        } else {
            mas3143Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3144Field() throws SQLException {
        if(mas3144Field.isEditable()){
            muzzlesAndSilencersCount.setMas3144(Integer.parseInt(mas3144Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3144Field.setEditable(false);
        } else {
            mas3144Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3145Field() throws SQLException {
        if(mas3145Field.isEditable()){
            muzzlesAndSilencersCount.setMas3145(Integer.parseInt(mas3145Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3145Field.setEditable(false);
        } else {
            mas3145Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3146Field() throws SQLException {
        if(mas3146Field.isEditable()){
            muzzlesAndSilencersCount.setMas3146(Integer.parseInt(mas3146Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3146Field.setEditable(false);
        } else {
            mas3146Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3147Field() throws SQLException {
        if(mas3147Field.isEditable()){
            muzzlesAndSilencersCount.setMas3147(Integer.parseInt(mas3147Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3147Field.setEditable(false);
        } else {
            mas3147Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3148Field() throws SQLException {
        if(mas3148Field.isEditable()){
            muzzlesAndSilencersCount.setMas3148(Integer.parseInt(mas3148Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3148Field.setEditable(false);
        } else {
            mas3148Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3149Field() throws SQLException {
        if(mas3149Field.isEditable()){
            muzzlesAndSilencersCount.setMas3149(Integer.parseInt(mas3149Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3149Field.setEditable(false);
        } else {
            mas3149Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3150Field() throws SQLException {
        if(mas3150Field.isEditable()){
            muzzlesAndSilencersCount.setMas3150(Integer.parseInt(mas3150Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3150Field.setEditable(false);
        } else {
            mas3150Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3151Field() throws SQLException {
        if(mas3151Field.isEditable()){
            muzzlesAndSilencersCount.setMas3151(Integer.parseInt(mas3151Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3151Field.setEditable(false);
        } else {
            mas3151Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3152Field() throws SQLException {
        if(mas3152Field.isEditable()){
            muzzlesAndSilencersCount.setMas3152(Integer.parseInt(mas3152Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3152Field.setEditable(false);
        } else {
            mas3152Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3153Field() throws SQLException {
        if(mas3153Field.isEditable()){
            muzzlesAndSilencersCount.setMas3153(Integer.parseInt(mas3153Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3153Field.setEditable(false);
        } else {
            mas3153Field.setEditable(true);
        }
    }

    @FXML
    private void handleMas3154Field() throws SQLException {
        if(mas3154Field.isEditable()){
            muzzlesAndSilencersCount.setMas3154(Integer.parseInt(mas3154Field.getText()));
            SciDB.updateMuzzlesAndSilencersCount(person, muzzlesAndSilencersCount);
            mas3154Field.setEditable(false);
        } else {
            mas3154Field.setEditable(true);
        }
    }
}
