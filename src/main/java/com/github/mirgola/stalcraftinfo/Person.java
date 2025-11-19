package com.github.mirgola.stalcraftinfo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final IntegerProperty idUser;
    private final StringProperty nickname;
    private final StringProperty fraction;
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
    private final IntegerProperty cost;
    private final IntegerProperty tradeCoins;
    private final IntegerProperty arsenalPoints;
    private final IntegerProperty seasonBox;
    private final IntegerProperty combatPassLevel;

    private final IntegerProperty greenMoldRemains;
    private final IntegerProperty swampStoneRemains;
    private final IntegerProperty stinkyRootRemains;
    private final IntegerProperty crappiteRemains;
    private final IntegerProperty piecesOfCopperWireRemains;
    private final IntegerProperty sprigOfChernobylChamomileRemains;
    private final IntegerProperty pickleRemains;
    private final IntegerProperty remainsOfRadioTransmitterRemains;
    private final IntegerProperty alphaDataFragmentRemains;
    private final IntegerProperty northernMossRemains;
    private final IntegerProperty dopeStoneRemains;
    private final IntegerProperty remainsOfBatteriesRemains;
    private final IntegerProperty betaDataFragmentRemains;
    private final IntegerProperty redFernRemains;
    private final IntegerProperty substance07270Remains;
    private final IntegerProperty remainsOfPsyTrackerRemains;
    private final IntegerProperty gammaDataFragmentRemains;
    private final IntegerProperty quantumBatteryRemains;
    private final IntegerProperty anomalousSerumRemains;
    private final IntegerProperty bitterleafRemains;
    private final IntegerProperty limboRemains;
    private final IntegerProperty lambdaDataFragmentRemains;
    private final IntegerProperty anomalousBatteryRemains;
    private final IntegerProperty limboPlasmaRemains;
    private final IntegerProperty costRemains;

    public Person(String nickname, String fraction) {
        this(0, nickname, fraction, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0,
                0, 0, 0,0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0,
                0, 0);
    }

    public Person(Integer idUser, String nickname, String fraction, Integer greenMold, Integer swampStone, Integer stinkyRoot ,Integer crappite,
                  Integer piecesOfCopperWire, Integer sprigOfChernobylChamomile, Integer pickle, Integer remainsOfRadioTransmitter, Integer alphaDataFragment,
                  Integer northernMoss, Integer dopeStone, Integer remainsOfBatteries, Integer betaDataFragment, Integer redFern, Integer substance07270,
                  Integer remainsOfPsyTracker, Integer gammaDataFragment, Integer quantumBattery, Integer anomalousSerum, Integer bitterleaf,
                  Integer limbo, Integer lambdaDataFragment, Integer anomalousBattery, Integer limboPlasma, Integer cost, Integer tradeCoins,
                  Integer arsenalPoints, Integer seasonBox, Integer combatPassLevel,
                  Integer greenMoldRemains, Integer swampStoneRemains, Integer stinkyRootRemains, Integer crappiteRemains, Integer piecesOfCopperWireRemains,
                  Integer sprigOfChernobylChamomileRemains, Integer pickleRemains, Integer remainsOfRadioTransmitterRemains, Integer alphaDataFragmentRemains,
                  Integer northernMossRemains, Integer dopeStoneRemains, Integer remainsOfBatteriesRemains, Integer betaDataFragmentRemains,
                  Integer redFernRemains, Integer substance07270Remains, Integer remainsOfPsyTrackerRemains, Integer gammaDataFragmentRemains,
                  Integer quantumBatteryRemains, Integer anomalousSerumRemains, Integer bitterleafRemains, Integer limboRemains,
                  Integer lambdaDataFragmentRemains, Integer anomalousBatteryRemains, Integer limboPlasmaRemains, Integer costRemains) {
        this.idUser = new SimpleIntegerProperty(idUser);
        this.nickname = new SimpleStringProperty(nickname);
        this.fraction = new SimpleStringProperty(fraction);
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
        this.cost = new SimpleIntegerProperty(cost);
        this.tradeCoins = new SimpleIntegerProperty(tradeCoins);
        this.arsenalPoints = new SimpleIntegerProperty(arsenalPoints);
        this.seasonBox = new SimpleIntegerProperty(seasonBox);
        this.combatPassLevel = new SimpleIntegerProperty(combatPassLevel);

        this.greenMoldRemains = new SimpleIntegerProperty(greenMoldRemains);
        this.swampStoneRemains = new SimpleIntegerProperty(swampStoneRemains);
        this.stinkyRootRemains = new SimpleIntegerProperty(stinkyRootRemains);
        this.crappiteRemains = new SimpleIntegerProperty(crappiteRemains);
        this.piecesOfCopperWireRemains = new SimpleIntegerProperty(piecesOfCopperWireRemains);
        this.sprigOfChernobylChamomileRemains = new SimpleIntegerProperty(sprigOfChernobylChamomileRemains);
        this.pickleRemains = new SimpleIntegerProperty(pickleRemains);
        this.remainsOfRadioTransmitterRemains = new SimpleIntegerProperty(remainsOfRadioTransmitterRemains);
        this.alphaDataFragmentRemains = new SimpleIntegerProperty(alphaDataFragmentRemains);
        this.northernMossRemains = new SimpleIntegerProperty(northernMossRemains);
        this.dopeStoneRemains = new SimpleIntegerProperty(dopeStoneRemains);
        this.remainsOfBatteriesRemains = new SimpleIntegerProperty(remainsOfBatteriesRemains);
        this.betaDataFragmentRemains = new SimpleIntegerProperty(betaDataFragmentRemains);
        this.redFernRemains = new SimpleIntegerProperty(redFernRemains);
        this.substance07270Remains = new SimpleIntegerProperty(substance07270Remains);
        this.remainsOfPsyTrackerRemains = new SimpleIntegerProperty(remainsOfPsyTrackerRemains);
        this.gammaDataFragmentRemains = new SimpleIntegerProperty(gammaDataFragmentRemains);
        this.quantumBatteryRemains = new SimpleIntegerProperty(quantumBatteryRemains);
        this.anomalousSerumRemains = new SimpleIntegerProperty(anomalousSerumRemains);
        this.bitterleafRemains = new SimpleIntegerProperty(bitterleafRemains);
        this.limboRemains = new SimpleIntegerProperty(limboRemains);
        this.lambdaDataFragmentRemains = new SimpleIntegerProperty(lambdaDataFragmentRemains);
        this.anomalousBatteryRemains = new SimpleIntegerProperty(anomalousBatteryRemains);
        this.limboPlasmaRemains = new SimpleIntegerProperty(limboPlasmaRemains);
        this.costRemains = new SimpleIntegerProperty(costRemains);
    }

    // ID пользователя
    public int getId() {
        return idUser.get();
    }
    public void setId(int id) {
        this.idUser.set(id);
    }
    public IntegerProperty idProperty() {
        return idUser;
    }

    // Имя пользователя
    public String getNickname() {
        return nickname.get();
    }
    public void setNickname (String nickname) {
        this.nickname.set(nickname);
    }
    public StringProperty nicknameProperty() {
        return nickname;
    }

    // Название фракции
    public String getFraction() {
        return fraction.get();
    }
    public void setFraction (String fraction) {
        this.fraction.set(fraction);
    }
    public StringProperty fractionProperty() {
        return fraction;
    }

    // Зеленая плесень - Green Mold
    public int getGreenMold() {
        return greenMold.get();
    }
    public void setGreenMold(int greenMold) {
        this.greenMold.set(greenMold);
    }
    public IntegerProperty greenMoldProperty() {
        return greenMold;
    }

    // Болотный камень - Swamp Stone
    public int getSwampStone() {
        return swampStone.get();
    }
    public void setSwampStone(int swampStone) {
        this.swampStone.set(swampStone);
    }
    public IntegerProperty swampStoneProperty() {
        return swampStone;
    }

    // Корень-вонючка - Stinky Root
    public int getStinkyRoot() {
        return stinkyRoot.get();
    }
    public void setStinkyRoot(int stinkyRoot) {
        this.stinkyRoot.set(stinkyRoot);
    }
    public IntegerProperty stinkyRootProperty() {
        return stinkyRoot;
    }

    // Срачник - Crap pite
    public int getCrappite() {
        return crappite.get();
    }
    public void setCrappite(int crappite) {
        this.crappite.set(crappite);
    }
    public IntegerProperty crappiteProperty() {
        return crappite;
    }

    //Остатки медной проволки - Pieces of Copper Wire
    public int getPiecesOfCopperWire() {
        return piecesOfCopperWire.get();
    }
    public void setPiecesOfCopperWire(int piecesOfCopperWire) {
        this.piecesOfCopperWire.set(piecesOfCopperWire);
    }
    public IntegerProperty piecesOfCopperWireProperty() {
        return piecesOfCopperWire;
    }

    // Росток чернобыльской ромашки - Sprig of Chernobyl Chamomile
    public int getSprigOfChernobylChamomile() {
        return sprigOfChernobylChamomile.get();
    }
    public void setSprigOfChernobylChamomile(int sprigOfChernobylChamomile) {
        this.sprigOfChernobylChamomile.set(sprigOfChernobylChamomile);
    }
    public IntegerProperty sprigOfChernobylChamomileProperty() {
        return sprigOfChernobylChamomile;
    }

    // Рассольник - Pickle
    public int getPickle() {
        return pickle.get();
    }
    public void setPickle(int pickle) {
        this.pickle.set(pickle);
    }
    public IntegerProperty pickleProperty() {
        return pickle;
    }

    // Остатки радиопередатчика - Remains of a Radio Transmitter
    public int getRemainsOfRadioTransmitter() {
        return remainsOfRadioTransmitter.get();
    }
    public void setRemainsOfRadioTransmitter(int remainsOfRadioTransmitter) {
        this.remainsOfRadioTransmitter.set(remainsOfRadioTransmitter);
    }
    public IntegerProperty remainsOfRadioTransmitterProperty() {
        return remainsOfRadioTransmitter;
    }

    // Фрагмент данных "Альфа" - Alpha Data Fragment
    public int getAlphaDataFragment() {
        return alphaDataFragment.get();
    }
    public void setAlphaDataFragment(int alphaDataFragment) {
        this.alphaDataFragment.set(alphaDataFragment);
    }
    public IntegerProperty alphaDataFragmentProperty() {
        return alphaDataFragment;
    }

    // Северный мох - Northern Moss
    public int getNorthernMoss() {
        return northernMoss.get();
    }
    public void setNorthernMoss(int northernMoss) {
        this.northernMoss.set(northernMoss);
    }
    public IntegerProperty northernMossProperty() {
        return northernMoss;
    }

    // Дурман-камень - Dopestone
    public int getDopeStone() {
        return dopeStone.get();
    }
    public void setDopeStone(int dopeStone) {
        this.dopeStone.set(dopeStone);
    }
    public IntegerProperty dopeStoneProperty() {
        return dopeStone;
    }

    // Остатки аккумуляторов - Remains of Batteries
    public int getRemainsOfBatteries() {
        return remainsOfBatteries.get();
    }
    public void setRemainsOfBatteries(int remainsOfBatteries) {
        this.remainsOfBatteries.set(remainsOfBatteries);
    }
    public IntegerProperty remainsOfBatteriesProperty() {
        return remainsOfBatteries;
    }

    // Фрагмент данных "Бета" - Beta Data Fragment
    public int getBetaDataFragment() {
        return betaDataFragment.get();
    }
    public void setBetaDataFragment(int betaDataFragment) {
        this.betaDataFragment.set(betaDataFragment);
    }
    public IntegerProperty betaDataFragmentProperty() {
        return betaDataFragment;
    }

    // Рыжий папоротник - Red Fern
    public int getRedFern() {
        return redFern.get();
    }
    public void setRedFern(int redFern) {
        this.redFern.set(redFern);
    }
    public IntegerProperty redFernProperty() {
        return redFern;
    }

    // Вещество 07270 - Substance 07270
    public int getSubstance07270() {
        return substance07270.get();
    }
    public void setSubstance07270(int substance07270) {
        this.substance07270.set(substance07270);
    }
    public IntegerProperty substance07270Property() {
        return substance07270;
    }

    // Остатки пси-маячка - Remains of a Psy-Tracker
    public int getRemainsOfPsyTracker() {
        return remainsOfPsyTracker.get();
    }
    public void setRemainsOfPsyTracker(int remainsOfPsyTracker) {
        this.remainsOfPsyTracker.set(remainsOfPsyTracker);
    }
    public IntegerProperty remainsOfPsyTrackerProperty() {
        return remainsOfPsyTracker;
    }

    // Фрагмент данных "Гамма" - Gamma Data Fragment
    public int getGammaDataFragment() {
        return gammaDataFragment.get();
    }
    public void setGammaDataFragment(int gammaDataFragment) {
        this.gammaDataFragment.set(gammaDataFragment);
    }
    public IntegerProperty gammaDataFragmentProperty() {
        return gammaDataFragment;
    }

    // Квантовая батарея - Quantum Battery
    public int getQuantumBattery() {
        return quantumBattery.get();
    }
    public void setQuantumBattery(int quantumBattery) {
        this.quantumBattery.set(quantumBattery);
    }
    public IntegerProperty quantumBatteryProperty() {
        return quantumBattery;
    }

    // Аномальная сыворотка - Anomalous Serum
    public int getAnomalousSerum() {
        return anomalousSerum.get();
    }
    public void setAnomalousSerum(int anomalousSerum) {
        this.anomalousSerum.set(anomalousSerum);
    }
    public IntegerProperty anomalousSerumProperty() {
        return anomalousSerum;
    }

    // Горьколистник - Bitterleaf
    public int getBitterleaf() {
        return bitterleaf.get();
    }
    public void setBitterleaf(int bitterleaf) {
        this.bitterleaf.set(bitterleaf);
    }
    public IntegerProperty bitterleafProperty() {
        return bitterleaf;
    }

    // Лимб - Limbo
    public int getLimbo() {
        return limbo.get();
    }
    public void setLimbo(int limbo) {
        this.limbo.set(limbo);
    }
    public IntegerProperty limboProperty() {
        return limbo;
    }

    // Фрагмент данных "Лямбда" - Lambda Data Fragment
    public int getLambdaDataFragment() {
        return lambdaDataFragment.get();
    }
    public void setLambdaDataFragment(int lambdaDataFragment) {
        this.lambdaDataFragment.set(lambdaDataFragment);
    }
    public IntegerProperty lambdaDataFragmentProperty() {
        return lambdaDataFragment;
    }

    // Аномальная батарея - Anomalous Battery
    public int getAnomalousBattery() {
        return anomalousBattery.get();
    }
    public void setAnomalousBattery(int anomalousBattery) {
        this.anomalousBattery.set(anomalousBattery);
    }
    public IntegerProperty anomalousBatteryProperty() {
        return anomalousBattery;
    }

    // Лимбоплазма - Limbo plasma
    public int getLimboPlasma() {
        return limboPlasma.get();
    }
    public void setLimboPlasma(int limboPlasma) {
        this.limboPlasma.set(limboPlasma);
    }
    public IntegerProperty limboPlasmaProperty() {
        return limboPlasma;
    }

    // Стоимость (Рубль) – Cost
    public int getCost() {
        return cost.get();
    }
    public void setCost(int cost) {
        this.cost.set(cost);
    }
    public IntegerProperty costProperty() {
        return cost;
    }

    // Обменные монеты - Trade Coins
    public int getTradeCoins() {
        return tradeCoins.get();
    }
    public void setTradeCoins(int tradeCoins) {
        this.tradeCoins.set(tradeCoins);
    }
    public IntegerProperty tradeCoinsProperty() {
        return tradeCoins;
    }

    // Репутация арсенала - Arsenal Points
    public int getArsenalPoints() {
        return arsenalPoints.get();
    }
    public void setArsenalPoints(int arsenalPoints) {
        this.arsenalPoints.set(arsenalPoints);
    }
    public IntegerProperty arsenalPointsProperty() {
        return arsenalPoints;
    }

    // Коробок сезона (открыто) - Season box
    public int getSeasonBox() {
        return seasonBox.get();
    }
    public void setSeasonBox(int seasonBox) {
        this.seasonBox.set(seasonBox);
    }
    public IntegerProperty seasonBoxProperty() {
        return seasonBox;
    }

    // Уровень боевого пропуска - Combat Pass Level
    public int getCombatPassLevel() {
        return combatPassLevel.get();
    }
    public void setCombatPassLevel(int combatPassLevel) {
        this.combatPassLevel.set(combatPassLevel);
    }
    public IntegerProperty combatPassLevelProperty() {
        return combatPassLevel;
    }

    // Остатки
    // Зеленая плесень - Green Mold Remains
    public int getGreenMoldRemains() {
        return greenMoldRemains.get();
    }
    public void setGreenMoldRemains(int greenMoldRemains) {
        this.greenMoldRemains.set(greenMoldRemains);
    }

    // Болотный камень - Swamp Stone Remains
    public int getSwampStoneRemains() {
        return swampStoneRemains.get();
    }
    public void setSwampStoneRemains(int swampStoneRemains) {
        this.swampStoneRemains.set(swampStoneRemains);
    }

    // Корень-вонючка - Stinky Root Remains
    public int getStinkyRootRemains() {
        return stinkyRootRemains.get();
    }
    public void setStinkyRootRemains(int stinkyRootRemains) {
        this.stinkyRootRemains.set(stinkyRootRemains);
    }

    // Срачник - Crap pite Remains
    public int getCrappiteRemains() {
        return crappiteRemains.get();
    }
    public void setCrappiteRemains(int crappiteRemains) {
        this.crappiteRemains.set(crappiteRemains);
    }

    //Остатки медной проволки - Pieces of Copper Wire Remains
    public int getPiecesOfCopperWireRemains() {
        return piecesOfCopperWireRemains.get();
    }
    public void setPiecesOfCopperWireRemains(int piecesOfCopperWireRemains) {
        this.piecesOfCopperWireRemains.set(piecesOfCopperWireRemains);
    }

    // Росток чернобыльской ромашки - Sprig of Chernobyl Chamomile Remains
    public int getSprigOfChernobylChamomileRemains() {
        return sprigOfChernobylChamomileRemains.get();
    }
    public void setSprigOfChernobylChamomileRemains(int sprigOfChernobylChamomileRemains) {
        this.sprigOfChernobylChamomileRemains.set(sprigOfChernobylChamomileRemains);
    }

    // Рассольник - Pickle Remains
    public int getPickleRemains() {
        return pickleRemains.get();
    }
    public void setPickleRemains(int pickleRemains) {
        this.pickleRemains.set(pickleRemains);
    }

    // Остатки радиопередатчика - Remains of a Radio Transmitter Remains
    public int getRemainsOfRadioTransmitterRemains() {
        return remainsOfRadioTransmitterRemains.get();
    }
    public void setRemainsOfRadioTransmitterRemains(int remainsOfRadioTransmitterRemains) {
        this.remainsOfRadioTransmitterRemains.set(remainsOfRadioTransmitterRemains);
    }

    // Фрагмент данных "Альфа" - Alpha Data Fragment Remains
    public int getAlphaDataFragmentRemains() {
        return alphaDataFragmentRemains.get();
    }
    public void setAlphaDataFragmentRemains(int alphaDataFragmentRemains) {
        this.alphaDataFragmentRemains.set(alphaDataFragmentRemains);
    }

    // Северный мох - Northern Moss Remains
    public int getNorthernMossRemains() {
        return northernMossRemains.get();
    }
    public void setNorthernMossRemains(int northernMossRemains) {
        this.northernMossRemains.set(northernMossRemains);
    }

    // Дурман-камень - Dopestone Remains
    public int getDopeStoneRemains() {
        return dopeStoneRemains.get();
    }
    public void setDopeStoneRemains(int dopeStoneRemains) {
        this.dopeStoneRemains.set(dopeStoneRemains);
    }

    // Остатки аккумуляторов - Remains of Batteries Remains
    public int getRemainsOfBatteriesRemains() {
        return remainsOfBatteriesRemains.get();
    }
    public void setRemainsOfBatteriesRemains(int remainsOfBatteriesRemains) {
        this.remainsOfBatteriesRemains.set(remainsOfBatteriesRemains);
    }

    // Фрагмент данных "Бета" - Beta Data Fragment Remains
    public int getBetaDataFragmentRemains() {
        return betaDataFragmentRemains.get();
    }
    public void setBetaDataFragmentRemains(int betaDataFragmentRemains) {
        this.betaDataFragmentRemains.set(betaDataFragmentRemains);
    }

    // Рыжий папоротник - Red Fern Remains
    public int getRedFernRemains() {
        return redFernRemains.get();
    }
    public void setRedFernRemains(int redFernRemains) {
        this.redFernRemains.set(redFernRemains);
    }

    // Вещество 07270 - Substance 07270 Remains
    public int getSubstance07270Remains() {
        return substance07270Remains.get();
    }
    public void setSubstance07270Remains(int substance07270Remains) {
        this.substance07270Remains.set(substance07270Remains);
    }

    // Остатки пси-маячка - Remains of a Psy-Tracker Remains
    public int getRemainsOfPsyTrackerRemains() {
        return remainsOfPsyTrackerRemains.get();
    }
    public void setRemainsOfPsyTrackerRemains(int remainsOfPsyTrackerRemains) {
        this.remainsOfPsyTrackerRemains.set(remainsOfPsyTrackerRemains);
    }

    // Фрагмент данных "Гамма" - Gamma Data Fragment Remains
    public int getGammaDataFragmentRemains() {
        return gammaDataFragmentRemains.get();
    }
    public void setGammaDataFragmentRemains(int gammaDataFragmentRemains) {
        this.gammaDataFragmentRemains.set(gammaDataFragmentRemains);
    }

    // Квантовая батарея - Quantum Battery Remains
    public int getQuantumBatteryRemains() {
        return quantumBatteryRemains.get();
    }
    public void setQuantumBatteryRemains(int quantumBatteryRemains) {
        this.quantumBatteryRemains.set(quantumBatteryRemains);
    }

    // Аномальная сыворотка - Anomalous Serum Remains
    public int getAnomalousSerumRemains() {
        return anomalousSerumRemains.get();
    }
    public void setAnomalousSerumRemains(int anomalousSerumRemains) {
        this.anomalousSerumRemains.set(anomalousSerumRemains);
    }

    // Горьколистник - Bitterleaf Remains
    public int getBitterleafRemains() {
        return bitterleafRemains.get();
    }
    public void setBitterleafRemains(int bitterleafRemains) {
        this.bitterleafRemains.set(bitterleafRemains);
    }

    // Лимб - Limbo Remains
    public int getLimboRemains() {
        return limboRemains.get();
    }
    public void setLimboRemains(int limboRemains) {
        this.limboRemains.set(limboRemains);
    }

    // Фрагмент данных "Лямбда" - Lambda Data Fragment Remains
    public int getLambdaDataFragmentRemains() {
        return lambdaDataFragmentRemains.get();
    }
    public void setLambdaDataFragmentRemains(int lambdaDataFragmentRemains) {
        this.lambdaDataFragmentRemains.set(lambdaDataFragmentRemains);
    }

    // Аномальная батарея - Anomalous Battery Remains
    public int getAnomalousBatteryRemains() {
        return anomalousBatteryRemains.get();
    }
    public void setAnomalousBatteryRemains(int anomalousBatteryRemains) {
        this.anomalousBatteryRemains.set(anomalousBatteryRemains);
    }

    // Лимбоплазма - Limbo plasma Remains
    public int getLimboPlasmaRemains() {
        return limboPlasmaRemains.get();
    }
    public void setLimboPlasmaRemains(int limboPlasmaRemains) {
        this.limboPlasmaRemains.set(limboPlasmaRemains);
    }

    // Стоимость (Рубль) – Cost Remains
    public int getCostRemains() {
        return costRemains.get();
    }
    public void setCostRemains(int costRemains) {
        this.costRemains.set(costRemains);
    }
}