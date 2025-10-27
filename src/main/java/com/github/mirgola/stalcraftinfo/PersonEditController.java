package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class PersonEditController {
    @FXML
    private TextField greenMoldField;
    @FXML
    private TextField swampStoneField;

    @FXML
    private TextField stinkyRootField;
    @FXML
    private TextField crappiteField;
    @FXML
    private TextField piecesOfCopperWireField;

    @FXML
    private TextField sprigOfChernobylChamomileField;
    @FXML
    private TextField pickleField;
    @FXML
    private TextField remainsOfRadioTransmitterField;
    @FXML
    private TextField alphaDataFragmentField;

    @FXML
    private TextField northernMossField;
    @FXML
    private TextField dopeStoneField;
    @FXML
    private TextField remainsOfBatteriesField;
    @FXML
    private TextField betaDataFragmentField;

    @FXML
    private TextField redFernField;
    @FXML
    private TextField substance07270Field;
    @FXML
    private TextField remainsOfPsyTrackerField;
    @FXML
    private TextField gammaDataFragmentField;
    @FXML
    private TextField quantumBatteryField;
    @FXML
    private TextField anomalousSerumField;

    @FXML
    private TextField bitterleafField;
    @FXML
    private TextField limboField;
    @FXML
    private TextField lambdaDataFragmentField;
    @FXML
    private TextField anomalousBatteryField;
    @FXML
    private TextField limboPlasmaField;

    @FXML
    private TextField tradeCoinsField;
    @FXML
    private TextField seasonBoxField;
    @FXML
    private TextField arsenalPointsField;

    private Stage stage;
    private Person person;
    private boolean okClicked = false;
    private DecimalFormat decimalFormat = new DecimalFormat("###,###");

    @FXML
    private void initialize() {

    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setPerson(Person person) {
        this.person = person;

        greenMoldField.setText(Integer.toString(person.getGreenMold()));
        swampStoneField.setText(Integer.toString(person.getSwampStone()));

        stinkyRootField.setText(Integer.toString(person.getStinkyRoot()));
        crappiteField.setText(Integer.toString(person.getCrappite()));
        piecesOfCopperWireField.setText(Integer.toString(person.getPiecesOfCopperWire()));

        sprigOfChernobylChamomileField.setText(Integer.toString(person.getSprigOfChernobylChamomile()));
        pickleField.setText(Integer.toString(person.getPickle()));
        remainsOfRadioTransmitterField.setText(Integer.toString(person.getRemainsOfRadioTransmitter()));
        alphaDataFragmentField.setText(Integer.toString(person.getAlphaDataFragment()));

        northernMossField.setText(Integer.toString(person.getNorthernMoss()));
        dopeStoneField.setText(Integer.toString(person.getDopeStone()));
        remainsOfBatteriesField.setText(Integer.toString(person.getRemainsOfBatteries()));
        betaDataFragmentField.setText(Integer.toString(person.getBetaDataFragment()));

        redFernField.setText(Integer.toString(person.getRedFern()));
        substance07270Field.setText(Integer.toString(person.getSubstance07270()));
        remainsOfPsyTrackerField.setText(Integer.toString(person.getRemainsOfPsyTracker()));
        gammaDataFragmentField.setText(Integer.toString(person.getGammaDataFragment()));
        quantumBatteryField.setText(Integer.toString(person.getQuantumBattery()));
        anomalousSerumField.setText(Integer.toString(person.getAnomalousSerum()));

        bitterleafField.setText(Integer.toString(person.getBitterleaf()));
        limboField.setText(Integer.toString(person.getLimbo()));
        lambdaDataFragmentField.setText(Integer.toString(person.getLambdaDataFragment()));
        anomalousBatteryField.setText(Integer.toString(person.getAnomalousBattery()));
        limboPlasmaField.setText(Integer.toString(person.getLimboPlasma()));

        tradeCoinsField.setText(Integer.toString(person.getTradeCoins()));
        seasonBoxField.setText(Integer.toString(person.getSeasonBox()));
        arsenalPointsField.setText(Integer.toString(person.getArsenalPoints()));
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    // Вызывается, когда пользователь кликнул по кнопке Сохранить
    @FXML
    private void handleOk() {
        if (isInputValid()) {
            person.setGreenMold(Integer.parseInt(greenMoldField.getText()));
            person.setSwampStone(Integer.parseInt(swampStoneField.getText()));

            person.setStinkyRoot(Integer.parseInt(stinkyRootField.getText()));
            person.setCrappite(Integer.parseInt(crappiteField.getText()));
            person.setPiecesOfCopperWire(Integer.parseInt(piecesOfCopperWireField.getText()));

            person.setSprigOfChernobylChamomile(Integer.parseInt(sprigOfChernobylChamomileField.getText()));
            person.setPickle(Integer.parseInt(pickleField.getText()));
            person.setRemainsOfRadioTransmitter(Integer.parseInt(remainsOfRadioTransmitterField.getText()));
            person.setAlphaDataFragment(Integer.parseInt(alphaDataFragmentField.getText()));

            person.setNorthernMoss(Integer.parseInt(northernMossField.getText()));
            person.setDopeStone(Integer.parseInt(dopeStoneField.getText()));
            person.setRemainsOfBatteries(Integer.parseInt(remainsOfBatteriesField.getText()));
            person.setBetaDataFragment(Integer.parseInt(betaDataFragmentField.getText()));

            person.setRedFern(Integer.parseInt(redFernField.getText()));
            person.setSubstance07270(Integer.parseInt(substance07270Field.getText()));
            person.setRemainsOfPsyTracker(Integer.parseInt(remainsOfPsyTrackerField.getText()));
            person.setGammaDataFragment(Integer.parseInt(gammaDataFragmentField.getText()));
            person.setQuantumBattery(Integer.parseInt(quantumBatteryField.getText()));
            person.setAnomalousSerum(Integer.parseInt(anomalousSerumField.getText()));

            person.setBitterleaf(Integer.parseInt(bitterleafField.getText()));
            person.setLimbo(Integer.parseInt(limboField.getText()));
            person.setLambdaDataFragment(Integer.parseInt(lambdaDataFragmentField.getText()));
            person.setAnomalousBattery(Integer.parseInt(anomalousBatteryField.getText()));
            person.setLimboPlasma(Integer.parseInt(limboPlasmaField.getText()));

            person.setTradeCoins(Integer.parseInt(tradeCoinsField.getText()));
            person.setSeasonBox(Integer.parseInt(seasonBoxField.getText()));
            person.setArsenalPoints(Integer.parseInt(arsenalPointsField.getText()));

            okClicked = true;
            stage.close();
        }
    }

    // Вызывается, когда пользователь кликнул по кнопке Отмена
    @FXML
    private void handleCancel() {
        stage.close();
    }

    private  boolean isInputValid() {
        String errorMessage = "";

        if (greenMoldField.getText() == null || greenMoldField.getText().length() == 0) {
            errorMessage += "Нет действительных Зеленая плесень!\n";
        } else {
          try {
              Integer.parseInt(greenMoldField.getText());
          }  catch (NumberFormatException e) {
              errorMessage += "Нет действительных Зеленая плесень (должно быть целое число)!\n";
          }
        }

        if (swampStoneField.getText() == null || swampStoneField.getText().length() == 0) {
            errorMessage += "Нет действительных Болотный камень!\n";
        } else {
            try {
                Integer.parseInt(swampStoneField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Болотный камень (должно быть целое число)!\n";
            }
        }

        if (stinkyRootField.getText() == null || stinkyRootField.getText().length() == 0) {
            errorMessage += "Нет действительных Корень-вонючка!\n";
        } else {
            try {
                Integer.parseInt(stinkyRootField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Корень-вонючка (должно быть целое число)!\n";
            }
        }

        if (crappiteField.getText() == null || crappiteField.getText().length() == 0) {
            errorMessage += "Нет действительных Срачник!\n";
        } else {
            try {
                Integer.parseInt(crappiteField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Срачник (должно быть целое число)!\n";
            }
        }

        if (piecesOfCopperWireField.getText() == null || piecesOfCopperWireField.getText().length() == 0) {
            errorMessage += "Нет действительных Остатки медной проволки!\n";
        } else {
            try {
                Integer.parseInt(piecesOfCopperWireField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Остатки медной проволки (должно быть целое число)!\n";
            }
        }

        if (sprigOfChernobylChamomileField.getText() == null || sprigOfChernobylChamomileField.getText().length() == 0) {
            errorMessage += "Нет действительных Росток чернобыльской ромашки!\n";
        } else {
            try {
                Integer.parseInt(sprigOfChernobylChamomileField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Росток чернобыльской ромашки (должно быть целое число)!\n";
            }
        }

        if (pickleField.getText() == null || pickleField.getText().length() == 0) {
            errorMessage += "Нет действительных Рассольник!\n";
        } else {
            try {
                Integer.parseInt(pickleField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Рассольник (должно быть целое число)!\n";
            }
        }

        if (remainsOfRadioTransmitterField.getText() == null || remainsOfRadioTransmitterField.getText().length() == 0) {
            errorMessage += "Нет действительных Остатки радиопередатчика!\n";
        } else {
            try {
                Integer.parseInt(remainsOfRadioTransmitterField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Остатки радиопередатчика (должно быть целое число)!\n";
            }
        }

        if (alphaDataFragmentField.getText() == null || alphaDataFragmentField.getText().length() == 0) {
            errorMessage += "Нет действительных Фрагмент данных Альфа!\n";
        } else {
            try {
                Integer.parseInt(alphaDataFragmentField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Фрагмент данных Альфа (должно быть целое число)!\n";
            }
        }

        if (northernMossField.getText() == null || northernMossField.getText().length() == 0) {
            errorMessage += "Нет действительных Северный мох!\n";
        } else {
            try {
                Integer.parseInt(northernMossField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Северный мох (должно быть целое число)!\n";
            }
        }

        if (dopeStoneField.getText() == null || dopeStoneField.getText().length() == 0) {
            errorMessage += "Нет действительных Дурман-камень!\n";
        } else {
            try {
                Integer.parseInt(dopeStoneField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Дурман-камень (должно быть целое число)!\n";
            }
        }

        if (remainsOfBatteriesField.getText() == null || remainsOfBatteriesField.getText().length() == 0) {
            errorMessage += "Нет действительных Остатки аккумуляторов!\n";
        } else {
            try {
                Integer.parseInt(remainsOfBatteriesField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Остатки аккумуляторов (должно быть целое число)!\n";
            }
        }

        if (betaDataFragmentField.getText() == null || betaDataFragmentField.getText().length() == 0) {
            errorMessage += "Нет действительных Фрагмент данных Бета!\n";
        } else {
            try {
                Integer.parseInt(betaDataFragmentField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Фрагмент данных Бета (должно быть целое число)!\n";
            }
        }

        if (redFernField.getText() == null || redFernField.getText().length() == 0) {
            errorMessage += "Нет действительных Рыжий папоротник!\n";
        } else {
            try {
                Integer.parseInt(redFernField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Рыжий папоротник (должно быть целое число)!\n";
            }
        }

        if (substance07270Field.getText() == null || substance07270Field.getText().length() == 0) {
            errorMessage += "Нет действительных Вещество 07270!\n";
        } else {
            try {
                Integer.parseInt(substance07270Field.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Вещество 07270 (должно быть целое число)!\n";
            }
        }

        if (remainsOfPsyTrackerField.getText() == null || remainsOfPsyTrackerField.getText().length() == 0) {
            errorMessage += "Нет действительных Остатки пси-маячка!\n";
        } else {
            try {
                Integer.parseInt(remainsOfPsyTrackerField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Остатки пси-маячка (должно быть целое число)!\n";
            }
        }

        if (gammaDataFragmentField.getText() == null || gammaDataFragmentField.getText().length() == 0) {
            errorMessage += "Нет действительных Фрагмент данных Гамма!\n";
        } else {
            try {
                Integer.parseInt(gammaDataFragmentField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Фрагмент данных Гамма (должно быть целое число)!\n";
            }
        }

        if (quantumBatteryField.getText() == null || quantumBatteryField.getText().length() == 0) {
            errorMessage += "Нет действительных Квантовая батарея!\n";
        } else {
            try {
                Integer.parseInt(quantumBatteryField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Квантовая батарея (должно быть целое число)!\n";
            }
        }

        if (anomalousSerumField.getText() == null || anomalousSerumField.getText().length() == 0) {
            errorMessage += "Нет действительных Аномальная сыворотка!\n";
        } else {
            try {
                Integer.parseInt(anomalousSerumField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Аномальная сыворотка (должно быть целое число)!\n";
            }
        }

        if (bitterleafField.getText() == null || bitterleafField.getText().length() == 0) {
            errorMessage += "Нет действительных Горьколистник!\n";
        } else {
            try {
                Integer.parseInt(bitterleafField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Горьколистник (должно быть целое число)!\n";
            }
        }

        if (limboField.getText() == null || limboField.getText().length() == 0) {
            errorMessage += "Нет действительных Лимб!\n";
        } else {
            try {
                Integer.parseInt(limboField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Лимб (должно быть целое число)!\n";
            }
        }

        if (lambdaDataFragmentField.getText() == null || lambdaDataFragmentField.getText().length() == 0) {
            errorMessage += "Нет действительных Фрагмент данных Лямбда!\n";
        } else {
            try {
                Integer.parseInt(lambdaDataFragmentField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Фрагмент данных Лямбда (должно быть целое число)!\n";
            }
        }

        if (anomalousBatteryField.getText() == null || anomalousBatteryField.getText().length() == 0) {
            errorMessage += "Нет действительных Аномальная батарея!\n";
        } else {
            try {
                Integer.parseInt(anomalousBatteryField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Аномальная батарея (должно быть целое число)!\n";
            }
        }

        if (limboPlasmaField.getText() == null || limboPlasmaField.getText().length() == 0) {
            errorMessage += "Нет действительных Лимбоплазма!\n";
        } else {
            try {
                Integer.parseInt(limboPlasmaField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Лимбоплазма (должно быть целое число)!\n";
            }
        }

        if (tradeCoinsField.getText() == null || tradeCoinsField.getText().length() == 0) {
            errorMessage += "Нет действительных Обменные монеты!\n";
        } else {
            try {
                Integer.parseInt(tradeCoinsField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Обменные монеты (должно быть целое число)!\n";
            }
        }

        if (seasonBoxField.getText() == null || seasonBoxField.getText().length() == 0) {
            errorMessage += "Нет действительных Коробки сезона открыто!\n";
        } else {
            try {
                Integer.parseInt(seasonBoxField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Коробки сезона открыто (должно быть целое число)!\n";
            }
        }

        if (arsenalPointsField.getText() == null || arsenalPointsField.getText().length() == 0) {
            errorMessage += "Нет действительных Арсенал!\n";
        } else {
            try {
                Integer.parseInt(arsenalPointsField.getText());
            }  catch (NumberFormatException e) {
                errorMessage += "Нет действительных Арсенал (должно быть целое число)!\n";
            }
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Показываем сообщение об ошибке.
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(stage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
