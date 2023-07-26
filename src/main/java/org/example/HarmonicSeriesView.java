package org.example;

import javax.swing.*;
import java.awt.*;

public class HarmonicSeriesView {
    private JTextArea textArea;

    public HarmonicSeriesView() {
        JFrame frame = new JFrame("Harmonic Series Sum");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
