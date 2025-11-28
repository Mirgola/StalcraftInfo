package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class HandlesController {
    private Person person;
    private HandlesCount handlesCount;
    
    @FXML
    private Label l1label, l2label, l3label, l4label, l5label;

    @FXML
    private TextField h3501Field, h3502Field, h3503Field, h3504Field, h3505Field, h3506Field, h3507Field, h3508Field, h3509Field, h3510Field,
                      h3511Field, h3512Field, h3513Field;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Пожарная часть | 3 Уровень");
            l2label.setText("Бар | 2 Уровень");
            l3label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l4label.setText("База «Рубежа» | 1 Уровень");
                l5label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l4label.setText("База «Зари» | 1 Уровень");
                l5label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l4label.setText("Фракции Севера | 1 Уровень");
                l5label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 3 Уровень");
            l2label.setText("Бар | 2 Уровень");
            l3label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l4label.setText("Лагерь «Наемников» | 1 Уровень");
                l5label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l4label.setText("Лагерь «Завета» | 1 Уровень");
                l5label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l4label.setText("Фракции Севера | 1 Уровень");
                l5label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(HandlesCount handlesCount) {
        this.handlesCount = handlesCount;
        System.out.println(handlesCount.getNicknamePerson());
        h3501Field.setText(Integer.toString(handlesCount.getH3501()));
        h3502Field.setText(Integer.toString(handlesCount.getH3502()));
        h3503Field.setText(Integer.toString(handlesCount.getH3503()));
        h3504Field.setText(Integer.toString(handlesCount.getH3504()));
        h3505Field.setText(Integer.toString(handlesCount.getH3505()));
        h3506Field.setText(Integer.toString(handlesCount.getH3506()));
        h3507Field.setText(Integer.toString(handlesCount.getH3507()));
        h3508Field.setText(Integer.toString(handlesCount.getH3508()));
        h3509Field.setText(Integer.toString(handlesCount.getH3509()));
        h3510Field.setText(Integer.toString(handlesCount.getH3510()));
        h3511Field.setText(Integer.toString(handlesCount.getH3511()));
        h3512Field.setText(Integer.toString(handlesCount.getH3512()));
        h3513Field.setText(Integer.toString(handlesCount.getH3513()));
    }

    @FXML
    private void handleH3501Field() throws SQLException {
        if(h3501Field.isEditable()){
            handlesCount.setH3501(Integer.parseInt(h3501Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3501Field.setEditable(false);
        } else {
            h3501Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3502Field() throws SQLException {
        if(h3502Field.isEditable()){
            handlesCount.setH3502(Integer.parseInt(h3502Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3502Field.setEditable(false);
        } else {
            h3502Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3503Field() throws SQLException {
        if(h3503Field.isEditable()){
            handlesCount.setH3503(Integer.parseInt(h3503Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3503Field.setEditable(false);
        } else {
            h3503Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3504Field() throws SQLException {
        if(h3504Field.isEditable()){
            handlesCount.setH3504(Integer.parseInt(h3504Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3504Field.setEditable(false);
        } else {
            h3504Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3505Field() throws SQLException {
        if(h3505Field.isEditable()){
            handlesCount.setH3505(Integer.parseInt(h3505Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3505Field.setEditable(false);
        } else {
            h3505Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3506Field() throws SQLException {
        if(h3506Field.isEditable()){
            handlesCount.setH3506(Integer.parseInt(h3506Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3506Field.setEditable(false);
        } else {
            h3506Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3507Field() throws SQLException {
        if(h3507Field.isEditable()){
            handlesCount.setH3507(Integer.parseInt(h3507Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3507Field.setEditable(false);
        } else {
            h3507Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3508Field() throws SQLException {
        if(h3508Field.isEditable()){
            handlesCount.setH3508(Integer.parseInt(h3508Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3508Field.setEditable(false);
        } else {
            h3508Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3509Field() throws SQLException {
        if(h3509Field.isEditable()){
            handlesCount.setH3509(Integer.parseInt(h3509Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3509Field.setEditable(false);
        } else {
            h3509Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3510Field() throws SQLException {
        if(h3510Field.isEditable()){
            handlesCount.setH3510(Integer.parseInt(h3510Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3510Field.setEditable(false);
        } else {
            h3510Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3511Field() throws SQLException {
        if(h3511Field.isEditable()){
            handlesCount.setH3511(Integer.parseInt(h3511Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3511Field.setEditable(false);
        } else {
            h3511Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3512Field() throws SQLException {
        if(h3512Field.isEditable()){
            handlesCount.setH3512(Integer.parseInt(h3512Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3512Field.setEditable(false);
        } else {
            h3512Field.setEditable(true);
        }
    }

    @FXML
    private void handleH3513Field() throws SQLException {
        if(h3513Field.isEditable()){
            handlesCount.setH3513(Integer.parseInt(h3513Field.getText()));
            SciDB.updateHandlesCount(person, handlesCount);
            h3513Field.setEditable(false);
        } else {
            h3513Field.setEditable(true);
        }
    }
}
