package org.example.controller;

import org.example.model.HarmonicSeriesCalculator;
import org.example.view.HarmonicSeriesView;

public class HarmonicSeriesController {

    private final HarmonicSeriesCalculator calculator;
    private final HarmonicSeriesView view;

    public HarmonicSeriesController(HarmonicSeriesCalculator calculator, HarmonicSeriesView view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void displaySeries(int limit) {
        view.appendText("  Term                Sum");
        view.appendText("---------            -----");

        double sum = calculator.calculateSum(limit);

        for (int n = 2; n <= limit + 1; n++) {
            if (n % 1000 == 0) view.appendText(String.format("%10d    %.15f", n, sum));
        }

        view.appendText(String.format("\nFinal series sum after  %d terms: %.15f", limit, sum));
        view.appendText("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
    }
}
