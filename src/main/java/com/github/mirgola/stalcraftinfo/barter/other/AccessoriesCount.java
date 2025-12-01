package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AccessoriesCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty a2501, a2502, a2503, a2504, a2505, a2506;

    public AccessoriesCount(Integer idPerson, String nicknamePerson,
                            Integer a2501, Integer a2502, Integer a2503, Integer a2504, Integer a2505,
                            Integer a2506) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.a2501 = new SimpleIntegerProperty(a2501);
        this.a2502 = new SimpleIntegerProperty(a2502);
        this.a2503 = new SimpleIntegerProperty(a2503);
        this.a2504 = new SimpleIntegerProperty(a2504);
        this.a2505 = new SimpleIntegerProperty(a2505);
        this.a2506 = new SimpleIntegerProperty(a2506);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "a2501" -> getA2501();
            case "a2502" -> getA2502();
            case "a2503" -> getA2503();
            case "a2504" -> getA2504();
            case "a2505" -> getA2505();
            case "a2506" -> getA2506();
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

    // 1.Брелок «Багровый жетон» - a2501
    public int getA2501() {
        return a2501.get();
    }

    public void setA2501(int a2501) {
        this.a2501.set(a2501);
    }

    // 2.Брелок «Мини КС-23» - a2502
    public int getA2502() {
        return a2502.get();
    }

    public void setA2502(int a2502) {
        this.a2502.set(a2502);
    }

    // 3.Брелок «Мини АМ-17» - a2503
    public int getA2503() {
        return a2503.get();
    }

    public void setA2503(int a2503) {
        this.a2503.set(a2503);
    }

    // 4.Брелок «Мини Кувалда» - a2504
    public int getA2504() {
        return a2504.get();
    }

    public void setA2504(int a2504) {
        this.a2504.set(a2504);
    }

    // 5.Брелок «Мини SIG Sauer P320» - a2505
    public int getA2505() {
        return a2505.get();
    }

    public void setA2505(int a2505) {
        this.a2505.set(a2505);
    }

    // 6.Брелок «Мини Scorpion EVO 3» - a2506
    public int getA2506() {
        return a2506.get();
    }

    public void setA2506(int a2506) {
        this.a2506.set(a2506);
    }
}
