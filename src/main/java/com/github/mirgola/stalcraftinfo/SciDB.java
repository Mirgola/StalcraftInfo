package com.github.mirgola.stalcraftinfo;

import java.sql.*;

public class SciDB {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    // Подключение к базе данных
    public static void conn() throws ClassNotFoundException, SQLException {
        connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:stalcraft_info_db.db");

        System.out.println("База Подключена!");

        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Users");
    }

    public static void readUsers(SciApplication sciApplication) throws SQLException{
        while(resultSet.next()) {
            int idUser = resultSet.getInt("id");
            String nickname = resultSet.getString("nickname");
            String fraction = resultSet.getString("fraction");
            int greenMold = resultSet.getInt("greenMold");
            int swampStone = resultSet.getInt("swampStone");
            int stinkyRoot = resultSet.getInt("stinkyRoot");
            int crappite = resultSet.getInt("crappite");
            int piecesOfCopperWire = resultSet.getInt("piecesOfCopperWire");
            int sprigOfChernobylChamomile = resultSet.getInt("sprigOfChernobylChamomile");
            int pickle = resultSet.getInt("pickle");
            int remainsOfRadioTransmitter = resultSet.getInt("remainsOfRadioTransmitter");
            int alphaDataFragment = resultSet.getInt("alphaDataFragment");
            int northernMoss = resultSet.getInt("northernMoss");
            int dopeStone = resultSet.getInt("dopeStone");
            int remainsOfBatteries = resultSet.getInt("remainsOfBatteries");
            int betaDataFragment = resultSet.getInt("betaDataFragment");
            int redFern = resultSet.getInt("redFern");
            int substance07270 = resultSet.getInt("substance07270");
            int remainsOfPsyTracker = resultSet.getInt("remainsOfPsyTracker");
            int gammaDataFragment = resultSet.getInt("gammaDataFragment");
            int quantumBattery = resultSet.getInt("quantumBattery");
            int anomalousSerum = resultSet.getInt("anomalousSerum");
            int bitterleaf = resultSet.getInt("bitterleaf");
            int limbo = resultSet.getInt("limbo");
            int lambdaDataFragment = resultSet.getInt("lambdaDataFragment");
            int anomalousBattery = resultSet.getInt("anomalousBattery");
            int limboPlasma = resultSet.getInt("limboPlasma");
            int cost = resultSet.getInt("cost");
            int tradeCoins = resultSet.getInt("tradeCoins");
            int arsenalPoints = resultSet.getInt("arsenalPoints");
            int seasonBox = resultSet.getInt("seasonBox");
            int combatPassLevel = resultSet.getInt("combatPassLevel");
            sciApplication.getPersonData().add(new Person(idUser, nickname, fraction, greenMold, swampStone, stinkyRoot, crappite,
                    piecesOfCopperWire, sprigOfChernobylChamomile, pickle, remainsOfRadioTransmitter, alphaDataFragment,
                    northernMoss, dopeStone, remainsOfBatteries, betaDataFragment, redFern, substance07270,
                    remainsOfPsyTracker, gammaDataFragment, quantumBattery, anomalousSerum, bitterleaf,
                    limbo, lambdaDataFragment, anomalousBattery, limboPlasma, cost, tradeCoins, arsenalPoints, seasonBox, combatPassLevel));
        }
    }

    public static void updateUsers(Person person) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Users SET greenMold = ? WHERE id = " + person.getId());
        ResultSet resultSetIdUser = statement.executeQuery("SELECT * FROM Users WHERE id = " + person.getId());

        if (person.getGreenMold() != resultSetIdUser.getInt("greenMold")) {
            //preparedStatement = connection.prepareStatement("UPDATE Users SET greenMold = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getGreenMold());
            preparedStatement.executeUpdate();
        }
        if (person.getSwampStone() != resultSetIdUser.getInt("swampStone")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET swampStone = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getSwampStone());
            preparedStatement.executeUpdate();
        }
        if (person.getStinkyRoot() != resultSetIdUser.getInt("stinkyRoot")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET stinkyRoot = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getStinkyRoot());
            preparedStatement.executeUpdate();
        }
        if (person.getCrappite() != resultSetIdUser.getInt("crappite")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET crappite = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getCrappite());
            preparedStatement.executeUpdate();
        }
        if (person.getPiecesOfCopperWire() != resultSetIdUser.getInt("piecesOfCopperWire")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET piecesOfCopperWire = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getPiecesOfCopperWire());
            preparedStatement.executeUpdate();
        }
        if (person.getSprigOfChernobylChamomile() != resultSetIdUser.getInt("sprigOfChernobylChamomile")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET sprigOfChernobylChamomile = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getSprigOfChernobylChamomile());
            preparedStatement.executeUpdate();
        }
        if (person.getPickle() != resultSetIdUser.getInt("pickle")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET pickle = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getPickle());
            preparedStatement.executeUpdate();
        }
        if (person.getRemainsOfRadioTransmitter() != resultSetIdUser.getInt("remainsOfRadioTransmitter")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET remainsOfRadioTransmitter = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getRemainsOfRadioTransmitter());
            preparedStatement.executeUpdate();
        }
        if (person.getAlphaDataFragment() != resultSetIdUser.getInt("alphaDataFragment")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET alphaDataFragment = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getAlphaDataFragment());
            preparedStatement.executeUpdate();
        }
        if (person.getNorthernMoss() != resultSetIdUser.getInt("northernMoss")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET northernMoss = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getNorthernMoss());
            preparedStatement.executeUpdate();
        }
        if (person.getDopeStone() != resultSetIdUser.getInt("dopeStone")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET dopeStone = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getDopeStone());
            preparedStatement.executeUpdate();
        }
        if (person.getRemainsOfBatteries() != resultSetIdUser.getInt("remainsOfBatteries")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET remainsOfBatteries = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getRemainsOfBatteries());
            preparedStatement.executeUpdate();
        }
        if (person.getBetaDataFragment() != resultSetIdUser.getInt("betaDataFragment")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET betaDataFragment = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getBetaDataFragment());
            preparedStatement.executeUpdate();
        }
        if (person.getRedFern() != resultSetIdUser.getInt("redFern")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET redFern = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getRedFern());
            preparedStatement.executeUpdate();
        }
        if (person.getSubstance07270() != resultSetIdUser.getInt("substance07270")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET substance07270 = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getSubstance07270());
            preparedStatement.executeUpdate();
        }
        if (person.getRemainsOfPsyTracker() != resultSetIdUser.getInt("remainsOfPsyTracker")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET remainsOfPsyTracker = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getRemainsOfPsyTracker());
            preparedStatement.executeUpdate();
        }
        if (person.getGammaDataFragment() != resultSetIdUser.getInt("gammaDataFragment")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET gammaDataFragment = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getGammaDataFragment());
            preparedStatement.executeUpdate();
        }
        if (person.getQuantumBattery() != resultSetIdUser.getInt("quantumBattery")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET quantumBattery = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getQuantumBattery());
            preparedStatement.executeUpdate();
        }
        if (person.getAnomalousSerum() != resultSetIdUser.getInt("anomalousSerum")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET anomalousSerum = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getAnomalousSerum());
            preparedStatement.executeUpdate();
        }
        if (person.getBitterleaf() != resultSetIdUser.getInt("bitterleaf")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET bitterleaf = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getBitterleaf());
            preparedStatement.executeUpdate();
        }
        if (person.getLimbo() != resultSetIdUser.getInt("limbo")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET limbo = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getLimbo());
            preparedStatement.executeUpdate();
        }
        if (person.getLambdaDataFragment() != resultSetIdUser.getInt("lambdaDataFragment")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET lambdaDataFragment = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getLambdaDataFragment());
            preparedStatement.executeUpdate();
        }
        if (person.getAnomalousBattery() != resultSetIdUser.getInt("anomalousBattery")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET anomalousBattery = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getAnomalousBattery());
            preparedStatement.executeUpdate();
        }
        if (person.getLimboPlasma() != resultSetIdUser.getInt("limboPlasma")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET limboPlasma = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getLimboPlasma());
            preparedStatement.executeUpdate();
        }
        if (person.getTradeCoins() != resultSetIdUser.getInt("tradeCoins")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET tradeCoins = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getTradeCoins());
            preparedStatement.executeUpdate();
        }
        if (person.getSeasonBox() != resultSetIdUser.getInt("seasonBox")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET seasonBox = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getSeasonBox());
            preparedStatement.executeUpdate();
        }
        if (person.getArsenalPoints() != resultSetIdUser.getInt("arsenalPoints")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET arsenalPoints = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getArsenalPoints());
            preparedStatement.executeUpdate();
        }

        resultSetIdUser.close();
        preparedStatement.close();
    }

    public static void closeDB() throws ClassNotFoundException, SQLException{
        connection.close();
        statement.close();
        resultSet.close();
        System.out.println("База закрыта!");
    }
}
