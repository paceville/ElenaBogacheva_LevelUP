package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class MultTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] multDataProviderLong() {
        return new Object[][] {
                {4611686020574871552L, 2147483648L, 2147483649L},
                {4611686020574871552L, -2147483648L, -2147483649L},
                {0, 2147483648L, 0},
        };
    }

    @DataProvider
    public Object[][] multDataProviderDouble() {
        return new Object[][] {
                {7.0, 3.3, 2.2},
                {7.0, -3.3, -2.2},
                {0, 5.5, 0},
        };
    }

    @Test(dataProvider = "multDataProviderLong")
    public void testMultLong(long expected, long param1, long param2) {
        Assert.assertEquals(expected, calculator.mult(param1, param2));
    }

    @Test(dataProvider = "multDataProviderDouble")
    public void testMultDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.mult(param1, param2));
    }
}
