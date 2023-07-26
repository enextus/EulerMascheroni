package org.example;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HarmonicSeriesView view = new HarmonicSeriesView();
            HarmonicSeriesCalculator model = new HarmonicSeriesCalculator();
            HarmonicSeriesController controller = new HarmonicSeriesController(model, view);

            controller.displaySeries(2_140_000);
        });
    }

}
