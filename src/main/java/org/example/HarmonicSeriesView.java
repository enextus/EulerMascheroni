package org.example;

import javax.swing.*;
import java.awt.*;

public class HarmonicSeriesView {
    private JTextArea textArea;

    public HarmonicSeriesView() {
        JFrame frame = new JFrame("Harmonic Series Sum");
        frame.setSize(600, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));  // Установка моноширинного шрифта
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setVisible(true);
    }

    public void appendText(String text) {
        textArea.append(text + "\n");
    }
}
