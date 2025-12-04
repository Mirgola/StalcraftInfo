package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.weapons.*;
import com.github.mirgola.stalcraftinfo.barter.BarterCount;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.function.Supplier;

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
    private CheckBox checkBox;

    @FXML
    private Label nicknameFractionLabel;

    private int group_1;
    private int group_1TradeCoins;
    private int greenMoldRemains;
    private int swampStoneRemains;
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
    private int stinkyRootRemains;
    private int crappiteRemains;
    private int piecesOfCopperWireRemains;
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
    private int sprigOfChernobylChamomileRemains;
    private int pickleRemains;
    private int remainsOfRadioTransmitterRemains;
    private int alphaDataFragmentRemains;
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
    private int northernMossRemains;
    private int dopeStoneRemains;
    private int remainsOfBatteriesRemains;
    private int betaDataFragmentRemains;
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
    private int redFernRemains;
    private int substance07270Remains;
    private int remainsOfPsyTrackerRemains;
    private int gammaDataFragmentRemains;
    private int quantumBatteryRemains;
    private int anomalousSerumRemains;
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
    private int bitterleafRemains;
    private int limboRemains;
    private int lambdaDataFragmentRemains;
    private int anomalousBatteryRemains;
    private int limboPlasmaRemains;
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

        checkBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
            Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
            if (selectedPerson != null) {
                updareRemainsLabrls(selectedPerson);
            }
        });
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
            greenMoldRemains = person.getGreenMold() - person.getGreenMoldRemains() < 0 ? person.getGreenMold() - person.getGreenMoldRemains() : 0;
            swampStoneRemains = person.getSwampStone() - person.getSwampStoneRemains() < 0 ? person.getSwampStone() - person.getSwampStoneRemains() : 0;
            group_1TradeCoins = (greenMoldRemains * -1) + (swampStoneRemains * -2);
            group_1Label.setText(decimalFormat.format(group_1));
            group_1TradeCoinsLabel.setText(decimalFormat.format(group_1TradeCoins));
            greenMoldLabel.setText(decimalFormat.format(person.getGreenMold()));
            //greenMoldRemainsLabel.setText(decimalFormat.format(greenMoldRemains));
            greenMoldTradeCoinsLabel.setText(decimalFormat.format(greenMoldRemains * -1));
            greenMoldRubLabel.setText(decimalFormat.format(person.getGreenMold() * 6));
            swampStoneLabel.setText(decimalFormat.format(person.getSwampStone()));
            //swampStoneRemainsLabel.setText(decimalFormat.format(swampStoneRemains));
            swampStoneTradeCoinsLabel.setText(decimalFormat.format(swampStoneRemains * -2));
            swampStoneRubLabel.setText(decimalFormat.format(person.getSwampStone() * 12));

            group_2 = (person.getStinkyRoot() * 16) + (person.getCrappite() * 24) + (person.getPiecesOfCopperWire() * 20);
            stinkyRootRemains = person.getStinkyRoot() - person.getStinkyRootRemains() < 0 ? person.getStinkyRoot() - person.getStinkyRootRemains() : 0;
            crappiteRemains = person.getCrappite() - person.getCrappiteRemains() < 0 ? person.getCrappite() - person.getCrappiteRemains() : 0;
            piecesOfCopperWireRemains = person.getPiecesOfCopperWire() - person.getPiecesOfCopperWireRemains() < 0 ? person.getPiecesOfCopperWire() - person.getPiecesOfCopperWireRemains() : 0;
            group_2TradeCoins = (stinkyRootRemains * -3) + (crappiteRemains * -4) + (piecesOfCopperWireRemains * -4);
            group_2Label.setText(decimalFormat.format(group_2));
            group_2TradeCoinsLabel.setText(decimalFormat.format(group_2TradeCoins));
            stinkyRootLabel.setText(decimalFormat.format(person.getStinkyRoot()));
            //stinkyRootRemainsLabel.setText(decimalFormat.format(stinkyRootRemains));
            stinkyRootTradeCoinsLabel.setText(decimalFormat.format(stinkyRootRemains * -3));
            stinkyRootRubLabel.setText(decimalFormat.format(person.getStinkyRoot() * 16));
            crappiteLabel.setText(decimalFormat.format(person.getCrappite()));
            //crappiteRemainsLabel.setText(decimalFormat.format(crappiteRemains));
            crappiteTradeCoinsLabel.setText(decimalFormat.format(crappiteRemains * -4));
            crappiteRubLabel.setText(decimalFormat.format(person.getCrappite() * 24));
            piecesOfCopperWireLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire()));
            //piecesOfCopperWireRemainsLabel.setText(decimalFormat.format(piecesOfCopperWireRemains));
            piecesOfCopperWireTradeCoinsLabel.setText(decimalFormat.format(piecesOfCopperWireRemains * -4));
            piecesOfCopperWireRubLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire() * 20));

            group_3 = (person.getSprigOfChernobylChamomile() * 22) + (person.getPickle() * 32) + (person.getRemainsOfRadioTransmitter() * 25) + (person.getAlphaDataFragment() * 80);
            sprigOfChernobylChamomileRemains = person.getSprigOfChernobylChamomile() - person.getSprigOfChernobylChamomileRemains() < 0 ? person.getSprigOfChernobylChamomile() - person.getSprigOfChernobylChamomileRemains() : 0;
            pickleRemains = person.getPickle() - person.getPickleRemains() < 0 ? person.getPickle() - person.getPickleRemains() : 0;
            remainsOfRadioTransmitterRemains = person.getRemainsOfRadioTransmitter() - person.getRemainsOfRadioTransmitterRemains() < 0 ? person.getRemainsOfRadioTransmitter() - person.getRemainsOfRadioTransmitterRemains() : 0;
            alphaDataFragmentRemains = person.getAlphaDataFragment() - person.getAlphaDataFragmentRemains() < 0 ? person.getAlphaDataFragment() - person.getAlphaDataFragmentRemains() : 0;
            group_3TradeCoins = (sprigOfChernobylChamomileRemains * -4) + (pickleRemains * -6) + (remainsOfRadioTransmitterRemains * -4) + (alphaDataFragmentRemains * -21);
            group_3Label.setText(decimalFormat.format(group_3));
            group_3TradeCoinsLabel.setText(decimalFormat.format(group_3TradeCoins));
            sprigOfChernobylChamomileLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile()));
            //sprigOfChernobylChamomileRemainsLabel.setText(decimalFormat.format(sprigOfChernobylChamomileRemains));
            sprigOfChernobylChamomileTradeCoinsLabel.setText(decimalFormat.format(sprigOfChernobylChamomileRemains * -4));
            sprigOfChernobylChamomileRubLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile() * 22));
            pickleLabel.setText(decimalFormat.format(person.getPickle()));
            //pickleRemainsLabel.setText(decimalFormat.format(pickleRemains));
            pickleTradeCoinsLabel.setText(decimalFormat.format(pickleRemains * -6));
            pickleRubLabel.setText(decimalFormat.format(person.getPickle() * 32));
            remainsOfRadioTransmitterLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter()));
            //remainsOfRadioTransmitterRemainsLabel.setText(decimalFormat.format(remainsOfRadioTransmitterRemains));
            remainsOfRadioTransmitterTradeCoinsLabel.setText(decimalFormat.format(remainsOfRadioTransmitterRemains * -4));
            remainsOfRadioTransmitterRubLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter() * 25));
            alphaDataFragmentLabel.setText(decimalFormat.format(person.getAlphaDataFragment()));
            //alphaDataFragmentRemainsLabel.setText(decimalFormat.format(alphaDataFragmentRemains));
            alphaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(alphaDataFragmentRemains * -21));
            alphaDataFragmentRubLabel.setText(decimalFormat.format(person.getAlphaDataFragment() * 80));

            group_4 = (person.getNorthernMoss() * 32) + (person.getDopeStone() * 40) + (person.getRemainsOfBatteries() * 36) + (person.getBetaDataFragment() * 90);
            northernMossRemains = person.getNorthernMoss() - person.getNorthernMossRemains() < 0 ? person.getNorthernMoss() - person.getNorthernMossRemains() : 0;
            dopeStoneRemains = person.getDopeStone() - person.getDopeStoneRemains() < 0 ? person.getDopeStone() - person.getDopeStoneRemains() : 0;
            remainsOfBatteriesRemains = person.getRemainsOfBatteries() - person.getRemainsOfBatteriesRemains() < 0 ? person.getRemainsOfBatteries() - person.getRemainsOfBatteriesRemains() : 0;
            betaDataFragmentRemains = person.getBetaDataFragment() - person.getBetaDataFragmentRemains() < 0 ? person.getBetaDataFragment() - person.getBetaDataFragmentRemains() : 0;
            group_4TradeCoins = (northernMossRemains * -5) + (dopeStoneRemains * -8) + (remainsOfBatteriesRemains * -7) + (betaDataFragmentRemains * -40);
            group_4Label.setText(decimalFormat.format(group_4));
            group_4TradeCoinsLabel.setText(decimalFormat.format(group_4TradeCoins));
            northernMossLabel.setText(decimalFormat.format(person.getNorthernMoss()));
            //northernMossRemainsLabel.setText(decimalFormat.format(northernMossRemains));
            northernMossTradeCoinsLabel.setText(decimalFormat.format(northernMossRemains * -5));
            northernMossRubLabel.setText(decimalFormat.format(person.getNorthernMoss() * 32));
            dopeStoneLabel.setText(decimalFormat.format(person.getDopeStone()));
            //dopeStoneRemainsLabel.setText(decimalFormat.format(dopeStoneRemains));
            dopeStoneTradeCoinsLabel.setText(decimalFormat.format(dopeStoneRemains * -8));
            dopeStoneRubLabel.setText(decimalFormat.format(person.getDopeStone() * 40));
            remainsOfBatteriesLabel.setText(decimalFormat.format(person.getRemainsOfBatteries()));
            //remainsOfBatteriesRemainsLabel.setText(decimalFormat.format(remainsOfBatteriesRemains));
            remainsOfBatteriesTradeCoinsLabel.setText(decimalFormat.format(remainsOfBatteriesRemains * -7));
            remainsOfBatteriesRubLabel.setText(decimalFormat.format(person.getRemainsOfBatteries() * 36));
            betaDataFragmentLabel.setText(decimalFormat.format(person.getBetaDataFragment()));
            //betaDataFragmentRemainsLabel.setText(decimalFormat.format(betaDataFragmentRemains));
            betaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(betaDataFragmentRemains * -40));
            betaDataFragmentRubLabel.setText(decimalFormat.format(person.getBetaDataFragment() * 90));

            group_5 = (person.getRedFern() * 60) + (person.getSubstance07270() * 48) + (person.getRemainsOfPsyTracker() * 42) + (person.getGammaDataFragment() * 100) + (person.getQuantumBattery() * 450);
            redFernRemains = person.getRedFern() - person.getRedFernRemains() < 0 ? person.getRedFern() - person.getRedFernRemains() : 0;
            substance07270Remains = person.getSubstance07270() - person.getSubstance07270Remains() < 0 ? person.getSubstance07270() - person.getSubstance07270Remains() : 0;
            remainsOfPsyTrackerRemains = person.getRemainsOfPsyTracker() - person.getRemainsOfPsyTrackerRemains() < 0 ? person.getRemainsOfPsyTracker() - person.getRemainsOfPsyTrackerRemains() : 0;
            gammaDataFragmentRemains = person.getGammaDataFragment() - person.getGammaDataFragmentRemains() < 0 ? person.getGammaDataFragment() - person.getGammaDataFragmentRemains() : 0;
            quantumBatteryRemains = person.getQuantumBattery() - person.getQuantumBatteryRemains() < 0 ? person.getQuantumBattery() - person.getQuantumBatteryRemains() : 0;
            anomalousSerumRemains = person.getAnomalousSerum() - person.getAnomalousSerumRemains() < 0 ? person.getAnomalousSerum() - person.getAnomalousSerumRemains() : 0;
            group_5TradeCoins = (redFernRemains * -10) + (substance07270Remains * -8) + (remainsOfPsyTrackerRemains * -7) + (gammaDataFragmentRemains * -66) + (quantumBatteryRemains * -42);
            group_5Label.setText(decimalFormat.format(group_5));
            group_5TradeCoinsLabel.setText(decimalFormat.format(group_5TradeCoins));
            redFernLabel.setText(decimalFormat.format(person.getRedFern()));
            //redFernRemainsLabel.setText(decimalFormat.format(redFernRemains));
            redFernTradeCoinsLabel.setText(decimalFormat.format(redFernRemains * -10));
            redFernRubLabel.setText(decimalFormat.format(person.getRedFern() * 60));
            substance07270Label.setText(decimalFormat.format(person.getSubstance07270()));
            //substance07270RemainsLabel.setText(decimalFormat.format(substance07270Remains));
            substance07270TradeCoinsLabel.setText(decimalFormat.format(substance07270Remains * -8));
            substance07270RubLabel.setText(decimalFormat.format(person.getSubstance07270() * 48));
            remainsOfPsyTrackerLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker()));
            //remainsOfPsyTrackerRemainsLabel.setText(decimalFormat.format(remainsOfPsyTrackerRemains));
            remainsOfPsyTrackerTradeCoinsLabel.setText(decimalFormat.format(remainsOfPsyTrackerRemains * -7));
            remainsOfPsyTrackerRubLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker() * 42));
            gammaDataFragmentLabel.setText(decimalFormat.format(person.getGammaDataFragment()));
            //gammaDataFragmentRemainsLabel.setText(decimalFormat.format(gammaDataFragmentRemains));
            gammaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(gammaDataFragmentRemains * -66));
            gammaDataFragmentRubLabel.setText(decimalFormat.format(person.getGammaDataFragment() * 100));
            quantumBatteryLabel.setText(decimalFormat.format(person.getQuantumBattery()));
            //quantumBatteryRemainsLabel.setText(decimalFormat.format(quantumBatteryRemains));
            quantumBatteryTradeCoinsLabel.setText(decimalFormat.format(quantumBatteryRemains * -42));
            quantumBatteryRubLabel.setText(decimalFormat.format(person.getQuantumBattery() * 450));
            anomalousSerumLabel.setText(decimalFormat.format(person.getAnomalousSerum()));
            //anomalousSerumRemainsLabel.setText(decimalFormat.format(anomalousSerumRemains));

            group_6 = (person.getBitterleaf() * 50) + (person.getLimbo() * 50) + (person.getLambdaDataFragment() * 100) + (person.getAnomalousBattery() * 2000) + (person.getLimboPlasma() * 3000);
            bitterleafRemains = person.getBitterleaf() - person.getBitterleafRemains() < 0 ? person.getBitterleaf() - person.getBitterleafRemains() : 0;
            limboRemains = person.getLimbo() - person.getLimboRemains() < 0 ? person.getLimbo() - person.getLimboRemains() : 0;
            lambdaDataFragmentRemains = person.getLambdaDataFragment() - person.getLambdaDataFragmentRemains() < 0 ? person.getLambdaDataFragment() - person.getLambdaDataFragmentRemains() : 0;
            anomalousBatteryRemains = person.getAnomalousBattery() - person.getAnomalousBatteryRemains() < 0 ? person.getAnomalousBattery() - person.getAnomalousBatteryRemains() : 0;
            limboPlasmaRemains = person.getLimboPlasma() - person.getLimboPlasmaRemains() < 0 ? person.getLimboPlasma() - person.getLimboPlasmaRemains() : 0;

            group_6TradeCoins = (bitterleafRemains * -16) + (limboRemains * -20) + (lambdaDataFragmentRemains * -100) + (anomalousBatteryRemains * -500) + (limboPlasmaRemains * -800);
            group_6Label.setText(decimalFormat.format(group_6));
            group_6TradeCoinsLabel.setText(decimalFormat.format(group_6TradeCoins));
            bitterleafLabel.setText(decimalFormat.format(person.getBitterleaf()));
            //bitterleafRemainsLabel.setText(decimalFormat.format(bitterleafRemains));
            bitterleafTradeCoinsLabel.setText(decimalFormat.format(bitterleafRemains * -16));
            bitterleafRubLabel.setText(decimalFormat.format(person.getBitterleaf() * 50));
            limboLabel.setText(decimalFormat.format(person.getLimbo()));
            //limboRemainsLabel.setText(decimalFormat.format(limboRemains));
            limboTradeCoinsLabel.setText(decimalFormat.format(limboRemains * -20));
            limboRubLabel.setText(decimalFormat.format(person.getLimbo() * 50));
            lambdaDataFragmentLabel.setText(decimalFormat.format(person.getLambdaDataFragment()));
            //lambdaDataFragmentRemainsLabel.setText(decimalFormat.format(lambdaDataFragmentRemains));
            lambdaDataFragmentTradeCoinsLabel.setText(decimalFormat.format(lambdaDataFragmentRemains * -100));
            lambdaDataFragmentRubLabel.setText(decimalFormat.format(person.getLambdaDataFragment() * 100));
            anomalousBatteryLabel.setText(decimalFormat.format(person.getAnomalousBattery()));
            //anomalousBatteryRemainsLabel.setText(decimalFormat.format(anomalousBatteryRemains));
            anomalousBatteryTradeCoinsLabel.setText(decimalFormat.format(anomalousBatteryRemains * -500));
            anomalousBatteryRubLabel.setText(decimalFormat.format(person.getAnomalousBattery() * 2000));
            limboPlasmaLabel.setText(decimalFormat.format(person.getLimboPlasma()));
            //limboPlasmaRemainsLabel.setText(decimalFormat.format(limboPlasmaRemains));
            limboPlasmaTradeCoinsLabel.setText(decimalFormat.format(limboPlasmaRemains * -800));
            limboPlasmaRubLabel.setText(decimalFormat.format(person.getLimboPlasma() * 3000));

            group_All = group_1 + group_2 + group_3 + group_4 + group_5 + group_6;
            group_AllTradeCoins = group_1TradeCoins + group_2TradeCoins + group_3TradeCoins + group_4TradeCoins + group_5TradeCoins + group_6TradeCoins;
            group_AllLabel.setText(decimalFormat.format(group_All));
            group_AllTradeCoinsLabel.setText(decimalFormat.format(group_AllTradeCoins));

            costLabel.setText(decimalFormat.format(person.getCost()));
            costRemainsLabel.setText(decimalFormat.format(person.getCost() - person.getCostRemains() < 0 ? person.getCost() - person.getCostRemains() : 0));
            tradeCoinsLabel.setText(decimalFormat.format(person.getTradeCoins()));
            tradeCoinsRemainsLabel.setText(decimalFormat.format(person.getTradeCoins() - group_AllTradeCoins < 0 ? person.getTradeCoins() - group_AllTradeCoins : 0));
            arsenalPointsLabel.setText(decimalFormat.format(person.getArsenalPoints()));
            seasonBoxLabel.setText(decimalFormat.format(person.getSeasonBox()));
            combatPassLevelLabel.setText(decimalFormat.format(person.getCombatPassLevel()));

            updareRemainsLabrls(person);

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

    private void updareRemainsLabrls(Person person) {
        if (checkBox.isSelected()) {
            greenMoldRemainsLabel.setText(decimalFormat.format(person.getGreenMold() - person.getGreenMoldRemains()));
            swampStoneRemainsLabel.setText(decimalFormat.format(person.getSwampStone() - person.getSwampStoneRemains()));

            stinkyRootRemainsLabel.setText(decimalFormat.format(person.getStinkyRoot() - person.getStinkyRootRemains()));
            crappiteRemainsLabel.setText(decimalFormat.format(person.getCrappite() - person.getCrappiteRemains()));
            piecesOfCopperWireRemainsLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire() - person.getPiecesOfCopperWireRemains()));

            sprigOfChernobylChamomileRemainsLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile() - person.getSprigOfChernobylChamomileRemains()));
            pickleRemainsLabel.setText(decimalFormat.format(person.getPickle() - person.getPickleRemains()));
            remainsOfRadioTransmitterRemainsLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter() - person.getRemainsOfRadioTransmitterRemains()));
            alphaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getAlphaDataFragment() - person.getAlphaDataFragmentRemains()));

            northernMossRemainsLabel.setText(decimalFormat.format(person.getNorthernMoss() - person.getNorthernMossRemains()));
            dopeStoneRemainsLabel.setText(decimalFormat.format(person.getDopeStone() - person.getDopeStoneRemains()));
            remainsOfBatteriesRemainsLabel.setText(decimalFormat.format(person.getRemainsOfBatteries() - person.getRemainsOfBatteriesRemains()));
            betaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getBetaDataFragment() - person.getBetaDataFragmentRemains()));

            redFernRemainsLabel.setText(decimalFormat.format(person.getRedFern() - person.getRedFernRemains()));
            substance07270RemainsLabel.setText(decimalFormat.format(person.getSubstance07270() - person.getSubstance07270Remains()));
            remainsOfPsyTrackerRemainsLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker() - person.getRemainsOfPsyTrackerRemains()));
            gammaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getGammaDataFragment() - person.getGammaDataFragmentRemains()));
            quantumBatteryRemainsLabel.setText(decimalFormat.format(person.getQuantumBattery() - person.getQuantumBatteryRemains()));
            anomalousSerumRemainsLabel.setText(decimalFormat.format(person.getAnomalousSerum() - person.getAnomalousSerumRemains()));

            bitterleafRemainsLabel.setText(decimalFormat.format(person.getBitterleaf() - person.getBitterleafRemains()));
            limboRemainsLabel.setText(decimalFormat.format(person.getLimbo() - person.getLimboRemains()));
            lambdaDataFragmentRemainsLabel.setText(decimalFormat.format(person.getLambdaDataFragment() - person.getLambdaDataFragmentRemains()));
            anomalousBatteryRemainsLabel.setText(decimalFormat.format(person.getAnomalousBattery() - person.getAnomalousBatteryRemains()));
            limboPlasmaRemainsLabel.setText(decimalFormat.format(person.getLimboPlasma() - person.getLimboPlasmaRemains()));
        } else {
            greenMoldRemainsLabel.setText(decimalFormat.format(greenMoldRemains));
            swampStoneRemainsLabel.setText(decimalFormat.format(swampStoneRemains));

            stinkyRootRemainsLabel.setText(decimalFormat.format(stinkyRootRemains));
            crappiteRemainsLabel.setText(decimalFormat.format(crappiteRemains));
            piecesOfCopperWireRemainsLabel.setText(decimalFormat.format(piecesOfCopperWireRemains));

            sprigOfChernobylChamomileRemainsLabel.setText(decimalFormat.format(sprigOfChernobylChamomileRemains));
            pickleRemainsLabel.setText(decimalFormat.format(pickleRemains));
            remainsOfRadioTransmitterRemainsLabel.setText(decimalFormat.format(remainsOfRadioTransmitterRemains));
            alphaDataFragmentRemainsLabel.setText(decimalFormat.format(alphaDataFragmentRemains));

            northernMossRemainsLabel.setText(decimalFormat.format(northernMossRemains));
            dopeStoneRemainsLabel.setText(decimalFormat.format(dopeStoneRemains));
            remainsOfBatteriesRemainsLabel.setText(decimalFormat.format(remainsOfBatteriesRemains));
            betaDataFragmentRemainsLabel.setText(decimalFormat.format(betaDataFragmentRemains));

            redFernRemainsLabel.setText(decimalFormat.format(redFernRemains));
            substance07270RemainsLabel.setText(decimalFormat.format(substance07270Remains));
            remainsOfPsyTrackerRemainsLabel.setText(decimalFormat.format(remainsOfPsyTrackerRemains));
            gammaDataFragmentRemainsLabel.setText(decimalFormat.format(gammaDataFragmentRemains));
            quantumBatteryRemainsLabel.setText(decimalFormat.format(quantumBatteryRemains));
            anomalousSerumRemainsLabel.setText(decimalFormat.format(anomalousSerumRemains));

            bitterleafRemainsLabel.setText(decimalFormat.format(bitterleafRemains));
            limboRemainsLabel.setText(decimalFormat.format(limboRemains));
            lambdaDataFragmentRemainsLabel.setText(decimalFormat.format(lambdaDataFragmentRemains));
            anomalousBatteryRemainsLabel.setText(decimalFormat.format(anomalousBatteryRemains));
            limboPlasmaRemainsLabel.setText(decimalFormat.format(limboPlasmaRemains));
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

    public void setRemains(Person person) {
        resetAllRemains(person);

        List<Supplier<List<? extends BarterCount>>> barterCountCollections = List.of(
                sciApplication::getAssaultRiflesCountData,          // 1.1
                sciApplication::getSubmachineGunsCountData,         // 1.2
                sciApplication::getMachineGunsCountData,            // 1.3
                sciApplication::getSniperRiflesCountData,           // 1.4
                sciApplication::getShotgunsAndRiflesCountData,      // 1.5
                sciApplication::getPistolsCountData,                // 1.6
                sciApplication::getMeleeWeaponsCountData,           // 1.7

                sciApplication::getBackpacksAndPouchesCountData,    // 2.1
                sciApplication::getContainersCountData,             // 2.2
                sciApplication::getDevicesCountData,                // 2.3
                sciApplication::getCosmeticsCountData,              // 2.4
                sciApplication::getAccessoriesCountData,            // 2.5
                sciApplication::getOtherCountData,                  // 2.6

                sciApplication::getMuzzlesAndSilencersCountData,    // 3.1
                sciApplication::getMagazinesCountData,              // 3.2
                sciApplication::getHanguardsAndBracketsCountData,   // 3.3
                sciApplication::getSightsCountData,                 // 3.4
                sciApplication::getHandlesCountData,                // 3.5
                sciApplication::getOtherAttachmentsCountData,       // 3.6

                sciApplication::getCombatCountData,                 // 4.1
                sciApplication::getCombinedCountData,               // 4.2
                sciApplication::getScientistCountData               // 4.3
        );

        barterCountCollections.forEach(collection ->{
            collection.get().stream()
                    .filter(c -> c.getIdPerson() == person.getId())
                    .findFirst()
                    .ifPresent(c -> {
                        sciApplication.getBartersData().stream()
                                .forEach(barter -> {
                                    int count = c.getCountByWeaponId(barter.getId());
                                    if (count > 0) {
                                        addBarterResources(person, barter, count);
                                    }
                                });
                    });
        });
    }

    private void resetAllRemains(Person person) {
        person.setCostRemains(0);

        person.setGreenMoldRemains(0);
        person.setSwampStoneRemains(0);

        person.setStinkyRootRemains(0);
        person.setCrappiteRemains(0);
        person.setPiecesOfCopperWireRemains(0);

        person.setSprigOfChernobylChamomileRemains(0);
        person.setPickleRemains(0);
        person.setRemainsOfRadioTransmitterRemains(0);
        person.setAlphaDataFragmentRemains(0);

        person.setNorthernMossRemains(0);
        person.setDopeStoneRemains(0);
        person.setRemainsOfBatteriesRemains(0);
        person.setBetaDataFragmentRemains(0);

        person.setRedFernRemains(0);
        person.setSubstance07270Remains(0);
        person.setRemainsOfPsyTrackerRemains(0);
        person.setGammaDataFragmentRemains(0);
        person.setQuantumBatteryRemains(0);
        person.setAnomalousSerumRemains(0);

        person.setBitterleafRemains(0);
        person.setLimboRemains(0);
        person.setLambdaDataFragmentRemains(0);
        person.setAnomalousBatteryRemains(0);
        person.setLimboPlasmaRemains(0);
    }

    private void addBarterResources(Person person, Barter barter, int count) {
        person.setCostRemains(person.getCostRemains() + barter.getCost() * count);

        person.setGreenMoldRemains(person.getGreenMoldRemains() + barter.getGreenMold() * count);
        person.setSwampStoneRemains(person.getSwampStoneRemains() + barter.getSwampStone() * count);

        person.setStinkyRootRemains(person.getStinkyRootRemains() + barter.getStinkyRoot() * count);
        person.setCrappiteRemains(person.getCrappiteRemains() + barter.getCrappite() * count);
        person.setPiecesOfCopperWireRemains(person.getPiecesOfCopperWireRemains() + barter.getPiecesOfCopperWire() * count);

        person.setSprigOfChernobylChamomileRemains(person.getSprigOfChernobylChamomileRemains() + barter.getSprigOfChernobylChamomile() * count);
        person.setPickleRemains(person.getPickleRemains() + barter.getPickle() * count);
        person.setRemainsOfRadioTransmitterRemains(person.getRemainsOfRadioTransmitterRemains() + barter.getRemainsOfRadioTransmitter() * count);
        person.setAlphaDataFragmentRemains(person.getAlphaDataFragmentRemains() + barter.getAlphaDataFragment() * count);

        person.setNorthernMossRemains(person.getNorthernMossRemains() + barter.getNorthernMoss() * count);
        person.setDopeStoneRemains(person.getDopeStoneRemains() + barter.getDopeStone() * count);
        person.setRemainsOfBatteriesRemains(person.getRemainsOfBatteriesRemains() + barter.getRemainsOfBatteries() * count);
        person.setBetaDataFragmentRemains(person.getBetaDataFragmentRemains() + barter.getBetaDataFragment() * count);

        person.setRedFernRemains(person.getRedFernRemains() + barter.getRedFern() * count);
        person.setSubstance07270Remains(person.getSubstance07270Remains() + barter.getSubstance07270() * count);
        person.setRemainsOfPsyTrackerRemains(person.getRemainsOfPsyTrackerRemains() + barter.getRemainsOfPsyTracker() * count);
        person.setGammaDataFragmentRemains(person.getGammaDataFragmentRemains() + barter.getGammaDataFragment() * count);
        person.setQuantumBatteryRemains(person.getQuantumBatteryRemains() + barter.getQuantumBattery() * count);
        person.setAnomalousSerumRemains(person.getAnomalousSerumRemains() + barter.getAnomalousSerum() * count);

        person.setBitterleafRemains(person.getBitterleafRemains() + barter.getBitterleaf() * count);
        person.setLimboRemains(person.getLimboRemains() + barter.getLimbo() * count);
        person.setLambdaDataFragmentRemains(person.getLambdaDataFragmentRemains() + barter.getLambdaDataFragment() * count);
        person.setAnomalousBatteryRemains(person.getAnomalousBatteryRemains() + barter.getAnomalousBattery() * count);
        person.setLimboPlasmaRemains(person.getLimboPlasmaRemains() + barter.getLimboPlasma() * count);
    }
}
