package org.example;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class GraphView {
    public static final String DELTA = "Delta";
    private final JFrame frame;
    private final XYSeries series;
    private final JFreeChart chart;
    public GraphView() {
        frame = new JFrame("Harmonic Series Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        series = new XYSeries("Harmonic Series");
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        chart = ChartFactory.createXYLineChart(
                "Harmonic Series ΔH_n",
                "Term",     // По оси X у нас будет номер терма
                "ΔH_n",     // По оси Y у нас будет приращение
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
    }

    public void display() {
        frame.setVisible(true);
    }

    public void addDataPoint(int term, double value) {
        series.add(term, value);
    }

    public void setLogarithmicAxis(boolean useLogAxis) {
        if (useLogAxis) {
            LogarithmicAxis logAxis = new LogarithmicAxis(DELTA);
            chart.getXYPlot().setRangeAxis(logAxis);
        } else {
            NumberAxis linearAxis = new NumberAxis(DELTA);
            chart.getXYPlot().setRangeAxis(linearAxis);
        }
    }

}
