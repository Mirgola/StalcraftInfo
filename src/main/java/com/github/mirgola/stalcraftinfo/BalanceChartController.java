package com.github.mirgola.stalcraftinfo;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
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

        double maxValue = 0;
        for (XYChart.Data<String, Number> data : series.getData()) {
            maxValue = Math.max(maxValue, data.getYValue().doubleValue());
        }

        double minValue = maxValue;
        for (XYChart.Data<String, Number> data : series.getData()) {
            minValue = Math.min(minValue, data.getYValue().doubleValue());
        }

        System.out.println(minValue);

        NumberAxis yAxis = (NumberAxis) lineChart.getYAxis();
        yAxis.setAutoRanging(false);
        yAxis.setLowerBound((int)(minValue * 0.9));
        yAxis.setUpperBound((int)(maxValue * 1.1));

        int tickUnit = (int)(maxValue * 1.1) / 10;
        yAxis.setTickUnit(tickUnit);

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

    public void setBalanceLabel(int balance) {
        balanceLabel.setText("Баланс аккаунта = " + decimalFormat.format(balance) + " ₽");
    }

    @FXML
    private void closeStage() {
        stage.close();
    }
}
