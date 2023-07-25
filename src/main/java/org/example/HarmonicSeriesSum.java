package org.example;

public class HarmonicSeriesSum {

    public static void main(String[] args) {
        double sum = 0.0;
        int n = 2;  // начальное значение (1 уже не учитываем)
        int limit = 2_140_000;  // предел для количества членов ряда

        System.out.println("  Член ряда            Сумма");
        System.out.println("---------            -----");

        for (; n <= limit + 1; n++) {
            sum += 1.0 / n;

            if (n % 1000 == 0) {
                System.out.printf("%10d    %.15f%n", n, sum);
            }
        }

        System.out.printf("\nИтоговая сумма ряда после %d членов: %.15f%n", limit, sum);
        System.out.print(Integer.MAX_VALUE);
    }

}
