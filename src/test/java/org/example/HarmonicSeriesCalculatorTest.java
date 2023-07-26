package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarmonicSeriesCalculatorTest {

    private HarmonicSeriesCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new HarmonicSeriesCalculator();
    }

    @Test
    void testCalculateSum() {
        double result = calculator.calculateSum(3);
        // Ожидаемая сумма для первых 3 термов гармонического ряда: 1 + 1/2 + 1/3
        double expected = 1 + (double) 1/2 + (double) 1/3;
        assertEquals(expected, result, 0.0001); // используем дельту для сравнения чисел с плавающей точкой
    }

    @Test
    void testCalculateSumNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateSum(-5));
    }

    @Test
    void testCalculateSumZeroInput() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateSum(0));
    }
}
