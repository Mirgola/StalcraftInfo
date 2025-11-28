package com.github.mirgola.stalcraftinfo.barter.attachments;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SightsCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty s3401, s3402, s3403, s3404, s3405, s3406, s3407, s3408, s3409, s3410,
                                  s3411, s3412, s3413, s3414, s3415, s3416, s3417, s3418, s3419, s3420,
                                  s3421, s3422, s3423, s3424, s3425, s3426, s3427, s3428, s3429, s3430,
                                  s3431, s3432, s3433, s3434, s3435, s3436;

    public SightsCount(Integer idPerson, String nicknamePerson,
                       Integer s3401, Integer s3402, Integer s3403, Integer s3404, Integer s3405,
                       Integer s3406, Integer s3407, Integer s3408, Integer s3409, Integer s3410,
                       Integer s3411, Integer s3412, Integer s3413, Integer s3414, Integer s3415,
                       Integer s3416, Integer s3417, Integer s3418, Integer s3419, Integer s3420,
                       Integer s3421, Integer s3422, Integer s3423, Integer s3424, Integer s3425,
                       Integer s3426, Integer s3427, Integer s3428, Integer s3429, Integer s3430,
                       Integer s3431, Integer s3432, Integer s3433, Integer s3434, Integer s3435,
                       Integer s3436) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.s3401 = new SimpleIntegerProperty(s3401);
        this.s3402 = new SimpleIntegerProperty(s3402);
        this.s3403 = new SimpleIntegerProperty(s3403);
        this.s3404 = new SimpleIntegerProperty(s3404);
        this.s3405 = new SimpleIntegerProperty(s3405);
        this.s3406 = new SimpleIntegerProperty(s3406);
        this.s3407 = new SimpleIntegerProperty(s3407);
        this.s3408 = new SimpleIntegerProperty(s3408);
        this.s3409 = new SimpleIntegerProperty(s3409);
        this.s3410 = new SimpleIntegerProperty(s3410);
        this.s3411 = new SimpleIntegerProperty(s3411);
        this.s3412 = new SimpleIntegerProperty(s3412);
        this.s3413 = new SimpleIntegerProperty(s3413);
        this.s3414 = new SimpleIntegerProperty(s3414);
        this.s3415 = new SimpleIntegerProperty(s3415);
        this.s3416 = new SimpleIntegerProperty(s3416);
        this.s3417 = new SimpleIntegerProperty(s3417);
        this.s3418 = new SimpleIntegerProperty(s3418);
        this.s3419 = new SimpleIntegerProperty(s3419);
        this.s3420 = new SimpleIntegerProperty(s3420);
        this.s3421 = new SimpleIntegerProperty(s3421);
        this.s3422 = new SimpleIntegerProperty(s3422);
        this.s3423 = new SimpleIntegerProperty(s3423);
        this.s3424 = new SimpleIntegerProperty(s3424);
        this.s3425 = new SimpleIntegerProperty(s3425);
        this.s3426 = new SimpleIntegerProperty(s3426);
        this.s3427 = new SimpleIntegerProperty(s3427);
        this.s3428 = new SimpleIntegerProperty(s3428);
        this.s3429 = new SimpleIntegerProperty(s3429);
        this.s3430 = new SimpleIntegerProperty(s3430);
        this.s3431 = new SimpleIntegerProperty(s3431);
        this.s3432 = new SimpleIntegerProperty(s3432);
        this.s3433 = new SimpleIntegerProperty(s3433);
        this.s3434 = new SimpleIntegerProperty(s3434);
        this.s3435 = new SimpleIntegerProperty(s3435);
        this.s3436 = new SimpleIntegerProperty(s3436);
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

    // 1.Прицел коллиматорный «Обзор» - s3401
    public int getS3401() {
        return s3401.get();
    }

    public void setS3401(int s3401) {
        this.s3401.set(s3401);
    }

    // 2.Прицел коллиматорный Micro - s3402
    public int getS3402() {
        return s3402.get();
    }

    public void setS3402(int s3402) {
        this.s3402.set(s3402);
    }

    // 3.Прицел оптический ПУ на боковой кронштейн - s3403
    public int getS3403() {
        return s3403.get();
    }

    public void setS3403(int s3403) {
        this.s3403.set(s3403);
    }

    // 4.Прицел оптический ПУ для СВТ - s3404
    public int getS3404() {
        return s3404.get();
    }

    public void setS3404(int s3404) {
        this.s3404.set(s3404);
    }

    // 5.Прицел коллиматорный «Валдай» - s3405
    public int getS3405() {
        return s3405.get();
    }

    public void setS3405(int s3405) {
        this.s3405.set(s3405);
    }

    // 6.Прицел оптический «Тюльпан» - s3406
    public int getS3406() {
        return s3406.get();
    }

    public void setS3406(int s3406) {
        this.s3406.set(s3406);
    }

    // 7.Прицел коллиматорный «Кобра» - s3407
    public int getS3407() {
        return s3407.get();
    }

    public void setS3407(int s3407) {
        this.s3407.set(s3407);
    }

    // 8.Прицел коллиматорный EoTech - s3408
    public int getS3408() {
        return s3408.get();
    }

    public void setS3408(int s3408) {
        this.s3408.set(s3408);
    }

    // 9.Прицел коллиматорный EoTech - s3409
    public int getS3409() {
        return s3409.get();
    }

    public void setS3409(int s3409) {
        this.s3409.set(s3409);
    }

    // 10.Прицел коллиматорный BSA Reflex - s3410
    public int getS3410() {
        return s3410.get();
    }

    public void setS3410(int s3410) {
        this.s3410.set(s3410);
    }

    // 11.Прицел широкоугольный «Ракурс» - s3411
    public int getS3411() {
        return s3411.get();
    }

    public void setS3411(int s3411) {
        this.s3411.set(s3411);
    }

    // 12.Прицел оптический SUSAT - s3412
    public int getS3412() {
        return s3412.get();
    }

    public void setS3412(int s3412) {
        this.s3412.set(s3412);
    }

    // 13.Прицел коллиматорный LaRue - s3413
    public int getS3413() {
        return s3413.get();
    }

    public void setS3413(int s3413) {
        this.s3413.set(s3413);
    }

    // 14.Прицел оптический ПСО - s3414
    public int getS3414() {
        return s3414.get();
    }

    public void setS3414(int s3414) {
        this.s3414.set(s3414);
    }

    // 15.Прицел коллиматорный Trijicon - s3415
    public int getS3415() {
        return s3415.get();
    }

    public void setS3415(int s3415) {
        this.s3415.set(s3415);
    }

    // 16.Прицел оптический Leupold - s3416
    public int getS3416() {
        return s3416.get();
    }

    public void setS3416(int s3416) {
        this.s3416.set(s3416);
    }

    // 17.Прицел коллиматорный Trijicon - s3417
    public int getS3417() {
        return s3417.get();
    }

    public void setS3417(int s3417) {
        this.s3417.set(s3417);
    }

    // 18.Прицел оптический 1П77 - s3418
    public int getS3418() {
        return s3418.get();
    }

    public void setS3418(int s3418) {
        this.s3418.set(s3418);
    }

    // 19.Прицел оптический Trijicon ACOG - s3419
    public int getS3419() {
        return s3419.get();
    }

    public void setS3419(int s3419) {
        this.s3419.set(s3419);
    }

    // 20.Прицел оптический Пилад 3.5х20 - s3420
    public int getS3420() {
        return s3420.get();
    }

    public void setS3420(int s3420) {
        this.s3420.set(s3420);
    }

    // 21.Прицел оптический Elcan M145 - s3421
    public int getS3421() {
        return s3421.get();
    }

    public void setS3421(int s3421) {
        this.s3421.set(s3421);
    }

    // 22.Прицел коллиматорный Sig Sauer - s3422
    public int getS3422() {
        return s3422.get();
    }

    public void setS3422(int s3422) {
        this.s3422.set(s3422);
    }

    // 23.Прицел коллиматорный «ПК-АС» - s3423
    public int getS3423() {
        return s3423.get();
    }

    public void setS3423(int s3423) {
        this.s3423.set(s3423);
    }

    // 24.Прицел оптический ПОСП - s3424
    public int getS3424() {
        return s3424.get();
    }

    public void setS3424(int s3424) {
        this.s3424.set(s3424);
    }

    // 25.Прицел оптический ПСО - s3425
    public int getS3425() {
        return s3425.get();
    }

    public void setS3425(int s3425) {
        this.s3425.set(s3425);
    }

    // 26.Прицел оптический Elcan - s3426
    public int getS3426() {
        return s3426.get();
    }

    public void setS3426(int s3426) {
        this.s3426.set(s3426);
    }

    // 27.Прицел оптический Барс - s3427
    public int getS3427() {
        return s3427.get();
    }

    public void setS3427(int s3427) {
        this.s3427.set(s3427);
    }

    // 28.Прицел оптический Trijicon ACOG - s3428
    public int getS3428() {
        return s3428.get();
    }

    public void setS3428(int s3428) {
        this.s3428.set(s3428);
    }

    // 29.Прицел оптический Elcan - s3429
    public int getS3429() {
        return s3429.get();
    }

    public void setS3429(int s3429) {
        this.s3429.set(s3429);
    }

    // 30.Прицел коллиматорный «Bering OPTICS» - s3430
    public int getS3430() {
        return s3430.get();
    }

    public void setS3430(int s3430) {
        this.s3430.set(s3430);
    }

    // 31.Прицел коллиматорный Vortex - s3431
    public int getS3431() {
        return s3431.get();
    }

    public void setS3431(int s3431) {
        this.s3431.set(s3431);
    }

    // 32.Прицел коллиматорный Vortex - s3432
    public int getS3432() {
        return s3432.get();
    }

    public void setS3432(int s3432) {
        this.s3432.set(s3432);
    }

    // 33.Прицел коллиматорный Trijicon - s3433
    public int getS3433() {
        return s3433.get();
    }

    public void setS3433(int s3433) {
        this.s3433.set(s3433);
    }

    // 34.Прицел оптический Trijicon AccuPoint - s3434
    public int getS3434() {
        return s3434.get();
    }

    public void setS3434(int s3434) {
        this.s3434.set(s3434);
    }

    // 35.Прицел коллиматорный DOTSAT - s3435
    public int getS3435() {
        return s3435.get();
    }

    public void setS3435(int s3435) {
        this.s3435.set(s3435);
    }

    // 36.Прицел оптический Trijicon ACOG 2x40 - s3436
    public int getS3436() {
        return s3436.get();
    }

    public void setS3436(int s3436) {
        this.s3436.set(s3436);
    }
}
