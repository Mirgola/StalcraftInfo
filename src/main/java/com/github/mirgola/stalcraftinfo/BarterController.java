package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BarterController {
    private BorderPane barter;

    public void setBarter(BorderPane barter) {
        this.barter = barter;
    }

    @FXML
    private void handleMeleeWeapons() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("BarterMeleeWeapons.fxml"));
        //AnchorPane meleeWeapons = (AnchorPane) fxmlLoader.load();
        ScrollPane meleeWeapons = (ScrollPane) fxmlLoader.load();
        barter.setCenter(meleeWeapons);
    }
}
