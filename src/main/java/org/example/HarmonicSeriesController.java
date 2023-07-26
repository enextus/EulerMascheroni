package org.example;

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

        double sum = 0.0;

        for (int n = 2; n <= limit + 1; n++) {
            sum += 1.0 / n; // Накапливаем сумму в цикле

            if ((n == 2) || (n % 1000 == 0)) {
                view.appendText(String.format("%10d    %.15f", n, sum));
            }
        }

        view.appendText(String.format("\nFinal series sum after  %d terms: %.15f", limit, sum));
        view.appendText("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
    }

}
