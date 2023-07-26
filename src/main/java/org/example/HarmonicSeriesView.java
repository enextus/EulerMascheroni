package org.example;

import javax.swing.*;
import java.awt.*;

public class HarmonicSeriesView {
    private final JTextArea textArea;
    private final JRadioButton normalScaleButton;
    private final JRadioButton logScaleButton;

    public HarmonicSeriesView() {
        JFrame frame = new JFrame("Harmonic Series Sum");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        normalScaleButton = new JRadioButton("Normal Scale");
        normalScaleButton.setSelected(true);
        logScaleButton = new JRadioButton("Logarithmic Scale");

        ButtonGroup scaleGroup = new ButtonGroup();
        scaleGroup.add(normalScaleButton);
        scaleGroup.add(logScaleButton);

        JPanel radioPanel = new JPanel();
        radioPanel.add(normalScaleButton);
        radioPanel.add(logScaleButton);
        frame.add(radioPanel, BorderLayout.SOUTH);

        // Text Area setup
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void appendText(String text) {
        textArea.append(text + "\n");
    }

}
