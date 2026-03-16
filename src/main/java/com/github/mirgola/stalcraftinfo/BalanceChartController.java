package com.github.mirgola.stalcraftinfo;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.text.DecimalFormat;

public class BalanceChartController {
    private Stage stage;
    private int balance;
    @FXML
    private LineChart<String, Number> lineChart;
    @FXML
    private Label balanceLabel;
    private DecimalFormat decimalFormat = new DecimalFormat("###,###");

    @FXML
    private void initialize() throws SQLException {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        SciDB.BalanceChart(series);

        lineChart.getData().add(series);

        // Принудительно создаем сцену и применяем CSS
        lineChart.sceneProperty().addListener((obs, oldScene, newScene) -> {
            if (newScene != null) {
                javafx.application.Platform.runLater(() -> {
                    lineChart.applyCss();
                    lineChart.layout();

                    // Теперь пробуем добавить подсказки
                    for (XYChart.Data<String, Number> data : series.getData()) {
                        Node node = data.getNode();
                        if (node != null) {
                            String tooltipText = String.format("%s, %,.0f ₽",
                                    data.getXValue().toString(),
                                    data.getYValue().doubleValue());
                            Tooltip tooltip = new Tooltip(tooltipText);
                            tooltip.setShowDelay(javafx.util.Duration.millis(100));
                            Tooltip.install(node, tooltip);
                        }
                    }
                });
            }
        });
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    //ObservableList<Person> personData

    public void setBalanceLabel(int balance) {
//        for (Person person : personData) {
//            balance += person.getCost();
//        }
//        balanceLabel.setText(decimalFormat.format(balance));
        balanceLabel.setText(decimalFormat.format(balance));
    }

    @FXML
    private void closeStage() {
        stage.close();
    }
}
