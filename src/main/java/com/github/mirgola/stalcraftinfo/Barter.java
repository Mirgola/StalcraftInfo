package com.github.mirgola.stalcraftinfo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Barter {
    private final StringProperty id;
    private final StringProperty name;
    private final IntegerProperty cost;
    private final IntegerProperty greenMold;
    private final IntegerProperty swampStone;
    private final IntegerProperty stinkyRoot;
    private final IntegerProperty crappite;
    private final IntegerProperty piecesOfCopperWire;
    private final IntegerProperty sprigOfChernobylChamomile;
    private final IntegerProperty pickle;
    private final IntegerProperty remainsOfRadioTransmitter;
    private final IntegerProperty alphaDataFragment;
    private final IntegerProperty northernMoss;
    private final IntegerProperty dopeStone;
    private final IntegerProperty remainsOfBatteries;
    private final IntegerProperty betaDataFragment;
    private final IntegerProperty redFern;
    private final IntegerProperty substance07270;
    private final IntegerProperty remainsOfPsyTracker;
    private final IntegerProperty gammaDataFragment;
    private final IntegerProperty quantumBattery;
    private final IntegerProperty anomalousSerum;
    private final IntegerProperty bitterleaf;
    private final IntegerProperty limbo;
    private final IntegerProperty lambdaDataFragment;
    private final IntegerProperty anomalousBattery;
    private final IntegerProperty limboPlasma;

    public Barter(String id, String name, Integer cost, Integer greenMold, Integer swampStone, Integer stinkyRoot , Integer crappite,
                  Integer piecesOfCopperWire, Integer sprigOfChernobylChamomile, Integer pickle, Integer remainsOfRadioTransmitter, Integer alphaDataFragment,
                  Integer northernMoss, Integer dopeStone, Integer remainsOfBatteries, Integer betaDataFragment, Integer redFern, Integer substance07270,
                  Integer remainsOfPsyTracker, Integer gammaDataFragment, Integer quantumBattery, Integer anomalousSerum, Integer bitterleaf,
                  Integer limbo, Integer lambdaDataFragment, Integer anomalousBattery, Integer limboPlasma) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.cost = new SimpleIntegerProperty(cost);
        this.greenMold = new SimpleIntegerProperty(greenMold);
        this.swampStone = new SimpleIntegerProperty(swampStone);
        this.stinkyRoot = new SimpleIntegerProperty(stinkyRoot);
        this.crappite = new SimpleIntegerProperty(crappite);
        this.piecesOfCopperWire = new SimpleIntegerProperty(piecesOfCopperWire);
        this.sprigOfChernobylChamomile = new SimpleIntegerProperty(sprigOfChernobylChamomile);
        this.pickle = new SimpleIntegerProperty(pickle);
        this.remainsOfRadioTransmitter = new SimpleIntegerProperty(remainsOfRadioTransmitter);
        this.alphaDataFragment = new SimpleIntegerProperty(alphaDataFragment);
        this.northernMoss = new SimpleIntegerProperty(northernMoss);
        this.dopeStone = new SimpleIntegerProperty(dopeStone);
        this.remainsOfBatteries = new SimpleIntegerProperty(remainsOfBatteries);
        this.betaDataFragment = new SimpleIntegerProperty(betaDataFragment);
        this.redFern = new SimpleIntegerProperty(redFern);
        this.substance07270 = new SimpleIntegerProperty(substance07270);
        this.remainsOfPsyTracker = new SimpleIntegerProperty(remainsOfPsyTracker);
        this.gammaDataFragment = new SimpleIntegerProperty(gammaDataFragment);
        this.quantumBattery = new SimpleIntegerProperty(quantumBattery);
        this.anomalousSerum = new SimpleIntegerProperty(anomalousSerum);
        this.bitterleaf = new SimpleIntegerProperty(bitterleaf);
        this.limbo = new SimpleIntegerProperty(limbo);
        this.lambdaDataFragment = new SimpleIntegerProperty(lambdaDataFragment);
        this.anomalousBattery = new SimpleIntegerProperty(anomalousBattery);
        this.limboPlasma = new SimpleIntegerProperty(limboPlasma);
    }

    // ID бартера (предмета)
    public String getId() {
        return id.get();
    }

    // Имя бартера (предмета)
    public String getName() {
        return name.get();
    }

    // Стоимость (Рубль) – Cost
    public int getCost() {
        return cost.get();
    }

    // Зеленая плесень - Green Mold
    public int getGreenMold() {
        return greenMold.get();
    }

    // Болотный камень - Swamp Stone
    public int getSwampStone() {
        return swampStone.get();
    }

    // Корень-вонючка - Stinky Root
    public int getStinkyRoot() {
        return stinkyRoot.get();
    }

    // Срачник - Crap pite
    public int getCrappite() {
        return crappite.get();
    }

    //Остатки медной проволки - Pieces of Copper Wire
    public int getPiecesOfCopperWire() {
        return piecesOfCopperWire.get();
    }

    // Росток чернобыльской ромашки - Sprig of Chernobyl Chamomile
    public int getSprigOfChernobylChamomile() {
        return sprigOfChernobylChamomile.get();
    }

    // Рассольник - Pickle
    public int getPickle() {
        return pickle.get();
    }

    // Остатки радиопередатчика - Remains of a Radio Transmitter
    public int getRemainsOfRadioTransmitter() {
        return remainsOfRadioTransmitter.get();
    }

    // Фрагмент данных "Альфа" - Alpha Data Fragment
    public int getAlphaDataFragment() {
        return alphaDataFragment.get();
    }

    // Северный мох - Northern Moss
    public int getNorthernMoss() {
        return northernMoss.get();
    }

    // Дурман-камень - Dopestone
    public int getDopeStone() {
        return dopeStone.get();
    }

    // Остатки аккумуляторов - Remains of Batteries
    public int getRemainsOfBatteries() {
        return remainsOfBatteries.get();
    }

    // Фрагмент данных "Бета" - Beta Data Fragment
    public int getBetaDataFragment() {
        return betaDataFragment.get();
    }

    // Рыжий папоротник - Red Fern
    public int getRedFern() {
        return redFern.get();
    }

    // Вещество 07270 - Substance 07270
    public int getSubstance07270() {
        return substance07270.get();
    }

    // Остатки пси-маячка - Remains of a Psy-Tracker
    public int getRemainsOfPsyTracker() {
        return remainsOfPsyTracker.get();
    }

    // Фрагмент данных "Гамма" - Gamma Data Fragment
    public int getGammaDataFragment() {
        return gammaDataFragment.get();
    }

    // Квантовая батарея - Quantum Battery
    public int getQuantumBattery() {
        return quantumBattery.get();
    }

    // Аномальная сыворотка - Anomalous Serum
    public int getAnomalousSerum() {
        return anomalousSerum.get();
    }

    // Горьколистник - Bitterleaf
    public int getBitterleaf() {
        return bitterleaf.get();
    }

    // Лимб - Limbo
    public int getLimbo() {
        return limbo.get();
    }

    // Фрагмент данных "Лямбда" - Lambda Data Fragment
    public int getLambdaDataFragment() {
        return lambdaDataFragment.get();
    }

    // Аномальная батарея - Anomalous Battery
    public int getAnomalousBattery() {
        return anomalousBattery.get();
    }

    // Лимбоплазма - Limbo plasma
    public int getLimboPlasma() {
        return limboPlasma.get();
    }
}