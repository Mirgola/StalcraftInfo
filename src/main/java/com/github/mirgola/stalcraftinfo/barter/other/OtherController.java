package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class OtherController {
    private Person person;
    private OtherCount otherCount;
    
    @FXML
    private Label l1label, l2label;

    @FXML
    private TextField o2601Field, o2602Field;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Бар | 1 Уровень");
            if (fraction.equals("Рубеж")) {
                l2label.setText("База «Рубежа» | 1 Уровень");
            }
            if (fraction.equals("Заря")) {
                l2label.setText("База «Зари» | 1 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l2label.setText("Фракции Севера | 1 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Бар | 1 Уровень");
            if (fraction.equals("Наемники")) {
                l2label.setText("Лагерь «Наемников» | 1 Уровень");
            }
            if (fraction.equals("Завет")) {
                l2label.setText("Лагерь «Завета» | 1 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l2label.setText("Фракции Севера | 1 Уровень");
            }
        }
    }

    public void setField(OtherCount otherCount) {
        this.otherCount = otherCount;
        System.out.println(otherCount.getNicknamePerson());
        o2601Field.setText(Integer.toString(otherCount.getO2601()));
        o2602Field.setText(Integer.toString(otherCount.getO2602()));
    }

    @FXML
    private void handleO2601Field() throws SQLException {
        if(o2601Field.isEditable()){
            otherCount.setO2601(Integer.parseInt(o2601Field.getText()));
            SciDB.updateOtherCount(person, otherCount);
            o2601Field.setEditable(false);
        } else {
            o2601Field.setEditable(true);
        }
    }

    @FXML
    private void handleO2602Field() throws SQLException {
        if(o2602Field.isEditable()){
            otherCount.setO2602(Integer.parseInt(o2602Field.getText()));
            SciDB.updateOtherCount(person, otherCount);
            o2602Field.setEditable(false);
        } else {
            o2602Field.setEditable(true);
        }
    }
}
