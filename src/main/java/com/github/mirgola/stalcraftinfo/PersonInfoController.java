package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.BarterMeleeWeapons;
import javafx.collections.ObservableList;
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

    private void showPersonDetails(Person person) {
        if (person != null) {
            nicknameFractionLabel.setText(person.getNickname()+ " - " + person.getFraction());

            group_1 = (person.getGreenMold() * 6) + (person.getSwampStone() * 12);
            //group_1TradeCoins;
            group_1Label.setText(decimalFormat.format(group_1));
            greenMoldLabel.setText(decimalFormat.format(person.getGreenMold()));
            greenMoldRemainsLabel.setText("");
            greenMoldTradeCoinsLabel.setText("");
            greenMoldRubLabel.setText(decimalFormat.format(person.getGreenMold() * 6));
            swampStoneLabel.setText(decimalFormat.format(person.getSwampStone()));
            swampStoneRubLabel.setText(decimalFormat.format(person.getSwampStone() * 12));

            group_2 = (person.getStinkyRoot() * 16) + (person.getCrappite() * 24) + (person.getPiecesOfCopperWire() * 20);
            group_2Label.setText(decimalFormat.format(group_2));
            stinkyRootLabel.setText(decimalFormat.format(person.getStinkyRoot()));
            stinkyRootRubLabel.setText(decimalFormat.format(person.getStinkyRoot() * 16));
            crappiteLabel.setText(decimalFormat.format(person.getCrappite()));
            crappiteRubLabel.setText(decimalFormat.format(person.getCrappite() * 24));
            piecesOfCopperWireLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire()));
            piecesOfCopperWireRubLabel.setText(decimalFormat.format(person.getPiecesOfCopperWire() * 20));

            group_3 = (person.getSprigOfChernobylChamomile() * 22) + (person.getPickle() * 32) + (person.getRemainsOfRadioTransmitter() * 25) + (person.getAlphaDataFragment() * 290);
            group_3Label.setText(decimalFormat.format(group_3));
            sprigOfChernobylChamomileLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile()));
            sprigOfChernobylChamomileRubLabel.setText(decimalFormat.format(person.getSprigOfChernobylChamomile() * 22));
            pickleLabel.setText(decimalFormat.format(person.getPickle()));
            pickleRubLabel.setText(decimalFormat.format(person.getPickle() * 32));
            remainsOfRadioTransmitterLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter()));
            remainsOfRadioTransmitterRubLabel.setText(decimalFormat.format(person.getRemainsOfRadioTransmitter() * 25));
            alphaDataFragmentLabel.setText(decimalFormat.format(person.getAlphaDataFragment()));
            alphaDataFragmentRubLabel.setText(decimalFormat.format(person.getAlphaDataFragment() * 290));

            group_4 = (person.getNorthernMoss() * 32) + (person.getDopeStone() * 40) + (person.getRemainsOfBatteries() * 36) + (person.getBetaDataFragment() * 600);
            group_4Label.setText(decimalFormat.format(group_4));
            northernMossLabel.setText(decimalFormat.format(person.getNorthernMoss()));
            northernMossRubLabel.setText(decimalFormat.format(person.getNorthernMoss() * 32));
            dopeStoneLabel.setText(decimalFormat.format(person.getDopeStone()));
            dopeStoneRubLabel.setText(decimalFormat.format(person.getDopeStone() * 40));
            remainsOfBatteriesLabel.setText(decimalFormat.format(person.getRemainsOfBatteries()));
            remainsOfBatteriesRubLabel.setText(decimalFormat.format(person.getRemainsOfBatteries() * 36));
            betaDataFragmentLabel.setText(decimalFormat.format(person.getBetaDataFragment()));
            betaDataFragmentRubLabel.setText(decimalFormat.format(person.getBetaDataFragment() * 600));

            group_5 = (person.getRedFern() * 60) + (person.getSubstance07270() * 48) + (person.getRemainsOfPsyTracker() * 42) + (person.getGammaDataFragment() * 900) + (person.getQuantumBattery() * 450);
            group_5Label.setText(decimalFormat.format(group_5));
            redFernLabel.setText(decimalFormat.format(person.getRedFern()));
            redFernRubLabel.setText(decimalFormat.format(person.getRedFern() * 60));
            substance07270Label.setText(decimalFormat.format(person.getSubstance07270()));
            substance07270RubLabel.setText(decimalFormat.format(person.getSubstance07270() * 48));
            remainsOfPsyTrackerLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker()));
            remainsOfPsyTrackerRubLabel.setText(decimalFormat.format(person.getRemainsOfPsyTracker() * 42));
            gammaDataFragmentLabel.setText(decimalFormat.format(person.getGammaDataFragment()));
            gammaDataFragmentRubLabel.setText(decimalFormat.format(person.getGammaDataFragment() * 900));
            quantumBatteryLabel.setText(decimalFormat.format(person.getQuantumBattery()));
            quantumBatteryRubLabel.setText(decimalFormat.format(person.getQuantumBattery() * 450));
            anomalousSerumLabel.setText(decimalFormat.format(person.getAnomalousSerum()));

            group_6 = (person.getBitterleaf() * 50) + (person.getLimbo() * 50) + (person.getLambdaDataFragment() * 900) + (person.getAnomalousBattery() * 2000) + (person.getLimboPlasma() * 3000);
            group_6Label.setText(decimalFormat.format(group_6));
            bitterleafLabel.setText(decimalFormat.format(person.getBitterleaf()));
            bitterleafRubLabel.setText(decimalFormat.format(person.getBitterleaf() * 50));
            limboLabel.setText(decimalFormat.format(person.getLimbo()));
            limboRubLabel.setText(decimalFormat.format(person.getLimbo() * 50));
            lambdaDataFragmentLabel.setText(decimalFormat.format(person.getLambdaDataFragment()));
            lambdaDataFragmentRubLabel.setText(decimalFormat.format(person.getLambdaDataFragment() * 900));
            anomalousBatteryLabel.setText(decimalFormat.format(person.getAnomalousBattery()));
            anomalousBatteryRubLabel.setText(decimalFormat.format(person.getAnomalousBattery() * 2000));
            limboPlasmaLabel.setText(decimalFormat.format(person.getLimboPlasma()));
            limboPlasmaRubLabel.setText(decimalFormat.format(person.getLimboPlasma() * 3000));

            group_All = group_1 + group_2 + group_3 + group_4 + group_5 + group_6;
            group_AllLabel.setText(decimalFormat.format(group_All));

            costLabel.setText(decimalFormat.format(person.getCost()));
            tradeCoinsLabel.setText(decimalFormat.format(person.getTradeCoins()));
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
    private void handlePersonEdin() throws SQLException {
        Person personEdit = personTable.getSelectionModel().getSelectedItem();
        if (personEdit != null) {
            boolean okCliked = sciApplication.showPersonEdin(personEdit);
            if (okCliked) {
                showPersonDetails(personEdit);
                SciDB.updateUsers(personEdit);
            }
        }
    }

    @FXML
    private void handleBarter() throws IOException {
        sciApplication.showBarter();
    }
}
