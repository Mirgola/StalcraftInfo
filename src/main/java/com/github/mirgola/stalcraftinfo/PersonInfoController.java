package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class PersonInfoController {
    @FXML
    private SplitPane splitPane;
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, Integer> idUserColumn;
    @FXML
    private TableColumn<Person, String> nicknameColumn;
    @FXML
    private TableColumn<Person, String> fractionColumn;

    @FXML
    private Label nicknameFractionLabel;

    private int group_1;
    private int group_1TradeCoins;
    @FXML
    private Label group_1Label;
    @FXML
    private Label group_1TradeCoinsLabel;
    @FXML
    private Label greenMoldLabel;
    @FXML
    private Label greenMoldRemainsLabel;
    @FXML
    private Label greenMoldTradeCoinsLabel;
    @FXML
    private Label greenMoldRubLabel;
    @FXML
    private Label swampStoneLabel;
    @FXML
    private Label swampStoneRemainsLabel;
    @FXML
    private Label swampStoneTradeCoinsLabel;
    @FXML
    private Label swampStoneRubLabel;

    private int group_2;
    private int group_2TradeCoins;
    @FXML
    private Label group_2Label;
    @FXML
    private Label group_2TradeCoinsLabel;
    @FXML
    private Label stinkyRootLabel;
    @FXML
    private Label stinkyRootRemainsLabel;
    @FXML
    private Label stinkyRootTradeCoinsLabel;
    @FXML
    private Label stinkyRootRubLabel;
    @FXML
    private Label crappiteLabel;
    @FXML
    private Label crappiteRemainsLabel;
    @FXML
    private Label crappiteTradeCoinsLabel;
    @FXML
    private Label crappiteRubLabel;
    @FXML
    private Label piecesOfCopperWireLabel;
    @FXML
    private Label piecesOfCopperWireRemainsLabel;
    @FXML
    private Label piecesOfCopperWireTradeCoinsLabel;
    @FXML
    private Label piecesOfCopperWireRubLabel;

    private int group_3;
    private int group_3TradeCoins;
    @FXML
    private Label group_3Label;
    @FXML
    private Label group_3TradeCoinsLabel;
    @FXML
    private Label sprigOfChernobylChamomileLabel;
    @FXML
    private Label sprigOfChernobylChamomileRemainsLabel;
    @FXML
    private Label sprigOfChernobylChamomileTradeCoinsLabel;
    @FXML
    private Label sprigOfChernobylChamomileRubLabel;
    @FXML
    private Label pickleLabel;
    @FXML
    private Label pickleRemainsLabel;
    @FXML
    private Label pickleTradeCoinsLabel;
    @FXML
    private Label pickleRubLabel;
    @FXML
    private Label remainsOfRadioTransmitterLabel;
    @FXML
    private Label remainsOfRadioTransmitterRemainsLabel;
    @FXML
    private Label remainsOfRadioTransmitterTradeCoinsLabel;
    @FXML
    private Label remainsOfRadioTransmitterRubLabel;
    @FXML
    private Label alphaDataFragmentLabel;
    @FXML
    private Label alphaDataFragmentRemainsLabel;
    @FXML
    private Label alphaDataFragmentTradeCoinsLabel;
    @FXML
    private Label alphaDataFragmentRubLabel;

    private int group_4;
    private int group_4TradeCoins;
    @FXML
    private Label group_4Label;
    @FXML
    private Label group_4TradeCoinsLabel;
    @FXML
    private Label northernMossLabel;
    @FXML
    private Label northernMossRemainsLabel;
    @FXML
    private Label northernMossTradeCoinsLabel;
    @FXML
    private Label northernMossRubLabel;
    @FXML
    private Label dopeStoneLabel;
    @FXML
    private Label dopeStoneRemainsLabel;
    @FXML
    private Label dopeStoneTradeCoinsLabel;
    @FXML
    private Label dopeStoneRubLabel;
    @FXML
    private Label remainsOfBatteriesLabel;
    @FXML
    private Label remainsOfBatteriesRemainsLabel;
    @FXML
    private Label remainsOfBatteriesTradeCoinsLabel;
    @FXML
    private Label remainsOfBatteriesRubLabel;
    @FXML
    private Label betaDataFragmentLabel;
    @FXML
    private Label betaDataFragmentRemainsLabel;
    @FXML
    private Label betaDataFragmentTradeCoinsLabel;
    @FXML
    private Label betaDataFragmentRubLabel;

    private int group_5;
    private int group_5TradeCoins;
    @FXML
    private Label group_5Label;
    @FXML
    private Label group_5TradeCoinsLabel;
    @FXML
    private Label redFernLabel;
    @FXML
    private Label redFernRemainsLabel;
    @FXML
    private Label redFernTradeCoinsLabel;
    @FXML
    private Label redFernRubLabel;
    @FXML
    private Label substance07270Label;
    @FXML
    private Label substance07270RemainsLabel;
    @FXML
    private Label substance07270TradeCoinsLabel;
    @FXML
    private Label substance07270RubLabel;
    @FXML
    private Label remainsOfPsyTrackerLabel;
    @FXML
    private Label remainsOfPsyTrackerRemainsLabel;
    @FXML
    private Label remainsOfPsyTrackerTradeCoinsLabel;
    @FXML
    private Label remainsOfPsyTrackerRubLabel;
    @FXML
    private Label gammaDataFragmentLabel;
    @FXML
    private Label gammaDataFragmentRemainsLabel;
    @FXML
    private Label gammaDataFragmentTradeCoinsLabel;
    @FXML
    private Label gammaDataFragmentRubLabel;
    @FXML
    private Label quantumBatteryLabel;
    @FXML
    private Label quantumBatteryRemainsLabel;
    @FXML
    private Label quantumBatteryTradeCoinsLabel;
    @FXML
    private Label quantumBatteryRubLabel;
    @FXML
    private Label anomalousSerumLabel;
    @FXML
    private Label anomalousSerumRemainsLabel;

    private int group_6;
    private int group_6TradeCoins;
    @FXML
    private Label group_6Label;
    @FXML
    private Label group_6TradeCoinsLabel;
    @FXML
    private Label bitterleafLabel;
    @FXML
    private Label bitterleafRemainsLabel;
    @FXML
    private Label bitterleafTradeCoinsLabel;
    @FXML
    private Label bitterleafRubLabel;
    @FXML
    private Label limboLabel;
    @FXML
    private Label limboRemainsLabel;
    @FXML
    private Label limboTradeCoinsLabel;
    @FXML
    private Label limboRubLabel;
    @FXML
    private Label lambdaDataFragmentLabel;
    @FXML
    private Label lambdaDataFragmentRemainsLabel;
    @FXML
    private Label lambdaDataFragmentTradeCoinsLabel;
    @FXML
    private Label lambdaDataFragmentRubLabel;
    @FXML
    private Label anomalousBatteryLabel;
    @FXML
    private Label anomalousBatteryRemainsLabel;
    @FXML
    private Label anomalousBatteryTradeCoinsLabel;
    @FXML
    private Label anomalousBatteryRubLabel;
    @FXML
    private Label limboPlasmaLabel;
    @FXML
    private Label limboPlasmaRemainsLabel;
    @FXML
    private Label limboPlasmaTradeCoinsLabel;
    @FXML
    private Label limboPlasmaRubLabel;

    private int group_All;
    private int group_AllTradeCoins;
    @FXML
    private Label costLabel;
    @FXML
    private Label costRemainsLabel;
    @FXML
    private Label group_AllLabel;
    @FXML
    private Label group_AllTradeCoinsLabel;
    @FXML
    private Label tradeCoinsLabel;
    @FXML
    private Label tradeCoinsRemainsLabel;
    @FXML
    private Label arsenalPointsLabel;
    @FXML
    private Label seasonBoxLabel;
    @FXML
    private Label combatPassLevelLabel;

    private SciApplication sciApplication;
    private DecimalFormat decimalFormat = new DecimalFormat("###,###");

    @FXML
    private void initialize() {
        // Запрет на изменение разделителя
        splitPane.getDividers().get(0).positionProperty().addListener((observable,oldValue,newValue) -> {
            splitPane.setDividerPositions(0.25);});

        // Инициализация таблицы адресатов с тремя столбцами.
        idUserColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        /*idUserColumn.setCellFactory(column -> {
            return new TableCell<Person, Integer>() {
                @Override
                protected void updateItem(Integer item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty || getIndex() < 0) {
                        setText(null);
                    } else {
                        setText(Integer.toString(getIndex() + 1));
                    }
                }
            };
        });*/
        nicknameColumn.setCellValueFactory(cellData -> cellData.getValue().nicknameProperty());
        fractionColumn.setCellValueFactory(cellData -> cellData.getValue().fractionProperty());

        // Очистка дополнительной информации об адресате.
        showPersonDetails(null);

        // Слушаем изменения выбора, и при изменении отображаем дополнительную информацию об адресате.
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }

    //
    public TableView<Person> getPersonTable() {
        return personTable;
    }

    // Вызывается главным приложением, которое даёт на себя ссылку.
    public void setSciApplication(SciApplication sciApplication) {
        this.sciApplication = sciApplication;

        // Добавление в таблицу данных из наблюдаемого списка
        personTable.setItems(sciApplication.getPersonData());
    }

    public void showPersonDetails(Person person) {
        if (person != null) {
            nicknameFractionLabel.setText(person.getNickname()+ " - " + person.getFraction());

            group_1 = (person.getGreenMold() * 6) + (person.getSwampStone() * 12);
            group_1TradeCoins = (person.getGreenMoldRemains() * 1) + (person.getSwampStoneRemains() * 2);
            group_1Label.setText(decimalFormat.format(group_1));
            group_1TradeCoinsLabel.setText(decimalFormat.format(group_1TradeCoins));
            greenMoldLabel.setText(decimalFormat.format(person.getGreenMold()));
            greenMoldRemainsLabel.setText(decimalFormat.format(person.getGreenMoldRemains()));
            greenMoldTradeCoinsLabel.setText(decimalFormat.format(person.getGreenMoldRemains() * 1));
            greenMoldRubLabel.setText(decimalFormat.format(person.getGreenMold() * 6));
            swampStoneLabel.setText(decimalFormat.format(person.getSwampStone()));
            swampStoneRemainsLabel.setText(decimalFormat.format(person.getSwampStoneRemains()));
            swampStoneTradeCoinsLabel.setText(decimalFormat.format(person.getSwampStoneRemains() * 2));
            swampStoneRubLabel.setText(decimalFormat.format(person.getSwampStone() * 12));

            group_2 = (person.getStinkyRoot() * 16) + (person.getCrappite() * 24) + (person.getPiecesOfCopperWire() * 20);
            group_2TradeCoins = (person.getStinkyRootRemains() * 3) + (person.getCrappiteRemains() * 4) + (person.getPiecesOfCopperWireRemains() * 4);
            group_2Label.setText(decimalFormat.format(group_2));
            group_2TradeCoinsLabel.setText(decimalFormat.format(group_2TradeCoins));
            stinkyRootLabel.setText(decimalFormat.format(person.getStinkyRoot()));
            stinkyRootRemainsLabel.setText(decimalFormat.format(person.getStinkyRootRemains()));
            stinkyRootTradeCoinsLabel.setText(decimalFormat.format(person.getStinkyRootRemains() * 3));
            stinkyRootRubLabel.setText(decimalFormat.format(person.getStinkyRoot() * 16));
            crappiteLabel.setText(decimalFormat.format(person.getCrappite()));
            crappiteRemainsLabel.setText(decimalFormat.format(person.getCrappiteRemains()));
            crappiteTradeCoinsLabel.setText(decimalFormat.format(person.getCrappiteRemains() * 4));
            crappiteRubLabel.setText(decimalFormat.format(person.getCrappite() * 24));
            piecesOfCopperWireLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire()));
            piecesOfCopperWireRemainsLabel.setText(decimalFormat.format(person.getPiecesOfCopperWireRemains()));
            piecesOfCopperWireTradeCoinsLabel.setText(decimalFormat.format(person.getPiecesOfCopperWireRemains() * 4));
            piecesOfCopperWireRubLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire() * 20));

            group_3 = (person.getSprigOfChernobylChamomile() * 22) + (person.getPickle() * 32) + (person.getRemainsOfRadioTransmitter() * 25) + (person.getAlphaDataFragment() * 290);
            group_3TradeCoins = (person.getSprigOfChernobylChamomileRemains() * 4) + (person.getPickleRemains() * 6) + (person.getRemainsOfRadioTransmitterRemains() * 4) + (person.getAlphaDataFragmentRemains() * 21);
            group_3Label.setText(decimalFormat.format(group_3));
            group_3TradeCoinsLabel.setText(decimalFormat.format(group_3TradeCoins));
            sprigOfChernobylChamomileLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile()));
            sprigOfChernobylChamomileRemainsLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomileRemains()));
            sprigOfChernobylChamomileTradeCoinsLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomileRemains() * 4));
            sprigOfChernobylChamomileRubLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile() * 22));
            pickleLabel.setText(decimalFormat.format(person.getPickle()));
            pickleRemainsLabel.setText(decimalFormat.format(person.getPickleRemains()));
            pickleTradeCoinsLabel.setText(decimalFormat.format(person.getPickleRemains() * 6));
            pickleRubLabel.setText(decimalFormat.format(person.getPickle() * 32));
            remainsOfRadioTransmitterLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter()));
            remainsOfRadioTransmitterRemainsLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitterRemains()));
            remainsOfRadioTransmitterTradeCoinsLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitterRemains() * 4));
            remainsOfRadioTransmitterRubLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter() * 25));
            alphaDataFragmentLabel.setText(decimalFormat.format(person.getAlphaDataFragment()));
            alphaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getAlphaDataFragmentRemains()));
            alphaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(person.getAlphaDataFragmentRemains() * 21));
            alphaDataFragmentRubLabel.setText(decimalFormat.format(person.getAlphaDataFragment() * 290));

            group_4 = (person.getNorthernMoss() * 32) + (person.getDopeStone() * 40) + (person.getRemainsOfBatteries() * 36) + (person.getBetaDataFragment() * 600);
            group_4TradeCoins = (person.getNorthernMossRemains() * 5) + (person.getDopeStoneRemains() * 8) + (person.getRemainsOfBatteriesRemains() * 7) + (person.getBetaDataFragmentRemains() * 40);
            group_4Label.setText(decimalFormat.format(group_4));
            group_4TradeCoinsLabel.setText(decimalFormat.format(group_4TradeCoins));
            northernMossLabel.setText(decimalFormat.format(person.getNorthernMoss()));
            northernMossRemainsLabel.setText(decimalFormat.format(person.getNorthernMossRemains()));
            northernMossTradeCoinsLabel.setText(decimalFormat.format(person.getNorthernMossRemains() * 5));
            northernMossRubLabel.setText(decimalFormat.format(person.getNorthernMoss() * 32));
            dopeStoneLabel.setText(decimalFormat.format(person.getDopeStone()));
            dopeStoneRemainsLabel.setText(decimalFormat.format(person.getDopeStoneRemains()));
            dopeStoneTradeCoinsLabel.setText(decimalFormat.format(person.getDopeStoneRemains() * 8));
            dopeStoneRubLabel.setText(decimalFormat.format(person.getDopeStone() * 40));
            remainsOfBatteriesLabel.setText(decimalFormat.format(person.getRemainsOfBatteries()));
            remainsOfBatteriesRemainsLabel.setText(decimalFormat.format(person.getRemainsOfBatteriesRemains()));
            remainsOfBatteriesTradeCoinsLabel.setText(decimalFormat.format(person.getRemainsOfBatteriesRemains() * 7));
            remainsOfBatteriesRubLabel.setText(decimalFormat.format(person.getRemainsOfBatteries() * 36));
            betaDataFragmentLabel.setText(decimalFormat.format(person.getBetaDataFragment()));
            betaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getBetaDataFragmentRemains()));
            betaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(person.getBetaDataFragmentRemains() * 40));
            betaDataFragmentRubLabel.setText(decimalFormat.format(person.getBetaDataFragment() * 600));

            group_5 = (person.getRedFern() * 60) + (person.getSubstance07270() * 48) + (person.getRemainsOfPsyTracker() * 42) + (person.getGammaDataFragment() * 900) + (person.getQuantumBattery() * 450);
            group_5TradeCoins = (person.getRedFernRemains() * 10) + (person.getSubstance07270Remains() * 8) + (person.getRemainsOfPsyTrackerRemains() * 7) + (person.getGammaDataFragmentRemains() * 66) + (person.getQuantumBatteryRemains() * 42);
            group_5Label.setText(decimalFormat.format(group_5));
            group_5TradeCoinsLabel.setText(decimalFormat.format(group_5TradeCoins));
            redFernLabel.setText(decimalFormat.format(person.getRedFern()));
            redFernRemainsLabel.setText(decimalFormat.format(person.getRedFernRemains()));
            redFernTradeCoinsLabel.setText(decimalFormat.format(person.getRedFernRemains() * 10));
            redFernRubLabel.setText(decimalFormat.format(person.getRedFern() * 60));
            substance07270Label.setText(decimalFormat.format(person.getSubstance07270()));
            substance07270RemainsLabel.setText(decimalFormat.format(person.getSubstance07270Remains()));
            substance07270TradeCoinsLabel.setText(decimalFormat.format(person.getSubstance07270Remains() * 8));
            substance07270RubLabel.setText(decimalFormat.format(person.getSubstance07270() * 48));
            remainsOfPsyTrackerLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker()));
            remainsOfPsyTrackerRemainsLabel.setText(decimalFormat.format(person.getRemainsOfPsyTrackerRemains()));
            remainsOfPsyTrackerTradeCoinsLabel.setText(decimalFormat.format(person.getRemainsOfPsyTrackerRemains() * 7));
            remainsOfPsyTrackerRubLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker() * 42));
            gammaDataFragmentLabel.setText(decimalFormat.format(person.getGammaDataFragment()));
            gammaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getGammaDataFragmentRemains()));
            gammaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(person.getGammaDataFragmentRemains() * 66));
            gammaDataFragmentRubLabel.setText(decimalFormat.format(person.getGammaDataFragment() * 900));
            quantumBatteryLabel.setText(decimalFormat.format(person.getQuantumBattery()));
            quantumBatteryRemainsLabel.setText(decimalFormat.format(person.getQuantumBatteryRemains()));
            quantumBatteryTradeCoinsLabel.setText(decimalFormat.format(person.getQuantumBatteryRemains() * 42));
            quantumBatteryRubLabel.setText(decimalFormat.format(person.getQuantumBattery() * 450));
            anomalousSerumLabel.setText(decimalFormat.format(person.getAnomalousSerum()));
            anomalousSerumRemainsLabel.setText(decimalFormat.format(person.getAnomalousSerumRemains()));

            group_6 = (person.getBitterleaf() * 50) + (person.getLimbo() * 50) + (person.getLambdaDataFragment() * 900) + (person.getAnomalousBattery() * 2000) + (person.getLimboPlasma() * 3000);
            group_6TradeCoins = (person.getBitterleafRemains() * 16) + (person.getLimboRemains() * 20) + (person.getLambdaDataFragmentRemains() * 100) + (person.getAnomalousBatteryRemains() * 500) + (person.getLimboPlasmaRemains() * 800);
            group_6Label.setText(decimalFormat.format(group_6));
            group_6TradeCoinsLabel.setText(decimalFormat.format(group_6TradeCoins));
            bitterleafLabel.setText(decimalFormat.format(person.getBitterleaf()));
            bitterleafRemainsLabel.setText(decimalFormat.format(person.getBitterleafRemains()));
            bitterleafTradeCoinsLabel.setText(decimalFormat.format(person.getBitterleafRemains() * 16));
            bitterleafRubLabel.setText(decimalFormat.format(person.getBitterleaf() * 50));
            limboLabel.setText(decimalFormat.format(person.getLimbo()));
            limboRemainsLabel.setText(decimalFormat.format(person.getLimboRemains()));
            limboTradeCoinsLabel.setText(decimalFormat.format(person.getLimboRemains() * 20));
            limboRubLabel.setText(decimalFormat.format(person.getLimbo() * 50));
            lambdaDataFragmentLabel.setText(decimalFormat.format(person.getLambdaDataFragment()));
            lambdaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getLambdaDataFragmentRemains()));
            lambdaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(person.getLambdaDataFragmentRemains() * 100));
            lambdaDataFragmentRubLabel.setText(decimalFormat.format(person.getLambdaDataFragment() * 900));
            anomalousBatteryLabel.setText(decimalFormat.format(person.getAnomalousBattery()));
            anomalousBatteryRemainsLabel.setText(decimalFormat.format(person.getAnomalousBatteryRemains()));
            anomalousBatteryTradeCoinsLabel.setText(decimalFormat.format(person.getAnomalousBatteryRemains() * 500));
            anomalousBatteryRubLabel.setText(decimalFormat.format(person.getAnomalousBattery() * 2000));
            limboPlasmaLabel.setText(decimalFormat.format(person.getLimboPlasma()));
            limboPlasmaRemainsLabel.setText(decimalFormat.format(person.getLimboPlasmaRemains()));
            limboPlasmaTradeCoinsLabel.setText(decimalFormat.format(person.getLimboPlasmaRemains() * 800));
            limboPlasmaRubLabel.setText(decimalFormat.format(person.getLimboPlasma() * 3000));

            group_All = group_1 + group_2 + group_3 + group_4 + group_5 + group_6;
            group_AllTradeCoins = group_1TradeCoins + group_2TradeCoins + group_3TradeCoins + group_4TradeCoins + group_5TradeCoins + group_6TradeCoins;
            group_AllLabel.setText(decimalFormat.format(group_All));
            group_AllTradeCoinsLabel.setText(decimalFormat.format(group_AllTradeCoins));

            costLabel.setText(decimalFormat.format(person.getCost()));
            costRemainsLabel.setText(decimalFormat.format(person.getCostRemains()));
            tradeCoinsLabel.setText(decimalFormat.format(person.getTradeCoins()));
            tradeCoinsRemainsLabel.setText(decimalFormat.format(person.getTradeCoins() - group_AllTradeCoins));
            arsenalPointsLabel.setText(decimalFormat.format(person.getArsenalPoints()));
            seasonBoxLabel.setText(decimalFormat.format(person.getSeasonBox()));
            combatPassLevelLabel.setText(decimalFormat.format(person.getCombatPassLevel()));
        } else {
            nicknameFractionLabel.setText("");

            group_1Label.setText("-");
            group_1TradeCoinsLabel.setText("-");
            greenMoldLabel.setText("-");
            greenMoldRemainsLabel.setText("-");
            greenMoldTradeCoinsLabel.setText("-");
            greenMoldRubLabel.setText("-");
            swampStoneLabel.setText("-");
            swampStoneRemainsLabel.setText("-");
            swampStoneTradeCoinsLabel.setText("-");
            swampStoneRubLabel.setText("-");

            group_2Label.setText("-");
            group_2TradeCoinsLabel.setText("-");
            stinkyRootLabel.setText("-");
            stinkyRootRemainsLabel.setText("-");
            stinkyRootTradeCoinsLabel.setText("-");
            stinkyRootRubLabel.setText("-");
            crappiteLabel.setText("-");
            crappiteRemainsLabel.setText("-");
            crappiteTradeCoinsLabel.setText("-");
            crappiteRubLabel.setText("-");
            piecesOfCopperWireLabel.setText("-");
            piecesOfCopperWireRemainsLabel.setText("-");
            piecesOfCopperWireTradeCoinsLabel.setText("-");
            piecesOfCopperWireRubLabel.setText("-");

            group_3Label.setText("-");
            group_3TradeCoinsLabel.setText("-");
            sprigOfChernobylChamomileLabel.setText("-");
            sprigOfChernobylChamomileRemainsLabel.setText("-");
            sprigOfChernobylChamomileTradeCoinsLabel.setText("-");
            sprigOfChernobylChamomileRubLabel.setText("-");
            pickleLabel.setText("-");
            pickleRemainsLabel.setText("-");
            pickleTradeCoinsLabel.setText("-");
            pickleRubLabel.setText("-");
            remainsOfRadioTransmitterLabel.setText("-");
            remainsOfRadioTransmitterRemainsLabel.setText("-");
            remainsOfRadioTransmitterTradeCoinsLabel.setText("-");
            remainsOfRadioTransmitterRubLabel.setText("-");
            alphaDataFragmentLabel.setText("-");
            alphaDataFragmentRemainsLabel.setText("-");
            alphaDataFragmentTradeCoinsLabel.setText("-");
            alphaDataFragmentRubLabel.setText("-");

            group_4Label.setText("-");
            group_4TradeCoinsLabel.setText("-");
            northernMossLabel.setText("-");
            northernMossRemainsLabel.setText("-");
            northernMossTradeCoinsLabel.setText("-");
            northernMossRubLabel.setText("-");
            dopeStoneLabel.setText("-");
            dopeStoneRemainsLabel.setText("-");
            dopeStoneTradeCoinsLabel.setText("-");
            dopeStoneRubLabel.setText("-");
            remainsOfBatteriesLabel.setText("-");
            remainsOfBatteriesRemainsLabel.setText("-");
            remainsOfBatteriesTradeCoinsLabel.setText("-");
            remainsOfBatteriesRubLabel.setText("-");
            betaDataFragmentLabel.setText("-");
            betaDataFragmentRemainsLabel.setText("-");
            betaDataFragmentTradeCoinsLabel.setText("-");
            betaDataFragmentRubLabel.setText("-");

            group_5Label.setText("-");
            group_5TradeCoinsLabel.setText("-");
            redFernLabel.setText("-");
            redFernRemainsLabel.setText("-");
            redFernTradeCoinsLabel.setText("-");
            redFernRubLabel.setText("-");
            substance07270Label.setText("-");
            substance07270RemainsLabel.setText("-");
            substance07270TradeCoinsLabel.setText("-");
            substance07270RubLabel.setText("-");
            remainsOfPsyTrackerLabel.setText("-");
            remainsOfPsyTrackerRemainsLabel.setText("-");
            remainsOfPsyTrackerTradeCoinsLabel.setText("-");
            remainsOfPsyTrackerRubLabel.setText("-");
            gammaDataFragmentLabel.setText("-");
            gammaDataFragmentRemainsLabel.setText("-");
            gammaDataFragmentTradeCoinsLabel.setText("-");
            gammaDataFragmentRubLabel.setText("-");
            quantumBatteryLabel.setText("-");
            quantumBatteryRemainsLabel.setText("-");
            quantumBatteryTradeCoinsLabel.setText("-");
            quantumBatteryRubLabel.setText("-");
            anomalousSerumLabel.setText("-");
            anomalousSerumRemainsLabel.setText("-");

            group_6Label.setText("-");
            group_6TradeCoinsLabel.setText("-");
            bitterleafLabel.setText("-");
            bitterleafRemainsLabel.setText("-");
            bitterleafTradeCoinsLabel.setText("-");
            bitterleafRubLabel.setText("-");
            limboLabel.setText("-");
            limboRemainsLabel.setText("-");
            limboTradeCoinsLabel.setText("-");
            limboRubLabel.setText("-");
            lambdaDataFragmentLabel.setText("-");
            lambdaDataFragmentRemainsLabel.setText("-");
            lambdaDataFragmentTradeCoinsLabel.setText("-");
            lambdaDataFragmentRubLabel.setText("-");
            anomalousBatteryLabel.setText("-");
            anomalousBatteryRemainsLabel.setText("-");
            anomalousBatteryTradeCoinsLabel.setText("-");
            anomalousBatteryRubLabel.setText("-");
            limboPlasmaLabel.setText("-");
            limboPlasmaRemainsLabel.setText("-");
            limboPlasmaTradeCoinsLabel.setText("-");
            limboPlasmaRubLabel.setText("-");

            group_AllLabel.setText("-");
            group_AllTradeCoinsLabel.setText("-");

            costLabel.setText("-");
            costRemainsLabel.setText("-");
            tradeCoinsLabel.setText("-");
            tradeCoinsRemainsLabel.setText("-");
            arsenalPointsLabel.setText("-");
            seasonBoxLabel.setText("-");
            combatPassLevelLabel.setText("-");
        }
    }

    @FXML
    private void handlePersonInfoEdin() throws SQLException {
        Person person = personTable.getSelectionModel().getSelectedItem();
        if (person != null) {
            boolean okCliked = sciApplication.showPersonInfoEdin(person);
            if (okCliked) {
                showPersonDetails(person);
                SciDB.updatePersonInfo(person);
            }
        }
    }

    @FXML
    private void handleBarter() throws IOException {
        sciApplication.showBarter(this);
    }

    private void getGreenMoldRemains() {
        Person person = personTable.getSelectionModel().getSelectedItem();
        for(Barter barter : sciApplication.getBartersData()){
            if (barter.getId().equals("mw1704")){

                //greenMoldRemains = barter.getGreenMold() * sciApplication.getBarterMeleeWeaponsData().get(person.getId() - 1).getMw1704();
            }
        }
    }
}
