import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSum(){
        assertEquals (5, calculator.sum(3,2));
        assertEquals(6.6, calculator.sum(3.3,3.3));
    }
    @Test
    void testSubtraction(){
        assertEquals (5, calculator.subtraction(10, 5));
        assertEquals(5.5, calculator.subtraction(10.5,5));
    }
    @Test
    void  testMultiplication(){
        assertEquals (12, calculator.multiplication(3,4));
        assertEquals(6.25, calculator.multiplication(2.5, 2.5));
    }
    @Test
    void testDivision() {
        assertEquals(2.5, calculator.division(5.0, 2.0), 0.0001);
        assertEquals(Double.POSITIVE_INFINITY, calculator.division(5.0, 0.0));
    }
}
