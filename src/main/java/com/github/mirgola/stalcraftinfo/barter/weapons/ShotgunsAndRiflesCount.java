package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ShotgunsAndRiflesCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty sar1501, sar1502, sar1503, sar1504, sar1505, sar1506, sar1507, sar1508, sar1509, sar1510,
                                  sar1511, sar1512, sar1513, sar1514, sar1515, sar1516, sar1517, sar1518, sar1519, sar1520,
                                  sar1521, sar1522, sar1523;

    public ShotgunsAndRiflesCount(Integer idPerson, String nicknamePerson) {
        this(idPerson, nicknamePerson,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,0,0,0);
    }

    public ShotgunsAndRiflesCount(Integer idPerson, String nicknamePerson,
                              Integer sar1501, Integer sar1502, Integer sar1503, Integer sar1504, Integer sar1505,
                              Integer sar1506, Integer sar1507, Integer sar1508, Integer sar1509, Integer sar1510,
                              Integer sar1511, Integer sar1512, Integer sar1513, Integer sar1514, Integer sar1515,
                              Integer sar1516, Integer sar1517, Integer sar1518, Integer sar1519, Integer sar1520,
                              Integer sar1521, Integer sar1522, Integer sar1523) {
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
        this.sar1516 = new SimpleIntegerProperty(sar1516);
        this.sar1517 = new SimpleIntegerProperty(sar1517);
        this.sar1518 = new SimpleIntegerProperty(sar1518);
        this.sar1519 = new SimpleIntegerProperty(sar1519);
        this.sar1520 = new SimpleIntegerProperty(sar1520);
        this.sar1521 = new SimpleIntegerProperty(sar1521);
        this.sar1522 = new SimpleIntegerProperty(sar1522);
        this.sar1523 = new SimpleIntegerProperty(sar1523);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "sar1501" -> getSar1501();
            case "sar1502" -> getSar1502();
            case "sar1503" -> getSar1503();
            case "sar1504" -> getSar1504();
            case "sar1505" -> getSar1505();
            case "sar1506" -> getSar1506();
            case "sar1507" -> getSar1507();
            case "sar1508" -> getSar1508();
            case "sar1509" -> getSar1509();
            case "sar1510" -> getSar1510();
            case "sar1511" -> getSar1511();
            case "sar1512" -> getSar1512();
            case "sar1513" -> getSar1513();
            case "sar1514" -> getSar1514();
            case "sar1515" -> getSar1515();
            case "sar1516" -> getSar1516();
            case "sar1517" -> getSar1517();
            case "sar1518" -> getSar1518();
            case "sar1519" -> getSar1519();
            case "sar1520" -> getSar1520();
            case "sar1521" -> getSar1521();
            case "sar1522" -> getSar1522();
            case "sar1523" -> getSar1523();
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

    // 1.Обрез БМ-16  - sar1501
    public int getSar1501() {
        return sar1501.get();
    }

    public void setSar1501(int sar1501) {
        this.sar1501.set(sar1501);
    }

    // 2.Winchester 1887 - sar1502
    public int getSar1502() {
        return sar1502.get();
    }

    public void setSar1502(int sar1502) {
        this.sar1502.set(sar1502);
    }

    // 3.Обрез ТОЗ-34  - sar1503
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

    // 5.БМ-16 - sar1505
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

    // 7.ТОЗ-34 - sar1507
    public int getSar1507() {
        return sar1507.get();
    }

    public void setSar1507(int sar1507) {
        this.sar1507.set(sar1507);
    }

    // 8.ИЖ-81 - sar1508
    public int getSar1508() {
        return sar1508.get();
    }

    public void setSar1508(int sar1508) {
        this.sar1508.set(sar1508);
    }

    // 9.Mossberg 590A1 - sar1509
    public int getSar1509() {
        return sar1509.get();
    }

    public void setSar1509(int sar1509) {
        this.sar1509.set(sar1509);
    }

    // 10.ТОЗ-55 - sar1510
    public int getSar1510() {
        return sar1510.get();
    }

    public void setSar1510(int sar1510) {
        this.sar1510.set(sar1510);
    }

    // 11.МР-133 - sar1511
    public int getSar1511() {
        return sar1511.get();
    }

    public void setSar1511(int sar1511) {
        this.sar1511.set(sar1511);
    }

    // 12.M1014 - sar1512
    public int getSar1512() {
        return sar1512.get();
    }

    public void setSar1512(int sar1512) {
        this.sar1512.set(sar1512);
    }

    // 13.ТОЗ-57 - sar1513
    public int getSar1513() {
        return sar1513.get();
    }

    public void setSar1513(int sar1513) {
        this.sar1513.set(sar1513);
    }

    // 14.МР-153 - sar1514
    public int getSar1514() {
        return sar1514.get();
    }

    public void setSar1514(int sar1514) {
        this.sar1514.set(sar1514);
    }

    // 15.Сайга-12К - sar1515
    public int getSar1515() {
        return sar1515.get();
    }

    public void setSar1515(int sar1515) {
        this.sar1515.set(sar1515);
    }

    // 16.Franchi SPAS-12 - sar1516
    public int getSar1516() {
        return sar1516.get();
    }

    public void setSar1516(int sar1516) {
        this.sar1516.set(sar1516);
    }

    // 17.Protecta – sar1517
    public int getSar1517() {
        return sar1517.get();
    }

    public void setSar1517(int sar1517) {
        this.sar1517.set(sar1517);
    }

    // 18.ТОЗ-84 – sar1518
    public int getSar1518() {
        return sar1518.get();
    }

    public void setSar1518(int sar1518) {
        this.sar1518.set(sar1518);
    }

    // 19.МР-155 Ultima – sar1519
    public int getSar1519() {
        return sar1519.get();
    }

    public void setSar1519(int sar1519) {
        this.sar1519.set(sar1519);
    }

    // 20.Сайга-12 – sar1520
    public int getSar1520() {
        return sar1520.get();
    }

    public void setSar1520(int sar1520) {
        this.sar1520.set(sar1520);
    }

    // 21.Franchi SPAS-15 – sar1521
    public int getSar1521() {
        return sar1521.get();
    }

    public void setSar1521(int sar1521) {
        this.sar1521.set(sar1521);
    }

    // 22.КС-23 – sar1522
    public int getSar1522() {
        return sar1522.get();
    }

    public void setSar1522(int sar1522) {
        this.sar1522.set(sar1522);
    }

    // 23.АЕК-965 – sar1523
    public int getSar1523() {
        return sar1523.get();
    }

    public void setSar1523(int sar1523) {
        this.sar1523.set(sar1523);
    }
}
