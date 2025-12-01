package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MachineGunsCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty mg1301, mg1302, mg1303, mg1304, mg1305, mg1306;


    public MachineGunsCount(Integer idPerson, String nicknamePerson,
                              Integer mg1301, Integer mg1302, Integer mg1303, Integer mg1304, Integer mg1305,
                              Integer mg1306) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.mg1301 = new SimpleIntegerProperty(mg1301);
        this.mg1302 = new SimpleIntegerProperty(mg1302);
        this.mg1303 = new SimpleIntegerProperty(mg1303);
        this.mg1304 = new SimpleIntegerProperty(mg1304);
        this.mg1305 = new SimpleIntegerProperty(mg1305);
        this.mg1306 = new SimpleIntegerProperty(mg1306);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "mg1301" -> getMg1301();
            case "mg1302" -> getMg1302();
            case "mg1303" -> getMg1303();
            case "mg1304" -> getMg1304();
            case "mg1305" -> getMg1305();
            case "mg1306" -> getMg1306();
            default -> 0;
        };
    }

    // idPerson
    public int getIdPerson() {
        return idPerson.get();
    }

    // nicknamePerson
    public String getNicknamePerson() {
        return nicknamePerson.get();
    }

    public void setNicknamePerson(String nicknamePerson) {
        this.nicknamePerson.set(nicknamePerson);
    }

    // Поношенная L86A1 – mg1301
    public int getMg1301() {
        return mg1301.get();
    }

    public void setMg1301(int mg1301) {
        this.mg1301.set(mg1301);
    }

    // РПД - mg1302
    public int getMg1302() {
        return mg1302.get();
    }

    public void setMg1302(int mg1302) {
        this.mg1302.set(mg1302);
    }

    // РПК-74 - mg1303
    public int getMg1303() {
        return mg1303.get();
    }

    public void setMg1303(int mg1303) {
        this.mg1303.set(mg1303);
    }

    // L86A1 - mg1304
    public int getMg1304() {
        return mg1304.get();
    }

    public void setMg1304(int mg1304) {
        this.mg1304.set(mg1304);
    }

    // Поношенный ПКП - mg1305
    public int getMg1305() {
        return mg1305.get();
    }

    public void setMg1305(int mg1305) {
        this.mg1305.set(mg1305);
    }

    // ПКП «Печенег» - mg1306
    public int getMg1306() {
        return mg1306.get();
    }

    public void setMg1306(int mg1306) {
        this.mg1306.set(mg1306);
    }
}
