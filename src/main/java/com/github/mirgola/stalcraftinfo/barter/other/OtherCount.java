package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OtherCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty o2601, o2602;

    public OtherCount(Integer idPerson, String nicknamePerson) {
        this(idPerson, nicknamePerson,
                0,0);
    }

    public OtherCount(Integer idPerson, String nicknamePerson,
                      Integer o2601, Integer o2602) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.o2601 = new SimpleIntegerProperty(o2601);
        this.o2602 = new SimpleIntegerProperty(o2602);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "o2601" -> getO2601();
            case "o2602" -> getO2602();
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

    // 1.Детектор широкого диапазона САК-1 – o2601
    public int getO2601() {
        return o2601.get();
    }

    public void setO2601(int o2601) {
        this.o2601.set(o2601);
    }

    // 2.Черный Регалий - o2602
    public int getO2602() {
        return o2602.get();
    }

    public void setO2602(int o2602) {
        this.o2602.set(o2602);
    }
}
