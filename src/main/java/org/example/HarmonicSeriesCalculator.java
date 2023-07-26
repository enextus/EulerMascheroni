package org.example;

public class HarmonicSeriesCalculator {
    public double calculateSum(int limit) {

        if (limit <= 0) {
            throw new IllegalArgumentException("Value of n must be positive");
        }

        double sum = 0.0;
        for (int n = 1; n <= limit; n++) {
            sum += 1.0 / n;
        }
        return sum;
    }


}
