package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class HanguardsAndBracketsController {
    private Person person;
    private HanguardsAndBracketsCount hanguardsAndBracketsCount;
    
    @FXML
    private Label l1label, l2label, l3label, l4label, l5label;

    @FXML
    private TextField hab3301Field, hab3302Field, hab3303Field, hab3304Field, hab3305Field, hab3306Field;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            l1label.setText("Ставка Атамана | 2 Уровень");
            l2label.setText("Пожарная часть | 1 Уровень");
            l3label.setText("Пожарная часть | 3 Уровень");
            l4label.setText("Бар | 1 Уровень");
            l5label.setText("Бар | 7 Уровень");
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            l1label.setText("Лодочная станция | 2 Уровень");
            l2label.setText("Сельская школа | 1 Уровень");
            l3label.setText("Сельская школа | 3 Уровень");
            l4label.setText("Бар | 1 Уровень");
            l5label.setText("Бар | 7 Уровень");
        }
    }

    public void setField(HanguardsAndBracketsCount hanguardsAndBracketsCount) {
        this.hanguardsAndBracketsCount = hanguardsAndBracketsCount;
        System.out.println(hanguardsAndBracketsCount.getNicknamePerson());
        hab3301Field.setText(Integer.toString(hanguardsAndBracketsCount.getHab3301()));
        hab3302Field.setText(Integer.toString(hanguardsAndBracketsCount.getHab3302()));
        hab3303Field.setText(Integer.toString(hanguardsAndBracketsCount.getHab3303()));
        hab3304Field.setText(Integer.toString(hanguardsAndBracketsCount.getHab3304()));
        hab3305Field.setText(Integer.toString(hanguardsAndBracketsCount.getHab3305()));
        hab3306Field.setText(Integer.toString(hanguardsAndBracketsCount.getHab3306()));
    }

    @FXML
    private void handleHab3301Field() throws SQLException {
        if(hab3301Field.isEditable()){
            hanguardsAndBracketsCount.setHab3301(Integer.parseInt(hab3301Field.getText()));
            SciDB.updateHanguardsAndBracketsCount(person, hanguardsAndBracketsCount);
            hab3301Field.setEditable(false);
        } else {
            hab3301Field.setEditable(true);
        }
    }

    @FXML
    private void handleHab3302Field() throws SQLException {
        if(hab3302Field.isEditable()){
            hanguardsAndBracketsCount.setHab3302(Integer.parseInt(hab3302Field.getText()));
            SciDB.updateHanguardsAndBracketsCount(person, hanguardsAndBracketsCount);
            hab3302Field.setEditable(false);
        } else {
            hab3302Field.setEditable(true);
        }
    }

    @FXML
    private void handleHab3303Field() throws SQLException {
        if(hab3303Field.isEditable()){
            hanguardsAndBracketsCount.setHab3303(Integer.parseInt(hab3303Field.getText()));
            SciDB.updateHanguardsAndBracketsCount(person, hanguardsAndBracketsCount);
            hab3303Field.setEditable(false);
        } else {
            hab3303Field.setEditable(true);
        }
    }

    @FXML
    private void handleHab3304Field() throws SQLException {
        if(hab3304Field.isEditable()){
            hanguardsAndBracketsCount.setHab3304(Integer.parseInt(hab3304Field.getText()));
            SciDB.updateHanguardsAndBracketsCount(person, hanguardsAndBracketsCount);
            hab3304Field.setEditable(false);
        } else {
            hab3304Field.setEditable(true);
        }
    }

    @FXML
    private void handleHab3305Field() throws SQLException {
        if(hab3305Field.isEditable()){
            hanguardsAndBracketsCount.setHab3305(Integer.parseInt(hab3305Field.getText()));
            SciDB.updateHanguardsAndBracketsCount(person, hanguardsAndBracketsCount);
            hab3305Field.setEditable(false);
        } else {
            hab3305Field.setEditable(true);
        }
    }

    @FXML
    private void handleHab3306Field() throws SQLException {
        if(hab3306Field.isEditable()){
            hanguardsAndBracketsCount.setHab3306(Integer.parseInt(hab3306Field.getText()));
            SciDB.updateHanguardsAndBracketsCount(person, hanguardsAndBracketsCount);
            hab3306Field.setEditable(false);
        } else {
            hab3306Field.setEditable(true);
        }
    }
}
