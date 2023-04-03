package ch.zhaw.iwi.devops.StringCalculator;


// StringCalculatorTests.java aus https://github.com/scripts4me/R_DevOps_TDD
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTests {

    @Test
    public void ZeroInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void OneInteger1() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    public void OneInteger2() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(7, calculator.add("7"));
    }

    @Test
    public void TwoInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(15, calculator.add("8,7"));
    }

    @Test
    public void TwoIntegerWithSpace() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(15, calculator.add("8, 7"));
    }

    @Test
    public void GreatherThanMax() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.add("1001, 2"));
    }

    @Test
    public void SmallerThanMin() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.add("-1002, 2"));
    }

    @Test
    public void DoubleComma() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("2,,3"));
    }

    @Test
    public void OnlyAllowedDelimeter() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.add("2/3"));
    }

    @Test
    public void MaxAmountOfNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.add("2,3,6, 7, 8 ,9"));
    }

}
