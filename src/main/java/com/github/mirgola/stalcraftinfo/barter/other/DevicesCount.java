package com.github.mirgola.stalcraftinfo.barter.other;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DevicesCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty d2301, d2302, d2303, d2304, d2305, d2306, d2307, d2308, d2309, d2310,
                                  d2311;

    public DevicesCount(Integer idPerson, String nicknamePerson,
                        Integer d2301, Integer d2302, Integer d2303, Integer d2304, Integer d2305,
                        Integer d2306, Integer d2307, Integer d2308, Integer d2309, Integer d2310,
                        Integer d2311) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.d2301 = new SimpleIntegerProperty(d2301);
        this.d2302 = new SimpleIntegerProperty(d2302);
        this.d2303 = new SimpleIntegerProperty(d2303);
        this.d2304 = new SimpleIntegerProperty(d2304);
        this.d2305 = new SimpleIntegerProperty(d2305);
        this.d2306 = new SimpleIntegerProperty(d2306);
        this.d2307 = new SimpleIntegerProperty(d2307);
        this.d2308 = new SimpleIntegerProperty(d2308);
        this.d2309 = new SimpleIntegerProperty(d2309);
        this.d2310 = new SimpleIntegerProperty(d2310);
        this.d2311 = new SimpleIntegerProperty(d2311);
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

    // 1.Штурмовой ПНВ – d2301
    public int getD2301() {
        return d2301.get();
    }

    public void setD2301(int d2301) {
        this.d2301.set(d2301);
    }

    // 2.СН-1у «Блинчик» - d2302
    public int getD2302() {
        return d2302.get();
    }

    public void setD2302(int d2302) {
        this.d2302.set(d2302);
    }

    // 3.Штурмовой ПНВ (сталкер) – d2303
    public int getD2303() {
        return d2303.get();
    }

    public void setD2303(int d2303) {
        this.d2303.set(d2303);
    }

    // 4.СН-1 «Блин» - d2304
    public int getD2304() {
        return d2304.get();
    }

    public void setD2304(int d2304) {
        this.d2304.set(d2304);
    }

    // 5.Детектор узкого диапазона «Свеча» - d2305
    public int getD2305() {
        return d2305.get();
    }

    public void setD2305(int d2305) {
        this.d2305.set(d2305);
    }

    // 6.Сломанный ПНВ – d2306
    public int getD2306() {
        return d2306.get();
    }

    public void setD2306(int d2306) {
        this.d2306.set(d2306);
    }

    // 7.Aww Scary NVD – d2307
    public int getD2307() {
        return d2307.get();
    }

    public void setD2307(int d2307) {
        this.d2307.set(d2307);
    }

    // 8.Штурмовой ПНВ (ветеран) – d2308
    public int getD2308() {
        return d2308.get();
    }

    public void setD2308(int d2308) {
        this.d2308.set(d2308);
    }

    // 9.Штурмовой ПНВ (синий) – d2309
    public int getD2309() {
        return d2309.get();
    }

    public void setD2309(int d2309) {
        this.d2309.set(d2309);
    }

    // 10.Штурмовой ПНВ (белый) – d2310
    public int getD2310() {
        return d2310.get();
    }

    public void setD2310(int d2310) {
        this.d2310.set(d2310);
    }

    // 11.Штурмовой ПНВ (зеленый) – d2311
    public int getD2311() {
        return d2311.get();
    }

    public void setD2311(int d2311) {
        this.d2311.set(d2311);
    }
}
