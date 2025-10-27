package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class PersonInfoController {
    private int group_1;
    private int group_2;
    private int group_3;
    private int group_4;
    private int group_5;
    private int group_6;
    private int group_All;

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

    @FXML
    private Label group_1Label;
    @FXML
    private Label greenMoldLabel;
    @FXML
    private Label greenMoldRubLabel;
    @FXML
    private Label swampStoneLabel;
    @FXML
    private Label swampStoneRubLabel;

    @FXML
    private Label group_2Label;
    @FXML
    private Label stinkyRootLabel;
    @FXML
    private Label stinkyRootRubLabel;
    @FXML
    private Label crappiteLabel;
    @FXML
    private Label crappiteRubLabel;
    @FXML
    private Label piecesOfCopperWireLabel;
    @FXML
    private Label piecesOfCopperWireRubLabel;

    @FXML
    private Label group_3Label;
    @FXML
    private Label sprigOfChernobylChamomileLabel;
    @FXML
    private Label sprigOfChernobylChamomileRubLabel;
    @FXML
    private Label pickleLabel;
    @FXML
    private Label pickleRubLabel;
    @FXML
    private Label remainsOfRadioTransmitterLabel;
    @FXML
    private Label remainsOfRadioTransmitterRubLabel;
    @FXML
    private Label alphaDataFragmentLabel;
    @FXML
    private Label alphaDataFragmentRubLabel;

    @FXML
    private Label group_4Label;
    @FXML
    private Label northernMossLabel;
    @FXML
    private Label northernMossRubLabel;
    @FXML
    private Label dopeStoneLabel;
    @FXML
    private Label dopeStoneRubLabel;
    @FXML
    private Label remainsOfBatteriesLabel;
    @FXML
    private Label remainsOfBatteriesRubLabel;
    @FXML
    private Label betaDataFragmentLabel;
    @FXML
    private Label betaDataFragmentRubLabel;

    @FXML
    private Label group_5Label;
    @FXML
    private Label redFernLabel;
    @FXML
    private Label redFernRubLabel;
    @FXML
    private Label substance07270Label;
    @FXML
    private Label substance07270RubLabel;
    @FXML
    private Label remainsOfPsyTrackerLabel;
    @FXML
    private Label remainsOfPsyTrackerRubLabel;
    @FXML
    private Label gammaDataFragmentLabel;
    @FXML
    private Label gammaDataFragmentRubLabel;
    @FXML
    private Label quantumBatteryLabel;
    @FXML
    private Label quantumBatteryRubLabel;
    @FXML
    private Label anomalousSerumLabel;

    @FXML
    private Label group_6Label;
    @FXML
    private Label bitterleafLabel;
    @FXML
    private Label bitterleafRubLabel;
    @FXML
    private Label limboLabel;
    @FXML
    private Label limboRubLabel;
    @FXML
    private Label lambdaDataFragmentLabel;
    @FXML
    private Label lambdaDataFragmentRubLabel;
    @FXML
    private Label anomalousBatteryLabel;
    @FXML
    private Label anomalousBatteryRubLabel;
    @FXML
    private Label limboPlasmaLabel;
    @FXML
    private Label limboPlasmaRubLabel;

    @FXML
    private Label group_AllLabel;
    @FXML
    private Label tradeCoinsLabel;
    @FXML
    private Label seasonBoxLabel;
    @FXML
    private Label arsenalPointsLabel;

    private SciApplication sciApplication;
    private DecimalFormat decimalFormat = new DecimalFormat("###,###");

    @FXML
    private void initialize() {
        splitPane.getDividers().get(0).positionProperty().addListener((observable,oldValue,newValue) -> {
            splitPane.setDividerPositions(0.25);});
        /*
        for (SplitPane.Divider divider : splitPane.getDividers()) {
            divider.positionProperty().addListener((observable, oldValue, newValue) -> {divider.setPosition(0.2);});
        }

         */
        // Инициализация таблицы адресатов с тремя столбцами.
        idUserColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nicknameColumn.setCellValueFactory(cellData -> cellData.getValue().nicknameProperty());
        fractionColumn.setCellValueFactory(cellData -> cellData.getValue().fractionProperty());

        // Очистка дополнительной информации об адресате.
        showPersonDetails(null);

        // Слушаем изменения выбора, и при изменении отображаем
        // дополнительную информацию об адресате.
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue));
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
            group_1Label.setText(decimalFormat.format(group_1));
            greenMoldLabel.setText(decimalFormat.format(person.getGreenMold()));
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

            tradeCoinsLabel.setText(decimalFormat.format(person.getTradeCoins()));
            seasonBoxLabel.setText(decimalFormat.format(person.getSeasonBox()));
            arsenalPointsLabel.setText(decimalFormat.format(person.getArsenalPoints()));
        } else {

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
