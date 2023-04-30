package ch.zhaw.iwi.devops.StringCalculator;

// StringCalculatorTests.java aus https://github.com/scripts4me/R_DevOps_TDD
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTests {

    @Test
    void ZeroInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
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
