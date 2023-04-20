import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
    void TwoPlusTwoShouldEqualFour(){
        var cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @org.junit.jupiter.api.Test
    void TwoPlusThreeShouldEqualFive(){
        var cal = new Calculator();
        assertEquals(5,cal.add(2,3));
    }

    @org.junit.jupiter.api.Test
    void TwoMinusThreeShouldEqualMinusOne(){
        var cal = new Calculator();
        assertEquals(-1,cal.subtract(2,3));
    }

}
