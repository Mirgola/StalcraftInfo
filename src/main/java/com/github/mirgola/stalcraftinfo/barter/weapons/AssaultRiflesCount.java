package com.github.mirgola.stalcraftinfo.barter.weapons;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AssaultRiflesCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty ar1101, ar1102, ar1103, ar1104, ar1105, ar1106, ar1107, ar1108, ar1109, ar1110,
                                  ar1111, ar1112, ar1113, ar1114, ar1115, ar1116, ar1117, ar1118, ar1119, ar1120,
                                  ar1121, ar1122, ar1123, ar1124, ar1125, ar1126, ar1127, ar1128, ar1129, ar1130,
                                  ar1131, ar1132, ar1133, ar1134;

    public AssaultRiflesCount(Integer idPerson, String nicknamePerson,
                              Integer ar1101, Integer ar1102, Integer ar1103, Integer ar1104, Integer ar1105,
                              Integer ar1106, Integer ar1107, Integer ar1108, Integer ar1109, Integer ar1110,
                              Integer ar1111, Integer ar1112, Integer ar1113, Integer ar1114, Integer ar1115,
                              Integer ar1116, Integer ar1117, Integer ar1118, Integer ar1119, Integer ar1120,
                              Integer ar1121, Integer ar1122, Integer ar1123, Integer ar1124, Integer ar1125,
                              Integer ar1126, Integer ar1127, Integer ar1128, Integer ar1129, Integer ar1130,
                              Integer ar1131, Integer ar1132, Integer ar1133, Integer ar1134) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.ar1101 = new SimpleIntegerProperty(ar1101);
        this.ar1102 = new SimpleIntegerProperty(ar1102);
        this.ar1103 = new SimpleIntegerProperty(ar1103);
        this.ar1104 = new SimpleIntegerProperty(ar1104);
        this.ar1105 = new SimpleIntegerProperty(ar1105);
        this.ar1106 = new SimpleIntegerProperty(ar1106);
        this.ar1107 = new SimpleIntegerProperty(ar1107);
        this.ar1108 = new SimpleIntegerProperty(ar1108);
        this.ar1109 = new SimpleIntegerProperty(ar1109);
        this.ar1110 = new SimpleIntegerProperty(ar1110);
        this.ar1111 = new SimpleIntegerProperty(ar1111);
        this.ar1112 = new SimpleIntegerProperty(ar1112);
        this.ar1113 = new SimpleIntegerProperty(ar1113);
        this.ar1114 = new SimpleIntegerProperty(ar1114);
        this.ar1115 = new SimpleIntegerProperty(ar1115);
        this.ar1116 = new SimpleIntegerProperty(ar1116);
        this.ar1117 = new SimpleIntegerProperty(ar1117);
        this.ar1118 = new SimpleIntegerProperty(ar1118);
        this.ar1119 = new SimpleIntegerProperty(ar1119);
        this.ar1120 = new SimpleIntegerProperty(ar1120);
        this.ar1121 = new SimpleIntegerProperty(ar1121);
        this.ar1122 = new SimpleIntegerProperty(ar1122);
        this.ar1123 = new SimpleIntegerProperty(ar1123);
        this.ar1124 = new SimpleIntegerProperty(ar1124);
        this.ar1125 = new SimpleIntegerProperty(ar1125);
        this.ar1126 = new SimpleIntegerProperty(ar1126);
        this.ar1127 = new SimpleIntegerProperty(ar1127);
        this.ar1128 = new SimpleIntegerProperty(ar1128);
        this.ar1129 = new SimpleIntegerProperty(ar1129);
        this.ar1130 = new SimpleIntegerProperty(ar1130);
        this.ar1131 = new SimpleIntegerProperty(ar1131);
        this.ar1132 = new SimpleIntegerProperty(ar1132);
        this.ar1133 = new SimpleIntegerProperty(ar1133);
        this.ar1134 = new SimpleIntegerProperty(ar1134);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "ar1101" -> getAr1101();
            case "ar1102" -> getAr1102();
            case "ar1103" -> getAr1103();
            case "ar1104" -> getAr1104();
            case "ar1105" -> getAr1105();
            case "ar1106" -> getAr1106();
            case "ar1107" -> getAr1107();
            case "ar1108" -> getAr1108();
            case "ar1109" -> getAr1109();
            case "ar1110" -> getAr1110();
            case "ar1111" -> getAr1111();
            case "ar1112" -> getAr1112();
            case "ar1113" -> getAr1113();
            case "ar1114" -> getAr1114();
            case "ar1115" -> getAr1115();
            case "ar1116" -> getAr1116();
            case "ar1117" -> getAr1117();
            case "ar1118" -> getAr1118();
            case "ar1119" -> getAr1119();
            case "ar1120" -> getAr1120();
            case "ar1121" -> getAr1121();
            case "ar1122" -> getAr1122();
            case "ar1123" -> getAr1123();
            case "ar1124" -> getAr1124();
            case "ar1125" -> getAr1125();
            case "ar1126" -> getAr1126();
            case "ar1127" -> getAr1127();
            case "ar1128" -> getAr1128();
            case "ar1129" -> getAr1129();
            case "ar1130" -> getAr1130();
            case "ar1131" -> getAr1131();
            case "ar1132" -> getAr1132();
            case "ar1133" -> getAr1133();
            case "ar1134" -> getAr1134();
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

    // 1.АКС-74У – ar1101
    public int getAr1101() {
        return ar1101.get();
    }

    public void setAr1101(int ar1101) {
        this.ar1101.set(ar1101);
    }

    // 2.M16A1 – ar1102
    public int getAr1102() {
        return ar1102.get();
    }

    public void setAr1102(int ar1102) {
        this.ar1102.set(ar1102);
    }

    // 3.АКС-74 – ar1103
    public int getAr1103() {
        return ar1103.get();
    }

    public void setAr1103(int ar1103) {
        this.ar1103.set(ar1103);
    }

    // 4.M16A2 – ar1104
    public int getAr1104() {
        return ar1104.get();
    }

    public void setAr1104(int ar1104) {
        this.ar1104.set(ar1104);
    }

    // 5.АКС чистильщика – ar1105
    public int getAr1105() {
        return ar1105.get();
    }

    public void setAr1105(int ar1105) {
        this.ar1105.set(ar1105);
    }

    // 6.АК-74М – ar1106
    public int getAr1106() {
        return ar1106.get();
    }

    public void setAr1106(int ar1106) {
        this.ar1106.set(ar1106);
    }

    // 7.M16A3 – ar1107
    public int getAr1107() {
        return ar1107.get();
    }

    public void setAr1107(int ar1107) {
        this.ar1107.set(ar1107);
    }

    // 8.АН-94 «Абакан» – ar1108
    public int getAr1108() {
        return ar1108.get();
    }

    public void setAr1108(int ar1108) {
        this.ar1108.set(ar1108);
    }

    // 9.АКМ – ar1109
    public int getAr1109() {
        return ar1109.get();
    }

    public void setAr1109(int ar1109) {
        this.ar1109.set(ar1109);
    }

    // 10.Поношенный SIG SG 550 – ar1110
    public int getAr1110() {
        return ar1110.get();
    }

    public void setAr1110(int ar1110) {
        this.ar1110.set(ar1110);
    }

    // 11.Поношенная L85A1 – ar1111
    public int getAr1111() {
        return ar1111.get();
    }

    public void setAr1111(int ar1111) {
        this.ar1111.set(ar1111);
    }

    // 12.M4A1 – ar1112
    public int getAr1112() {
        return ar1112.get();
    }

    public void setAr1112(int ar1112) {
        this.ar1112.set(ar1112);
    }

    // 13.АН-94М «Абакан» – ar1113
    public int getAr1113() {
        return ar1113.get();
    }

    public void setAr1113(int ar1113) {
        this.ar1113.set(ar1113);
    }

    // 14.АКМ «Тишина» – ar1114
    public int getAr1114() {
        return ar1114.get();
    }

    public void setAr1114(int ar1114) {
        this.ar1114.set(ar1114);
    }

    // 15.АК-103 – ar1115
    public int getAr1115() {
        return ar1115.get();
    }

    public void setAr1115(int ar1115) {
        this.ar1115.set(ar1115);
    }

    // 16.Поношенная HK G3A1 – ar1116
    public int getAr1116() {
        return ar1116.get();
    }

    public void setAr1116(int ar1116) {
        this.ar1116.set(ar1116);
    }

    // 17.SIG SG 550 – ar1117
    public int getAr1117() {
        return ar1117.get();
    }

    public void setAr1117(int ar1117) {
        this.ar1117.set(ar1117);
    }

    // 18.L85A1 – ar1118
    public int getAr1118() {
        return ar1118.get();
    }

    public void setAr1118(int ar1118) {
        this.ar1118.set(ar1118);
    }

    // 19.LWRC M6 – ar1119
    public int getAr1119() {
        return ar1119.get();
    }

    public void setAr1119(int ar1119) {
        this.ar1119.set(ar1119);
    }

    // 20.АЕК-971 – ar1120
    public int getAr1120() {
        return ar1120.get();
    }

    public void setAr1120(int ar1120) {
        this.ar1120.set(ar1120);
    }

    // 21.АС «Вал» – ar1121
    public int getAr1121() {
        return ar1121.get();
    }

    public void setAr1121(int ar1121) {
        this.ar1121.set(ar1121);
    }

    // 22.ОЦ-14 «Гроза» – ar1122
    public int getAr1122() {
        return ar1122.get();
    }

    public void setAr1122(int ar1122) {
        this.ar1122.set(ar1122);
    }

    // 23.АК-203 – ar1123
    public int getAr1123() {
        return ar1123.get();
    }

    public void setAr1123(int ar1123) {
        this.ar1123.set(ar1123);
    }

    // 24.HK G3A1 – ar1124
    public int getAr1124() {
        return ar1124.get();
    }

    public void setAr1124(int ar1124) {
        this.ar1124.set(ar1124);
    }

    // 25.HK G36C – ar1125
    public int getAr1125() {
        return ar1125.get();
    }

    public void setAr1125(int ar1125) {
        this.ar1125.set(ar1125);
    }

    // 26.FN F2000 – ar1126
    public int getAr1126() {
        return ar1126.get();
    }

    public void setAr1126(int ar1126) {
        this.ar1126.set(ar1126);
    }

    // 27.SIG 516 – ar1127
    public int getAr1127() {
        return ar1127.get();
    }

    public void setAr1127(int ar1127) {
        this.ar1127.set(ar1127);
    }

    // 28.А-545 – ar1128
    public int getAr1128() {
        return ar1128.get();
    }

    public void setAr1128(int ar1128) {
        this.ar1128.set(ar1128);
    }

    // 29.АМБ-17 – ar1129
    public int getAr1129() {
        return ar1129.get();
    }

    public void setAr1129(int ar1129) {
        this.ar1129.set(ar1129);
    }

    // 30.АШ-12 – ar1130
    public int getAr1130() {
        return ar1130.get();
    }

    public void setAr1130(int ar1130) {
        this.ar1130.set(ar1130);
    }

    // 31.АК-15 – ar1131
    public int getAr1131() {
        return ar1131.get();
    }

    public void setAr1131(int ar1131) {
        this.ar1131.set(ar1131);
    }

    // 32.FN F2000 Tactical – ar1132
    public int getAr1132() {
        return ar1132.get();
    }

    public void setAr1132(int ar1132) {
        this.ar1132.set(ar1132);
    }

    // 33.KS-1 – ar1133
    public int getAr1133() {
        return ar1133.get();
    }

    public void setAr1133(int ar1133) {
        this.ar1133.set(ar1133);
    }

    // 34.АМ-17 – ar1134
    public int getAr1134() {
        return ar1134.get();
    }

    public void setAr1134(int ar1134) {
        this.ar1134.set(ar1134);
    }
}
