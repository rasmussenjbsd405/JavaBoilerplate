/**
 * Tests to run the Calculator class
 *
 * @author Mr. Rasmussen
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void evalutatesExpression() {
        Calculator calculator = new Calculator();

        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}
