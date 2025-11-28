package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HanguardsAndBracketsCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty hab3301, hab3302, hab3303, hab3304, hab3305, hab3306;

    public HanguardsAndBracketsCount(Integer idPerson, String nicknamePerson,
                              Integer hab3301, Integer hab3302, Integer hab3303, Integer hab3304, Integer hab3305,
                              Integer hab3306) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.hab3301 = new SimpleIntegerProperty(hab3301);
        this.hab3302 = new SimpleIntegerProperty(hab3302);
        this.hab3303 = new SimpleIntegerProperty(hab3303);
        this.hab3304 = new SimpleIntegerProperty(hab3304);
        this.hab3305 = new SimpleIntegerProperty(hab3305);
        this.hab3306 = new SimpleIntegerProperty(hab3306);
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

    // 1.Надствольное крепление БМ – hab3301
    public int getHab3301() {
        return hab3301.get();
    }

    public void setHab3301(int hab3301) {
        this.hab3301.set(hab3301);
    }

    // 2.Планка с базой Пикатинни – hab3302
    public int getHab3302() {
        return hab3302.get();
    }

    public void setHab3302(int hab3302) {
        this.hab3302.set(hab3302);
    }

    // 3.Направляющая RIS для дробовиков – hab3303
    public int getHab3303() {
        return hab3303.get();
    }

    public void setHab3303(int hab3303) {
        this.hab3303.set(hab3303);
    }

    // 4.Боковой кронштейн с планкой Пикатинни – hab3304
    public int getHab3304() {
        return hab3304.get();
    }

    public void setHab3304(int hab3304) {
        this.hab3304.set(hab3304);
    }

    // 5.Повышающая RIS-планка – hab3305
    public int getHab3305() {
        return hab3305.get();
    }

    public void setHab3305(int hab3305) {
        this.hab3305.set(hab3305);
    }

    // 6.Цевье для Сайга-12К – hab3306
    public int getHab3306() {
        return hab3306.get();
    }

    public void setHab3306(int hab3306) {
        this.hab3306.set(hab3306);
    }
}
