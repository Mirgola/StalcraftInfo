package com.github.mirgola.stalcraftinfo.barter.suits;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CombatCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty c4101, c4102, c4103, c4104, c4105, c4106, c4107, c4108, c4109, c4110,
                                  c4111, c4112, c4113, c4114, c4115, c4116, c4117, c4118, c4119, c4120,
                                  c4121, c4122, c4123, c4124, c4125, c4126, c4127, c4128, c4129;

    public CombatCount(Integer idPerson, String nicknamePerson,
                       Integer c4101, Integer c4102, Integer c4103, Integer c4104, Integer c4105,
                       Integer c4106, Integer c4107, Integer c4108, Integer c4109, Integer c4110,
                       Integer c4111, Integer c4112, Integer c4113, Integer c4114, Integer c4115,
                       Integer c4116, Integer c4117, Integer c4118, Integer c4119, Integer c4120,
                       Integer c4121, Integer c4122, Integer c4123, Integer c4124, Integer c4125,
                       Integer c4126, Integer c4127, Integer c4128, Integer c4129) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.c4101 = new SimpleIntegerProperty(c4101);
        this.c4102 = new SimpleIntegerProperty(c4102);
        this.c4103 = new SimpleIntegerProperty(c4103);
        this.c4104 = new SimpleIntegerProperty(c4104);
        this.c4105 = new SimpleIntegerProperty(c4105);
        this.c4106 = new SimpleIntegerProperty(c4106);
        this.c4107 = new SimpleIntegerProperty(c4107);
        this.c4108 = new SimpleIntegerProperty(c4108);
        this.c4109 = new SimpleIntegerProperty(c4109);
        this.c4110 = new SimpleIntegerProperty(c4110);
        this.c4111 = new SimpleIntegerProperty(c4111);
        this.c4112 = new SimpleIntegerProperty(c4112);
        this.c4113 = new SimpleIntegerProperty(c4113);
        this.c4114 = new SimpleIntegerProperty(c4114);
        this.c4115 = new SimpleIntegerProperty(c4115);
        this.c4116 = new SimpleIntegerProperty(c4116);
        this.c4117 = new SimpleIntegerProperty(c4117);
        this.c4118 = new SimpleIntegerProperty(c4118);
        this.c4119 = new SimpleIntegerProperty(c4119);
        this.c4120 = new SimpleIntegerProperty(c4120);
        this.c4121 = new SimpleIntegerProperty(c4121);
        this.c4122 = new SimpleIntegerProperty(c4122);
        this.c4123 = new SimpleIntegerProperty(c4123);
        this.c4124 = new SimpleIntegerProperty(c4124);
        this.c4125 = new SimpleIntegerProperty(c4125);
        this.c4126 = new SimpleIntegerProperty(c4126);
        this.c4127 = new SimpleIntegerProperty(c4127);
        this.c4128 = new SimpleIntegerProperty(c4128);
        this.c4129 = new SimpleIntegerProperty(c4129);
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

    // 1.Куртка с бронежилетом – c4101
    public int getC4101() {
        return c4101.get();
    }

    public void setC4101(int c4101) {
        this.c4101.set(c4101);
    }

    // 2.Охотничий плащ - c4102
    public int getC4102() {
        return c4102.get();
    }

    public void setC4102(int c4102) {
        this.c4102.set(c4102);
    }

    // 3.Костюм «Скаут» - c4103
    public int getC4103() {
        return c4103.get();
    }

    public void setC4103(int c4103) {
        this.c4103.set(c4103);
    }

    // 4.Костюм «Псарь» – c4104
    public int getC4104() {
        return c4104.get();
    }

    public void setC4104(int c4104) {
        this.c4104.set(c4104);
    }

    // 5.Бронекостюм «Комбат-5М» - c4105
    public int getC4105() {
        return c4105.get();
    }

    public void setC4105(int c4105) {
        this.c4105.set(c4105);
    }

    // 6.Бронекостюм «Червь» - c4106
    public int getC4106() {
        return c4106.get();
    }

    public void setC4106(int c4106) {
        this.c4106.set(c4106);
    }

    // 7.Костюм «Траппер» – c4107
    public int getC4107() {
        return c4107.get();
    }

    public void setC4107(int c4107) {
        this.c4107.set(c4107);
    }

    // 8.Бронекостюм «Страйкер» - c4108
    public int getC4108() {
        return c4108.get();
    }

    public void setC4108(int c4108) {
        this.c4108.set(c4108);
    }

    // 9.Бронекостюм «Ворса» - c4109
    public int getC4109() {
        return c4109.get();
    }

    public void setC4109(int c4109) {
        this.c4109.set(c4109);
    }

    // 10.Бронекостюм «Гоплит» - c4110
    public int getC4110() {
        return c4110.get();
    }

    public void setC4110(int c4110) {
        this.c4110.set(c4110);
    }

    // 11.Бронекостюм «Ош» - c4111
    public int getC4111() {
        return c4111.get();
    }

    public void setC4111(int c4111) {
        this.c4111.set(c4111);
    }

    // 12.Тяжелый бронекостюм «Восход» - c4112
    public int getC4112() {
        return c4112.get();
    }

    public void setC4112(int c4112) {
        this.c4112.set(c4112);
    }

    // 13.Tяжелый бронекостюм «Громила» - c4113
    public int getC4113() {
        return c4113.get();
    }

    public void setC4113(int c4113) {
        this.c4113.set(c4113);
    }

    // 14.Тяжелый бронекостюм «Легионер» - c4114
    public int getC4114() {
        return c4114.get();
    }

    public void setC4114(int c4114) {
        this.c4114.set(c4114);
    }

    // 15.Экзоброня «Егерь» - c4115
    public int getC4115() {
        return c4115.get();
    }

    public void setC4115(int c4115) {
        this.c4115.set(c4115);
    }

    // 16.Экзоброня «Самсон» - c4116
    public int getC4116() {
        return c4116.get();
    }

    public void setC4116(int c4116) {
        this.c4116.set(c4116);
    }

    // 17.Экзоброня «Масть» - c4117
    public int getC4117() {
        return c4117.get();
    }

    public void setC4117(int c4117) {
        this.c4117.set(c4117);
    }

    // 18.Бронекостюм «Центурион» - c4118
    public int getC4118() {
        return c4118.get();
    }

    public void setC4118(int c4118) {
        this.c4118.set(c4118);
    }

    // 19.Экзоброня «Зверобой» - c4119
    public int getC4119() {
        return c4119.get();
    }

    public void setC4119(int c4119) {
        this.c4119.set(c4119);
    }

    // 20.Экзоброня «Мул» - c4120
    public int getC4120() {
        return c4120.get();
    }

    public void setC4120(int c4120) {
        this.c4120.set(c4120);
    }

    // 21.Экзоброня «Туз» - c4121
    public int getC4121() {
        return c4121.get();
    }

    public void setC4121(int c4121) {
        this.c4121.set(c4121);
    }

    // 22.Сверхтяжелый бронекостюм «Гранит» - c4122
    public int getC4122() {
        return c4122.get();
    }

    public void setC4122(int c4122) {
        this.c4122.set(c4122);
    }

    // 23.Сверхтяжелый бронекостюм «Вождь» - c4123
    public int getC4123() {
        return c4123.get();
    }

    public void setC4123(int c4123) {
        this.c4123.set(c4123);
    }

    // 24.Сверхтяжелый бронекостюм «Рейтар» - c4124
    public int getC4124() {
        return c4124.get();
    }

    public void setC4124(int c4124) {
        this.c4124.set(c4124);
    }

    // 25.Сверхтяжелый бронекостюм «Апостол» - c4125
    public int getC4125() {
        return c4125.get();
    }

    public void setC4125(int c4125) {
        this.c4125.set(c4125);
    }

    // 26.Бронекостюм «Авангард» - c4126
    public int getC4126() {
        return c4126.get();
    }

    public void setC4126(int c4126) {
        this.c4126.set(c4126);
    }

    // 27.Бронекостюм «Прометей» - c4127
    public int getC4127() {
        return c4127.get();
    }

    public void setC4127(int c4127) {
        this.c4127.set(c4127);
    }

    // 28.Бронекостюм «Ронин» - c4128
    public int getC4128() {
        return c4128.get();
    }

    public void setC4128(int c4128) {
        this.c4128.set(c4128);
    }

    // 29.Бронекостюм «Храмовник» - c4129
    public int getC4129() {
        return c4129.get();
    }

    public void setC4129(int c4129) {
        this.c4129.set(c4129);
    }
}
