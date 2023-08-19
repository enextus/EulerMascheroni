package org.example;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create radio buttons for selecting the scale
            JRadioButton logScaleButton = new JRadioButton("Logarithmic Scale", true);
            JRadioButton normalScaleButton = new JRadioButton("Normal Scale");

            ButtonGroup scaleGroup = new ButtonGroup();
            scaleGroup.add(logScaleButton);
            scaleGroup.add(normalScaleButton);

            JPanel inputPanel = new JPanel();
            inputPanel.setLayout(new BorderLayout());

            // Text field
            JTextField inputField = new JTextField("10000");
            inputPanel.add(inputField, BorderLayout.CENTER);

            // Panel with radio buttons
            JPanel radioPanel = new JPanel();
            radioPanel.add(logScaleButton);
            radioPanel.add(normalScaleButton);
            inputPanel.add(radioPanel, BorderLayout.SOUTH);

            int result = JOptionPane.showConfirmDialog(null, inputPanel,
                    "Enter the number of series elements and select the scale:", JOptionPane.OK_CANCEL_OPTION);

            int limit = 10000; // default value

            if (result == JOptionPane.OK_OPTION) {
                try {
                    limit = Integer.parseInt(inputField.getText());
                } catch (NumberFormatException e) {
                    // If the user enters an incorrect value or nothing, the default value will be 10000
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
