import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(10.00, 25.00), 35.00, "incorrect");
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.substract(10.00, 25.00), -15);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(10.00, 25.00), 250.00);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(10.00, 25.00), 0.40);
    }
}