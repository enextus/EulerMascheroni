package org.example;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String input = JOptionPane.showInputDialog(null, "Введите количество элементов ряда:", "10000");
            int limit;
            try {
                limit = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                limit = 10000; // значение по умолчанию, если пользователь введет некорректное значение или ничего не введет
            }

            HarmonicSeriesView view = new HarmonicSeriesView();
            HarmonicSeriesCalculator model = new HarmonicSeriesCalculator();
            HarmonicSeriesController controller = new HarmonicSeriesController(model, view);

            controller.displaySeries(limit);
        });
    }
}
