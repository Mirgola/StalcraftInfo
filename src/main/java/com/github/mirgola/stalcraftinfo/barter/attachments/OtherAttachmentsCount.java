package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OtherAttachmentsCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty oa3601, oa3602, oa3603, oa3604, oa3605, oa3606, oa3607, oa3608, oa3609, oa3610,
                                  oa3611, oa3612;

    public OtherAttachmentsCount(Integer idPerson, String nicknamePerson) {
        this(idPerson, nicknamePerson,
                0,0,0,0,0,0,0,0,0,0,
                0,0);
    }

    public OtherAttachmentsCount(Integer idPerson, String nicknamePerson,
                                 Integer oa3601, Integer oa3602, Integer oa3603, Integer oa3604, Integer oa3605,
                                 Integer oa3606, Integer oa3607, Integer oa3608, Integer oa3609, Integer oa3610,
                                 Integer oa3611, Integer oa3612) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.oa3601 = new SimpleIntegerProperty(oa3601);
        this.oa3602 = new SimpleIntegerProperty(oa3602);
        this.oa3603 = new SimpleIntegerProperty(oa3603);
        this.oa3604 = new SimpleIntegerProperty(oa3604);
        this.oa3605 = new SimpleIntegerProperty(oa3605);
        this.oa3606 = new SimpleIntegerProperty(oa3606);
        this.oa3607 = new SimpleIntegerProperty(oa3607);
        this.oa3608 = new SimpleIntegerProperty(oa3608);
        this.oa3609 = new SimpleIntegerProperty(oa3609);
        this.oa3610 = new SimpleIntegerProperty(oa3610);
        this.oa3611 = new SimpleIntegerProperty(oa3611);
        this.oa3612 = new SimpleIntegerProperty(oa3612);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "oa3601" -> getOa3601();
            case "oa3602" -> getOa3602();
            case "oa3603" -> getOa3603();
            case "oa3604" -> getOa3604();
            case "oa3605" -> getOa3605();
            case "oa3606" -> getOa3606();
            case "oa3607" -> getOa3607();
            case "oa3608" -> getOa3608();
            case "oa3609" -> getOa3609();
            case "oa3610" -> getOa3610();
            case "oa3611" -> getOa3611();
            case "oa3612" -> getOa3612();
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

    // 1.HQ ISSUE Mini Laser Sight (зеленый лазер) – oa3601
    public int getOa3601() {
        return oa3601.get();
    }

    public void setOa3601(int oa3601) {
        this.oa3601.set(oa3601);
    }

    // 2.Компактная защитная планка, хаки – oa3602
    public int getOa3602() {
        return oa3602.get();
    }

    public void setOa3602(int oa3602) {
        this.oa3602.set(oa3602);
    }

    // 3.Компактная защитная планка,черная – oa3603
    public int getOa3603() {
        return oa3603.get();
    }

    public void setOa3603(int oa3603) {
        this.oa3603.set(oa3603);
    }

    // 4.Компактная защитная планка, олива – oa3604
    public int getOa3604() {
        return oa3604.get();
    }

    public void setOa3604(int oa3604) {
        this.oa3604.set(oa3604);
    }

    // 5.Лазерный целеуказатель «Клещ-2ПС» – oa3605
    public int getOa3605() {
        return oa3605.get();
    }

    public void setOa3605(int oa3605) {
        this.oa3605.set(oa3605);
    }

    // 6.Защитная планка, хаки – oa3606
    public int getOa3606() {
        return oa3606.get();
    }

    public void setOa3606(int oa3606) {
        this.oa3606.set(oa3606);
    }

    // 7.Защитная планка, черная – oa3607
    public int getOa3607() {
        return oa3607.get();
    }

    public void setOa3607(int oa3607) {
        this.oa3607.set(oa3607);
    }

    // 8.Защитная планка, олива – oa3608
    public int getOa3608() {
        return oa3608.get();
    }

    public void setOa3608(int oa3608) {
        this.oa3608.set(oa3608);
    }

    // 9.HQ ISSUE Low-Profile Laser Sight (красный лазер) – oa3609
    public int getOa3609() {
        return oa3609.get();
    }

    public void setOa3609(int oa3609) {
        this.oa3609.set(oa3609);
    }

    // 10.Тактический блок Зенит «Перст-3» – oa3610
    public int getOa3610() {
        return oa3610.get();
    }

    public void setOa3610(int oa3610) {
        this.oa3610.set(oa3610);
    }

    // 11.ГП-25 «Костер» – oa3611
    public int getOa3611() {
        return oa3611.get();
    }

    public void setOa3611(int oa3611) {
        this.oa3611.set(oa3611);
    }

    // 12.M203 – oa3612
    public int getOa3612() {
        return oa3612.get();
    }

    public void setOa3612(int oa3612) {
        this.oa3612.set(oa3612);
    }
}
