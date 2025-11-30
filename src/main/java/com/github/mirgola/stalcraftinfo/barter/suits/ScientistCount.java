package com.github.mirgola.stalcraftinfo.barter.suits;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ScientistCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty s4301, s4302, s4303, s4304, s4305, s4306, s4307, s4308, s4309, s4310,
                                  s4311, s4312, s4313;

    public ScientistCount(Integer idPerson, String nicknamePerson,
                          Integer s4301, Integer s4302, Integer s4303, Integer s4304, Integer s4305,
                          Integer s4306, Integer s4307, Integer s4308, Integer s4309, Integer s4310,
                          Integer s4311, Integer s4312, Integer s4313) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.s4301 = new SimpleIntegerProperty(s4301);
        this.s4302 = new SimpleIntegerProperty(s4302);
        this.s4303 = new SimpleIntegerProperty(s4303);
        this.s4304 = new SimpleIntegerProperty(s4304);
        this.s4305 = new SimpleIntegerProperty(s4305);
        this.s4306 = new SimpleIntegerProperty(s4306);
        this.s4307 = new SimpleIntegerProperty(s4307);
        this.s4308 = new SimpleIntegerProperty(s4308);
        this.s4309 = new SimpleIntegerProperty(s4309);
        this.s4310 = new SimpleIntegerProperty(s4310);
        this.s4311 = new SimpleIntegerProperty(s4311);
        this.s4312 = new SimpleIntegerProperty(s4312);
        this.s4313 = new SimpleIntegerProperty(s4313);
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

    // 1.Дождевик – s4301
    public int getS4301() {
        return s4301.get();
    }

    public void setS4301(int s4301) {
        this.s4301.set(s4301);
    }

    // 2.ИП-4м – s4302
    public int getS4302() {
        return s4302.get();
    }

    public void setS4302(int s4302) {
        this.s4302.set(s4302);
    }

    // 3.Костюм «Аврора-Б» – s4303
    public int getS4303() {
        return s4303.get();
    }

    public void setS4303(int s4303) {
        this.s4303.set(s4303);
    }

    // 4.Бандитский костюм с баллонами - s4304
    public int getS4304() {
        return s4304.get();
    }

    public void setS4304(int s4304) {
        this.s4304.set(s4304);
    }

    // 5.КИМ-99 «Янтарь» – s4305
    public int getS4305() {
        return s4305.get();
    }

    public void setS4305(int s4305) {
        this.s4305.set(s4305);
    }

    // 6.КИМ-99М «Малахит» – s4306
    public int getS4306() {
        return s4306.get();
    }

    public void setS4306(int s4306) {
        this.s4306.set(s4306);
    }

    // 7.Комбинезон «Уран» – s4307
    public int getS4307() {
        return s4307.get();
    }

    public void setS4307(int s4307) {
        this.s4307.set(s4307);
    }

    // 8.Комбинезон «Жнец» - s4308
    public int getS4308() {
        return s4308.get();
    }

    public void setS4308(int s4308) {
        this.s4308.set(s4308);
    }

    // 9.Комбинезон «Сатурн» – s4309
    public int getS4309() {
        return s4309.get();
    }

    public void setS4309(int s4309) {
        this.s4309.set(s4309);
    }

    // 10.Комбинезон «Ковчег» – s4310
    public int getS4310() {
        return s4310.get();
    }

    public void setS4310(int s4310) {
        this.s4310.set(s4310);
    }

    // 11.Комбинезон «Орион» - s4311
    public int getS4311() {
        return s4311.get();
    }

    public void setS4311(int s4311) {
        this.s4311.set(s4311);
    }

    // 12.Комбинезон «Навигатор» - s4312
    public int getS4312() {
        return s4312.get();
    }

    public void setS4312(int s4312) {
        this.s4312.set(s4312);
    }

    // 13.Комбинезон «Пересвет» - s4313
    public int getS4313() {
        return s4313.get();
    }

    public void setS4313(int s4313) {
        this.s4313.set(s4313);
    }

}
