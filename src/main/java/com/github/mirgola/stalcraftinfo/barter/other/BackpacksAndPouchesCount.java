package com.github.mirgola.stalcraftinfo.barter.other;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BackpacksAndPouchesCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty bap2101, bap2102, bap2103, bap2104, bap2105, bap2106, bap2107, bap2108, bap2109, bap2110,
                                  bap2111, bap2112, bap2113, bap2114, bap2115, bap2116, bap2117;

    public BackpacksAndPouchesCount(Integer idPerson, String nicknamePerson) {
        this(idPerson, nicknamePerson,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0);
    }

    public BackpacksAndPouchesCount(Integer idPerson, String nicknamePerson,
                              Integer bap2101, Integer bap2102, Integer bap2103, Integer bap2104, Integer bap2105,
                              Integer bap2106, Integer bap2107, Integer bap2108, Integer bap2109, Integer bap2110,
                              Integer bap2111, Integer bap2112, Integer bap2113, Integer bap2114, Integer bap2115,
                              Integer bap2116, Integer bap2117) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.bap2101 = new SimpleIntegerProperty(bap2101);
        this.bap2102 = new SimpleIntegerProperty(bap2102);
        this.bap2103 = new SimpleIntegerProperty(bap2103);
        this.bap2104 = new SimpleIntegerProperty(bap2104);
        this.bap2105 = new SimpleIntegerProperty(bap2105);
        this.bap2106 = new SimpleIntegerProperty(bap2106);
        this.bap2107 = new SimpleIntegerProperty(bap2107);
        this.bap2108 = new SimpleIntegerProperty(bap2108);
        this.bap2109 = new SimpleIntegerProperty(bap2109);
        this.bap2110 = new SimpleIntegerProperty(bap2110);
        this.bap2111 = new SimpleIntegerProperty(bap2111);
        this.bap2112 = new SimpleIntegerProperty(bap2112);
        this.bap2113 = new SimpleIntegerProperty(bap2113);
        this.bap2114 = new SimpleIntegerProperty(bap2114);
        this.bap2115 = new SimpleIntegerProperty(bap2115);
        this.bap2116 = new SimpleIntegerProperty(bap2116);
        this.bap2117 = new SimpleIntegerProperty(bap2117);
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "bap2101" -> getBap2101();
            case "bap2102" -> getBap2102();
            case "bap2103" -> getBap2103();
            case "bap2104" -> getBap2104();
            case "bap2105" -> getBap2105();
            case "bap2106" -> getBap2106();
            case "bap2107" -> getBap2107();
            case "bap2108" -> getBap2108();
            case "bap2109" -> getBap2109();
            case "bap2110" -> getBap2110();
            case "bap2111" -> getBap2111();
            case "bap2112" -> getBap2112();
            case "bap2113" -> getBap2113();
            case "bap2114" -> getBap2114();
            case "bap2115" -> getBap2115();
            case "bap2116" -> getBap2116();
            case "bap2117" -> getBap2117();
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

    // 1.Сумка-трансформер – bap2101
    public int getBap2101() {
        return bap2101.get();
    }

    public void setBap2101(int bap2101) {
        this.bap2101.set(bap2101);
    }

    // 2.Вещмешок – bap2102
    public int getBap2102() {
        return bap2102.get();
    }

    public void setBap2102(int bap2102) {
        this.bap2102.set(bap2102);
    }

    // 3.	Спортивная сумка – bap2103
    public int getBap2103() {
        return bap2103.get();
    }

    public void setBap2103(int bap2103) {
        this.bap2103.set(bap2103);
    }

    // 4.Рюкзак Errand Junior - bap2104
    public int getBap2104() {
        return bap2104.get();
    }

    public void setBap2104(int bap2104) {
        this.bap2104.set(bap2104);
    }

    // 5.Рюкзак «Хелбой» - bap2105
    public int getBap2105() {
        return bap2105.get();
    }

    public void setBap2105(int bap2105) {
        this.bap2105.set(bap2105);
    }

    // 6.Поясная сумка PROTECT 3B - bap2106
    public int getBap2106() {
        return bap2106.get();
    }

    public void setBap2106(int bap2106) {
        this.bap2106.set(bap2106);
    }

    // 7.Рюкзак MBSS – bap2107
    public int getBap2107() {
        return bap2107.get();
    }

    public void setBap2107(int bap2107) {
        this.bap2107.set(bap2107);
    }

    // 8.Рюкзак «Хелбой-У» - bap2108
    public int getBap2108() {
        return bap2108.get();
    }

    public void setBap2108(int bap2108) {
        this.bap2108.set(bap2108);
    }

    // 9.Подсумок Black Eagle B-33 – bap2109
    public int getBap2109() {
        return bap2109.get();
    }

    public void setBap2109(int bap2109) {
        this.bap2109.set(bap2109);
    }

    // 10.Штурмовой рюкзак Tri-Zip – bap2110
    public int getBap2110() {
        return bap2110.get();
    }

    public void setBap2110(int bap2110) {
        this.bap2110.set(bap2110);
    }

    // 11.Рюкзак NPA – bap2111
    public int getBap2111() {
        return bap2111.get();
    }

    public void setBap2111(int bap2111) {
        this.bap2111.set(bap2111);
    }

    // 12.Разгрузка Black Eagle Y-73 – bap2112
    public int getBap2112() {
        return bap2112.get();
    }

    public void setBap2112(int bap2112) {
        this.bap2112.set(bap2112);
    }

    // 13.Советский походный рюкзак – bap2113
    public int getBap2113() {
        return bap2113.get();
    }

    public void setBap2113(int bap2113) {
        this.bap2113.set(bap2113);
    }

    // 14.Ягдташ – bap2114
    public int getBap2114() {
        return bap2114.get();
    }

    public void setBap2114(int bap2114) {
        this.bap2114.set(bap2114);
    }

    // 15.Разгрузка ADR-WRBT – bap2115
    public int getBap2115() {
        return bap2115.get();
    }

    public void setBap2115(int bap2115) {
        this.bap2115.set(bap2115);
    }

    // 16.Рюкзак Secret Valley 35 – bap2116
    public int getBap2116() {
        return bap2116.get();
    }

    public void setBap2116(int bap2116) {
        this.bap2116.set(bap2116);
    }

    // 17.Рюкзак «Гроб» - bap2117
    public int getBap2117() {
        return bap2117.get();
    }

    public void setBap2117(int bap2117) {
        this.bap2117.set(bap2117);
    }
}
