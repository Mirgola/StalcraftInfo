package com.github.mirgola.stalcraftinfo.barter.suits;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CombinedCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty c4201, c4202, c4203, c4204, c4205, c4206, c4207, c4208, c4209, c4210,
                                  c4211, c4212, c4213, c4214, c4215, c4216, c4217, c4218, c4219;

    public CombinedCount(Integer idPerson, String nicknamePerson,
                         Integer c4201, Integer c4202, Integer c4203, Integer c4204, Integer c4205,
                         Integer c4206, Integer c4207, Integer c4208, Integer c4209, Integer c4210,
                         Integer c4211, Integer c4212, Integer c4213, Integer c4214, Integer c4215,
                         Integer c4216, Integer c4217, Integer c4218, Integer c4219) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.c4201 = new SimpleIntegerProperty(c4201);
        this.c4202 = new SimpleIntegerProperty(c4202);
        this.c4203 = new SimpleIntegerProperty(c4203);
        this.c4204 = new SimpleIntegerProperty(c4204);
        this.c4205 = new SimpleIntegerProperty(c4205);
        this.c4206 = new SimpleIntegerProperty(c4206);
        this.c4207 = new SimpleIntegerProperty(c4207);
        this.c4208 = new SimpleIntegerProperty(c4208);
        this.c4209 = new SimpleIntegerProperty(c4209);
        this.c4210 = new SimpleIntegerProperty(c4210);
        this.c4211 = new SimpleIntegerProperty(c4211);
        this.c4212 = new SimpleIntegerProperty(c4212);
        this.c4213 = new SimpleIntegerProperty(c4213);
        this.c4214 = new SimpleIntegerProperty(c4214);
        this.c4215 = new SimpleIntegerProperty(c4215);
        this.c4216 = new SimpleIntegerProperty(c4216);
        this.c4217 = new SimpleIntegerProperty(c4217);
        this.c4218 = new SimpleIntegerProperty(c4218);
        this.c4219 = new SimpleIntegerProperty(c4219);
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

    // 1.Костюм «Горка-3» - c4201
    public int getC4201() {
        return c4201.get();
    }

    public void setC4201(int c4201) {
        this.c4201.set(c4201);
    }

    // 2.Костюм «Аврора» с противогазом - c4202
    public int getC4202() {
        return c4202.get();
    }

    public void setC4202(int c4202) {
        this.c4202.set(c4202);
    }

    // 3.Бандитский костюм с противогазом - c4203
    public int getC4203() {
        return c4203.get();
    }

    public void setC4203(int c4203) {
        this.c4203.set(c4203);
    }

    // 4.Костюм «Грибник» - c4204
    public int getC4204() {
        return c4204.get();
    }

    public void setC4204(int c4204) {
        this.c4204.set(c4204);
    }

    // 5.Костюм «Клептоман» - c4205
    public int getC4205() {
        return c4205.get();
    }

    public void setC4205(int c4205) {
        this.c4205.set(c4205);
    }

    // 6.Костюм АО-2 «Странник» - c4206
    public int getC4206() {
        return c4206.get();
    }

    public void setC4206(int c4206) {
        this.c4206.set(c4206);
    }

    // 7.Костюм «Сокол» - c4207
    public int getC4207() {
        return c4207.get();
    }

    public void setC4207(int c4207) {
        this.c4207.set(c4207);
    }

    // 8.Костюм «Пересмешник» - c4208
    public int getC4208() {
        return c4208.get();
    }

    public void setC4208(int c4208) {
        this.c4208.set(c4208);
    }

    // 9.Костюм АО-3 «Искатель» - c4209
    public int getC4209() {
        return c4209.get();
    }

    public void setC4209(int c4209) {
        this.c4209.set(c4209);
    }

    // 10.Бронекостюм «Скиф-2м» - c4210
    public int getC4210() {
        return c4210.get();
    }

    public void setC4210(int c4210) {
        this.c4210.set(c4210);
    }

    // 11.УКАЗ АО-4 «Рейдер» - c4211
    public int getC4211() {
        return c4211.get();
    }

    public void setC4211(int c4211) {
        this.c4211.set(c4211);
    }

    // 12.Бронекостюм «Скиф-4» - c4212
    public int getC4212() {
        return c4212.get();
    }

    public void setC4212(int c4212) {
        this.c4212.set(c4212);
    }

    // 13.УКАЗ АО-5 «Пилигрим» - c4213
    public int getC4213() {
        return c4213.get();
    }

    public void setC4213(int c4213) {
        this.c4213.set(c4213);
    }

    // 14.Бронекостюм «Скиф-5» - c4214
    public int getC4214() {
        return c4214.get();
    }

    public void setC4214(int c4214) {
        this.c4214.set(c4214);
    }

    // 15.УКАЗ АО-6 «Кочевник» - c4215
    public int getC4215() {
        return c4215.get();
    }

    public void setC4215(int c4215) {
        this.c4215.set(c4215);
    }

    // 16.Экзоброня «Следак» - c4216
    public int getC4216() {
        return c4216.get();
    }

    public void setC4216(int c4216) {
        this.c4216.set(c4216);
    }

    // 17.Экзоброня «Гончий» - c4217
    public int getC4217() {
        return c4217.get();
    }

    public void setC4217(int c4217) {
        this.c4217.set(c4217);
    }

    // 18.Экзоброня «Каратель» - c4218
    public int getC4218() {
        return c4218.get();
    }

    public void setC4218(int c4218) {
        this.c4218.set(c4218);
    }

    // 19.Экзокостюм «Миссионер» - c4219
    public int getC4219() {
        return c4219.get();
    }

    public void setC4219(int c4219) {
        this.c4219.set(c4219);
    }
}
