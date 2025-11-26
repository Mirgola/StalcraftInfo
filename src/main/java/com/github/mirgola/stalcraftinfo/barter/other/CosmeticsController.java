package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import com.github.mirgola.stalcraftinfo.barter.weapons.AssaultRiflesCount;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class CosmeticsController {
    private Person person;
    private CosmeticsCount cosmeticsCount;

    @FXML
    private Label l1label, l2label;

    @FXML
    private TextField c2401Field, c2402Field, c2403Field;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            if (fraction.equals("Рубеж")) {
                l1label.setText("База «Рубежа» | 5 Уровень");
                l2label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l1label.setText("База «Зари» | 5 Уровень");
                l2label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l1label.setText("Фракции Севера | 5 Уровень");
                l2label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            if (fraction.equals("Наемники")) {
                l1label.setText("Лагерь «Наемников» | 5 Уровень");
                l2label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l1label.setText("Лагерь «Завета» | 5 Уровень");
                l2label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l1label.setText("Фракции Севера | 5 Уровень");
                l2label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(CosmeticsCount cosmeticsCount) {
        this.cosmeticsCount = cosmeticsCount;
        System.out.println(cosmeticsCount.getNicknamePerson());
        c2401Field.setText(Integer.toString(cosmeticsCount.getC2401()));
        c2402Field.setText(Integer.toString(cosmeticsCount.getC2402()));
        c2403Field.setText(Integer.toString(cosmeticsCount.getC2403()));
    }

    @FXML
    private void handleC2401Field() throws SQLException {
        if(c2401Field.isEditable()){
            cosmeticsCount.setC2401(Integer.parseInt(c2401Field.getText()));
            SciDB.updateCosmeticsCount(person, cosmeticsCount);
            c2401Field.setEditable(false);
        } else {
            c2401Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2402Field() throws SQLException {
        if(c2402Field.isEditable()){
            cosmeticsCount.setC2402(Integer.parseInt(c2402Field.getText()));
            SciDB.updateCosmeticsCount(person, cosmeticsCount);
            c2402Field.setEditable(false);
        } else {
            c2402Field.setEditable(true);
        }
    }

    @FXML
    private void handleC2403Field() throws SQLException {
        if(c2403Field.isEditable()){
            cosmeticsCount.setC2403(Integer.parseInt(c2403Field.getText()));
            SciDB.updateCosmeticsCount(person, cosmeticsCount);
            c2403Field.setEditable(false);
        } else {
            c2403Field.setEditable(true);
        }
    }
}
