package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HandlesCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty h3501, h3502, h3503, h3504, h3505, h3506, h3507, h3508, h3509, h3510,
                                  h3511, h3512, h3513;

    public HandlesCount(Integer idPerson, String nicknamePerson,
                        Integer h3501, Integer h3502, Integer h3503, Integer h3504, Integer h3505,
                        Integer h3506, Integer h3507, Integer h3508, Integer h3509, Integer h3510,
                        Integer h3511, Integer h3512, Integer h3513) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.h3501 = new SimpleIntegerProperty(h3501);
        this.h3502 = new SimpleIntegerProperty(h3502);
        this.h3503 = new SimpleIntegerProperty(h3503);
        this.h3504 = new SimpleIntegerProperty(h3504);
        this.h3505 = new SimpleIntegerProperty(h3505);
        this.h3506 = new SimpleIntegerProperty(h3506);
        this.h3507 = new SimpleIntegerProperty(h3507);
        this.h3508 = new SimpleIntegerProperty(h3508);
        this.h3509 = new SimpleIntegerProperty(h3509);
        this.h3510 = new SimpleIntegerProperty(h3510);
        this.h3511 = new SimpleIntegerProperty(h3511);
        this.h3512 = new SimpleIntegerProperty(h3512);
        this.h3513 = new SimpleIntegerProperty(h3513);
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

    // 1.Тактическая рукоятка FMA TD Grip – h3501
    public int getH3501() {
        return h3501.get();
    }

    public void setH3501(int h3501) {
        this.h3501.set(h3501);
    }

    // 2.Рукоять переноса огня FMA DARK EARTH – h3502
    public int getH3502() {
        return h3502.get();
    }

    public void setH3502(int h3502) {
        this.h3502.set(h3502);
    }

    // 3.РК-5 – h3503
    public int getH3503() {
        return h3503.get();
    }

    public void setH3503(int h3503) {
        this.h3503.set(h3503);
    }

    // 4.Тактическая рукоятка Magpul AFG – h3504
    public int getH3504() {
        return h3504.get();
    }

    public void setH3504(int h3504) {
        this.h3504.set(h3504);
    }

    // 5.Тактическая рукоятка KAC Vertical Foregrip – h3505
    public int getH3505() {
        return h3505.get();
    }

    public void setH3505(int h3505) {
        this.h3505.set(h3505);
    }

    // 6.Вертикальная рукоятка ANG4 – h3506
    public int getH3506() {
        return h3506.get();
    }

    public void setH3506(int h3506) {
        this.h3506.set(h3506);
    }

    // 7.FX PTKB FAB Defense – h3507
    public int getH3507() {
        return h3507.get();
    }

    public void setH3507(int h3507) {
        this.h3507.set(h3507);
    }

    // 8.Вертикальная рукоятка Tapco – h3508
    public int getH3508() {
        return h3508.get();
    }

    public void setH3508(int h3508) {
        this.h3508.set(h3508);
    }

    // 9.РК-0 – h3509
    public int getH3509() {
        return h3509.get();
    }

    public void setH3509(int h3509) {
        this.h3509.set(h3509);
    }

    // 10.Тактическая рукоятка Fortis SHIFT Vertical, черная – h3510
    public int getH3510() {
        return h3510.get();
    }

    public void setH3510(int h3510) {
        this.h3510.set(h3510);
    }

    // 11.Magpul RVG – h3511
    public int getH3511() {
        return h3511.get();
    }

    public void setH3511(int h3511) {
        this.h3511.set(h3511);
    }

    // 12.РК-1 – h3512
    public int getH3512() {
        return h3512.get();
    }

    public void setH3512(int h3512) {
        this.h3512.set(h3512);
    }

    // 13.Тактическая рукоятка Viking Tactics UVG – h3513
    public int getH3513() {
        return h3513.get();
    }

    public void setH3513(int h3513) {
        this.h3513.set(h3513);
    }
}
