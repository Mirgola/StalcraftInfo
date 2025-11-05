package com.github.mirgola.stalcraftinfo;

import com.github.mirgola.stalcraftinfo.barter.BarterMeleeWeaponsController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class BarterController {
    private BorderPane barter;
    private Person person;
    private SciApplication sciApplication;

    public void setBarter(BorderPane barter) {
        this.barter = barter;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setSciApplication(SciApplication sciApplication) {
        this.sciApplication = sciApplication;
    }

    @FXML
    private void handleMeleeWeapons() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SciApplication.class.getResource("/com/github/mirgola/stalcraftinfo/barter/BarterMeleeWeapons.fxml"));
        ScrollPane meleeWeapons = (ScrollPane) fxmlLoader.load();
        barter.setCenter(meleeWeapons);

        BarterMeleeWeaponsController controller = fxmlLoader.getController();
        controller.setPerson(person);
        controller.setBarterMeleeWeapons(sciApplication.getBarterMeleeWeaponsData().get(person.getId() - 1));
    }
}
