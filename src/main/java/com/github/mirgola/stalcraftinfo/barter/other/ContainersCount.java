package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ContainersCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty c2201, c2202, c2203, c2204, c2205, c2206, c2207, c2208, c2209, c2210,
                                  c2211, c2212, c2213, c2214, c2215, c2216, c2217, c2218, c2219, c2220,
                                  c2221, c2222;

    public ContainersCount(Integer idPerson, String nicknamePerson,
                              Integer c2201, Integer c2202, Integer c2203, Integer c2204, Integer c2205,
                              Integer c2206, Integer c2207, Integer c2208, Integer c2209, Integer c2210,
                              Integer c2211, Integer c2212, Integer c2213, Integer c2214, Integer c2215,
                              Integer c2216, Integer c2217, Integer c2218, Integer c2219, Integer c2220,
                              Integer c2221, Integer c2222) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.c2201 = new SimpleIntegerProperty(c2201);
        this.c2202 = new SimpleIntegerProperty(c2202);
        this.c2203 = new SimpleIntegerProperty(c2203);
        this.c2204 = new SimpleIntegerProperty(c2204);
        this.c2205 = new SimpleIntegerProperty(c2205);
        this.c2206 = new SimpleIntegerProperty(c2206);
        this.c2207 = new SimpleIntegerProperty(c2207);
        this.c2208 = new SimpleIntegerProperty(c2208);
        this.c2209 = new SimpleIntegerProperty(c2209);
        this.c2210 = new SimpleIntegerProperty(c2210);
        this.c2211 = new SimpleIntegerProperty(c2211);
        this.c2212 = new SimpleIntegerProperty(c2212);
        this.c2213 = new SimpleIntegerProperty(c2213);
        this.c2214 = new SimpleIntegerProperty(c2214);
        this.c2215 = new SimpleIntegerProperty(c2215);
        this.c2216 = new SimpleIntegerProperty(c2216);
        this.c2217 = new SimpleIntegerProperty(c2217);
        this.c2218 = new SimpleIntegerProperty(c2218);
        this.c2219 = new SimpleIntegerProperty(c2219);
        this.c2220 = new SimpleIntegerProperty(c2220);
        this.c2221 = new SimpleIntegerProperty(c2221);
        this.c2222 = new SimpleIntegerProperty(c2222);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "c2201" -> getC2201();
            case "c2202" -> getC2202();
            case "c2203" -> getC2203();
            case "c2204" -> getC2204();
            case "c2205" -> getC2205();
            case "c2206" -> getC2206();
            case "c2207" -> getC2207();
            case "c2208" -> getC2208();
            case "c2209" -> getC2209();
            case "c2210" -> getC2210();
            case "c2211" -> getC2211();
            case "c2212" -> getC2212();
            case "c2213" -> getC2213();
            case "c2214" -> getC2214();
            case "c2215" -> getC2215();
            case "c2216" -> getC2216();
            case "c2217" -> getC2217();
            case "c2218" -> getC2218();
            case "c2219" -> getC2219();
            case "c2220" -> getC2220();
            case "c2221" -> getC2221();
            case "c2222" -> getC2222();
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

    // 1.Контейнер «КЗС-1у» - c2201
    public int getC2201() {
        return c2201.get();
    }

    public void setC2201(int c2201) {
        this.c2201.set(c2201);
    }

    // 2.Контейнер «КЗС-2» - c2202
    public int getC2202() {
        return c2202.get();
    }

    public void setC2202(int c2202) {
        this.c2202.set(c2202);
    }

    // 3.Контейнер «Кокон» - c2203
    public int getC2203() {
        return c2203.get();
    }

    public void setC2203(int c2203) {
        this.c2203.set(c2203);
    }

    // 4.Контейнер «Берлога-4» - c2204
    public int getC2204() {
        return c2204.get();
    }

    public void setC2204(int c2204) {
        this.c2204.set(c2204);
    }

    // 5.Контейнер «Бидон» - c2205
    public int getC2205() {
        return c2205.get();
    }

    public void setC2205(int c2205) {
        this.c2205.set(c2205);
    }

    // 6.Контейнер «КЗС-2У» - c2206
    public int getC2206() {
        return c2206.get();
    }

    public void setC2206(int c2206) {
        this.c2206.set(c2206);
    }

    // 7.Контейнер «Кокон-У» - c2207
    public int getC2207() {
        return c2207.get();
    }

    public void setC2207(int c2207) {
        this.c2207.set(c2207);
    }

    // 8.Контейнер «Берлога-4у»- c2208
    public int getC2208() {
        return c2208.get();
    }

    public void setC2208(int c2208) {
        this.c2208.set(c2208);
    }

    // 9.Контейнер «Бидон-У» - c2209
    public int getC2209() {
        return c2209.get();
    }

    public void setC2209(int c2209) {
        this.c2209.set(c2209);
    }

    // 10.Контейнер «КЗС-М» - c2210
    public int getC2210() {
        return c2210.get();
    }

    public void setC2210(int c2210) {
        this.c2210.set(c2210);
    }

    // 11.Контейнер «Сота» - c2211
    public int getC2211() {
        return c2211.get();
    }

    public void setC2211(int c2211) {
        this.c2211.set(c2211);
    }

    // 12.Контейнер «Берлога-5» - c2212
    public int getC2212() {
        return c2212.get();
    }

    public void setC2212(int c2212) {
        this.c2212.set(c2212);
    }

    // 13.Контейнер «Кега» - c2213
    public int getC2213() {
        return c2213.get();
    }

    public void setC2213(int c2213) {
        this.c2213.set(c2213);
    }

    // 14.Контейнер «КЗС-МУ» - c2214
    public int getC2214() {
        return c2214.get();
    }

    public void setC2214(int c2214) {
        this.c2214.set(c2214);
    }

    // 15.Контейнер «Сота-У» - c2215
    public int getC2215() {
        return c2215.get();
    }

    public void setC2215(int c2215) {
        this.c2215.set(c2215);
    }

    // 16.Контейнер «Добытчик» - c2216
    public int getC2216() {
        return c2216.get();
    }

    public void setC2216(int c2216) {
        this.c2216.set(c2216);
    }

    // 17.Контейнер «Берлога-5У» - c2217
    public int getC2217() {
        return c2217.get();
    }

    public void setC2217(int c2217) {
        this.c2217.set(c2217);
    }

    // 18.Контейнер «Кега-УЭ» - c2218
    public int getC2218() {
        return c2218.get();
    }

    public void setC2218(int c2218) {
        this.c2218.set(c2218);
    }

    // 19.Контейнер «КСМ» - c2219
    public int getC2219() {
        return c2219.get();
    }

    public void setC2219(int c2219) {
        this.c2219.set(c2219);
    }

    // 20.Контейнер «Улей» - c2220
    public int getC2220() {
        return c2220.get();
    }

    public void setC2220(int c2220) {
        this.c2220.set(c2220);
    }

    // 21.Контейнер «Берлога-6» - c2221
    public int getC2221() {
        return c2221.get();
    }

    public void setC2221(int c2221) {
        this.c2221.set(c2221);
    }

    // 22.	Контейнер «Бочонок» - c2222
    public int getC2222() {
        return c2222.get();
    }

    public void setC2222(int c2222) {
        this.c2222.set(c2222);
    }
}
