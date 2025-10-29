package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class StageBarterController {
    private Stage stage;

    // Закрытие окна
    @FXML
    private void closeButton() {
        stage.close();
    }

    public void setStageBarter(Stage stage) {
        this.stage = stage;
    }
}
