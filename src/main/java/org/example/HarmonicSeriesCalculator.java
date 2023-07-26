package org.example.model;

public class HarmonicSeriesCalculator {

    public double calculateSum(int limit) {
        double sum = 0.0;
        for (int n = 2; n <= limit + 1; n++) {
            sum += 1.0 / n;
        }
        return sum;
    }
}
