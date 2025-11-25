package com.github.mirgola.stalcraftinfo.barter.weapons;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SniperRiflesCount {
    private final IntegerProperty idPerson;
    private final StringProperty nicknamePerson;
    private final IntegerProperty sr1401, sr1402, sr1403, sr1404, sr1405, sr1406, sr1407, sr1408, sr1409, sr1410,
                                  sr1411, sr1412, sr1413, sr1414, sr1415, sr1416, sr1417, sr1418, sr1419, sr1420,
                                  sr1421, sr1422;

    public SniperRiflesCount(Integer idPerson, String nicknamePerson,
                              Integer sr1401, Integer sr1402, Integer sr1403, Integer sr1404, Integer sr1405,
                              Integer sr1406, Integer sr1407, Integer sr1408, Integer sr1409, Integer sr1410,
                              Integer sr1411, Integer sr1412, Integer sr1413, Integer sr1414, Integer sr1415,
                              Integer sr1416, Integer sr1417, Integer sr1418, Integer sr1419, Integer sr1420,
                              Integer sr1421, Integer sr1422) {
        this.idPerson = new SimpleIntegerProperty(idPerson);
        this.nicknamePerson = new SimpleStringProperty(nicknamePerson);
        this.sr1401 = new SimpleIntegerProperty(sr1401);
        this.sr1402 = new SimpleIntegerProperty(sr1402);
        this.sr1403 = new SimpleIntegerProperty(sr1403);
        this.sr1404 = new SimpleIntegerProperty(sr1404);
        this.sr1405 = new SimpleIntegerProperty(sr1405);
        this.sr1406 = new SimpleIntegerProperty(sr1406);
        this.sr1407 = new SimpleIntegerProperty(sr1407);
        this.sr1408 = new SimpleIntegerProperty(sr1408);
        this.sr1409 = new SimpleIntegerProperty(sr1409);
        this.sr1410 = new SimpleIntegerProperty(sr1410);
        this.sr1411 = new SimpleIntegerProperty(sr1411);
        this.sr1412 = new SimpleIntegerProperty(sr1412);
        this.sr1413 = new SimpleIntegerProperty(sr1413);
        this.sr1414 = new SimpleIntegerProperty(sr1414);
        this.sr1415 = new SimpleIntegerProperty(sr1415);
        this.sr1416 = new SimpleIntegerProperty(sr1416);
        this.sr1417 = new SimpleIntegerProperty(sr1417);
        this.sr1418 = new SimpleIntegerProperty(sr1418);
        this.sr1419 = new SimpleIntegerProperty(sr1419);
        this.sr1420 = new SimpleIntegerProperty(sr1420);
        this.sr1421 = new SimpleIntegerProperty(sr1421);
        this.sr1422 = new SimpleIntegerProperty(sr1422);
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

    // 1.Карабин Мосина – sr1401
    public int getSr1401() {
        return sr1401.get();
    }

    public void setSr1401(int sr1401) {
        this.sr1401.set(sr1401);
    }

    // 2.Винтовка Мосина - sr1402
    public int getSr1402() {
        return sr1402.get();
    }

    public void setSr1402(int sr1402) {
        this.sr1402.set(sr1402);
    }

    // 3.Поношенный Winchester M70 - sr1403
    public int getSr1403() {
        return sr1403.get();
    }

    public void setSr1403(int sr1403) {
        this.sr1403.set(sr1403);
    }

    // 4.СКТ-40 - sr1404
    public int getSr1404() {
        return sr1404.get();
    }

    public void setSr1404(int sr1404) {
        this.sr1404.set(sr1404);
    }

    // 5.СКС - sr1405
    public int getSr1405() {
        return sr1405.get();
    }

    public void setSr1405(int sr1405) {
        this.sr1405.set(sr1405);
    }

    // 6.Winchester M70 - sr1406
    public int getSr1406() {
        return sr1406.get();
    }

    public void setSr1406(int sr1406) {
        this.sr1406.set(sr1406);
    }

    // 7.СВТ-40 - sr1407
    public int getSr1407() {
        return sr1407.get();
    }

    public void setSr1407(int sr1407) {
        this.sr1407.set(sr1407);
    }

    // 8.СКС-Т - sr1408
    public int getSr1408() {
        return sr1408.get();
    }

    public void setSr1408(int sr1408) {
        this.sr1408.set(sr1408);
    }

    // 9.Поношенная M40A5 - sr1409
    public int getSr1409() {
        return sr1409.get();
    }

    public void setSr1409(int sr1409) {
        this.sr1409.set(sr1409);
    }

    // 10.СВД - sr1410
    public int getSr1410() {
        return sr1410.get();
    }

    public void setSr1410(int sr1410) {
        this.sr1410.set(sr1410);
    }

    // 11.M1A - sr1411
    public int getSr1411() {
        return sr1411.get();
    }

    public void setSr1411(int sr1411) {
        this.sr1411.set(sr1411);
    }

    // 12.M40A5 - sr1412
    public int getSr1412() {
        return sr1412.get();
    }

    public void setSr1412(int sr1412) {
        this.sr1412.set(sr1412);
    }

    // 13.СВД-С - sr1413
    public int getSr1413() {
        return sr1413.get();
    }

    public void setSr1413(int sr1413) {
        this.sr1413.set(sr1413);
    }

    // 14.СВУ - sr1414
    public int getSr1414() {
        return sr1414.get();
    }

    public void setSr1414(int sr1414) {
        this.sr1414.set(sr1414);
    }

    // 15.	МЦ-558 - sr1415
    public int getSr1415() {
        return sr1415.get();
    }

    public void setSr1415(int sr1415) {
        this.sr1415.set(sr1415);
    }

    // 16.M1A FA - sr1416
    public int getSr1416() {
        return sr1416.get();
    }

    public void setSr1416(int sr1416) {
        this.sr1416.set(sr1416);
    }

    // 17.ВСС «Винторез» - sr1417
    public int getSr1417() {
        return sr1417.get();
    }

    public void setSr1417(int sr1417) {
        this.sr1417.set(sr1417);
    }

    // 18.L96A1 - sr1418
    public int getSr1418() {
        return sr1418.get();
    }

    public void setSr1418(int sr1418) {
        this.sr1418.set(sr1418);
    }

    // 19.СВД-М - sr1419
    public int getSr1419() {
        return sr1419.get();
    }

    public void setSr1419(int sr1419) {
        this.sr1419.set(sr1419);
    }

    // 20.ВССК «Выхлоп» - sr1420
    public int getSr1420() {
        return sr1420.get();
    }

    public void setSr1420(int sr1420) {
        this.sr1420.set(sr1420);
    }

    // 21.Mk 14 EBR - sr1421
    public int getSr1421() {
        return sr1421.get();
    }

    public void setSr1421(int sr1421) {
        this.sr1421.set(sr1421);
    }

    // 22.ВСС-М «Винторез» - sr1422
    public int getSr1422() {
        return sr1422.get();
    }

    public void setSr1422(int sr1422) {
        this.sr1422.set(sr1422);
    }
}
