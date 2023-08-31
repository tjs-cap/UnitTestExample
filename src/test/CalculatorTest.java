import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void TwoPlusTwoShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqualFive(){
        var cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }

    @Test
    void TwoMinusTwoShouldEqualZero(){
        var cal = new Calculator();
        assertEquals(0,cal.subtract(2,2));
    }

    @Test
    void TwoTimesThreeShouldEqualSix(){
        var cal = new Calculator();
        assertEquals(6,cal.multiply(2,3));
    }
}