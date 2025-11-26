package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CosmeticsCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty c2401, c2402, c2403;

    public CosmeticsCount(Integer idPerson, String nicknamePerson,
                          Integer c2401, Integer c2402, Integer c2403) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.c2401 = new SimpleIntegerProperty(c2401);
        this.c2402 = new SimpleIntegerProperty(c2402);
        this.c2403 = new SimpleIntegerProperty(c2403);
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

    // 1.«Лимб» - c2401
    public int getC2401() {
        return c2401.get();
    }

    public void setC2401(int c2401) {
        this.c2401.set(c2401);
    }

    // 2.EMR-65 «Spark» - c2402
    public int getC2402() {
        return c2402.get();
    }

    public void setC2402(int c2402) {
        this.c2402.set(c2402);
    }

    // 3.ZIVCAS 3.0 «Expanse» - c2403
    public int getC2403() {
        return c2403.get();
    }

    public void setC2403(int c2403) {
        this.c2403.set(c2403);
    }
}
