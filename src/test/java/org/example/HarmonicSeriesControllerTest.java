package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class HarmonicSeriesControllerTest {

    private HarmonicSeriesCalculator calculatorMock;
    private HarmonicSeriesView viewMock;
    private GraphView graphViewMock;
    private HarmonicSeriesController controller;

    @BeforeEach
    public void setUp() {
        calculatorMock = mock(HarmonicSeriesCalculator.class);
        viewMock = mock(HarmonicSeriesView.class);
        graphViewMock = mock(GraphView.class);

        controller = new HarmonicSeriesController(calculatorMock, viewMock);
    }

    @Test
    public void testDisplaySeries() {
        when(calculatorMock.calculateSum(anyInt())).thenReturn(1.0); // Для упрощения
        controller.displaySeries(2);

        verify(viewMock, times(5)).appendText(anyString());  // Проверяем, что метод appendText вызывался три раза (два терма + заголовки)
    }

}
