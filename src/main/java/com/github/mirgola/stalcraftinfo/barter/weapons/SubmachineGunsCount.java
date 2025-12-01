package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SubmachineGunsCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty sg1201, sg1202, sg1203, sg1204, sg1205, sg1206, sg1207, sg1208, sg1209, sg1210,
                                  sg1211, sg1212, sg1213, sg1214, sg1215, sg1216, sg1217, sg1218, sg1219, sg1220,
                                  sg1221;

    public SubmachineGunsCount(Integer idPerson, String nicknamePerson,
                               Integer sg1201, Integer sg1202, Integer sg1203, Integer sg1204, Integer sg1205,
                               Integer sg1206, Integer sg1207, Integer sg1208, Integer sg1209, Integer sg1210,
                               Integer sg1211, Integer sg1212, Integer sg1213, Integer sg1214, Integer sg1215,
                               Integer sg1216, Integer sg1217, Integer sg1218, Integer sg1219, Integer sg1220,
                               Integer sg1221) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.sg1201 = new SimpleIntegerProperty(sg1201);
        this.sg1202 = new SimpleIntegerProperty(sg1202);
        this.sg1203 = new SimpleIntegerProperty(sg1203);
        this.sg1204 = new SimpleIntegerProperty(sg1204);
        this.sg1205 = new SimpleIntegerProperty(sg1205);
        this.sg1206 = new SimpleIntegerProperty(sg1206);
        this.sg1207 = new SimpleIntegerProperty(sg1207);
        this.sg1208 = new SimpleIntegerProperty(sg1208);
        this.sg1209 = new SimpleIntegerProperty(sg1209);
        this.sg1210 = new SimpleIntegerProperty(sg1210);
        this.sg1211 = new SimpleIntegerProperty(sg1211);
        this.sg1212 = new SimpleIntegerProperty(sg1212);
        this.sg1213 = new SimpleIntegerProperty(sg1213);
        this.sg1214 = new SimpleIntegerProperty(sg1214);
        this.sg1215 = new SimpleIntegerProperty(sg1215);
        this.sg1216 = new SimpleIntegerProperty(sg1216);
        this.sg1217 = new SimpleIntegerProperty(sg1217);
        this.sg1218 = new SimpleIntegerProperty(sg1218);
        this.sg1219 = new SimpleIntegerProperty(sg1219);
        this.sg1220 = new SimpleIntegerProperty(sg1220);
        this.sg1221 = new SimpleIntegerProperty(sg1221);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "sg1201" -> getSg1201();
            case "sg1202" -> getSg1202();
            case "sg1203" -> getSg1203();
            case "sg1204" -> getSg1204();
            case "sg1205" -> getSg1205();
            case "sg1206" -> getSg1206();
            case "sg1207" -> getSg1207();
            case "sg1208" -> getSg1208();
            case "sg1209" -> getSg1209();
            case "sg1210" -> getSg1210();
            case "sg1211" -> getSg1211();
            case "sg1212" -> getSg1212();
            case "sg1213" -> getSg1213();
            case "sg1214" -> getSg1214();
            case "sg1215" -> getSg1215();
            case "sg1216" -> getSg1216();
            case "sg1217" -> getSg1217();
            case "sg1218" -> getSg1218();
            case "sg1219" -> getSg1219();
            case "sg1220" -> getSg1220();
            case "sg1221" -> getSg1221();
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

    // 1.Walther MPK – sg1201
    public int getSg1201() {
        return sg1201.get();
    }

    public void setSg1201(int sg1201) {
        this.sg1201.set(sg1201);
    }

    // 2.ПП-91 «Кедр» – sg1202
    public int getSg1202() {
        return sg1202.get();
    }

    public void setSg1202(int sg1202) {
        this.sg1202.set(sg1202);
    }

    // 3.Vz.68 Scorpion – sg1203
    public int getSg1203() {
        return sg1203.get();
    }

    public void setSg1203(int sg1203) {
        this.sg1203.set(sg1203);
    }

    // 4.«Гепард» – sg1204
    public int getSg1204() {
        return sg1204.get();
    }

    public void setSg1204(int sg1204) {
        this.sg1204.set(sg1204);
    }

    // 5.IMI Uzi – sg1205
    public int getSg1205() {
        return sg1205.get();
    }

    public void setSg1205(int sg1205) {
        this.sg1205.set(sg1205);
    }

    // 6.ПП-2000 – sg1206
    public int getSg1206() {
        return sg1206.get();
    }

    public void setSg1206(int sg1206) {
        this.sg1206.set(sg1206);
    }

    // 7.АЕК-919К «Каштан» – sg1207
    public int getSg1207() {
        return sg1207.get();
    }

    public void setSg1207(int sg1207) {
        this.sg1207.set(sg1207);
    }

    // 8.Spectre M4 – sg1208
    public int getSg1208() {
        return sg1208.get();
    }

    public void setSg1208(int sg1208) {
        this.sg1208.set(sg1208);
    }

    // 9.СР-2М «Вереск» – sg1209
    public int getSg1209() {
        return sg1209.get();
    }

    public void setSg1209(int sg1209) {
        this.sg1209.set(sg1209);
    }

    // 10.ПП-19-01 «Витязь» – sg1210
    public int getSg1210() {
        return sg1210.get();
    }

    public void setSg1210(int sg1210) {
        this.sg1210.set(sg1210);
    }

    // 11.ПП-19 «Бизон-2-01» – sg1211
    public int getSg1211() {
        return sg1211.get();
    }

    public void setSg1211(int sg1211) {
        this.sg1211.set(sg1211);
    }

    // 12.HK UMP45 – sg1212
    public int getSg1212() {
        return sg1212.get();
    }

    public void setSg1212(int sg1212) {
        this.sg1212.set(sg1212);
    }

    // 13.СР-3 «Вихрь» – sg1213
    public int getSg1213() {
        return sg1213.get();
    }

    public void setSg1213(int sg1213) {
        this.sg1213.set(sg1213);
    }

    // 14.«Витязь-СН» – sg1214
    public int getSg1214() {
        return sg1214.get();
    }

    public void setSg1214(int sg1214) {
        this.sg1214.set(sg1214);
    }

    // 15.FN P90 – sg1215
    public int getSg1215() {
        return sg1215.get();
    }

    public void setSg1215(int sg1215) {
        this.sg1215.set(sg1215);
    }

    // 16.Beretta Mx4 Storm – sg1216
    public int getSg1216() {
        return sg1216.get();
    }

    public void setSg1216(int sg1216) {
        this.sg1216.set(sg1216);
    }

    // 17.HK MP5 – sg1217
    public int getSg1217() {
        return sg1217.get();
    }

    public void setSg1217(int sg1217) {
        this.sg1217.set(sg1217);
    }

    // 18.СР-3М – sg1218
    public int getSg1218() {
        return sg1218.get();
    }

    public void setSg1218(int sg1218) {
        this.sg1218.set(sg1218);
    }

    // 19.ППК-20 – sg1219
    public int getSg1219() {
        return sg1219.get();
    }

    public void setSg1219(int sg1219) {
        this.sg1219.set(sg1219);
    }

    // 20.TDI KRISS Vector – sg1220
    public int getSg1220() {
        return sg1220.get();
    }

    public void setSg1220(int sg1220) {
        this.sg1220.set(sg1220);
    }

    // 21.Scorpion EVO III – sg1221
    public int getSg1221() {
        return sg1221.get();
    }

    public void setSg1221(int sg1221) {
        this.sg1221.set(sg1221);
    }
}
