package org.example;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Создаем радио-кнопки для выбора масштаба
            JRadioButton normalScaleButton = new JRadioButton("Normal Scale", true);
            JRadioButton logScaleButton = new JRadioButton("Logarithmic Scale");
            ButtonGroup scaleGroup = new ButtonGroup();
            scaleGroup.add(normalScaleButton);
            scaleGroup.add(logScaleButton);

            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new BorderLayout());

            // Текстовое поле
            JTextField inputField = new JTextField("10000");
            inputPanel.add(inputField, BorderLayout.CENTER);

            // Панель с радио-кнопками
            JPanel radioPanel = new JPanel();
            radioPanel.add(normalScaleButton);
            radioPanel.add(logScaleButton);
            inputPanel.add(radioPanel, BorderLayout.SOUTH);

            int result = JOptionPane.showConfirmDialog(null, inputPanel,
                    "Введите количество элементов ряда и выберите шкалу:", JOptionPane.OK_CANCEL_OPTION);

            int limit = 10000; // значение по умолчанию
            if (result == JOptionPane.OK_OPTION) {
                try {
                    limit = Integer.parseInt(inputField.getText());
                } catch (NumberFormatException e) {
                    // если пользователь введет некорректное значение или ничего не введет, значение по умолчанию будет 10000
                }
            }

            HarmonicSeriesView view = new HarmonicSeriesView();
            HarmonicSeriesCalculator model = new HarmonicSeriesCalculator();
            HarmonicSeriesController controller = new HarmonicSeriesController(model, view);

            controller.setLogarithmicAxis(logScaleButton.isSelected());
            controller.displaySeries(limit);
        });
    }
    
}
