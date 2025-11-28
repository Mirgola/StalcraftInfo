package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class OtherAttachmentsController {
    private Person person;
    private OtherAttachmentsCount otherAttachmentsCount;
    
    @FXML
    private Label l1label, l2label, l3label, l4label, l5label;

    @FXML
    private TextField oa3601Field, oa3602Field, oa3603Field, oa3604Field, oa3605Field, oa3606Field, oa3607Field, oa3608Field, oa3609Field, oa3610Field,
                      oa3611Field, oa3612Field;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Пожарная часть | 3 Уровень");
            l2label.setText("Бар | 1 Уровень");
            l3label.setText("Бар | 2 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Рубеж")) {
                l5label.setText("База «Рубежа» | 1 Уровень");
            }
            if (fraction.equals("Заря")) {
                l5label.setText("База «Зари» | 1 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l5label.setText("Фракции Севера | 1 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Сельская школа | 3 Уровень");
            l2label.setText("Бар | 1 Уровень");
            l3label.setText("Бар | 2 Уровень");
            l4label.setText("Бар | 5 Уровень");
            if (fraction.equals("Наемники")) {
                l5label.setText("Лагерь «Наемников» | 1 Уровень");
            }
            if (fraction.equals("Завет")) {
                l5label.setText("Лагерь «Завета» | 1 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l5label.setText("Фракции Севера | 1 Уровень");
            }
        }
    }

    public void setField(OtherAttachmentsCount otherAttachmentsCount) {
        this.otherAttachmentsCount = otherAttachmentsCount;
        System.out.println(otherAttachmentsCount.getNicknamePerson());
        oa3601Field.setText(Integer.toString(otherAttachmentsCount.getOa3601()));
        oa3602Field.setText(Integer.toString(otherAttachmentsCount.getOa3602()));
        oa3603Field.setText(Integer.toString(otherAttachmentsCount.getOa3603()));
        oa3604Field.setText(Integer.toString(otherAttachmentsCount.getOa3604()));
        oa3605Field.setText(Integer.toString(otherAttachmentsCount.getOa3605()));
        oa3606Field.setText(Integer.toString(otherAttachmentsCount.getOa3606()));
        oa3607Field.setText(Integer.toString(otherAttachmentsCount.getOa3607()));
        oa3608Field.setText(Integer.toString(otherAttachmentsCount.getOa3608()));
        oa3609Field.setText(Integer.toString(otherAttachmentsCount.getOa3609()));
        oa3610Field.setText(Integer.toString(otherAttachmentsCount.getOa3610()));
        oa3611Field.setText(Integer.toString(otherAttachmentsCount.getOa3611()));
        oa3612Field.setText(Integer.toString(otherAttachmentsCount.getOa3612()));
    }

    @FXML
    private void handleOa3601Field() throws SQLException {
        if(oa3601Field.isEditable()){
            otherAttachmentsCount.setOa3601(Integer.parseInt(oa3601Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3601Field.setEditable(false);
        } else {
            oa3601Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3602Field() throws SQLException {
        if(oa3602Field.isEditable()){
            otherAttachmentsCount.setOa3602(Integer.parseInt(oa3602Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3602Field.setEditable(false);
        } else {
            oa3602Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3603Field() throws SQLException {
        if(oa3603Field.isEditable()){
            otherAttachmentsCount.setOa3603(Integer.parseInt(oa3603Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3603Field.setEditable(false);
        } else {
            oa3603Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3604Field() throws SQLException {
        if(oa3604Field.isEditable()){
            otherAttachmentsCount.setOa3604(Integer.parseInt(oa3604Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3604Field.setEditable(false);
        } else {
            oa3604Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3605Field() throws SQLException {
        if(oa3605Field.isEditable()){
            otherAttachmentsCount.setOa3605(Integer.parseInt(oa3605Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3605Field.setEditable(false);
        } else {
            oa3605Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3606Field() throws SQLException {
        if(oa3606Field.isEditable()){
            otherAttachmentsCount.setOa3606(Integer.parseInt(oa3606Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3606Field.setEditable(false);
        } else {
            oa3606Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3607Field() throws SQLException {
        if(oa3607Field.isEditable()){
            otherAttachmentsCount.setOa3607(Integer.parseInt(oa3607Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3607Field.setEditable(false);
        } else {
            oa3607Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3608Field() throws SQLException {
        if(oa3608Field.isEditable()){
            otherAttachmentsCount.setOa3608(Integer.parseInt(oa3608Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3608Field.setEditable(false);
        } else {
            oa3608Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3609Field() throws SQLException {
        if(oa3609Field.isEditable()){
            otherAttachmentsCount.setOa3609(Integer.parseInt(oa3609Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3609Field.setEditable(false);
        } else {
            oa3609Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3610Field() throws SQLException {
        if(oa3610Field.isEditable()){
            otherAttachmentsCount.setOa3610(Integer.parseInt(oa3610Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3610Field.setEditable(false);
        } else {
            oa3610Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3611Field() throws SQLException {
        if(oa3611Field.isEditable()){
            otherAttachmentsCount.setOa3611(Integer.parseInt(oa3611Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3611Field.setEditable(false);
        } else {
            oa3611Field.setEditable(true);
        }
    }

    @FXML
    private void handleOa3612Field() throws SQLException {
        if(oa3612Field.isEditable()){
            otherAttachmentsCount.setOa3612(Integer.parseInt(oa3612Field.getText()));
            SciDB.updateOtherAttachmentsCount(person, otherAttachmentsCount);
            oa3612Field.setEditable(false);
        } else {
            oa3612Field.setEditable(true);
        }
    }
}
