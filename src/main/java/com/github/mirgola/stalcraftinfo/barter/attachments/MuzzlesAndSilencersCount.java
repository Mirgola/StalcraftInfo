package com.github.mirgola.stalcraftinfo.barter.attachments;

import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MuzzlesAndSilencersCount implements BarterCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty mas3101, mas3102, mas3103, mas3104, mas3105, mas3106, mas3107, mas3108, mas3109, mas3110,
                                  mas3111, mas3112, mas3113, mas3114, mas3115, mas3116, mas3117, mas3118, mas3119, mas3120,
                                  mas3121, mas3122, mas3123, mas3124, mas3125, mas3126, mas3127, mas3128, mas3129, mas3130,
                                  mas3131, mas3132, mas3133, mas3134, mas3135, mas3136, mas3137, mas3138, mas3139, mas3140,
                                  mas3141, mas3142, mas3143, mas3144, mas3145, mas3146, mas3147, mas3148, mas3149, mas3150,
                                  mas3151, mas3152, mas3153, mas3154;

    public MuzzlesAndSilencersCount(Integer idPerson, String nicknamePerson,
                                    Integer mas3101, Integer mas3102, Integer mas3103, Integer mas3104, Integer mas3105,
                                    Integer mas3106, Integer mas3107, Integer mas3108, Integer mas3109, Integer mas3110,
                                    Integer mas3111, Integer mas3112, Integer mas3113, Integer mas3114, Integer mas3115,
                                    Integer mas3116, Integer mas3117, Integer mas3118, Integer mas3119, Integer mas3120,
                                    Integer mas3121, Integer mas3122, Integer mas3123, Integer mas3124, Integer mas3125,
                                    Integer mas3126, Integer mas3127, Integer mas3128, Integer mas3129, Integer mas3130,
                                    Integer mas3131, Integer mas3132, Integer mas3133, Integer mas3134, Integer mas3135,
                                    Integer mas3136, Integer mas3137, Integer mas3138, Integer mas3139, Integer mas3140,
                                    Integer mas3141, Integer mas3142, Integer mas3143, Integer mas3144, Integer mas3145,
                                    Integer mas3146, Integer mas3147, Integer mas3148, Integer mas3149, Integer mas3150,
                                    Integer mas3151, Integer mas3152, Integer mas3153, Integer mas3154) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.mas3101 = new SimpleIntegerProperty(mas3101);
        this.mas3102 = new SimpleIntegerProperty(mas3102);
        this.mas3103 = new SimpleIntegerProperty(mas3103);
        this.mas3104 = new SimpleIntegerProperty(mas3104);
        this.mas3105 = new SimpleIntegerProperty(mas3105);
        this.mas3106 = new SimpleIntegerProperty(mas3106);
        this.mas3107 = new SimpleIntegerProperty(mas3107);
        this.mas3108 = new SimpleIntegerProperty(mas3108);
        this.mas3109 = new SimpleIntegerProperty(mas3109);
        this.mas3110 = new SimpleIntegerProperty(mas3110);
        this.mas3111 = new SimpleIntegerProperty(mas3111);
        this.mas3112 = new SimpleIntegerProperty(mas3112);
        this.mas3113 = new SimpleIntegerProperty(mas3113);
        this.mas3114 = new SimpleIntegerProperty(mas3114);
        this.mas3115 = new SimpleIntegerProperty(mas3115);
        this.mas3116 = new SimpleIntegerProperty(mas3116);
        this.mas3117 = new SimpleIntegerProperty(mas3117);
        this.mas3118 = new SimpleIntegerProperty(mas3118);
        this.mas3119 = new SimpleIntegerProperty(mas3119);
        this.mas3120 = new SimpleIntegerProperty(mas3120);
        this.mas3121 = new SimpleIntegerProperty(mas3121);
        this.mas3122 = new SimpleIntegerProperty(mas3122);
        this.mas3123 = new SimpleIntegerProperty(mas3123);
        this.mas3124 = new SimpleIntegerProperty(mas3124);
        this.mas3125 = new SimpleIntegerProperty(mas3125);
        this.mas3126 = new SimpleIntegerProperty(mas3126);
        this.mas3127 = new SimpleIntegerProperty(mas3127);
        this.mas3128 = new SimpleIntegerProperty(mas3128);
        this.mas3129 = new SimpleIntegerProperty(mas3129);
        this.mas3130 = new SimpleIntegerProperty(mas3130);
        this.mas3131 = new SimpleIntegerProperty(mas3131);
        this.mas3132 = new SimpleIntegerProperty(mas3132);
        this.mas3133 = new SimpleIntegerProperty(mas3133);
        this.mas3134 = new SimpleIntegerProperty(mas3134);
        this.mas3135 = new SimpleIntegerProperty(mas3135);
        this.mas3136 = new SimpleIntegerProperty(mas3136);
        this.mas3137 = new SimpleIntegerProperty(mas3137);
        this.mas3138 = new SimpleIntegerProperty(mas3138);
        this.mas3139 = new SimpleIntegerProperty(mas3139);
        this.mas3140 = new SimpleIntegerProperty(mas3140);
        this.mas3141 = new SimpleIntegerProperty(mas3141);
        this.mas3142 = new SimpleIntegerProperty(mas3142);
        this.mas3143 = new SimpleIntegerProperty(mas3143);
        this.mas3144 = new SimpleIntegerProperty(mas3144);
        this.mas3145 = new SimpleIntegerProperty(mas3145);
        this.mas3146 = new SimpleIntegerProperty(mas3146);
        this.mas3147 = new SimpleIntegerProperty(mas3147);
        this.mas3148 = new SimpleIntegerProperty(mas3148);
        this.mas3149 = new SimpleIntegerProperty(mas3149);
        this.mas3150 = new SimpleIntegerProperty(mas3150);
        this.mas3151 = new SimpleIntegerProperty(mas3151);
        this.mas3152 = new SimpleIntegerProperty(mas3152);
        this.mas3153 = new SimpleIntegerProperty(mas3153);
        this.mas3154 = new SimpleIntegerProperty(mas3154);
                
    }

    public int getCountByWeaponId(String id) {
        return switch(id) {
            case "mas3101" -> getMas3101();
            case "mas3102" -> getMas3102();
            case "mas3103" -> getMas3103();
            case "mas3104" -> getMas3104();
            case "mas3105" -> getMas3105();
            case "mas3106" -> getMas3106();
            case "mas3107" -> getMas3107();
            case "mas3108" -> getMas3108();
            case "mas3109" -> getMas3109();
            case "mas3110" -> getMas3110();
            case "mas3111" -> getMas3111();
            case "mas3112" -> getMas3112();
            case "mas3113" -> getMas3113();
            case "mas3114" -> getMas3114();
            case "mas3115" -> getMas3115();
            case "mas3116" -> getMas3116();
            case "mas3117" -> getMas3117();
            case "mas3118" -> getMas3118();
            case "mas3119" -> getMas3119();
            case "mas3120" -> getMas3120();
            case "mas3121" -> getMas3121();
            case "mas3122" -> getMas3122();
            case "mas3123" -> getMas3123();
            case "mas3124" -> getMas3124();
            case "mas3125" -> getMas3125();
            case "mas3126" -> getMas3126();
            case "mas3127" -> getMas3127();
            case "mas3128" -> getMas3128();
            case "mas3129" -> getMas3129();
            case "mas3130" -> getMas3130();
            case "mas3131" -> getMas3131();
            case "mas3132" -> getMas3132();
            case "mas3133" -> getMas3133();
            case "mas3134" -> getMas3134();
            case "mas3135" -> getMas3135();
            case "mas3136" -> getMas3136();
            case "mas3137" -> getMas3137();
            case "mas3138" -> getMas3138();
            case "mas3139" -> getMas3139();
            case "mas3140" -> getMas3140();
            case "mas3141" -> getMas3141();
            case "mas3142" -> getMas3142();
            case "mas3143" -> getMas3143();
            case "mas3144" -> getMas3144();
            case "mas3145" -> getMas3145();
            case "mas3146" -> getMas3146();
            case "mas3147" -> getMas3147();
            case "mas3148" -> getMas3148();
            case "mas3149" -> getMas3149();
            case "mas3150" -> getMas3150();
            case "mas3151" -> getMas3151();
            case "mas3152" -> getMas3152();
            case "mas3153" -> getMas3153();
            case "mas3154" -> getMas3154();
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

    // 1.Пламегаситель Noveske KX3 – mas3101
    public int getMas3101() {
        return mas3101.get();
    }

    public void setMas3101(int mas3101) {
        this.mas3101.set(mas3101);
    }

    // 2.Resistance Armament Compensator - mas3102
    public int getMas3102() {
        return mas3102.get();
    }

    public void setMas3102(int mas3102) {
        this.mas3102.set(mas3102);
    }

    // 3.MICRO BADGER - mas3103
    public int getMas3103() {
        return mas3103.get();
    }

    public void setMas3103(int mas3103) {
        this.mas3103.set(mas3103);
    }

    // 4.VR-09 - mas3104
    public int getMas3104() {
        return mas3104.get();
    }

    public void setMas3104(int mas3104) {
        this.mas3104.set(mas3104);
    }

    // 5.Пламегаситель AKademia Тьма - mas3105
    public int getMas3105() {
        return mas3105.get();
    }

    public void setMas3105(int mas3105) {
        this.mas3105.set(mas3105);
    }

    // 6.ДТК-2 - mas3106
    public int getMas3106() {
        return mas3106.get();
    }

    public void setMas3106(int mas3106) {
        this.mas3106.set(mas3106);
    }

    // 7.CMMG SV Brake 7.62x51 - mas3107
    public int getMas3107() {
        return mas3107.get();
    }

    public void setMas3107(int mas3107) {
        this.mas3107.set(mas3107);
    }

    // 8.Diamondhead Compensator - mas3108
    public int getMas3108() {
        return mas3108.get();
    }

    public void setMas3108(int mas3108) {
        this.mas3108.set(mas3108);
    }

    // 9.Precision Armament M11 Severe Duty 7.62x51 - mas3109
    public int getMas3109() {
        return mas3109.get();
    }

    public void setMas3109(int mas3109) {
        this.mas3109.set(mas3109);
    }

    // 10.Hera Arms CC Compensator - mas3110
    public int getMas3110() {
        return mas3110.get();
    }

    public void setMas3110(int mas3110) {
        this.mas3110.set(mas3110);
    }

    // 11.Пламегаситель LoneWolf - mas3111
    public int getMas3111() {
        return mas3111.get();
    }

    public void setMas3111(int mas3111) {
        this.mas3111.set(mas3111);
    }

    // 12.Port Mini Compensator - mas3112
    public int getMas3112() {
        return mas3112.get();
    }

    public void setMas3112(int mas3112) {
        this.mas3112.set(mas3112);
    }

    // 13.Spikes Tactical Dynacomp - mas3113
    public int getMas3113() {
        return mas3113.get();
    }

    public void setMas3113(int mas3113) {
        this.mas3113.set(mas3113);
    }

    // 14.ДТК «Вихрь» - mas3114
    public int getMas3114() {
        return mas3114.get();
    }

    public void setMas3114(int mas3114) {
        this.mas3114.set(mas3114);
    }

    // 15.АКМЛ - mas3115
    public int getMas3115() {
        return mas3115.get();
    }

    public void setMas3115(int mas3115) {
        this.mas3115.set(mas3115);
    }

    // 16.ДТК-1 - mas3116
    public int getMas3116() {
        return mas3116.get();
    }

    public void setMas3116(int mas3116) {
        this.mas3116.set(mas3116);
    }

    // 17.Глушитель SCAR-SD - mas3117
    public int getMas3117() {
        return mas3117.get();
    }

    public void setMas3117(int mas3117) {
        this.mas3117.set(mas3117);
    }

    // 18.Keeno Arms SHREWD 7.62x51 - mas3118
    public int getMas3118() {
        return mas3118.get();
    }

    public void setMas3118(int mas3118) {
        this.mas3118.set(mas3118);
    }

    // 19.Глушитель SureFire SOCOM556-RC2 - mas3119
    public int getMas3119() {
        return mas3119.get();
    }

    public void setMas3119(int mas3119) {
        this.mas3119.set(mas3119);
    }

    // 20.HK BLITZ 5.56 - mas3120
    public int getMas3120() {
        return mas3120.get();
    }

    public void setMas3120(int mas3120) {
        this.mas3120.set(mas3120);
    }

    // 21.SureFire Pro Comp 7.62x51 - mas3121
    public int getMas3121() {
        return mas3121.get();
    }

    public void setMas3121(int mas3121) {
        this.mas3121.set(mas3121);
    }

    // 22.AlienTech 5.56 - mas3122
    public int getMas3122() {
        return mas3122.get();
    }

    public void setMas3122(int mas3122) {
        this.mas3122.set(mas3122);
    }

    // 23.Глушитель SUPRA K-8 С.К.О.С. - mas3123
    public int getMas3123() {
        return mas3123.get();
    }

    public void setMas3123(int mas3123) {
        this.mas3123.set(mas3123);
    }

    // 24.Custom Guns Doncaster - mas3124
    public int getMas3124() {
        return mas3124.get();
    }

    public void setMas3124(int mas3124) {
        this.mas3124.set(mas3124);
    }

    // 25.Hi-Point Razor - mas3125
    public int getMas3125() {
        return mas3125.get();
    }

    public void setMas3125(int mas3125) {
        this.mas3125.set(mas3125);
    }

    // 26.SPVV 7.62 - mas3126
    public int getMas3126() {
        return mas3126.get();
    }

    public void setMas3126(int mas3126) {
        this.mas3126.set(mas3126);
    }

    // 27.ПБС-4 - mas3127
    public int getMas3127() {
        return mas3127.get();
    }

    public void setMas3127(int mas3127) {
        this.mas3127.set(mas3127);
    }

    // 28.SRVV MBR Jet - mas3128
    public int getMas3128() {
        return mas3128.get();
    }

    public void setMas3128(int mas3128) {
        this.mas3128.set(mas3128);
    }

    // 29.ДТК «Косой» - mas3129
    public int getMas3129() {
        return mas3129.get();
    }

    public void setMas3129(int mas3129) {
        this.mas3129.set(mas3129);
    }

    // 30.PWS CQB 74 - mas3130
    public int getMas3130() {
        return mas3130.get();
    }

    public void setMas3130(int mas3130) {
        this.mas3130.set(mas3130);
    }

    // 31.ПБС-1 - mas3131
    public int getMas3131() {
        return mas3131.get();
    }

    public void setMas3131(int mas3131) {
        this.mas3131.set(mas3131);
    }

    // 32.SIG Sauer SRD762Ti - mas3132
    public int getMas3132() {
        return mas3132.get();
    }

    public void setMas3132(int mas3132) {
        this.mas3132.set(mas3132);
    }

    // 33.VG6 EPSILON 762 Muzzle Brake - mas3133
    public int getMas3133() {
        return mas3133.get();
    }

    public void setMas3133(int mas3133) {
        this.mas3133.set(mas3133);
    }

    // 34.Глушитель KAC Style QD - mas3134
    public int getMas3134() {
        return mas3134.get();
    }

    public void setMas3134(int mas3134) {
        this.mas3134.set(mas3134);
    }

    // 35.VG6 EPSILON 556 Muzzle Brake - mas3135
    public int getMas3135() {
        return mas3135.get();
    }

    public void setMas3135(int mas3135) {
        this.mas3135.set(mas3135);
    }

    // 36.Odin Works ATLAS 7.62x51 - mas3136
    public int getMas3136() {
        return mas3136.get();
    }

    public void setMas3136(int mas3136) {
        this.mas3136.set(mas3136);
    }

    // 37.Bulletec ST-6012 - mas3137
    public int getMas3137() {
        return mas3137.get();
    }

    public void setMas3137(int mas3137) {
        this.mas3137.set(mas3137);
    }

    // 38.Глушитель Osprey - mas3138
    public int getMas3138() {
        return mas3138.get();
    }

    public void setMas3138(int mas3138) {
        this.mas3138.set(mas3138);
    }

    // 39.Удлиненный ствол 9 мм - mas3139
    public int getMas3139() {
        return mas3139.get();
    }

    public void setMas3139(int mas3139) {
        this.mas3139.set(mas3139);
    }

    // 40.GE-OCTO Gunethics - mas3140
    public int getMas3140() {
        return mas3140.get();
    }

    public void setMas3140(int mas3140) {
        this.mas3140.set(mas3140);
    }

    // 41.Рукоятка для ОЦ-14 «Гроза» - mas3141
    public int getMas3141() {
        return mas3141.get();
    }

    public void setMas3141(int mas3141) {
        this.mas3141.set(mas3141);
    }

    // 42.Venom Tactical Antidote - mas3142
    public int getMas3142() {
        return mas3142.get();
    }

    public void setMas3142(int mas3142) {
        this.mas3142.set(mas3142);
    }

    // 43.Имкас ПСУЗВ–11ТМ.12 - mas3143
    public int getMas3143() {
        return mas3143.get();
    }

    public void setMas3143(int mas3143) {
        this.mas3143.set(mas3143);
    }

    // 44.ДТК Цитадель 5.45 - mas3144
    public int getMas3144() {
        return mas3144.get();
    }

    public void setMas3144(int mas3144) {
        this.mas3144.set(mas3144);
    }

    // 45.Jmac Customs RDC 4C 7.62 - mas3145
    public int getMas3145() {
        return mas3145.get();
    }

    public void setMas3145(int mas3145) {
        this.mas3145.set(mas3145);
    }

    // 46.Jmac Customs RDC 4C 5.45 - mas3146
    public int getMas3146() {
        return mas3146.get();
    }

    public void setMas3146(int mas3146) {
        this.mas3146.set(mas3146);
    }

    // 47.Глушитель АТГ - mas3147
    public int getMas3147() {
        return mas3147.get();
    }

    public void setMas3147(int mas3147) {
        this.mas3147.set(mas3147);
    }

    // 48.Глушитель для ОЦ-14 «Гроза» - mas3148
    public int getMas3148() {
        return mas3148.get();
    }

    public void setMas3148(int mas3148) {
        this.mas3148.set(mas3148);
    }

    // 49.Удлиненный ствол D-Eagle VII - mas3149
    public int getMas3149() {
        return mas3149.get();
    }

    public void setMas3149(int mas3149) {
        this.mas3149.set(mas3149);
    }

    // 50.Удлиненный ствол D-Eagle XIX - mas3150
    public int getMas3150() {
        return mas3150.get();
    }

    public void setMas3150(int mas3150) {
        this.mas3150.set(mas3150);
    }

    // 51.Пламегаситель Lantac BMD - mas3151
    public int getMas3151() {
        return mas3151.get();
    }

    public void setMas3151(int mas3151) {
        this.mas3151.set(mas3151);
    }

    // 52.Пламегаситель Lantac Dragon 7.62 - mas3152
    public int getMas3152() {
        return mas3152.get();
    }

    public void setMas3152(int mas3152) {
        this.mas3152.set(mas3152);
    }

    // 53.ДТК АШ-12 - mas3153
    public int getMas3153() {
        return mas3153.get();
    }

    public void setMas3153(int mas3153) {
        this.mas3153.set(mas3153);
    }

    // 54.Глушитель АШ-12/МЦ-558 - mas3154
    public int getMas3154() {
        return mas3154.get();
    }

    public void setMas3154(int mas3154) {
        this.mas3154.set(mas3154);
    }
}
