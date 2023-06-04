package ch.zhaw.iwi.devops.demo;

// StringCalculatorTests.java aus https://github.com/scripts4me/R_DevOps_TDD
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTests {

    @Test
    void ZeroInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
/* 
    @Test
    void OneInteger1() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void OneInteger2() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(7, calculator.add("7"));
    }

    @Test
    void TwoInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(15, calculator.add("8,7"));
    }

    @Test
    void TwoIntegerWithSpace() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(15, calculator.add("8, 7"));
    }

    @Test
    void GreatherThanMax() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.add("1001, 2"));
    }

    @Test
    void SmallerThanMin() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.add("-1002, 2"));
    }

    @Test
    void DoubleComma() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("2,,3"));
    }
*/

    @Test
    void OnlyAllowedDelimeter() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.add("2/3"));
    }

    @Test
    void MaxAmountOfNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.add("2,3,6, 7, 8 ,9"));
    }

}
