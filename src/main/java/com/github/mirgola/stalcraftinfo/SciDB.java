package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.BarterMeleeWeapons;

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

    // Заполнение списка из таблицы "User"
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

    // Заполнение списка из таблицы "MeleeWeaponsCount"
    public static void readMeleeWeaponsCount(SciApplication sciApplication) throws SQLException{
        ResultSet resultSet = statement.executeQuery("SELECT * FROM MeleeWeaponsCount");
        while (resultSet.next()){
            int idUser = resultSet.getInt("idUser");
            int mw1701 = resultSet.getInt("mw1701");
            int mw1702 = resultSet.getInt("mw1702");
            int mw1703 = resultSet.getInt("mw1703");
            int mw1704 = resultSet.getInt("mw1704");
            int mw1705 = resultSet.getInt("mw1705");
            int mw1706 = resultSet.getInt("mw1706");
            int mw1707 = resultSet.getInt("mw1707");
            int mw1708 = resultSet.getInt("mw1708");
            int mw1709 = resultSet.getInt("mw1709");
            int mw1710 = resultSet.getInt("mw1710");
            int mw1711 = resultSet.getInt("mw1711");
            int mw1712 = resultSet.getInt("mw1712");
            int mw1713 = resultSet.getInt("mw1713");
            int mw1714 = resultSet.getInt("mw1714");
            int mw1715 = resultSet.getInt("mw1715");
            int mw1716 = resultSet.getInt("mw1716");
            sciApplication.getBarterMeleeWeaponsData().add(new BarterMeleeWeapons(idUser, mw1701, mw1702, mw1703, mw1704, mw1705, mw1706, mw1707,
                    mw1708, mw1709, mw1710, mw1711, mw1712, mw1713, mw1714, mw1715, mw1716));
        }

        resultSet.close();
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
        if (person.getCost() != resultSetIdUser.getInt("cost")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET cost = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getCost());
            preparedStatement.executeUpdate();
        }
        if (person.getTradeCoins() != resultSetIdUser.getInt("tradeCoins")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET tradeCoins = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getTradeCoins());
            preparedStatement.executeUpdate();
        }
        if (person.getArsenalPoints() != resultSetIdUser.getInt("arsenalPoints")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET arsenalPoints = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getArsenalPoints());
            preparedStatement.executeUpdate();
        }
        if (person.getSeasonBox() != resultSetIdUser.getInt("seasonBox")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET seasonBox = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getSeasonBox());
            preparedStatement.executeUpdate();
        }
        if (person.getCombatPassLevel() != resultSetIdUser.getInt("combatPassLevel")) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET combatPassLevel = ? WHERE id = " + person.getId());
            preparedStatement.setInt(1, person.getSeasonBox());
            preparedStatement.executeUpdate();
        }

        resultSetIdUser.close();
        preparedStatement.close();
    }

    public static void updateBarterMeleeWeapons(Person person, BarterMeleeWeapons barterMeleeWeapons) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1701 = ? WHERE idUser = " + person.getId());
        ResultSet resultSetIdUser = statement.executeQuery("SELECT * FROM MeleeWeaponsCount WHERE idUser = " + person.getId());

        if (barterMeleeWeapons.getMw1701() != resultSetIdUser.getInt("mw1701")) {
            //preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1701 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1701());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1702() != resultSetIdUser.getInt("mw1702")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1702 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1702());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1703() != resultSetIdUser.getInt("mw1703")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1703 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1703());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1704() != resultSetIdUser.getInt("mw1704")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1704 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1704());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1705() != resultSetIdUser.getInt("mw1705")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1705 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1705());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1706() != resultSetIdUser.getInt("mw1706")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1706 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1706());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1707() != resultSetIdUser.getInt("mw1707")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1707 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1707());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1708() != resultSetIdUser.getInt("mw1708")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1708 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1708());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1709() != resultSetIdUser.getInt("mw1709")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1709 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1709());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1710() != resultSetIdUser.getInt("mw1710")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1710 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1710());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1711() != resultSetIdUser.getInt("mw1711")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1711 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1711());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1712() != resultSetIdUser.getInt("mw1712")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1712 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1712());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1713() != resultSetIdUser.getInt("mw1713")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1713 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1713());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1714() != resultSetIdUser.getInt("mw1714")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1714 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1714());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1715() != resultSetIdUser.getInt("mw1715")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1715 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1715());
            preparedStatement.executeUpdate();
        }

        if (barterMeleeWeapons.getMw1716() != resultSetIdUser.getInt("mw1716")) {
            preparedStatement = connection.prepareStatement("UPDATE MeleeWeaponsCount SET mw1716 = ? WHERE idUser = " + person.getId());
            preparedStatement.setInt(1, barterMeleeWeapons.getMw1716());
            preparedStatement.executeUpdate();
        }

        resultSetIdUser.close();
        preparedStatement.close();
    }

    public static void newUser(Person person) throws SQLException{
        statement.execute("INSERT INTO Users (id, nickname, fraction) VALUES ('" + person.getId() + "', '" + person.getNickname() + "', '" + person.getFraction() + "')");
        statement.execute("INSERT INTO MeleeWeaponsCount (idUser) VALUES ('" + person.getId() + "')");
    }

    public static void editUser(Person person) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Users SET nickname = ? WHERE id = " + person.getId());
        ResultSet resultSetIdUser = statement.executeQuery("SELECT * FROM Users WHERE id = " + person.getId());

        if (!person.getNickname().equals(resultSetIdUser.getString("nickname"))) {
            //preparedStatement = connection.prepareStatement("UPDATE Users SET nickname = ? WHERE id = " + person.getId());
            preparedStatement.setString(1, person.getNickname());
            preparedStatement.executeUpdate();
        }
        if (!person.getFraction().equals(resultSetIdUser.getInt("fraction"))) {
            preparedStatement = connection.prepareStatement("UPDATE Users SET fraction = ? WHERE id = " + person.getId());
            preparedStatement.setString(1, person.getFraction());
            preparedStatement.executeUpdate();
        }

        preparedStatement.close();
        resultSetIdUser.close();
    }

    public static void deleteUser(Person person) throws SQLException {
        statement.execute("DELETE FROM Users WHERE id = " + person.getId());
        statement.execute("DELETE FROM MeleeWeaponsCount WHERE idUser = " + person.getId());
    }

    public static void closeDB() throws ClassNotFoundException, SQLException{
        connection.close();
        statement.close();
        resultSet.close();
        System.out.println("База закрыта!");
    }
}
