package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.attachments.*;
import com.github.mirgola.stalcraftinfo.barter.suits.*;
import com.github.mirgola.stalcraftinfo.barter.weapons.*;
import com.github.mirgola.stalcraftinfo.barter.other.*;
import java.sql.*;

public class SciDB {
    private static boolean okClicked = false;
    private static Connection connection;
    private static Statement statement;
    private static final String[] tableName = {"W_AssaultRifles", "W_SubmachineGuns", "W_MachineGuns", "W_SniperRifles",
            "W_ShotgunsAndRifles", "W_Pistols", "W_MeleeWeapons", "O_BackpacksAndPouches", "O_Containers", "O_Devices",
            "O_Cosmetics", "O_Accessories", "O_Other", "A_MuzzlesAndSilencers", "A_Magazines", "A_HanguardsAndBrackets",
            "A_Sights", "A_Handles", "A_OtherAttachments", "S_Combat", "S_Combined", "S_Scientist"};

    private static final String[] tableNameCount = {"W_AssaultRiflesCount", "W_SubmachineGunsCount", "W_MachineGunsCount", "W_SniperRiflesCount",
            "W_ShotgunsAndRiflesCount", "W_PistolsCount", "W_MeleeWeaponsCount", "O_BackpacksAndPouchesCount", "O_ContainersCount", "O_DevicesCount",
            "O_CosmeticsCount", "O_AccessoriesCount", "O_OtherCount", "A_MuzzlesAndSilencersCount", "A_MagazinesCount", "A_HanguardsAndBracketsCount",
            "A_SightsCount", "A_HandlesCount", "A_OtherAttachmentsCount", "S_CombatCount", "S_CombinedCount", "S_ScientistCount"};

    public static boolean isOkClicked() {
        return okClicked;
    }

    public static void setOkClickedTrue() { okClicked = true;}

    public static void setOkClickedFalse() { okClicked = false;}

    // Подключение к базе данных
    public static void conn() throws ClassNotFoundException, SQLException {
        connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:stalcraft_info_db.db");

        System.out.println("База Подключена!");

        statement = connection.createStatement();
    }

    // Заполнение списка из таблицы "Person"
    public static void readUsers(SciApplication sciApplication) throws SQLException{
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Person");
        while(resultSet.next()) {
            int idPerson = resultSet.getInt("idPerson");
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

            int greenMoldRemains = resultSet.getInt("greenMoldRemains");
            int swampStoneRemains = resultSet.getInt("swampStoneRemains");
            int stinkyRootRemains = resultSet.getInt("stinkyRootRemains");
            int crappiteRemains = resultSet.getInt("crappiteRemains");
            int piecesOfCopperWireRemains = resultSet.getInt("piecesOfCopperWireRemains");
            int sprigOfChernobylChamomileRemains = resultSet.getInt("sprigOfChernobylChamomileRemains");
            int pickleRemains = resultSet.getInt("pickleRemains");
            int remainsOfRadioTransmitterRemains = resultSet.getInt("remainsOfRadioTransmitterRemains");
            int alphaDataFragmentRemains = resultSet.getInt("alphaDataFragmentRemains");
            int northernMossRemains = resultSet.getInt("northernMossRemains");
            int dopeStoneRemains = resultSet.getInt("dopeStoneRemains");
            int remainsOfBatteriesRemains = resultSet.getInt("remainsOfBatteriesRemains");
            int betaDataFragmentRemains = resultSet.getInt("betaDataFragmentRemains");
            int redFernRemains = resultSet.getInt("redFernRemains");
            int substance07270Remains = resultSet.getInt("substance07270Remains");
            int remainsOfPsyTrackerRemains = resultSet.getInt("remainsOfPsyTrackerRemains");
            int gammaDataFragmentRemains = resultSet.getInt("gammaDataFragmentRemains");
            int quantumBatteryRemains = resultSet.getInt("quantumBatteryRemains");
            int anomalousSerumRemains = resultSet.getInt("anomalousSerumRemains");
            int bitterleafRemains = resultSet.getInt("bitterleafRemains");
            int limboRemains = resultSet.getInt("limboRemains");
            int lambdaDataFragmentRemains = resultSet.getInt("lambdaDataFragmentRemains");
            int anomalousBatteryRemains = resultSet.getInt("anomalousBatteryRemains");
            int limboPlasmaRemains = resultSet.getInt("limboPlasmaRemains");
            int costRemains = resultSet.getInt("costRemains");

            sciApplication.getPersonData().add(new Person(idPerson, nickname, fraction, greenMold, swampStone, stinkyRoot, crappite,
                    piecesOfCopperWire, sprigOfChernobylChamomile, pickle, remainsOfRadioTransmitter, alphaDataFragment,
                    northernMoss, dopeStone, remainsOfBatteries, betaDataFragment, redFern, substance07270,
                    remainsOfPsyTracker, gammaDataFragment, quantumBattery, anomalousSerum, bitterleaf,
                    limbo, lambdaDataFragment, anomalousBattery, limboPlasma, cost, tradeCoins, arsenalPoints, seasonBox, combatPassLevel,
                    greenMoldRemains, swampStoneRemains, stinkyRootRemains, crappiteRemains, piecesOfCopperWireRemains, sprigOfChernobylChamomileRemains,
                    pickleRemains, remainsOfRadioTransmitterRemains, alphaDataFragmentRemains, northernMossRemains, dopeStoneRemains,
                    remainsOfBatteriesRemains, betaDataFragmentRemains, redFernRemains, substance07270Remains, remainsOfPsyTrackerRemains,
                    gammaDataFragmentRemains, quantumBatteryRemains, anomalousSerumRemains, bitterleafRemains, limboRemains,
                    lambdaDataFragmentRemains, anomalousBatteryRemains, limboPlasmaRemains, costRemains));
        }

        resultSet.close();
    }

    // Заполнение списка из всех таблиц предметов бартера
    public static void readBarter(SciApplication sciApplication) throws SQLException {
        for (String s : tableName) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM " + s)) {
                while(resultSet.next()) {
                    String id = resultSet.getString("id");
                    String name = resultSet.getString("name");
                    int cost = resultSet.getInt("cost");
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

                    sciApplication.getBartersData().add(new Barter(id, name, cost, greenMold, swampStone, stinkyRoot, crappite,
                            piecesOfCopperWire, sprigOfChernobylChamomile, pickle, remainsOfRadioTransmitter, alphaDataFragment,
                            northernMoss, dopeStone, remainsOfBatteries, betaDataFragment, redFern, substance07270,
                            remainsOfPsyTracker, gammaDataFragment, quantumBattery, anomalousSerum, bitterleaf,
                            limbo, lambdaDataFragment, anomalousBattery, limboPlasma));
                }
            }
        }
    }

    // 1.1 Заполнение списка из таблицы "AssaultRiflesCount"
    public static void readAssaultRiflesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_AssaultRiflesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int ar1101 = resultSet.getInt("ar1101");
                int ar1102 = resultSet.getInt("ar1102");
                int ar1103 = resultSet.getInt("ar1103");
                int ar1104 = resultSet.getInt("ar1104");
                int ar1105 = resultSet.getInt("ar1105");
                int ar1106 = resultSet.getInt("ar1106");
                int ar1107 = resultSet.getInt("ar1107");
                int ar1108 = resultSet.getInt("ar1108");
                int ar1109 = resultSet.getInt("ar1109");
                int ar1110 = resultSet.getInt("ar1110");
                int ar1111 = resultSet.getInt("ar1111");
                int ar1112 = resultSet.getInt("ar1112");
                int ar1113 = resultSet.getInt("ar1113");
                int ar1114 = resultSet.getInt("ar1114");
                int ar1115 = resultSet.getInt("ar1115");
                int ar1116 = resultSet.getInt("ar1116");
                int ar1117 = resultSet.getInt("ar1117");
                int ar1118 = resultSet.getInt("ar1118");
                int ar1119 = resultSet.getInt("ar1119");
                int ar1120 = resultSet.getInt("ar1120");
                int ar1121 = resultSet.getInt("ar1121");
                int ar1122 = resultSet.getInt("ar1122");
                int ar1123 = resultSet.getInt("ar1123");
                int ar1124 = resultSet.getInt("ar1124");
                int ar1125 = resultSet.getInt("ar1125");
                int ar1126 = resultSet.getInt("ar1126");
                int ar1127 = resultSet.getInt("ar1127");
                int ar1128 = resultSet.getInt("ar1128");
                int ar1129 = resultSet.getInt("ar1129");
                int ar1130 = resultSet.getInt("ar1130");
                int ar1131 = resultSet.getInt("ar1131");
                int ar1132 = resultSet.getInt("ar1132");
                int ar1133 = resultSet.getInt("ar1133");
                int ar1134 = resultSet.getInt("ar1134");

                sciApplication.getAssaultRiflesCountData().add(new AssaultRiflesCount(idPerson, nicknamePerson,
                        ar1101, ar1102, ar1103, ar1104, ar1105, ar1106, ar1107, ar1108, ar1109, ar1110,
                        ar1111, ar1112, ar1113, ar1114, ar1115, ar1116, ar1117, ar1118, ar1119, ar1120,
                        ar1121, ar1122, ar1123, ar1124, ar1125, ar1126, ar1127, ar1128, ar1129, ar1130,
                        ar1131, ar1132, ar1133, ar1134));
            }
        }
    }

    // 1.2 Заполнение списка из таблицы "SubmachineGunsCount"
    public static void readSubmachineGunsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_SubmachineGunsCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int sg1201 = resultSet.getInt("sg1201");
                int sg1202 = resultSet.getInt("sg1202");
                int sg1203 = resultSet.getInt("sg1203");
                int sg1204 = resultSet.getInt("sg1204");
                int sg1205 = resultSet.getInt("sg1205");
                int sg1206 = resultSet.getInt("sg1206");
                int sg1207 = resultSet.getInt("sg1207");
                int sg1208 = resultSet.getInt("sg1208");
                int sg1209 = resultSet.getInt("sg1209");
                int sg1210 = resultSet.getInt("sg1210");
                int sg1211 = resultSet.getInt("sg1211");
                int sg1212 = resultSet.getInt("sg1212");
                int sg1213 = resultSet.getInt("sg1213");
                int sg1214 = resultSet.getInt("sg1214");
                int sg1215 = resultSet.getInt("sg1215");
                int sg1216 = resultSet.getInt("sg1216");
                int sg1217 = resultSet.getInt("sg1217");
                int sg1218 = resultSet.getInt("sg1218");
                int sg1219 = resultSet.getInt("sg1219");
                int sg1220 = resultSet.getInt("sg1220");
                int sg1221 = resultSet.getInt("sg1221");

                sciApplication.getSubmachineGunsCountData().add(new SubmachineGunsCount(idPerson, nicknamePerson,
                        sg1201, sg1202, sg1203, sg1204, sg1205, sg1206, sg1207, sg1208, sg1209, sg1210,
                        sg1211, sg1212, sg1213, sg1214, sg1215, sg1216, sg1217, sg1218, sg1219, sg1220,
                        sg1221));
            }
        }
    }

    // 1.3 Заполнение списка из таблицы "MachineGunsCount"
    public static void readMachineGunsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_MachineGunsCount")) {
            while (resultSet.next()){
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int mg1301 = resultSet.getInt("mg1301");
                int mg1302 = resultSet.getInt("mg1302");
                int mg1303 = resultSet.getInt("mg1303");
                int mg1304 = resultSet.getInt("mg1304");
                int mg1305 = resultSet.getInt("mg1305");
                int mg1306 = resultSet.getInt("mg1306");
                sciApplication.getMachineGunsCountData().add(new MachineGunsCount(idPerson, nicknamePerson,
                        mg1301, mg1302, mg1303, mg1304, mg1305, mg1306));
            }
        }
    }

    // 1.4 Заполнение списка из таблицы "SniperRiflesCount"
    public static void readSniperRiflesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_SniperRiflesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int sr1401 = resultSet.getInt("sr1401");
                int sr1402 = resultSet.getInt("sr1402");
                int sr1403 = resultSet.getInt("sr1403");
                int sr1404 = resultSet.getInt("sr1404");
                int sr1405 = resultSet.getInt("sr1405");
                int sr1406 = resultSet.getInt("sr1406");
                int sr1407 = resultSet.getInt("sr1407");
                int sr1408 = resultSet.getInt("sr1408");
                int sr1409 = resultSet.getInt("sr1409");
                int sr1410 = resultSet.getInt("sr1410");
                int sr1411 = resultSet.getInt("sr1411");
                int sr1412 = resultSet.getInt("sr1412");
                int sr1413 = resultSet.getInt("sr1413");
                int sr1414 = resultSet.getInt("sr1414");
                int sr1415 = resultSet.getInt("sr1415");
                int sr1416 = resultSet.getInt("sr1416");
                int sr1417 = resultSet.getInt("sr1417");
                int sr1418 = resultSet.getInt("sr1418");
                int sr1419 = resultSet.getInt("sr1419");
                int sr1420 = resultSet.getInt("sr1420");
                int sr1421 = resultSet.getInt("sr1421");
                int sr1422 = resultSet.getInt("sr1422");

                sciApplication.getSniperRiflesCountData().add(new SniperRiflesCount(idPerson, nicknamePerson,
                        sr1401, sr1402, sr1403, sr1404, sr1405, sr1406, sr1407, sr1408, sr1409, sr1410,
                        sr1411, sr1412, sr1413, sr1414, sr1415, sr1416, sr1417, sr1418, sr1419, sr1420,
                        sr1421, sr1422));
            }
        }
    }

    // 1.5 Заполнение списка из таблицы "ShotgunsAndRiflesCount"
    public static void readShotgunsAndRiflesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_ShotgunsAndRiflesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int sar1501 = resultSet.getInt("sar1501");
                int sar1502 = resultSet.getInt("sar1502");
                int sar1503 = resultSet.getInt("sar1503");
                int sar1504 = resultSet.getInt("sar1504");
                int sar1505 = resultSet.getInt("sar1505");
                int sar1506 = resultSet.getInt("sar1506");
                int sar1507 = resultSet.getInt("sar1507");
                int sar1508 = resultSet.getInt("sar1508");
                int sar1509 = resultSet.getInt("sar1509");
                int sar1510 = resultSet.getInt("sar1510");
                int sar1511 = resultSet.getInt("sar1511");
                int sar1512 = resultSet.getInt("sar1512");
                int sar1513 = resultSet.getInt("sar1513");
                int sar1514 = resultSet.getInt("sar1514");
                int sar1515 = resultSet.getInt("sar1515");

                sciApplication.getShotgunsAndRiflesCountData().add(new ShotgunsAndRiflesCount(idPerson, nicknamePerson,
                        sar1501, sar1502, sar1503, sar1504, sar1505, sar1506, sar1507, sar1508, sar1509, sar1510,
                        sar1511, sar1512, sar1513, sar1514, sar1515));
            }
        }
    }

    // 1.6 Заполнение списка из таблицы "PistolsCount"
    public static void readPistolsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_PistolsCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int p1601 = resultSet.getInt("p1601");
                int p1602 = resultSet.getInt("p1602");
                int p1603 = resultSet.getInt("p1603");
                int p1604 = resultSet.getInt("p1604");
                int p1605 = resultSet.getInt("p1605");
                int p1606 = resultSet.getInt("p1606");
                int p1607 = resultSet.getInt("p1607");
                int p1608 = resultSet.getInt("p1608");
                int p1609 = resultSet.getInt("p1609");
                int p1610 = resultSet.getInt("p1610");
                int p1611 = resultSet.getInt("p1611");
                int p1612 = resultSet.getInt("p1612");
                int p1613 = resultSet.getInt("p1613");
                int p1614 = resultSet.getInt("p1614");
                int p1615 = resultSet.getInt("p1615");
                int p1616 = resultSet.getInt("p1616");
                int p1617 = resultSet.getInt("p1617");

                sciApplication.getPistolsCountData().add(new PistolsCount(idPerson, nicknamePerson,
                        p1601, p1602, p1603, p1604, p1605, p1606, p1607, p1608, p1609, p1610,
                        p1611, p1612, p1613, p1614, p1615, p1616, p1617));
            }
        }
    }

    // 1.7 Заполнение списка из таблицы "MeleeWeaponsCount"
    public static void readMeleeWeaponsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM W_MeleeWeaponsCount")) {
            while (resultSet.next()){
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
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
                sciApplication.getMeleeWeaponsCountData().add(new MeleeWeaponsCount(idPerson, nicknamePerson,
                        mw1701, mw1702, mw1703, mw1704, mw1705, mw1706, mw1707, mw1708, mw1709, mw1710,
                        mw1711, mw1712, mw1713, mw1714, mw1715, mw1716));
            }
        }
    }

    // 2.1 Заполнение списка из таблицы "BackpacksAndPouchesCount"
    public static void readBackpacksAndPouchesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM O_BackpacksAndPouchesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int bap2101 = resultSet.getInt("bap2101");
                int bap2102 = resultSet.getInt("bap2102");
                int bap2103 = resultSet.getInt("bap2103");
                int bap2104 = resultSet.getInt("bap2104");
                int bap2105 = resultSet.getInt("bap2105");
                int bap2106 = resultSet.getInt("bap2106");
                int bap2107 = resultSet.getInt("bap2107");
                int bap2108 = resultSet.getInt("bap2108");
                int bap2109 = resultSet.getInt("bap2109");
                int bap2110 = resultSet.getInt("bap2110");
                int bap2111 = resultSet.getInt("bap2111");
                int bap2112 = resultSet.getInt("bap2112");
                int bap2113 = resultSet.getInt("bap2113");
                int bap2114 = resultSet.getInt("bap2114");
                int bap2115 = resultSet.getInt("bap2115");
                int bap2116 = resultSet.getInt("bap2116");
                int bap2117 = resultSet.getInt("bap2117");

                sciApplication.getBackpacksAndPouchesCountData().add(new BackpacksAndPouchesCount(idPerson, nicknamePerson,
                        bap2101, bap2102, bap2103, bap2104, bap2105, bap2106, bap2107, bap2108, bap2109, bap2110,
                        bap2111, bap2112, bap2113, bap2114, bap2115, bap2116, bap2117));
            }
        }
    }

    // 2.2 Заполнение списка из таблицы "ContainersCount"
    public static void readContainersCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM O_ContainersCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int c2201 = resultSet.getInt("c2201");
                int c2202 = resultSet.getInt("c2202");
                int c2203 = resultSet.getInt("c2203");
                int c2204 = resultSet.getInt("c2204");
                int c2205 = resultSet.getInt("c2205");
                int c2206 = resultSet.getInt("c2206");
                int c2207 = resultSet.getInt("c2207");
                int c2208 = resultSet.getInt("c2208");
                int c2209 = resultSet.getInt("c2209");
                int c2210 = resultSet.getInt("c2210");
                int c2211 = resultSet.getInt("c2211");
                int c2212 = resultSet.getInt("c2212");
                int c2213 = resultSet.getInt("c2213");
                int c2214 = resultSet.getInt("c2214");
                int c2215 = resultSet.getInt("c2215");
                int c2216 = resultSet.getInt("c2216");
                int c2217 = resultSet.getInt("c2217");
                int c2218 = resultSet.getInt("c2218");
                int c2219 = resultSet.getInt("c2219");
                int c2220 = resultSet.getInt("c2220");
                int c2221 = resultSet.getInt("c2221");
                int c2222 = resultSet.getInt("c2222");

                sciApplication.getContainersCountData().add(new ContainersCount(idPerson, nicknamePerson,
                        c2201, c2202, c2203, c2204, c2205, c2206, c2207, c2208, c2209, c2210,
                        c2211, c2212, c2213, c2214, c2215, c2216, c2217, c2218, c2219, c2220,
                        c2221, c2222));
            }
        }
    }

    // 2.3 Заполнение списка из таблицы "DevicesCount"
    public static void readDevicesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM O_DevicesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int d2301 = resultSet.getInt("d2301");
                int d2302 = resultSet.getInt("d2302");
                int d2303 = resultSet.getInt("d2303");
                int d2304 = resultSet.getInt("d2304");
                int d2305 = resultSet.getInt("d2305");
                int d2306 = resultSet.getInt("d2306");
                int d2307 = resultSet.getInt("d2307");
                int d2308 = resultSet.getInt("d2308");
                int d2309 = resultSet.getInt("d2309");
                int d2310 = resultSet.getInt("d2310");
                int d2311 = resultSet.getInt("d2311");

                sciApplication.getDevicesCountData().add(new DevicesCount(idPerson, nicknamePerson,
                        d2301, d2302, d2303, d2304, d2305, d2306, d2307, d2308, d2309, d2310,
                        d2311));
            }
        }
    }

    // 2.4 Заполнение списка из таблицы "CosmeticsCount"
    public static void readCosmeticsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM O_CosmeticsCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int c2401 = resultSet.getInt("c2401");
                int c2402 = resultSet.getInt("c2402");
                int c2403 = resultSet.getInt("c2403");

                sciApplication.getCosmeticsCountData().add(new CosmeticsCount(idPerson, nicknamePerson,
                        c2401, c2402, c2403));
            }
        }
    }

    // 2.5 Заполнение списка из таблицы "AccessoriesCount"
    public static void readAccessoriesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM O_AccessoriesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int a2501 = resultSet.getInt("a2501");
                int a2502 = resultSet.getInt("a2502");
                int a2503 = resultSet.getInt("a2503");
                int a2504 = resultSet.getInt("a2504");
                int a2505 = resultSet.getInt("a2505");
                int a2506 = resultSet.getInt("a2506");

                sciApplication.getAccessoriesCountData().add(new AccessoriesCount(idPerson, nicknamePerson,
                        a2501, a2502, a2503, a2504, a2505, a2506));
            }
        }
    }

    // 2.6 Заполнение списка из таблицы "OtherCount"
    public static void readOtherCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM O_OtherCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int o2601 = resultSet.getInt("o2601");
                int o2602 = resultSet.getInt("o2602");

                sciApplication.getOtherCountData().add(new OtherCount(idPerson, nicknamePerson,
                        o2601, o2602));
            }
        }
    }

    // 3.1 Заполнение списка из таблицы "MuzzlesAndSilencersCount"
    public static void readMuzzlesAndSilencersCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM A_MuzzlesAndSilencersCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int mas3101 = resultSet.getInt("mas3101");
                int mas3102 = resultSet.getInt("mas3102");
                int mas3103 = resultSet.getInt("mas3103");
                int mas3104 = resultSet.getInt("mas3104");
                int mas3105 = resultSet.getInt("mas3105");
                int mas3106 = resultSet.getInt("mas3106");
                int mas3107 = resultSet.getInt("mas3107");
                int mas3108 = resultSet.getInt("mas3108");
                int mas3109 = resultSet.getInt("mas3109");
                int mas3110 = resultSet.getInt("mas3110");
                int mas3111 = resultSet.getInt("mas3111");
                int mas3112 = resultSet.getInt("mas3112");
                int mas3113 = resultSet.getInt("mas3113");
                int mas3114 = resultSet.getInt("mas3114");
                int mas3115 = resultSet.getInt("mas3115");
                int mas3116 = resultSet.getInt("mas3116");
                int mas3117 = resultSet.getInt("mas3117");
                int mas3118 = resultSet.getInt("mas3118");
                int mas3119 = resultSet.getInt("mas3119");
                int mas3120 = resultSet.getInt("mas3120");
                int mas3121 = resultSet.getInt("mas3121");
                int mas3122 = resultSet.getInt("mas3122");
                int mas3123 = resultSet.getInt("mas3123");
                int mas3124 = resultSet.getInt("mas3124");
                int mas3125 = resultSet.getInt("mas3125");
                int mas3126 = resultSet.getInt("mas3126");
                int mas3127 = resultSet.getInt("mas3127");
                int mas3128 = resultSet.getInt("mas3128");
                int mas3129 = resultSet.getInt("mas3129");
                int mas3130 = resultSet.getInt("mas3130");
                int mas3131 = resultSet.getInt("mas3131");
                int mas3132 = resultSet.getInt("mas3132");
                int mas3133 = resultSet.getInt("mas3133");
                int mas3134 = resultSet.getInt("mas3134");
                int mas3135 = resultSet.getInt("mas3135");
                int mas3136 = resultSet.getInt("mas3136");
                int mas3137 = resultSet.getInt("mas3137");
                int mas3138 = resultSet.getInt("mas3138");
                int mas3139 = resultSet.getInt("mas3139");
                int mas3140 = resultSet.getInt("mas3140");
                int mas3141 = resultSet.getInt("mas3141");
                int mas3142 = resultSet.getInt("mas3142");
                int mas3143 = resultSet.getInt("mas3143");
                int mas3144 = resultSet.getInt("mas3144");
                int mas3145 = resultSet.getInt("mas3145");
                int mas3146 = resultSet.getInt("mas3146");
                int mas3147 = resultSet.getInt("mas3147");
                int mas3148 = resultSet.getInt("mas3148");
                int mas3149 = resultSet.getInt("mas3149");
                int mas3150 = resultSet.getInt("mas3150");
                int mas3151 = resultSet.getInt("mas3151");
                int mas3152 = resultSet.getInt("mas3152");
                int mas3153 = resultSet.getInt("mas3153");
                int mas3154 = resultSet.getInt("mas3154");

                sciApplication.getMuzzlesAndSilencersCountData().add(new MuzzlesAndSilencersCount(idPerson, nicknamePerson,
                        mas3101, mas3102, mas3103, mas3104, mas3105, mas3106, mas3107, mas3108, mas3109, mas3110,
                        mas3111, mas3112, mas3113, mas3114, mas3115, mas3116, mas3117, mas3118, mas3119, mas3120,
                        mas3121, mas3122, mas3123, mas3124, mas3125, mas3126, mas3127, mas3128, mas3129, mas3130,
                        mas3131, mas3132, mas3133, mas3134, mas3135, mas3136, mas3137, mas3138, mas3139, mas3140,
                        mas3141, mas3142, mas3143, mas3144, mas3145, mas3146, mas3147, mas3148, mas3149, mas3150,
                        mas3151, mas3152, mas3153, mas3154));
            }
        }
    }

    // 3.2 Заполнение списка из таблицы "MagazinesCount"
    public static void readMagazinesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM A_MagazinesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int m3201 = resultSet.getInt("m3201");
                int m3202 = resultSet.getInt("m3202");
                int m3203 = resultSet.getInt("m3203");
                int m3204 = resultSet.getInt("m3204");
                int m3205 = resultSet.getInt("m3205");
                int m3206 = resultSet.getInt("m3206");
                int m3207 = resultSet.getInt("m3207");
                int m3208 = resultSet.getInt("m3208");
                int m3209 = resultSet.getInt("m3209");
                int m3210 = resultSet.getInt("m3210");
                int m3211 = resultSet.getInt("m3211");
                int m3212 = resultSet.getInt("m3212");
                int m3213 = resultSet.getInt("m3213");
                int m3214 = resultSet.getInt("m3214");
                int m3215 = resultSet.getInt("m3215");
                int m3216 = resultSet.getInt("m3216");
                int m3217 = resultSet.getInt("m3217");
                int m3218 = resultSet.getInt("m3218");
                int m3219 = resultSet.getInt("m3219");
                int m3220 = resultSet.getInt("m3220");
                int m3221 = resultSet.getInt("m3221");
                int m3222 = resultSet.getInt("m3222");
                int m3223 = resultSet.getInt("m3223");
                int m3224 = resultSet.getInt("m3224");
                int m3225 = resultSet.getInt("m3225");
                int m3226 = resultSet.getInt("m3226");
                int m3227 = resultSet.getInt("m3227");
                int m3228 = resultSet.getInt("m3228");
                int m3229 = resultSet.getInt("m3229");
                int m3230 = resultSet.getInt("m3230");
                int m3231 = resultSet.getInt("m3231");

                sciApplication.getMagazinesCountData().add(new MagazinesCount(idPerson, nicknamePerson,
                        m3201, m3202, m3203, m3204, m3205, m3206, m3207, m3208, m3209, m3210,
                        m3211, m3212, m3213, m3214, m3215, m3216, m3217, m3218, m3219, m3220,
                        m3221, m3222, m3223, m3224, m3225, m3226, m3227, m3228, m3229, m3230,
                        m3231));
            }
        }
    }

    // 3.3 Заполнение списка из таблицы "HanguardsAndBracketsCount"
    public static void readHanguardsAndBracketsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM A_HanguardsAndBracketsCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int hab3301 = resultSet.getInt("hab3301");
                int hab3302 = resultSet.getInt("hab3302");
                int hab3303 = resultSet.getInt("hab3303");
                int hab3304 = resultSet.getInt("hab3304");
                int hab3305 = resultSet.getInt("hab3305");
                int hab3306 = resultSet.getInt("hab3306");

                sciApplication.getHanguardsAndBracketsCountData().add(new HanguardsAndBracketsCount(idPerson, nicknamePerson,
                        hab3301, hab3302, hab3303, hab3304, hab3305, hab3306));
            }
        }
    }

    // 3.4 Заполнение списка из таблицы "SightsCount"
    public static void readSightsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM A_SightsCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int s3401 = resultSet.getInt("s3401");
                int s3402 = resultSet.getInt("s3402");
                int s3403 = resultSet.getInt("s3403");
                int s3404 = resultSet.getInt("s3404");
                int s3405 = resultSet.getInt("s3405");
                int s3406 = resultSet.getInt("s3406");
                int s3407 = resultSet.getInt("s3407");
                int s3408 = resultSet.getInt("s3408");
                int s3409 = resultSet.getInt("s3409");
                int s3410 = resultSet.getInt("s3410");
                int s3411 = resultSet.getInt("s3411");
                int s3412 = resultSet.getInt("s3412");
                int s3413 = resultSet.getInt("s3413");
                int s3414 = resultSet.getInt("s3414");
                int s3415 = resultSet.getInt("s3415");
                int s3416 = resultSet.getInt("s3416");
                int s3417 = resultSet.getInt("s3417");
                int s3418 = resultSet.getInt("s3418");
                int s3419 = resultSet.getInt("s3419");
                int s3420 = resultSet.getInt("s3420");
                int s3421 = resultSet.getInt("s3421");
                int s3422 = resultSet.getInt("s3422");
                int s3423 = resultSet.getInt("s3423");
                int s3424 = resultSet.getInt("s3424");
                int s3425 = resultSet.getInt("s3425");
                int s3426 = resultSet.getInt("s3426");
                int s3427 = resultSet.getInt("s3427");
                int s3428 = resultSet.getInt("s3428");
                int s3429 = resultSet.getInt("s3429");
                int s3430 = resultSet.getInt("s3430");
                int s3431 = resultSet.getInt("s3431");
                int s3432 = resultSet.getInt("s3432");
                int s3433 = resultSet.getInt("s3433");
                int s3434 = resultSet.getInt("s3434");
                int s3435 = resultSet.getInt("s3435");
                int s3436 = resultSet.getInt("s3436");

                sciApplication.getSightsCountData().add(new SightsCount(idPerson, nicknamePerson,
                        s3401, s3402, s3403, s3404, s3405, s3406, s3407, s3408, s3409, s3410,
                        s3411, s3412, s3413, s3414, s3415, s3416, s3417, s3418, s3419, s3420,
                        s3421, s3422, s3423, s3424, s3425, s3426, s3427, s3428, s3429, s3430,
                        s3431, s3432, s3433, s3434, s3435, s3436));
            }
        }
    }

    // 3.5 Заполнение списка из таблицы "HandlesCount"
    public static void readHandlesCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM A_HandlesCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int h3501 = resultSet.getInt("h3501");
                int h3502 = resultSet.getInt("h3502");
                int h3503 = resultSet.getInt("h3503");
                int h3504 = resultSet.getInt("h3504");
                int h3505 = resultSet.getInt("h3505");
                int h3506 = resultSet.getInt("h3506");
                int h3507 = resultSet.getInt("h3507");
                int h3508 = resultSet.getInt("h3508");
                int h3509 = resultSet.getInt("h3509");
                int h3510 = resultSet.getInt("h3510");
                int h3511 = resultSet.getInt("h3511");
                int h3512 = resultSet.getInt("h3512");
                int h3513 = resultSet.getInt("h3513");

                sciApplication.getHandlesCountData().add(new HandlesCount(idPerson, nicknamePerson,
                        h3501, h3502, h3503, h3504, h3505, h3506, h3507, h3508, h3509, h3510,
                        h3511, h3512, h3513));
            }
        }
    }

    // 3.6 Заполнение списка из таблицы "OtherAttachmentsCount"
    public static void readOtherAttachmentsCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM A_OtherAttachmentsCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int oa3601 = resultSet.getInt("oa3601");
                int oa3602 = resultSet.getInt("oa3602");
                int oa3603 = resultSet.getInt("oa3603");
                int oa3604 = resultSet.getInt("oa3604");
                int oa3605 = resultSet.getInt("oa3605");
                int oa3606 = resultSet.getInt("oa3606");
                int oa3607 = resultSet.getInt("oa3607");
                int oa3608 = resultSet.getInt("oa3608");
                int oa3609 = resultSet.getInt("oa3609");
                int oa3610 = resultSet.getInt("oa3610");
                int oa3611 = resultSet.getInt("oa3611");
                int oa3612 = resultSet.getInt("oa3612");

                sciApplication.getOtherAttachmentsCountData().add(new OtherAttachmentsCount(idPerson, nicknamePerson,
                        oa3601, oa3602, oa3603, oa3604, oa3605, oa3606, oa3607, oa3608, oa3609, oa3610,
                        oa3611, oa3612));
            }
        }
    }

    // 1.1 Заполнение списка из таблицы "CombatCount"
    public static void readCombatCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM S_CombatCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int c4101 = resultSet.getInt("c4101");
                int c4102 = resultSet.getInt("c4102");
                int c4103 = resultSet.getInt("c4103");
                int c4104 = resultSet.getInt("c4104");
                int c4105 = resultSet.getInt("c4105");
                int c4106 = resultSet.getInt("c4106");
                int c4107 = resultSet.getInt("c4107");
                int c4108 = resultSet.getInt("c4108");
                int c4109 = resultSet.getInt("c4109");
                int c4110 = resultSet.getInt("c4110");
                int c4111 = resultSet.getInt("c4111");
                int c4112 = resultSet.getInt("c4112");
                int c4113 = resultSet.getInt("c4113");
                int c4114 = resultSet.getInt("c4114");
                int c4115 = resultSet.getInt("c4115");
                int c4116 = resultSet.getInt("c4116");
                int c4117 = resultSet.getInt("c4117");
                int c4118 = resultSet.getInt("c4118");
                int c4119 = resultSet.getInt("c4119");
                int c4120 = resultSet.getInt("c4120");
                int c4121 = resultSet.getInt("c4121");
                int c4122 = resultSet.getInt("c4122");
                int c4123 = resultSet.getInt("c4123");
                int c4124 = resultSet.getInt("c4124");
                int c4125 = resultSet.getInt("c4125");
                int c4126 = resultSet.getInt("c4126");
                int c4127 = resultSet.getInt("c4127");
                int c4128 = resultSet.getInt("c4128");
                int c4129 = resultSet.getInt("c4129");

                sciApplication.getCombatCountData().add(new CombatCount(idPerson, nicknamePerson,
                        c4101, c4102, c4103, c4104, c4105, c4106, c4107, c4108, c4109, c4110,
                        c4111, c4112, c4113, c4114, c4115, c4116, c4117, c4118, c4119, c4120,
                        c4121, c4122, c4123, c4124, c4125, c4126, c4127, c4128, c4129));
            }
        }
    }

    // 4.2 Заполнение списка из таблицы "CombinedCount"
    public static void readCombinedCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM S_CombinedCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int c4201 = resultSet.getInt("c4201");
                int c4202 = resultSet.getInt("c4202");
                int c4203 = resultSet.getInt("c4203");
                int c4204 = resultSet.getInt("c4204");
                int c4205 = resultSet.getInt("c4205");
                int c4206 = resultSet.getInt("c4206");
                int c4207 = resultSet.getInt("c4207");
                int c4208 = resultSet.getInt("c4208");
                int c4209 = resultSet.getInt("c4209");
                int c4210 = resultSet.getInt("c4210");
                int c4211 = resultSet.getInt("c4211");
                int c4212 = resultSet.getInt("c4212");
                int c4213 = resultSet.getInt("c4213");
                int c4214 = resultSet.getInt("c4214");
                int c4215 = resultSet.getInt("c4215");
                int c4216 = resultSet.getInt("c4216");
                int c4217 = resultSet.getInt("c4217");
                int c4218 = resultSet.getInt("c4218");
                int c4219 = resultSet.getInt("c4219");

                sciApplication.getCombinedCountData().add(new CombinedCount(idPerson, nicknamePerson,
                        c4201, c4202, c4203, c4204, c4205, c4206, c4207, c4208, c4209, c4210,
                        c4211, c4212, c4213, c4214, c4215, c4216, c4217, c4218, c4219));
            }
        }
    }

    // 4.3 Заполнение списка из таблицы "ScientistCount"
    public static void readScientistCount(SciApplication sciApplication) throws SQLException {
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM S_ScientistCount")) {
            while (resultSet.next()) {
                int idPerson = resultSet.getInt("idPerson");
                String nicknamePerson = resultSet.getString("nicknamePerson");
                int s4301 = resultSet.getInt("s4301");
                int s4302 = resultSet.getInt("s4302");
                int s4303 = resultSet.getInt("s4303");
                int s4304 = resultSet.getInt("s4304");
                int s4305 = resultSet.getInt("s4305");
                int s4306 = resultSet.getInt("s4306");
                int s4307 = resultSet.getInt("s4307");
                int s4308 = resultSet.getInt("s4308");
                int s4309 = resultSet.getInt("s4309");
                int s4310 = resultSet.getInt("s4310");
                int s4311 = resultSet.getInt("s4311");
                int s4312 = resultSet.getInt("s4312");
                int s4313 = resultSet.getInt("s4313");

                sciApplication.getScientistCountData().add(new ScientistCount(idPerson, nicknamePerson,
                        s4301, s4302, s4303, s4304, s4305, s4306, s4307, s4308, s4309, s4310,
                        s4311, s4312, s4313));
            }
        }
    }

    //
    // Изменение информации о персонаже
    public static void updatePersonInfo(Person person) throws SQLException {
        String sql = "SELECT * FROM Person WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                updateIfChanged(person.getId(), "Person", "greenMold", person.getGreenMold(), resultSet.getInt("greenMold"));
                updateIfChanged(person.getId(), "Person", "swampStone", person.getSwampStone(), resultSet.getInt("swampStone"));
                updateIfChanged(person.getId(), "Person", "stinkyRoot", person.getStinkyRoot(), resultSet.getInt("stinkyRoot"));
                updateIfChanged(person.getId(), "Person", "crappite", person.getCrappite(), resultSet.getInt("crappite"));
                updateIfChanged(person.getId(), "Person", "piecesOfCopperWire", person.getPiecesOfCopperWire(), resultSet.getInt("piecesOfCopperWire"));
                updateIfChanged(person.getId(), "Person", "sprigOfChernobylChamomile", person.getSprigOfChernobylChamomile(), resultSet.getInt("sprigOfChernobylChamomile"));
                updateIfChanged(person.getId(), "Person", "pickle", person.getPickle(), resultSet.getInt("pickle"));
                updateIfChanged(person.getId(), "Person", "remainsOfRadioTransmitter", person.getRemainsOfRadioTransmitter(), resultSet.getInt("remainsOfRadioTransmitter"));
                updateIfChanged(person.getId(), "Person", "alphaDataFragment", person.getAlphaDataFragment(), resultSet.getInt("alphaDataFragment"));
                updateIfChanged(person.getId(), "Person", "northernMoss", person.getNorthernMoss(), resultSet.getInt("northernMoss"));
                updateIfChanged(person.getId(), "Person", "dopeStone", person.getDopeStone(), resultSet.getInt("dopeStone"));
                updateIfChanged(person.getId(), "Person", "remainsOfBatteries", person.getRemainsOfBatteries(), resultSet.getInt("remainsOfBatteries"));
                updateIfChanged(person.getId(), "Person", "betaDataFragment", person.getBetaDataFragment(), resultSet.getInt("betaDataFragment"));
                updateIfChanged(person.getId(), "Person", "redFern", person.getRedFern(), resultSet.getInt("redFern"));
                updateIfChanged(person.getId(), "Person", "substance07270", person.getSubstance07270(), resultSet.getInt("substance07270"));
                updateIfChanged(person.getId(), "Person", "remainsOfPsyTracker", person.getRemainsOfPsyTracker(), resultSet.getInt("remainsOfPsyTracker"));
                updateIfChanged(person.getId(), "Person", "gammaDataFragment", person.getGammaDataFragment(), resultSet.getInt("gammaDataFragment"));
                updateIfChanged(person.getId(), "Person", "quantumBattery", person.getQuantumBattery(), resultSet.getInt("quantumBattery"));
                updateIfChanged(person.getId(), "Person", "anomalousSerum", person.getAnomalousSerum(), resultSet.getInt("anomalousSerum"));
                updateIfChanged(person.getId(), "Person", "bitterleaf", person.getBitterleaf(), resultSet.getInt("bitterleaf"));
                updateIfChanged(person.getId(), "Person", "limbo", person.getLimbo(), resultSet.getInt("limbo"));
                updateIfChanged(person.getId(), "Person", "lambdaDataFragment", person.getLambdaDataFragment(), resultSet.getInt("lambdaDataFragment"));
                updateIfChanged(person.getId(), "Person", "anomalousBattery", person.getAnomalousBattery(), resultSet.getInt("anomalousBattery"));
                updateIfChanged(person.getId(), "Person", "limboPlasma", person.getLimboPlasma(), resultSet.getInt("limboPlasma"));
                updateIfChanged(person.getId(), "Person", "cost", person.getCost(), resultSet.getInt("cost"));
                updateIfChanged(person.getId(), "Person", "tradeCoins", person.getTradeCoins(), resultSet.getInt("tradeCoins"));
                updateIfChanged(person.getId(), "Person", "arsenalPoints", person.getArsenalPoints(), resultSet.getInt("arsenalPoints"));
                updateIfChanged(person.getId(), "Person", "seasonBox", person.getSeasonBox(), resultSet.getInt("seasonBox"));
                updateIfChanged(person.getId(), "Person", "combatPassLevel", person.getCombatPassLevel(), resultSet.getInt("combatPassLevel"));
            }
        }
    }

    // Измение информации об остатках ресурсов для бартара персонажа
    public static void updateRemains(Person person) throws SQLException {
        String sql = "SELECT * FROM Person WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                updateIfChanged(person.getId(), "Person", "greenMold", person.getGreenMold(), resultSet.getInt("greenMold"));
                updateIfChanged(person.getId(), "Person", "swampStone", person.getSwampStone(), resultSet.getInt("swampStone"));
                updateIfChanged(person.getId(), "Person", "stinkyRoot", person.getStinkyRoot(), resultSet.getInt("stinkyRoot"));
                updateIfChanged(person.getId(), "Person", "crappite", person.getCrappite(), resultSet.getInt("crappite"));
                updateIfChanged(person.getId(), "Person", "piecesOfCopperWire", person.getPiecesOfCopperWire(), resultSet.getInt("piecesOfCopperWire"));
                updateIfChanged(person.getId(), "Person", "sprigOfChernobylChamomile", person.getSprigOfChernobylChamomile(), resultSet.getInt("sprigOfChernobylChamomile"));
                updateIfChanged(person.getId(), "Person", "pickle", person.getPickle(), resultSet.getInt("pickle"));
                updateIfChanged(person.getId(), "Person", "remainsOfRadioTransmitter", person.getRemainsOfRadioTransmitter(), resultSet.getInt("remainsOfRadioTransmitter"));
                updateIfChanged(person.getId(), "Person", "alphaDataFragment", person.getAlphaDataFragment(), resultSet.getInt("alphaDataFragment"));
                updateIfChanged(person.getId(), "Person", "northernMoss", person.getNorthernMoss(), resultSet.getInt("northernMoss"));
                updateIfChanged(person.getId(), "Person", "dopeStone", person.getDopeStone(), resultSet.getInt("dopeStone"));
                updateIfChanged(person.getId(), "Person", "remainsOfBatteries", person.getRemainsOfBatteries(), resultSet.getInt("remainsOfBatteries"));
                updateIfChanged(person.getId(), "Person", "betaDataFragment", person.getBetaDataFragment(), resultSet.getInt("betaDataFragment"));
                updateIfChanged(person.getId(), "Person", "redFern", person.getRedFern(), resultSet.getInt("redFern"));
                updateIfChanged(person.getId(), "Person", "substance07270", person.getSubstance07270(), resultSet.getInt("substance07270"));
                updateIfChanged(person.getId(), "Person", "remainsOfPsyTracker", person.getRemainsOfPsyTracker(), resultSet.getInt("remainsOfPsyTracker"));
                updateIfChanged(person.getId(), "Person", "gammaDataFragment", person.getGammaDataFragment(), resultSet.getInt("gammaDataFragment"));
                updateIfChanged(person.getId(), "Person", "quantumBattery", person.getQuantumBattery(), resultSet.getInt("quantumBattery"));
                updateIfChanged(person.getId(), "Person", "anomalousSerum", person.getAnomalousSerum(), resultSet.getInt("anomalousSerum"));
                updateIfChanged(person.getId(), "Person", "bitterleaf", person.getBitterleaf(), resultSet.getInt("bitterleaf"));
                updateIfChanged(person.getId(), "Person", "limbo", person.getLimbo(), resultSet.getInt("limbo"));
                updateIfChanged(person.getId(), "Person", "lambdaDataFragment", person.getLambdaDataFragment(), resultSet.getInt("lambdaDataFragment"));
                updateIfChanged(person.getId(), "Person", "anomalousBattery", person.getAnomalousBattery(), resultSet.getInt("anomalousBattery"));
                updateIfChanged(person.getId(), "Person", "limboPlasma", person.getLimboPlasma(), resultSet.getInt("limboPlasma"));
                updateIfChanged(person.getId(), "Person", "cost", person.getCost(), resultSet.getInt("cost"));
            }
        }
    }

    // 1.1 Изменение количества крафтов предметов для AssaultRiflesCount
    public static void updateAssaultRiflesCount(Person person, AssaultRiflesCount assaultRiflesCount) throws SQLException {
        String Sql = "SELECT * FROM W_AssaultRiflesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1101", assaultRiflesCount.getAr1101(), resultSet.getInt("ar1101"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1102", assaultRiflesCount.getAr1102(), resultSet.getInt("ar1102"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1103", assaultRiflesCount.getAr1103(), resultSet.getInt("ar1103"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1104", assaultRiflesCount.getAr1104(), resultSet.getInt("ar1104"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1105", assaultRiflesCount.getAr1105(), resultSet.getInt("ar1105"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1106", assaultRiflesCount.getAr1106(), resultSet.getInt("ar1106"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1107", assaultRiflesCount.getAr1107(), resultSet.getInt("ar1107"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1108", assaultRiflesCount.getAr1108(), resultSet.getInt("ar1108"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1109", assaultRiflesCount.getAr1109(), resultSet.getInt("ar1109"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1110", assaultRiflesCount.getAr1110(), resultSet.getInt("ar1110"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1111", assaultRiflesCount.getAr1111(), resultSet.getInt("ar1111"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1112", assaultRiflesCount.getAr1112(), resultSet.getInt("ar1112"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1113", assaultRiflesCount.getAr1113(), resultSet.getInt("ar1113"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1114", assaultRiflesCount.getAr1114(), resultSet.getInt("ar1114"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1115", assaultRiflesCount.getAr1115(), resultSet.getInt("ar1115"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1116", assaultRiflesCount.getAr1116(), resultSet.getInt("ar1116"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1117", assaultRiflesCount.getAr1117(), resultSet.getInt("ar1117"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1118", assaultRiflesCount.getAr1118(), resultSet.getInt("ar1118"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1119", assaultRiflesCount.getAr1119(), resultSet.getInt("ar1119"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1120", assaultRiflesCount.getAr1120(), resultSet.getInt("ar1120"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1121", assaultRiflesCount.getAr1121(), resultSet.getInt("ar1121"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1122", assaultRiflesCount.getAr1122(), resultSet.getInt("ar1122"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1123", assaultRiflesCount.getAr1123(), resultSet.getInt("ar1123"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1124", assaultRiflesCount.getAr1124(), resultSet.getInt("ar1124"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1125", assaultRiflesCount.getAr1125(), resultSet.getInt("ar1125"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1126", assaultRiflesCount.getAr1126(), resultSet.getInt("ar1126"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1127", assaultRiflesCount.getAr1127(), resultSet.getInt("ar1127"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1128", assaultRiflesCount.getAr1128(), resultSet.getInt("ar1128"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1129", assaultRiflesCount.getAr1129(), resultSet.getInt("ar1129"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1130", assaultRiflesCount.getAr1130(), resultSet.getInt("ar1130"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1131", assaultRiflesCount.getAr1131(), resultSet.getInt("ar1131"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1132", assaultRiflesCount.getAr1132(), resultSet.getInt("ar1132"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1133", assaultRiflesCount.getAr1133(), resultSet.getInt("ar1133"));
                updateIfChanged(person.getId(), "W_AssaultRiflesCount", "ar1134", assaultRiflesCount.getAr1134(), resultSet.getInt("ar1134"));
            }
        }
    }

    // 1.2 Изменение количества крафтов предметов для SubmachineGunsCount
    public static void updateSubmachineGunsCount(Person person, SubmachineGunsCount submachineGunsCount) throws SQLException {
        String Sql = "SELECT * FROM W_SubmachineGunsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1201", submachineGunsCount.getSg1201(), resultSet.getInt("sg1201"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1202", submachineGunsCount.getSg1202(), resultSet.getInt("sg1202"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1203", submachineGunsCount.getSg1203(), resultSet.getInt("sg1203"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1204", submachineGunsCount.getSg1204(), resultSet.getInt("sg1204"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1205", submachineGunsCount.getSg1205(), resultSet.getInt("sg1205"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1206", submachineGunsCount.getSg1206(), resultSet.getInt("sg1206"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1207", submachineGunsCount.getSg1207(), resultSet.getInt("sg1207"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1208", submachineGunsCount.getSg1208(), resultSet.getInt("sg1208"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1209", submachineGunsCount.getSg1209(), resultSet.getInt("sg1209"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1210", submachineGunsCount.getSg1210(), resultSet.getInt("sg1210"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1211", submachineGunsCount.getSg1211(), resultSet.getInt("sg1211"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1212", submachineGunsCount.getSg1212(), resultSet.getInt("sg1212"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1213", submachineGunsCount.getSg1213(), resultSet.getInt("sg1213"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1214", submachineGunsCount.getSg1214(), resultSet.getInt("sg1214"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1215", submachineGunsCount.getSg1215(), resultSet.getInt("sg1215"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1216", submachineGunsCount.getSg1216(), resultSet.getInt("sg1216"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1217", submachineGunsCount.getSg1217(), resultSet.getInt("sg1217"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1218", submachineGunsCount.getSg1218(), resultSet.getInt("sg1218"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1219", submachineGunsCount.getSg1219(), resultSet.getInt("sg1219"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1220", submachineGunsCount.getSg1220(), resultSet.getInt("sg1220"));
                updateIfChanged(person.getId(), "W_SubmachineGunsCount", "sg1221", submachineGunsCount.getSg1221(), resultSet.getInt("sg1221"));
            }
        }
    }

    // 1.3 Изменение количества крафтов предметов для MeleeWeapons
    public static void updateMachineGunsCount(Person person, MachineGunsCount machineGunsCount) throws SQLException {
        String Sql = "SELECT * FROM W_MachineGunsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_MachineGunsCount", "mg1301", machineGunsCount.getMg1301(), resultSet.getInt("mg1301"));
                updateIfChanged(person.getId(), "W_MachineGunsCount", "mg1302", machineGunsCount.getMg1302(), resultSet.getInt("mg1302"));
                updateIfChanged(person.getId(), "W_MachineGunsCount", "mg1303", machineGunsCount.getMg1303(), resultSet.getInt("mg1303"));
                updateIfChanged(person.getId(), "W_MachineGunsCount", "mg1304", machineGunsCount.getMg1304(), resultSet.getInt("mg1304"));
                updateIfChanged(person.getId(), "W_MachineGunsCount", "mg1305", machineGunsCount.getMg1305(), resultSet.getInt("mg1305"));
                updateIfChanged(person.getId(), "W_MachineGunsCount", "mg1306", machineGunsCount.getMg1306(), resultSet.getInt("mg1306"));
            }
        }
    }

    // 1.4 Изменение количества крафтов предметов для SniperRiflesCount
    public static void updateSniperRiflesCount(Person person, SniperRiflesCount sniperRiflesCount) throws SQLException {
        String Sql = "SELECT * FROM W_SniperRiflesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1401", sniperRiflesCount.getSr1401(), resultSet.getInt("sr1401"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1402", sniperRiflesCount.getSr1402(), resultSet.getInt("sr1402"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1403", sniperRiflesCount.getSr1403(), resultSet.getInt("sr1403"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1404", sniperRiflesCount.getSr1404(), resultSet.getInt("sr1404"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1405", sniperRiflesCount.getSr1405(), resultSet.getInt("sr1405"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1406", sniperRiflesCount.getSr1406(), resultSet.getInt("sr1406"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1407", sniperRiflesCount.getSr1407(), resultSet.getInt("sr1407"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1408", sniperRiflesCount.getSr1408(), resultSet.getInt("sr1408"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1409", sniperRiflesCount.getSr1409(), resultSet.getInt("sr1409"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1410", sniperRiflesCount.getSr1410(), resultSet.getInt("sr1410"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1411", sniperRiflesCount.getSr1411(), resultSet.getInt("sr1411"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1412", sniperRiflesCount.getSr1412(), resultSet.getInt("sr1412"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1413", sniperRiflesCount.getSr1413(), resultSet.getInt("sr1413"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1414", sniperRiflesCount.getSr1414(), resultSet.getInt("sr1414"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1415", sniperRiflesCount.getSr1415(), resultSet.getInt("sr1415"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1416", sniperRiflesCount.getSr1416(), resultSet.getInt("sr1416"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1417", sniperRiflesCount.getSr1417(), resultSet.getInt("sr1417"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1418", sniperRiflesCount.getSr1418(), resultSet.getInt("sr1418"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1419", sniperRiflesCount.getSr1419(), resultSet.getInt("sr1419"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1420", sniperRiflesCount.getSr1420(), resultSet.getInt("sr1420"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1421", sniperRiflesCount.getSr1421(), resultSet.getInt("sr1421"));
                updateIfChanged(person.getId(), "W_SniperRiflesCount", "sr1422", sniperRiflesCount.getSr1422(), resultSet.getInt("sr1422"));
            }
        }
    }

    // 1.5 Изменение количества крафтов предметов для ShotgunsAndRiflesCount
    public static void updateShotgunsAndRiflesCount(Person person, ShotgunsAndRiflesCount shotgunsAndRiflesCount) throws SQLException {
        String Sql = "SELECT * FROM W_ShotgunsAndRiflesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1501", shotgunsAndRiflesCount.getSar1501(), resultSet.getInt("sar1501"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1502", shotgunsAndRiflesCount.getSar1502(), resultSet.getInt("sar1502"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1503", shotgunsAndRiflesCount.getSar1503(), resultSet.getInt("sar1503"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1504", shotgunsAndRiflesCount.getSar1504(), resultSet.getInt("sar1504"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1505", shotgunsAndRiflesCount.getSar1505(), resultSet.getInt("sar1505"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1506", shotgunsAndRiflesCount.getSar1506(), resultSet.getInt("sar1506"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1507", shotgunsAndRiflesCount.getSar1507(), resultSet.getInt("sar1507"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1508", shotgunsAndRiflesCount.getSar1508(), resultSet.getInt("sar1508"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1509", shotgunsAndRiflesCount.getSar1509(), resultSet.getInt("sar1509"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1510", shotgunsAndRiflesCount.getSar1510(), resultSet.getInt("sar1510"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1511", shotgunsAndRiflesCount.getSar1511(), resultSet.getInt("sar1511"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1512", shotgunsAndRiflesCount.getSar1512(), resultSet.getInt("sar1512"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1513", shotgunsAndRiflesCount.getSar1513(), resultSet.getInt("sar1513"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1514", shotgunsAndRiflesCount.getSar1514(), resultSet.getInt("sar1514"));
                updateIfChanged(person.getId(), "W_ShotgunsAndRiflesCount", "sar1515", shotgunsAndRiflesCount.getSar1515(), resultSet.getInt("sar1514"));
            }
        }
    }

    // 1.6 Изменение количества крафтов предметов для PistolsCount
    public static void updatePistolsCount(Person person, PistolsCount pistolsCount) throws SQLException {
        String Sql = "SELECT * FROM W_PistolsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_PistolsCount", "p1601", pistolsCount.getP1601(), resultSet.getInt("p1601"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1602", pistolsCount.getP1602(), resultSet.getInt("p1602"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1603", pistolsCount.getP1603(), resultSet.getInt("p1603"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1604", pistolsCount.getP1604(), resultSet.getInt("p1604"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1605", pistolsCount.getP1605(), resultSet.getInt("p1605"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1606", pistolsCount.getP1606(), resultSet.getInt("p1606"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1607", pistolsCount.getP1607(), resultSet.getInt("p1607"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1608", pistolsCount.getP1608(), resultSet.getInt("p1608"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1609", pistolsCount.getP1609(), resultSet.getInt("p1609"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1610", pistolsCount.getP1610(), resultSet.getInt("p1610"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1611", pistolsCount.getP1611(), resultSet.getInt("p1611"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1612", pistolsCount.getP1612(), resultSet.getInt("p1612"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1613", pistolsCount.getP1613(), resultSet.getInt("p1613"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1614", pistolsCount.getP1614(), resultSet.getInt("p1614"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1615", pistolsCount.getP1615(), resultSet.getInt("p1615"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1616", pistolsCount.getP1616(), resultSet.getInt("p1616"));
                updateIfChanged(person.getId(), "W_PistolsCount", "p1617", pistolsCount.getP1617(), resultSet.getInt("p1617"));
            }
        }
    }

    // 1.7 Изменение количества крафтов предметов для MeleeWeapons
    public static void updateMeleeWeaponsCount(Person person, MeleeWeaponsCount meleeWeaponsCount) throws SQLException {
        String Sql = "SELECT * FROM W_MeleeWeaponsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1701", meleeWeaponsCount.getMw1701(), resultSet.getInt("mw1701"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1702", meleeWeaponsCount.getMw1702(), resultSet.getInt("mw1702"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1703", meleeWeaponsCount.getMw1703(), resultSet.getInt("mw1703"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1704", meleeWeaponsCount.getMw1704(), resultSet.getInt("mw1704"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1705", meleeWeaponsCount.getMw1705(), resultSet.getInt("mw1705"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1706", meleeWeaponsCount.getMw1706(), resultSet.getInt("mw1706"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1707", meleeWeaponsCount.getMw1707(), resultSet.getInt("mw1707"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1708", meleeWeaponsCount.getMw1708(), resultSet.getInt("mw1708"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1709", meleeWeaponsCount.getMw1709(), resultSet.getInt("mw1709"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1710", meleeWeaponsCount.getMw1710(), resultSet.getInt("mw1710"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1711", meleeWeaponsCount.getMw1711(), resultSet.getInt("mw1711"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1712", meleeWeaponsCount.getMw1712(), resultSet.getInt("mw1712"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1713", meleeWeaponsCount.getMw1713(), resultSet.getInt("mw1713"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1714", meleeWeaponsCount.getMw1714(), resultSet.getInt("mw1714"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1715", meleeWeaponsCount.getMw1715(), resultSet.getInt("mw1715"));
                updateIfChanged(person.getId(), "W_MeleeWeaponsCount", "mw1716", meleeWeaponsCount.getMw1716(), resultSet.getInt("mw1716"));
            }
        }
    }

    // 2.1 Изменение количества крафтов предметов для BackpacksAndPouchesCount
    public static void updateBackpacksAndPouchesCount(Person person, BackpacksAndPouchesCount backpacksAndPouchesCount) throws SQLException {
        String Sql = "SELECT * FROM O_BackpacksAndPouchesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2101", backpacksAndPouchesCount.getBap2101(), resultSet.getInt("bap2101"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2102", backpacksAndPouchesCount.getBap2102(), resultSet.getInt("bap2102"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2103", backpacksAndPouchesCount.getBap2103(), resultSet.getInt("bap2103"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2104", backpacksAndPouchesCount.getBap2104(), resultSet.getInt("bap2104"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2105", backpacksAndPouchesCount.getBap2104(), resultSet.getInt("bap2105"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2106", backpacksAndPouchesCount.getBap2106(), resultSet.getInt("bap2106"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2107", backpacksAndPouchesCount.getBap2107(), resultSet.getInt("bap2107"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2108", backpacksAndPouchesCount.getBap2108(), resultSet.getInt("bap2108"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2109", backpacksAndPouchesCount.getBap2109(), resultSet.getInt("bap2109"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2110", backpacksAndPouchesCount.getBap2110(), resultSet.getInt("bap2110"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2111", backpacksAndPouchesCount.getBap2111(), resultSet.getInt("bap2111"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2112", backpacksAndPouchesCount.getBap2112(), resultSet.getInt("bap2112"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2113", backpacksAndPouchesCount.getBap2113(), resultSet.getInt("bap2113"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2114", backpacksAndPouchesCount.getBap2114(), resultSet.getInt("bap2114"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2115", backpacksAndPouchesCount.getBap2115(), resultSet.getInt("bap2115"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2116", backpacksAndPouchesCount.getBap2116(), resultSet.getInt("bap2116"));
                updateIfChanged(person.getId(), "O_BackpacksAndPouchesCount", "bap2117", backpacksAndPouchesCount.getBap2117(), resultSet.getInt("bap2117"));
            }
        }
    }

    // 2.2 Изменение количества крафтов предметов для ContainersCount
    public static void updateContainersCount(Person person, ContainersCount containersCount) throws SQLException {
        String Sql = "SELECT * FROM O_ContainersCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "O_ContainersCount", "c2201", containersCount.getC2201(), resultSet.getInt("c2201"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2202", containersCount.getC2202(), resultSet.getInt("c2202"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2203", containersCount.getC2203(), resultSet.getInt("c2203"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2204", containersCount.getC2204(), resultSet.getInt("c2204"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2205", containersCount.getC2205(), resultSet.getInt("c2205"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2206", containersCount.getC2206(), resultSet.getInt("c2206"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2207", containersCount.getC2207(), resultSet.getInt("c2207"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2208", containersCount.getC2208(), resultSet.getInt("c2208"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2209", containersCount.getC2209(), resultSet.getInt("c2209"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2210", containersCount.getC2210(), resultSet.getInt("c2210"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2211", containersCount.getC2211(), resultSet.getInt("c2211"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2212", containersCount.getC2212(), resultSet.getInt("c2212"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2213", containersCount.getC2213(), resultSet.getInt("c2213"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2214", containersCount.getC2214(), resultSet.getInt("c2214"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2215", containersCount.getC2215(), resultSet.getInt("c2215"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2216", containersCount.getC2216(), resultSet.getInt("c2216"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2217", containersCount.getC2217(), resultSet.getInt("c2217"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2218", containersCount.getC2218(), resultSet.getInt("c2218"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2219", containersCount.getC2219(), resultSet.getInt("c2219"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2220", containersCount.getC2220(), resultSet.getInt("c2220"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2221", containersCount.getC2221(), resultSet.getInt("c2221"));
                updateIfChanged(person.getId(), "O_ContainersCount", "c2222", containersCount.getC2222(), resultSet.getInt("c2222"));
            }
        }
    }

    // 2.3 Изменение количества крафтов предметов для DevicesCount
    public static void updateDevicesCount(Person person, DevicesCount devicesCount) throws SQLException {
        String Sql = "SELECT * FROM O_DevicesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "O_DevicesCount", "d2301", devicesCount.getD2301(), resultSet.getInt("d2301"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2302", devicesCount.getD2302(), resultSet.getInt("d2302"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2303", devicesCount.getD2303(), resultSet.getInt("d2303"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2304", devicesCount.getD2304(), resultSet.getInt("d2304"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2305", devicesCount.getD2305(), resultSet.getInt("d2305"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2306", devicesCount.getD2306(), resultSet.getInt("d2306"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2307", devicesCount.getD2307(), resultSet.getInt("d2307"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2308", devicesCount.getD2308(), resultSet.getInt("d2308"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2309", devicesCount.getD2309(), resultSet.getInt("d2309"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2310", devicesCount.getD2310(), resultSet.getInt("d2310"));
                updateIfChanged(person.getId(), "O_DevicesCount", "d2311", devicesCount.getD2311(), resultSet.getInt("d2311"));
            }
        }
    }

    // 2.4 Изменение количества крафтов предметов для CosmeticsCount
    public static void updateCosmeticsCount(Person person, CosmeticsCount cosmeticsCount) throws SQLException {
        String Sql = "SELECT * FROM O_CosmeticsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "O_CosmeticsCount", "c2401", cosmeticsCount.getC2401(), resultSet.getInt("c2401"));
                updateIfChanged(person.getId(), "O_CosmeticsCount", "c2402", cosmeticsCount.getC2402(), resultSet.getInt("c2402"));
                updateIfChanged(person.getId(), "O_CosmeticsCount", "c2403", cosmeticsCount.getC2403(), resultSet.getInt("c2403"));
            }
        }
    }

    // 2.5 Изменение количества крафтов предметов для AccessoriesCount
    public static void updateAccessoriesCount(Person person, AccessoriesCount accessoriesCount) throws SQLException {
        String Sql = "SELECT * FROM O_AccessoriesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "O_AccessoriesCount", "a2501", accessoriesCount.getA2501(), resultSet.getInt("a2501"));
                updateIfChanged(person.getId(), "O_AccessoriesCount", "a2502", accessoriesCount.getA2502(), resultSet.getInt("a2502"));
                updateIfChanged(person.getId(), "O_AccessoriesCount", "a2503", accessoriesCount.getA2503(), resultSet.getInt("a2503"));
                updateIfChanged(person.getId(), "O_AccessoriesCount", "a2504", accessoriesCount.getA2504(), resultSet.getInt("a2504"));
                updateIfChanged(person.getId(), "O_AccessoriesCount", "a2505", accessoriesCount.getA2505(), resultSet.getInt("a2505"));
                updateIfChanged(person.getId(), "O_AccessoriesCount", "a2506", accessoriesCount.getA2506(), resultSet.getInt("a2506"));
            }
        }
    }

    // 2.6 Изменение количества крафтов предметов для OtherCount
    public static void updateOtherCount(Person person, OtherCount otherCount) throws SQLException {
        String Sql = "SELECT * FROM O_OtherCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "O_OtherCount", "o2601", otherCount.getO2601(), resultSet.getInt("o2601"));
                updateIfChanged(person.getId(), "O_OtherCount", "o2602", otherCount.getO2602(), resultSet.getInt("o2602"));
            }
        }
    }

    // 3.1 Изменение количества крафтов предметов для MuzzlesAndSilencersCount
    public static void updateMuzzlesAndSilencersCount(Person person, MuzzlesAndSilencersCount muzzlesAndSilencersCount) throws SQLException {
        String Sql = "SELECT * FROM A_MuzzlesAndSilencersCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3101", muzzlesAndSilencersCount.getMas3101(), resultSet.getInt("mas3101"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3102", muzzlesAndSilencersCount.getMas3102(), resultSet.getInt("mas3102"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3103", muzzlesAndSilencersCount.getMas3103(), resultSet.getInt("mas3103"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3104", muzzlesAndSilencersCount.getMas3104(), resultSet.getInt("mas3104"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3105", muzzlesAndSilencersCount.getMas3105(), resultSet.getInt("mas3105"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3106", muzzlesAndSilencersCount.getMas3106(), resultSet.getInt("mas3106"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3107", muzzlesAndSilencersCount.getMas3107(), resultSet.getInt("mas3107"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3108", muzzlesAndSilencersCount.getMas3108(), resultSet.getInt("mas3108"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3109", muzzlesAndSilencersCount.getMas3109(), resultSet.getInt("mas3109"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3110", muzzlesAndSilencersCount.getMas3110(), resultSet.getInt("mas3110"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3111", muzzlesAndSilencersCount.getMas3111(), resultSet.getInt("mas3111"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3112", muzzlesAndSilencersCount.getMas3112(), resultSet.getInt("mas3112"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3113", muzzlesAndSilencersCount.getMas3113(), resultSet.getInt("mas3113"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3114", muzzlesAndSilencersCount.getMas3114(), resultSet.getInt("mas3114"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3115", muzzlesAndSilencersCount.getMas3115(), resultSet.getInt("mas3115"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3116", muzzlesAndSilencersCount.getMas3116(), resultSet.getInt("mas3116"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3117", muzzlesAndSilencersCount.getMas3117(), resultSet.getInt("mas3117"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3118", muzzlesAndSilencersCount.getMas3118(), resultSet.getInt("mas3118"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3119", muzzlesAndSilencersCount.getMas3119(), resultSet.getInt("mas3119"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3120", muzzlesAndSilencersCount.getMas3120(), resultSet.getInt("mas3120"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3121", muzzlesAndSilencersCount.getMas3121(), resultSet.getInt("mas3121"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3122", muzzlesAndSilencersCount.getMas3122(), resultSet.getInt("mas3122"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3123", muzzlesAndSilencersCount.getMas3123(), resultSet.getInt("mas3123"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3124", muzzlesAndSilencersCount.getMas3124(), resultSet.getInt("mas3124"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3125", muzzlesAndSilencersCount.getMas3125(), resultSet.getInt("mas3125"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3126", muzzlesAndSilencersCount.getMas3126(), resultSet.getInt("mas3126"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3127", muzzlesAndSilencersCount.getMas3127(), resultSet.getInt("mas3127"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3128", muzzlesAndSilencersCount.getMas3128(), resultSet.getInt("mas3128"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3129", muzzlesAndSilencersCount.getMas3129(), resultSet.getInt("mas3129"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3130", muzzlesAndSilencersCount.getMas3130(), resultSet.getInt("mas3130"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3131", muzzlesAndSilencersCount.getMas3131(), resultSet.getInt("mas3131"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3132", muzzlesAndSilencersCount.getMas3132(), resultSet.getInt("mas3132"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3133", muzzlesAndSilencersCount.getMas3133(), resultSet.getInt("mas3133"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3134", muzzlesAndSilencersCount.getMas3134(), resultSet.getInt("mas3134"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3135", muzzlesAndSilencersCount.getMas3135(), resultSet.getInt("mas3135"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3136", muzzlesAndSilencersCount.getMas3136(), resultSet.getInt("mas3136"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3137", muzzlesAndSilencersCount.getMas3137(), resultSet.getInt("mas3137"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3138", muzzlesAndSilencersCount.getMas3138(), resultSet.getInt("mas3138"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3139", muzzlesAndSilencersCount.getMas3139(), resultSet.getInt("mas3139"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3140", muzzlesAndSilencersCount.getMas3140(), resultSet.getInt("mas3140"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3141", muzzlesAndSilencersCount.getMas3141(), resultSet.getInt("mas3141"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3142", muzzlesAndSilencersCount.getMas3142(), resultSet.getInt("mas3142"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3143", muzzlesAndSilencersCount.getMas3143(), resultSet.getInt("mas3143"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3144", muzzlesAndSilencersCount.getMas3144(), resultSet.getInt("mas3144"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3145", muzzlesAndSilencersCount.getMas3145(), resultSet.getInt("mas3145"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3146", muzzlesAndSilencersCount.getMas3146(), resultSet.getInt("mas3146"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3147", muzzlesAndSilencersCount.getMas3147(), resultSet.getInt("mas3147"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3148", muzzlesAndSilencersCount.getMas3148(), resultSet.getInt("mas3148"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3149", muzzlesAndSilencersCount.getMas3149(), resultSet.getInt("mas3149"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3150", muzzlesAndSilencersCount.getMas3150(), resultSet.getInt("mas3150"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3151", muzzlesAndSilencersCount.getMas3151(), resultSet.getInt("mas3151"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3152", muzzlesAndSilencersCount.getMas3152(), resultSet.getInt("mas3152"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3153", muzzlesAndSilencersCount.getMas3153(), resultSet.getInt("mas3153"));
                updateIfChanged(person.getId(), "A_MuzzlesAndSilencersCount", "mas3154", muzzlesAndSilencersCount.getMas3154(), resultSet.getInt("mas3154"));
            }
        }
    }

    // 3.2 Изменение количества крафтов предметов для MagazinesCount
    public static void updateMagazinesCount(Person person, MagazinesCount magazinesCount) throws SQLException {
        String Sql = "SELECT * FROM A_MagazinesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3201", magazinesCount.getM3201(), resultSet.getInt("m3201"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3202", magazinesCount.getM3202(), resultSet.getInt("m3202"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3203", magazinesCount.getM3203(), resultSet.getInt("m3203"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3204", magazinesCount.getM3204(), resultSet.getInt("m3204"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3205", magazinesCount.getM3205(), resultSet.getInt("m3205"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3206", magazinesCount.getM3206(), resultSet.getInt("m3206"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3207", magazinesCount.getM3207(), resultSet.getInt("m3207"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3208", magazinesCount.getM3208(), resultSet.getInt("m3208"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3209", magazinesCount.getM3209(), resultSet.getInt("m3209"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3210", magazinesCount.getM3210(), resultSet.getInt("m3210"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3211", magazinesCount.getM3211(), resultSet.getInt("m3211"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3212", magazinesCount.getM3212(), resultSet.getInt("m3212"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3213", magazinesCount.getM3213(), resultSet.getInt("m3213"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3214", magazinesCount.getM3214(), resultSet.getInt("m3214"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3215", magazinesCount.getM3215(), resultSet.getInt("m3215"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3216", magazinesCount.getM3216(), resultSet.getInt("m3216"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3217", magazinesCount.getM3217(), resultSet.getInt("m3217"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3218", magazinesCount.getM3218(), resultSet.getInt("m3218"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3219", magazinesCount.getM3219(), resultSet.getInt("m3219"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3220", magazinesCount.getM3220(), resultSet.getInt("m3220"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3221", magazinesCount.getM3221(), resultSet.getInt("m3221"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3222", magazinesCount.getM3222(), resultSet.getInt("m3222"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3223", magazinesCount.getM3223(), resultSet.getInt("m3223"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3224", magazinesCount.getM3224(), resultSet.getInt("m3224"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3225", magazinesCount.getM3225(), resultSet.getInt("m3225"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3226", magazinesCount.getM3226(), resultSet.getInt("m3226"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3227", magazinesCount.getM3227(), resultSet.getInt("m3227"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3228", magazinesCount.getM3228(), resultSet.getInt("m3228"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3229", magazinesCount.getM3229(), resultSet.getInt("m3229"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3230", magazinesCount.getM3230(), resultSet.getInt("m3230"));
                updateIfChanged(person.getId(), "A_MagazinesCount", "m3231", magazinesCount.getM3231(), resultSet.getInt("m3231"));
            }
        }
    }

    // 3.3 Изменение количества крафтов предметов для HanguardsAndBracketsCount
    public static void updateHanguardsAndBracketsCount(Person person, HanguardsAndBracketsCount hanguardsAndBracketsCount) throws SQLException {
        String Sql = "SELECT * FROM A_HanguardsAndBracketsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "A_HanguardsAndBracketsCount", "hab3301", hanguardsAndBracketsCount.getHab3301(), resultSet.getInt("hab3301"));
                updateIfChanged(person.getId(), "A_HanguardsAndBracketsCount", "hab3302", hanguardsAndBracketsCount.getHab3302(), resultSet.getInt("hab3302"));
                updateIfChanged(person.getId(), "A_HanguardsAndBracketsCount", "hab3303", hanguardsAndBracketsCount.getHab3303(), resultSet.getInt("hab3303"));
                updateIfChanged(person.getId(), "A_HanguardsAndBracketsCount", "hab3304", hanguardsAndBracketsCount.getHab3304(), resultSet.getInt("hab3304"));
                updateIfChanged(person.getId(), "A_HanguardsAndBracketsCount", "hab3305", hanguardsAndBracketsCount.getHab3305(), resultSet.getInt("hab3305"));
                updateIfChanged(person.getId(), "A_HanguardsAndBracketsCount", "hab3306", hanguardsAndBracketsCount.getHab3306(), resultSet.getInt("hab3306"));
            }
        }
    }

    // 3.4 Изменение количества крафтов предметов для SightsCount
    public static void updateSightsCount(Person person, SightsCount sightsCount) throws SQLException {
        String Sql = "SELECT * FROM A_SightsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "A_SightsCount", "s3401", sightsCount.getS3401(), resultSet.getInt("s3401"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3402", sightsCount.getS3402(), resultSet.getInt("s3402"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3403", sightsCount.getS3403(), resultSet.getInt("s3403"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3404", sightsCount.getS3404(), resultSet.getInt("s3404"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3405", sightsCount.getS3405(), resultSet.getInt("s3405"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3406", sightsCount.getS3406(), resultSet.getInt("s3406"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3407", sightsCount.getS3407(), resultSet.getInt("s3407"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3408", sightsCount.getS3408(), resultSet.getInt("s3408"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3409", sightsCount.getS3409(), resultSet.getInt("s3409"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3410", sightsCount.getS3410(), resultSet.getInt("s3410"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3411", sightsCount.getS3411(), resultSet.getInt("s3411"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3412", sightsCount.getS3412(), resultSet.getInt("s3412"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3413", sightsCount.getS3413(), resultSet.getInt("s3413"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3414", sightsCount.getS3414(), resultSet.getInt("s3414"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3415", sightsCount.getS3415(), resultSet.getInt("s3415"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3416", sightsCount.getS3416(), resultSet.getInt("s3416"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3417", sightsCount.getS3417(), resultSet.getInt("s3417"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3418", sightsCount.getS3418(), resultSet.getInt("s3418"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3419", sightsCount.getS3419(), resultSet.getInt("s3419"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3420", sightsCount.getS3420(), resultSet.getInt("s3420"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3421", sightsCount.getS3421(), resultSet.getInt("s3421"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3422", sightsCount.getS3422(), resultSet.getInt("s3422"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3423", sightsCount.getS3423(), resultSet.getInt("s3423"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3424", sightsCount.getS3424(), resultSet.getInt("s3424"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3425", sightsCount.getS3425(), resultSet.getInt("s3425"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3426", sightsCount.getS3426(), resultSet.getInt("s3426"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3427", sightsCount.getS3427(), resultSet.getInt("s3427"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3428", sightsCount.getS3428(), resultSet.getInt("s3428"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3429", sightsCount.getS3429(), resultSet.getInt("s3429"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3430", sightsCount.getS3430(), resultSet.getInt("s3430"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3431", sightsCount.getS3431(), resultSet.getInt("s3431"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3432", sightsCount.getS3432(), resultSet.getInt("s3432"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3433", sightsCount.getS3433(), resultSet.getInt("s3433"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3434", sightsCount.getS3434(), resultSet.getInt("s3434"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3435", sightsCount.getS3435(), resultSet.getInt("s3435"));
                updateIfChanged(person.getId(), "A_SightsCount", "s3436", sightsCount.getS3436(), resultSet.getInt("s3436"));
            }
        }
    }

    // 3.5 Изменение количества крафтов предметов для HandlesCount
    public static void updateHandlesCount(Person person, HandlesCount handlesCount) throws SQLException {
        String Sql = "SELECT * FROM A_HandlesCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "A_HandlesCount", "h3501", handlesCount.getH3501(), resultSet.getInt("h3501"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3502", handlesCount.getH3502(), resultSet.getInt("h3502"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3503", handlesCount.getH3503(), resultSet.getInt("h3503"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3504", handlesCount.getH3504(), resultSet.getInt("h3504"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3505", handlesCount.getH3505(), resultSet.getInt("h3505"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3506", handlesCount.getH3506(), resultSet.getInt("h3506"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3507", handlesCount.getH3507(), resultSet.getInt("h3507"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3508", handlesCount.getH3508(), resultSet.getInt("h3508"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3509", handlesCount.getH3509(), resultSet.getInt("h3509"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3510", handlesCount.getH3510(), resultSet.getInt("h3510"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3511", handlesCount.getH3511(), resultSet.getInt("h3511"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3512", handlesCount.getH3512(), resultSet.getInt("h3512"));
                updateIfChanged(person.getId(), "A_HandlesCount", "h3513", handlesCount.getH3513(), resultSet.getInt("h3513"));
            }
        }
    }

    // 3.6 Изменение количества крафтов предметов для OtherAttachmentsCount
    public static void updateOtherAttachmentsCount(Person person, OtherAttachmentsCount otherAttachmentsCount) throws SQLException {
        String Sql = "SELECT * FROM A_OtherAttachmentsCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3601", otherAttachmentsCount.getOa3601(), resultSet.getInt("oa3601"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3602", otherAttachmentsCount.getOa3602(), resultSet.getInt("oa3602"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3603", otherAttachmentsCount.getOa3603(), resultSet.getInt("oa3603"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3604", otherAttachmentsCount.getOa3604(), resultSet.getInt("oa3604"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3605", otherAttachmentsCount.getOa3605(), resultSet.getInt("oa3605"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3606", otherAttachmentsCount.getOa3606(), resultSet.getInt("oa3606"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3607", otherAttachmentsCount.getOa3607(), resultSet.getInt("oa3607"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3608", otherAttachmentsCount.getOa3608(), resultSet.getInt("oa3608"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3609", otherAttachmentsCount.getOa3609(), resultSet.getInt("oa3609"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3610", otherAttachmentsCount.getOa3610(), resultSet.getInt("oa3610"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3611", otherAttachmentsCount.getOa3611(), resultSet.getInt("oa3611"));
                updateIfChanged(person.getId(), "A_OtherAttachmentsCount", "oa3612", otherAttachmentsCount.getOa3612(), resultSet.getInt("oa3612"));
            }
        }
    }

    // 4.1 Изменение количества крафтов предметов для CombatCount
    public static void updateCombatCount(Person person, CombatCount combatCount) throws SQLException {
        String Sql = "SELECT * FROM S_CombatCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "S_CombatCount", "c4101", combatCount.getC4101(), resultSet.getInt("c4101"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4102", combatCount.getC4102(), resultSet.getInt("c4102"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4103", combatCount.getC4103(), resultSet.getInt("c4103"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4104", combatCount.getC4104(), resultSet.getInt("c4104"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4105", combatCount.getC4105(), resultSet.getInt("c4105"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4106", combatCount.getC4106(), resultSet.getInt("c4106"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4107", combatCount.getC4107(), resultSet.getInt("c4107"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4108", combatCount.getC4108(), resultSet.getInt("c4108"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4109", combatCount.getC4109(), resultSet.getInt("c4109"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4110", combatCount.getC4110(), resultSet.getInt("c4110"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4111", combatCount.getC4111(), resultSet.getInt("c4111"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4112", combatCount.getC4112(), resultSet.getInt("c4112"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4113", combatCount.getC4113(), resultSet.getInt("c4113"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4114", combatCount.getC4114(), resultSet.getInt("c4114"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4115", combatCount.getC4115(), resultSet.getInt("c4115"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4116", combatCount.getC4116(), resultSet.getInt("c4116"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4117", combatCount.getC4117(), resultSet.getInt("c4117"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4118", combatCount.getC4118(), resultSet.getInt("c4118"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4119", combatCount.getC4119(), resultSet.getInt("c4119"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4120", combatCount.getC4120(), resultSet.getInt("c4120"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4121", combatCount.getC4121(), resultSet.getInt("c4121"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4122", combatCount.getC4122(), resultSet.getInt("c4122"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4123", combatCount.getC4123(), resultSet.getInt("c4123"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4124", combatCount.getC4124(), resultSet.getInt("c4124"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4125", combatCount.getC4125(), resultSet.getInt("c4125"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4126", combatCount.getC4126(), resultSet.getInt("c4126"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4127", combatCount.getC4127(), resultSet.getInt("c4127"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4128", combatCount.getC4128(), resultSet.getInt("c4128"));
                updateIfChanged(person.getId(), "S_CombatCount", "c4129", combatCount.getC4129(), resultSet.getInt("c4129"));
            }
        }
    }

    // 4.2 Изменение количества крафтов предметов для CombinedCount
    public static void updateCombinedCount(Person person, CombinedCount combinedCount) throws SQLException {
        String Sql = "SELECT * FROM S_CombinedCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "S_CombinedCount", "c4201", combinedCount.getC4201(), resultSet.getInt("c4201"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4202", combinedCount.getC4202(), resultSet.getInt("c4202"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4203", combinedCount.getC4203(), resultSet.getInt("c4203"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4204", combinedCount.getC4204(), resultSet.getInt("c4204"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4205", combinedCount.getC4205(), resultSet.getInt("c4205"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4206", combinedCount.getC4206(), resultSet.getInt("c4206"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4207", combinedCount.getC4207(), resultSet.getInt("c4207"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4208", combinedCount.getC4208(), resultSet.getInt("c4208"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4209", combinedCount.getC4209(), resultSet.getInt("c4209"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4210", combinedCount.getC4210(), resultSet.getInt("c4210"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4211", combinedCount.getC4211(), resultSet.getInt("c4211"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4212", combinedCount.getC4212(), resultSet.getInt("c4212"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4213", combinedCount.getC4213(), resultSet.getInt("c4213"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4214", combinedCount.getC4214(), resultSet.getInt("c4214"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4215", combinedCount.getC4215(), resultSet.getInt("c4215"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4216", combinedCount.getC4216(), resultSet.getInt("c4216"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4217", combinedCount.getC4217(), resultSet.getInt("c4217"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4218", combinedCount.getC4218(), resultSet.getInt("c4218"));
                updateIfChanged(person.getId(), "S_CombinedCount", "c4219", combinedCount.getC4219(), resultSet.getInt("c4219"));
            }
        }
    }

    // 4.3 Изменение количества крафтов предметов для ScientistCount
    public static void updateScientistCount(Person person, ScientistCount scientistCount) throws SQLException {
        String Sql = "SELECT * FROM S_ScientistCount WHERE idPerson = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(Sql)) {
            preparedStatement.setInt(1, person.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                updateIfChanged(person.getId(), "S_ScientistCount", "s4301", scientistCount.getS4301(), resultSet.getInt("s4301"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4302", scientistCount.getS4302(), resultSet.getInt("s4302"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4303", scientistCount.getS4303(), resultSet.getInt("s4303"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4304", scientistCount.getS4304(), resultSet.getInt("s4304"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4305", scientistCount.getS4305(), resultSet.getInt("s4305"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4306", scientistCount.getS4306(), resultSet.getInt("s4306"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4307", scientistCount.getS4307(), resultSet.getInt("s4307"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4308", scientistCount.getS4308(), resultSet.getInt("s4308"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4309", scientistCount.getS4309(), resultSet.getInt("s4309"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4310", scientistCount.getS4310(), resultSet.getInt("s4310"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4311", scientistCount.getS4311(), resultSet.getInt("s4311"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4312", scientistCount.getS4312(), resultSet.getInt("s4312"));
                updateIfChanged(person.getId(), "S_ScientistCount", "s4313", scientistCount.getS4313(), resultSet.getInt("s4313"));
            }
        }
    }

    // Вспомогательный метод
    private static void updateIfChanged(int personId, String tableName, String fieldName, int newValue, int currentValue) throws SQLException {
        if (newValue != currentValue) {
            String sql = "UPDATE " + tableName + " SET " + fieldName + " = ? WHERE idPerson = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, newValue);
                preparedStatement.setInt(2, personId);
                preparedStatement.executeUpdate();
            }
        }
    }

    // Создание нового персонажа и получение его id
    public static void newPerson(Person person) throws SQLException{
        statement.execute("INSERT INTO Person (nickname, fraction) VALUES ('" + person.getNickname() + "', '" + person.getFraction() + "')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Person WHERE nickname = '" + person.getNickname() + "'");
        int idPerson = resultSet.getInt("idPerson");
        person.setId(idPerson);
        resultSet.close();
    }

    // Создание записей в остальных связанных таблицах
    public static void newPersonOther(Person person) throws SQLException{
        for (String s : tableNameCount){
            statement.execute("INSERT INTO " + s + " (idPerson, nicknamePerson) VALUES ('" + person.getId() + "', '" + person.getNickname() + "')");
        }
    }

    // Редактирование Имени и Фракции персонажа
    public static void editPerson(Person person) throws SQLException{
        try (ResultSet resultSet = statement.executeQuery("SELECT * FROM Person WHERE idPerson = " + person.getId())) {

            if (!person.getNickname().equals(resultSet.getString("nickname"))) {
                try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Person SET nickname = ? WHERE idPerson = " + person.getId())) {
                    preparedStatement.setString(1, person.getNickname());
                    preparedStatement.executeUpdate();
                }
            }

            if (!person.getFraction().equals(resultSet.getString("fraction"))) {
                try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Person SET fraction = ? WHERE idPerson = " + person.getId())) {
                    preparedStatement.setString(1, person.getFraction());
                    preparedStatement.executeUpdate();
                }
            }
        }
    }

    // Удаление Персонажа и связанных с ним данных
    public static void deletePerson(Person person) throws SQLException {
        statement.execute("DELETE FROM Person WHERE idPerson = '" + person.getId() + "'");

        for (String s : tableNameCount) {
            statement.execute("DELETE FROM " + s + " WHERE idPerson = '" + person.getId() + "'");
        }
    }

    // Закрытие базы данных
    public static void closeDB() throws SQLException{
        connection.close();
        statement.close();
        System.out.println("База закрыта!");
    }
}
