package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MagazinesCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty m3201, m3202, m3203, m3204, m3205, m3206, m3207, m3208, m3209, m3210,
                                  m3211, m3212, m3213, m3214, m3215, m3216, m3217, m3218, m3219, m3220,
                                  m3221, m3222, m3223, m3224, m3225, m3226, m3227, m3228, m3229, m3230,
                                  m3231;

    public MagazinesCount(Integer idPerson, String nicknamePerson,
                          Integer m3201, Integer m3202, Integer m3203, Integer m3204, Integer m3205,
                          Integer m3206, Integer m3207, Integer m3208, Integer m3209, Integer m3210,
                          Integer m3211, Integer m3212, Integer m3213, Integer m3214, Integer m3215,
                          Integer m3216, Integer m3217, Integer m3218, Integer m3219, Integer m3220,
                          Integer m3221, Integer m3222, Integer m3223, Integer m3224, Integer m3225,
                          Integer m3226, Integer m3227, Integer m3228, Integer m3229, Integer m3230,
                          Integer m3231) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.m3201 = new SimpleIntegerProperty(m3201);
        this.m3202 = new SimpleIntegerProperty(m3202);
        this.m3203 = new SimpleIntegerProperty(m3203);
        this.m3204 = new SimpleIntegerProperty(m3204);
        this.m3205 = new SimpleIntegerProperty(m3205);
        this.m3206 = new SimpleIntegerProperty(m3206);
        this.m3207 = new SimpleIntegerProperty(m3207);
        this.m3208 = new SimpleIntegerProperty(m3208);
        this.m3209 = new SimpleIntegerProperty(m3209);
        this.m3210 = new SimpleIntegerProperty(m3210);
        this.m3211 = new SimpleIntegerProperty(m3211);
        this.m3212 = new SimpleIntegerProperty(m3212);
        this.m3213 = new SimpleIntegerProperty(m3213);
        this.m3214 = new SimpleIntegerProperty(m3214);
        this.m3215 = new SimpleIntegerProperty(m3215);
        this.m3216 = new SimpleIntegerProperty(m3216);
        this.m3217 = new SimpleIntegerProperty(m3217);
        this.m3218 = new SimpleIntegerProperty(m3218);
        this.m3219 = new SimpleIntegerProperty(m3219);
        this.m3220 = new SimpleIntegerProperty(m3220);
        this.m3221 = new SimpleIntegerProperty(m3221);
        this.m3222 = new SimpleIntegerProperty(m3222);
        this.m3223 = new SimpleIntegerProperty(m3223);
        this.m3224 = new SimpleIntegerProperty(m3224);
        this.m3225 = new SimpleIntegerProperty(m3225);
        this.m3226 = new SimpleIntegerProperty(m3226);
        this.m3227 = new SimpleIntegerProperty(m3227);
        this.m3228 = new SimpleIntegerProperty(m3228);
        this.m3229 = new SimpleIntegerProperty(m3229);
        this.m3230 = new SimpleIntegerProperty(m3230);
        this.m3231 = new SimpleIntegerProperty(m3231);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "m3201" -> getM3201();
            case "m3202" -> getM3202();
            case "m3203" -> getM3203();
            case "m3204" -> getM3204();
            case "m3205" -> getM3205();
            case "m3206" -> getM3206();
            case "m3207" -> getM3207();
            case "m3208" -> getM3208();
            case "m3209" -> getM3209();
            case "m3210" -> getM3210();
            case "m3211" -> getM3211();
            case "m3212" -> getM3212();
            case "m3213" -> getM3213();
            case "m3214" -> getM3214();
            case "m3215" -> getM3215();
            case "m3216" -> getM3216();
            case "m3217" -> getM3217();
            case "m3218" -> getM3218();
            case "m3219" -> getM3219();
            case "m3220" -> getM3220();
            case "m3221" -> getM3221();
            case "m3222" -> getM3222();
            case "m3223" -> getM3223();
            case "m3224" -> getM3224();
            case "m3225" -> getM3225();
            case "m3226" -> getM3226();
            case "m3227" -> getM3227();
            case "m3228" -> getM3228();
            case "m3229" -> getM3229();
            case "m3230" -> getM3230();
            case "m3231" -> getM3231();
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

    // 1.Увеличенный магазин ПМ/ПБ – m3201
    public int getM3201() {
        return m3201.get();
    }

    public void setM3201(int m3201) {
        this.m3201.set(m3201);
    }

    // 2.Увеличенный магазин Browning – m3202
    public int getM3202() {
        return m3202.get();
    }

    public void setM3202(int m3202) {
        this.m3202.set(m3202);
    }

    // 3.Увеличенный магазин Форт-12 – m3203
    public int getM3203() {
        return m3203.get();
    }

    public void setM3203(int m3203) {
        this.m3203.set(m3203);
    }

    // 4.Магазин 5.56 NATO STANAG – m3204
    public int getM3204() {
        return m3204.get();
    }

    public void setM3204(int m3204) {
        this.m3204.set(m3204);
    }

    // 5.Увеличенный магазин Colt – m3205
    public int getM3205() {
        return m3205.get();
    }

    public void setM3205(int m3205) {
        this.m3205.set(m3205);
    }

    // 6.Магазин 5.45 PMAG, черный – m3206
    public int getM3206() {
        return m3206.get();
    }

    public void setM3206(int m3206) {
        this.m3206.set(m3206);
    }

    // 7.Магазин 5.56 NATO STANAG – m3207
    public int getM3207() {
        return m3207.get();
    }

    public void setM3207(int m3207) {
        this.m3207.set(m3207);
    }

    // 8.Удлинитель магазина МР-133/МР-153 – m3208
    public int getM3208() {
        return m3208.get();
    }

    public void setM3208(int m3208) {
        this.m3208.set(m3208);
    }

    // 9.Барабанный магазин X-5 – m3209
    public int getM3209() {
        return m3209.get();
    }

    public void setM3209(int m3209) {
        this.m3209.set(m3209);
    }

    // 10.Увеличенный магазин Beretta – m3210
    public int getM3210() {
        return m3210.get();
    }

    public void setM3210(int m3210) {
        this.m3210.set(m3210);
    }

    // 11.Магазин 5.45 бакелитовый – m3211
    public int getM3211() {
        return m3211.get();
    }

    public void setM3211(int m3211) {
        this.m3211.set(m3211);
    }

    // 12.Магазин 7.62 бакелитовый – m3212
    public int getM3212() {
        return m3212.get();
    }

    public void setM3212(int m3212) {
        this.m3212.set(m3212);
    }

    // 13.Магазин 5.56 NATO PMAG, черный – m3213
    public int getM3213() {
        return m3213.get();
    }

    public void setM3213(int m3213) {
        this.m3213.set(m3213);
    }

    // 14.Магазин 5.45 пластиковый – m3214
    public int getM3214() {
        return m3214.get();
    }

    public void setM3214(int m3214) {
        this.m3214.set(m3214);
    }

    // 15.Магазин 5.45 «Вафля» – m3215
    public int getM3215() {
        return m3215.get();
    }

    public void setM3215(int m3215) {
        this.m3215.set(m3215);
    }

    // 16.Магазин 7.62 пластиковый – m3216
    public int getM3216() {
        return m3216.get();
    }

    public void setM3216(int m3216) {
        this.m3216.set(m3216);
    }

    // 17.Магазин АКМ десантный – m3217
    public int getM3217() {
        return m3217.get();
    }

    public void setM3217(int m3217) {
        this.m3217.set(m3217);
    }

    // 18.Магазин 5.56 NATO STANAG – m3218
    public int getM3218() {
        return m3218.get();
    }

    public void setM3218(int m3218) {
        this.m3218.set(m3218);
    }

    // 19.Магазин EMAG – m3219
    public int getM3219() {
        return m3219.get();
    }

    public void setM3219(int m3219) {
        this.m3219.set(m3219);
    }

    // 20.Магазин 5.56 Pufgun, черный – m3220
    public int getM3220() {
        return m3220.get();
    }

    public void setM3220(int m3220) {
        this.m3220.set(m3220);
    }

    // 21.Магазин 5.45 – m3221
    public int getM3221() {
        return m3221.get();
    }

    public void setM3221(int m3221) {
        this.m3221.set(m3221);
    }

    // 22.Магазин MAG SG545 – m3222
    public int getM3222() {
        return m3222.get();
    }

    public void setM3222(int m3222) {
        this.m3222.set(m3222);
    }

    // 23.Увеличенный магазин ОЦ-14 – m3223
    public int getM3223() {
        return m3223.get();
    }

    public void setM3223(int m3223) {
        this.m3223.set(m3223);
    }

    // 24.Магазин эргономичный для ВСС/Вал – m3224
    public int getM3224() {
        return m3224.get();
    }

    public void setM3224(int m3224) {
        this.m3224.set(m3224);
    }

    // 25.Магазин Magpul PMAG 7.62x39 – m3225
    public int getM3225() {
        return m3225.get();
    }

    public void setM3225(int m3225) {
        this.m3225.set(m3225);
    }

    // 26.Магазин 5.56 NATO STANAG – m3226
    public int getM3226() {
        return m3226.get();
    }

    public void setM3226(int m3226) {
        this.m3226.set(m3226);
    }

    // 27.Магазин PMAG GEN2 M2 MOE – m3227
    public int getM3227() {
        return m3227.get();
    }

    public void setM3227(int m3227) {
        this.m3227.set(m3227);
    }

    // 28.Увеличенный магазин «Кобра» – m3228
    public int getM3228() {
        return m3228.get();
    }

    public void setM3228(int m3228) {
        this.m3228.set(m3228);
    }

    // 29.Увеличенный магазин АШ-12 – m3229
    public int getM3229() {
        return m3229.get();
    }

    public void setM3229(int m3229) {
        this.m3229.set(m3229);
    }

    // 30.Увеличенный магазин для ВСС/Вал – m3230
    public int getM3230() {
        return m3230.get();
    }

    public void setM3230(int m3230) {
        this.m3230.set(m3230);
    }

    // 31.Барабанный магазин G3/M1A – m3231
    public int getM3231() {
        return m3231.get();
    }

    public void setM3231(int m3231) {
        this.m3231.set(m3231);
    }
}
