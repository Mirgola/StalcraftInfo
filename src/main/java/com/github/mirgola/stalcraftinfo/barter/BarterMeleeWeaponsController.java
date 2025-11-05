package com.github.mirgola.stalcraftinfo.barter;

import com.github.mirgola.stalcraftinfo.Person;
import com.github.mirgola.stalcraftinfo.SciDB;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class BarterMeleeWeaponsController {
    private Person person;
    private BarterMeleeWeapons barterMeleeWeapons;

    @FXML
    private TextField mw1701Field;
    @FXML
    private TextField mw1702Field;
    @FXML
    private TextField mw1703Field;
    @FXML
    private TextField mw1704Field;
    @FXML
    private TextField mw1705Field;
    @FXML
    private TextField mw1706Field;
    @FXML
    private TextField mw1707Field;
    @FXML
    private TextField mw1708Field;
    @FXML
    private TextField mw1709Field;
    @FXML
    private TextField mw1710Field;
    @FXML
    private TextField mw1711Field;
    @FXML
    private TextField mw1712Field;
    @FXML
    private TextField mw1713Field;
    @FXML
    private TextField mw1714Field;
    @FXML
    private TextField mw1715Field;
    @FXML
    private TextField mw1716Field;

    @FXML
    private void initialize() {

    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setBarterMeleeWeapons(BarterMeleeWeapons barterMeleeWeapons) {
        this.barterMeleeWeapons = barterMeleeWeapons;
        System.out.println(barterMeleeWeapons.getIdUser());
        mw1701Field.setText(Integer.toString(barterMeleeWeapons.getMw1701()));
        mw1702Field.setText(Integer.toString(barterMeleeWeapons.getMw1702()));
        mw1703Field.setText(Integer.toString(barterMeleeWeapons.getMw1703()));
        mw1704Field.setText(Integer.toString(barterMeleeWeapons.getMw1704()));
        mw1705Field.setText(Integer.toString(barterMeleeWeapons.getMw1705()));
        mw1706Field.setText(Integer.toString(barterMeleeWeapons.getMw1706()));
        mw1707Field.setText(Integer.toString(barterMeleeWeapons.getMw1707()));
        mw1708Field.setText(Integer.toString(barterMeleeWeapons.getMw1708()));
        mw1709Field.setText(Integer.toString(barterMeleeWeapons.getMw1709()));
        mw1710Field.setText(Integer.toString(barterMeleeWeapons.getMw1710()));
        mw1711Field.setText(Integer.toString(barterMeleeWeapons.getMw1711()));
        mw1712Field.setText(Integer.toString(barterMeleeWeapons.getMw1712()));
        mw1713Field.setText(Integer.toString(barterMeleeWeapons.getMw1713()));
        mw1714Field.setText(Integer.toString(barterMeleeWeapons.getMw1714()));
        mw1715Field.setText(Integer.toString(barterMeleeWeapons.getMw1715()));
        mw1716Field.setText(Integer.toString(barterMeleeWeapons.getMw1716()));
    }

    @FXML
    private void handleMw1701Field() throws SQLException {
        if(mw1701Field.isEditable()){
            barterMeleeWeapons.setMw1701(Integer.parseInt(mw1701Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1701Field.setEditable(false);
        } else {
            mw1701Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1702Field() throws SQLException {
        if(mw1702Field.isEditable()){
            barterMeleeWeapons.setMw1702(Integer.parseInt(mw1702Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1702Field.setEditable(false);
        } else {
            mw1702Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1703Field() throws SQLException {
        if(mw1703Field.isEditable()){
            barterMeleeWeapons.setMw1703(Integer.parseInt(mw1703Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1703Field.setEditable(false);
        } else {
            mw1703Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1704Field() throws SQLException {
        if(mw1704Field.isEditable()){
            barterMeleeWeapons.setMw1704(Integer.parseInt(mw1704Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1704Field.setEditable(false);
        } else {
            mw1704Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1705Field() throws SQLException {
        if(mw1705Field.isEditable()){
            barterMeleeWeapons.setMw1705(Integer.parseInt(mw1705Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1705Field.setEditable(false);
        } else {
            mw1705Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1706Field() throws SQLException {
        if(mw1706Field.isEditable()){
            barterMeleeWeapons.setMw1706(Integer.parseInt(mw1706Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1706Field.setEditable(false);
        } else {
            mw1706Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1707Field() throws SQLException {
        if(mw1707Field.isEditable()){
            barterMeleeWeapons.setMw1707(Integer.parseInt(mw1707Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1707Field.setEditable(false);
        } else {
            mw1707Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1708Field() throws SQLException {
        if(mw1708Field.isEditable()){
            barterMeleeWeapons.setMw1708(Integer.parseInt(mw1708Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1708Field.setEditable(false);
        } else {
            mw1708Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1709Field() throws SQLException {
        if(mw1709Field.isEditable()){
            barterMeleeWeapons.setMw1709(Integer.parseInt(mw1709Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1709Field.setEditable(false);
        } else {
            mw1709Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1710Field() throws SQLException {
        if(mw1710Field.isEditable()){
            barterMeleeWeapons.setMw1710(Integer.parseInt(mw1710Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1710Field.setEditable(false);
        } else {
            mw1710Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1711Field() throws SQLException {
        if(mw1711Field.isEditable()){
            barterMeleeWeapons.setMw1711(Integer.parseInt(mw1711Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1711Field.setEditable(false);
        } else {
            mw1711Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1712Field() throws SQLException {
        if(mw1712Field.isEditable()){
            barterMeleeWeapons.setMw1712(Integer.parseInt(mw1712Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1712Field.setEditable(false);
        } else {
            mw1712Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1713Field() throws SQLException {
        if(mw1713Field.isEditable()){
            barterMeleeWeapons.setMw1713(Integer.parseInt(mw1713Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1713Field.setEditable(false);
        } else {
            mw1713Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1714Field() throws SQLException {
        if(mw1714Field.isEditable()){
            barterMeleeWeapons.setMw1714(Integer.parseInt(mw1714Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1714Field.setEditable(false);
        } else {
            mw1714Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1715Field() throws SQLException {
        if(mw1715Field.isEditable()){
            barterMeleeWeapons.setMw1715(Integer.parseInt(mw1715Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1715Field.setEditable(false);
        } else {
            mw1715Field.setEditable(true);
        }
    }

    @FXML
    private void handleMw1716Field() throws SQLException {
        if(mw1716Field.isEditable()){
            barterMeleeWeapons.setMw1716(Integer.parseInt(mw1716Field.getText()));
            SciDB.updateBarterMeleeWeapons(person, barterMeleeWeapons);
            mw1716Field.setEditable(false);
        } else {
            mw1716Field.setEditable(true);
        }
    }
}
