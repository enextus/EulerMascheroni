package org.example;

public class HarmonicSeriesController {
    private final HarmonicSeriesCalculator calculator;
    private final HarmonicSeriesView view;
    private final GraphView graphView;  // новый графический представитель

    public HarmonicSeriesController(HarmonicSeriesCalculator calculator, HarmonicSeriesView view) {
        this.calculator = calculator;
        this.view = view;
        this.graphView = new GraphView();  // инициализация нового графического представителя
    }

    public void displaySeries(int limit) {
        view.appendText("  Term                Sum");
        view.appendText("---------            -----");

        double previousSum = 0;
        for (int n = 1; n <= limit; n++) {
            double sum = calculator.calculateSum(n);
            if ((n == 2) || (n % 1000 == 0)) {
                view.appendText(String.format("%10d    %.15f", n, sum));
                graphView.addDataPoint(n, sum - previousSum);  // добавить точку на график
            }
            previousSum = sum;
        }


        view.appendText(String.format("\nFinal series sum after  %d terms: %.15f", limit, previousSum));
        view.appendText("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        graphView.display();  // отображаем график
    }
}
