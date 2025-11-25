package com.github.mirgola.stalcraftinfo.barter.weapons;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PistolsCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty p1601, p1602, p1603, p1604, p1605, p1606, p1607, p1608, p1609, p1610,
                                  p1611, p1612, p1613, p1614, p1615, p1616, p1617;

    public PistolsCount(Integer idPerson, String nicknamePerson,
                        Integer p1601, Integer p1602, Integer p1603, Integer p1604, Integer p1605,
                        Integer p1606, Integer p1607, Integer p1608, Integer p1609, Integer p1610,
                        Integer p1611, Integer p1612, Integer p1613, Integer p1614, Integer p1615,
                        Integer p1616, Integer p1617) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.p1601 = new SimpleIntegerProperty(p1601);
        this.p1602 = new SimpleIntegerProperty(p1602);
        this.p1603 = new SimpleIntegerProperty(p1603);
        this.p1604 = new SimpleIntegerProperty(p1604);
        this.p1605 = new SimpleIntegerProperty(p1605);
        this.p1606 = new SimpleIntegerProperty(p1606);
        this.p1607 = new SimpleIntegerProperty(p1607);
        this.p1608 = new SimpleIntegerProperty(p1608);
        this.p1609 = new SimpleIntegerProperty(p1609);
        this.p1610 = new SimpleIntegerProperty(p1610);
        this.p1611 = new SimpleIntegerProperty(p1611);
        this.p1612 = new SimpleIntegerProperty(p1612);
        this.p1613 = new SimpleIntegerProperty(p1613);
        this.p1614 = new SimpleIntegerProperty(p1614);
        this.p1615 = new SimpleIntegerProperty(p1615);
        this.p1616 = new SimpleIntegerProperty(p1616);
        this.p1617 = new SimpleIntegerProperty(p1617);
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

    // 1.ПМ – p1601
    public int getP1601() {
        return p1601.get();
    }

    public void setP1601(int p1601) {
        this.p1601.set(p1601);
    }

    // 2.ТТ - p1602
    public int getP1602() {
        return p1602.get();
    }

    public void setP1602(int p1602) {
        this.p1602.set(p1602);
    }

    // 3.Mauser C96 - p1603
    public int getP1603() {
        return p1603.get();
    }

    public void setP1603(int p1603) {
        this.p1603.set(p1603);
    }

    // 4.Форт-12 - p1604
    public int getP1604() {
        return p1604.get();
    }

    public void setP1604(int p1604) {
        this.p1604.set(p1604);
    }

    // 5.Walther P99 - p1605
    public int getP1605() {
        return p1605.get();
    }

    public void setP1605(int p1605) {
        this.p1605.set(p1605);
    }

    // 6.Browning Hi-Power - p1606
    public int getP1606() {
        return p1606.get();
    }

    public void setP1606(int p1606) {
        this.p1606.set(p1606);
    }

    // 7.Beretta 92FS - p1607
    public int getP1607() {
        return p1607.get();
    }

    public void setP1607(int p1607) {
        this.p1607.set(p1607);
    }

    // 8.SW1911 - p1608
    public int getP1608() {
        return p1608.get();
    }

    public void setP1608(int p1608) {
        this.p1608.set(p1608);
    }

    // 9.Поношенный Colt Python - p1609
    public int getP1609() {
        return p1609.get();
    }

    public void setP1609(int p1609) {
        this.p1609.set(p1609);
    }

    // 10.Glock 17 - p1610
    public int getP1610() {
        return p1610.get();
    }

    public void setP1610(int p1610) {
        this.p1610.set(p1610);
    }

    // 11.Beretta 93R - p1611
    public int getP1611() {
        return p1611.get();
    }

    public void setP1611(int p1611) {
        this.p1611.set(p1611);
    }

    // 12.Desert Eagle Mark VII - p1612
    public int getP1612() {
        return p1612.get();
    }

    public void setP1612(int p1612) {
        this.p1612.set(p1612);
    }

    // 13.Colt Python - p1613
    public int getP1613() {
        return p1613.get();
    }

    public void setP1613(int p1613) {
        this.p1613.set(p1613);
    }

    // 14.ОЦ-33 «Пернач» - p1614
    public int getP1614() {
        return p1614.get();
    }

    public void setP1614(int p1614) {
        this.p1614.set(p1614);
    }

    // 15.Desert Eagle Mark XIX - p1615
    public int getP1615() {
        return p1615.get();
    }

    public void setP1615(int p1615) {
        this.p1615.set(p1615);
    }

    // 16.РШ-12 - p1616
    public int getP1616() {
        return p1616.get();
    }

    public void setP1616(int p1616) {
        this.p1616.set(p1616);
    }

    // 17.SIG Sauer P320 - p1617
    public int getP1617() {
        return p1617.get();
    }

    public void setP1617(int p1617) {
        this.p1617.set(p1617);
    }
}
