package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import com.github.mirgola.stalcraftinfo.barter.weapons.AssaultRiflesCount;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AccessoriesController {
    private Person person;
    private AccessoriesCount accessoriesCount;
    
    @FXML
    private Label l1label;

    @FXML
    private TextField a2501Field, a2502Field, a2503Field, a2504Field, a2505Field, a2506Field;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setLabel(String fraction) {
        if (fraction.equals("Рубеж") || fraction.equals("Заря") || fraction.equals("Сталкеры")) {
            if (fraction.equals("Рубеж")) {
                l1label.setText("База «Рубежа» | 7 Уровень");
            }
            if (fraction.equals("Заря")) {
                l1label.setText("База «Зари» | 7 Уровень");
            }
            if (fraction.equals("Сталкеры")) {
                l1label.setText("Фракции Севера | 7 Уровень");
            }
        }

        if (fraction.equals("Наемники") || fraction.equals("Завет") || fraction.equals("Бандиты")) {
            if (fraction.equals("Наемники")) {
                l1label.setText("Лагерь «Наемников» | 7 Уровень");
            }
            if (fraction.equals("Завет")) {
                l1label.setText("Лагерь «Завета» | 7 Уровень");
            }
            if (fraction.equals("Бандиты")) {
                l1label.setText("Фракции Севера | 7 Уровень");
            }
        }
    }

    public void setField(AccessoriesCount accessoriesCount) {
        this.accessoriesCount = accessoriesCount;
        System.out.println(accessoriesCount.getNicknamePerson());
        a2501Field.setText(Integer.toString(accessoriesCount.getA2501()));
        a2502Field.setText(Integer.toString(accessoriesCount.getA2502()));
        a2503Field.setText(Integer.toString(accessoriesCount.getA2503()));
        a2504Field.setText(Integer.toString(accessoriesCount.getA2504()));
        a2505Field.setText(Integer.toString(accessoriesCount.getA2504()));
        a2506Field.setText(Integer.toString(accessoriesCount.getA2506()));
    }
    
    @FXML
    private void handleA2501Field() throws SQLException {
        if(a2501Field.isEditable()){
            accessoriesCount.setA2501(Integer.parseInt(a2501Field.getText()));
            SciDB.updateAccessoriesCount(person, accessoriesCount);
            a2501Field.setEditable(false);
        } else {
            a2501Field.setEditable(true);
        }
    }

    @FXML
    private void handleA2502Field() throws SQLException {
        if(a2502Field.isEditable()){
            accessoriesCount.setA2502(Integer.parseInt(a2502Field.getText()));
            SciDB.updateAccessoriesCount(person, accessoriesCount);
            a2502Field.setEditable(false);
        } else {
            a2502Field.setEditable(true);
        }
    }

    @FXML
    private void handleA2503Field() throws SQLException {
        if(a2503Field.isEditable()){
            accessoriesCount.setA2503(Integer.parseInt(a2503Field.getText()));
            SciDB.updateAccessoriesCount(person, accessoriesCount);
            a2503Field.setEditable(false);
        } else {
            a2503Field.setEditable(true);
        }
    }

    @FXML
    private void handleA2504Field() throws SQLException {
        if(a2504Field.isEditable()){
            accessoriesCount.setA2504(Integer.parseInt(a2504Field.getText()));
            SciDB.updateAccessoriesCount(person, accessoriesCount);
            a2504Field.setEditable(false);
        } else {
            a2504Field.setEditable(true);
        }
    }

    @FXML
    private void handleA2505Field() throws SQLException {
        if(a2505Field.isEditable()){
            accessoriesCount.setA2505(Integer.parseInt(a2505Field.getText()));
            SciDB.updateAccessoriesCount(person, accessoriesCount);
            a2505Field.setEditable(false);
        } else {
            a2505Field.setEditable(true);
        }
    }

    @FXML
    private void handleA2506Field() throws SQLException {
        if(a2506Field.isEditable()){
            accessoriesCount.setA2506(Integer.parseInt(a2506Field.getText()));
            SciDB.updateAccessoriesCount(person, accessoriesCount);
            a2506Field.setEditable(false);
        } else {
            a2506Field.setEditable(true);
        }
    }
}
