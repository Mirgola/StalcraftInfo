package com.github.mirgola.stalcraftinfo;

import javafx.application.Application;

import java.sql.SQLException;

public class Launcher {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SciDB.conn();
        Application.launch(SciApplication.class, args);
        SciDB.closeDB();
    }
}
