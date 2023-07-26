package org.example;

import javax.swing.*;
import org.example.model.HarmonicSeriesCalculator;
import org.example.view.HarmonicSeriesView;
import org.example.controller.HarmonicSeriesController;

public class HarmonicSeriesSum {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HarmonicSeriesView view = new HarmonicSeriesView();
            HarmonicSeriesCalculator model = new HarmonicSeriesCalculator();
            HarmonicSeriesController controller = new HarmonicSeriesController(model, view);

            controller.displaySeries(2_140_000);
        });
    }
}
