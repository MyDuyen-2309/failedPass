package failedPASS;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assert.assertEquals(calculator.add(2, 3), 5); // Test case pass
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.subtract(5, 3), 2); // Test case pass
    }

    @Test
    public void testAdditionFail() {
        Assert.assertEquals(calculator.add(2, 2), 4); // Test case fail
    }

}
