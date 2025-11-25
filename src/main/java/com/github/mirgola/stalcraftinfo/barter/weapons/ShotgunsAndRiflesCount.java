package com.github.mirgola.stalcraftinfo.barter.weapons;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ShotgunsAndRiflesCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty sar1501, sar1502, sar1503, sar1504, sar1505, sar1506, sar1507, sar1508, sar1509, sar1510,
                                  sar1511, sar1512, sar1513, sar1514, sar1515;

    public ShotgunsAndRiflesCount(Integer idPerson, String nicknamePerson,
                              Integer sar1501, Integer sar1502, Integer sar1503, Integer sar1504, Integer sar1505,
                              Integer sar1506, Integer sar1507, Integer sar1508, Integer sar1509, Integer sar1510,
                              Integer sar1511, Integer sar1512, Integer sar1513, Integer sar1514, Integer sar1515) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.sar1501 = new SimpleIntegerProperty(sar1501);
        this.sar1502 = new SimpleIntegerProperty(sar1502);
        this.sar1503 = new SimpleIntegerProperty(sar1503);
        this.sar1504 = new SimpleIntegerProperty(sar1504);
        this.sar1505 = new SimpleIntegerProperty(sar1505);
        this.sar1506 = new SimpleIntegerProperty(sar1506);
        this.sar1507 = new SimpleIntegerProperty(sar1507);
        this.sar1508 = new SimpleIntegerProperty(sar1508);
        this.sar1509 = new SimpleIntegerProperty(sar1509);
        this.sar1510 = new SimpleIntegerProperty(sar1510);
        this.sar1511 = new SimpleIntegerProperty(sar1511);
        this.sar1512 = new SimpleIntegerProperty(sar1512);
        this.sar1513 = new SimpleIntegerProperty(sar1513);
        this.sar1514 = new SimpleIntegerProperty(sar1514);
        this.sar1515 = new SimpleIntegerProperty(sar1515);
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

    // 1.Winchester 1887 - sar1501
    public int getSar1501() {
        return sar1501.get();
    }

    public void setSar1501(int sar1501) {
        this.sar1501.set(sar1501);
    }

    // 2.Обрез БМ-16 - sar1502
    public int getSar1502() {
        return sar1502.get();
    }

    public void setSar1502(int sar1502) {
        this.sar1502.set(sar1502);
    }

    // 3.БМ-16 - sar1503
    public int getSar1503() {
        return sar1503.get();
    }

    public void setSar1503(int sar1503) {
        this.sar1503.set(sar1503);
    }

    // 4.Shorty 590 - sar1504
    public int getSar1504() {
        return sar1504.get();
    }

    public void setSar1504(int sar1504) {
        this.sar1504.set(sar1504);
    }

    // 5.ТОЗ-34 - sar1505
    public int getSar1505() {
        return sar1505.get();
    }

    public void setSar1505(int sar1505) {
        this.sar1505.set(sar1505);
    }

    // 6.Mossberg 500 - sar1506
    public int getSar1506() {
        return sar1506.get();
    }

    public void setSar1506(int sar1506) {
        this.sar1506.set(sar1506);
    }

    // 7.МР-133 - sar1507
    public int getSar1507() {
        return sar1507.get();
    }

    public void setSar1507(int sar1507) {
        this.sar1507.set(sar1507);
    }

    // 8.Mossberg 590A1 - sar1508
    public int getSar1508() {
        return sar1508.get();
    }

    public void setSar1508(int sar1508) {
        this.sar1508.set(sar1508);
    }

    // 9.МР-153 - sar1509
    public int getSar1509() {
        return sar1509.get();
    }

    public void setSar1509(int sar1509) {
        this.sar1509.set(sar1509);
    }

    // 10.M1014 - sar1510
    public int getSar1510() {
        return sar1510.get();
    }

    public void setSar1510(int sar1510) {
        this.sar1510.set(sar1510);
    }

    // 11.Сайга-12К - sar1511
    public int getSar1511() {
        return sar1511.get();
    }

    public void setSar1511(int sar1511) {
        this.sar1511.set(sar1511);
    }

    // 12.Franchi SPAS-12 - sar1512
    public int getSar1512() {
        return sar1512.get();
    }

    public void setSar1512(int sar1512) {
        this.sar1512.set(sar1512);
    }

    // 13.Protecta - sar1513
    public int getSar1513() {
        return sar1513.get();
    }

    public void setSar1513(int sar1513) {
        this.sar1513.set(sar1513);
    }

    // 14.Franchi SPAS-15 - sar1514
    public int getSar1514() {
        return sar1514.get();
    }

    public void setSar1514(int sar1514) {
        this.sar1514.set(sar1514);
    }

    // 15.КС-23 - sar1515
    public int getSar1515() {
        return sar1515.get();
    }

    public void setSar1515(int sar1515) {
        this.sar1515.set(sar1515);
    }
}
