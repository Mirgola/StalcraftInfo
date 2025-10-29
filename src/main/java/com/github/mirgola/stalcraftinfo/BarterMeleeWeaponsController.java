package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BarterMeleeWeaponsController {
    @FXML
    private TextField meleeField;

    @FXML
    private void handleCheckBox() {
        if(meleeField.isEditable()){
            meleeField.setEditable(false);
        } else {
            meleeField.setEditable(true);
        }
    }

}
