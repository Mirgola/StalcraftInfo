package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class BalanceChartController {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void closeStage() {
        stage.close();
    }
}
