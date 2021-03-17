package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SumTest {

    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] sumDataProviderLong() {
        return new Object[][] {
                {4294967297L, 2147483648L, 2147483649L},
                {-4294967297L, -2147483648L, -2147483649L},
                {2147483648L, 2147483648L, 0},
        };
    }

    @DataProvider
    public Object[][] sumDataProviderDouble() {
        return new Object[][] {
                {5.5, 3.3, 2.2},
                {-5.5, -3.3, -2.2},
                {5.5, 5.5, 0},
        };
    }

    @Test(dataProvider = "sumDataProviderLong")
    public void testSumLong(long expected, long param1, long param2) {
        Assert.assertEquals(expected, calculator.sum(param1, param2));
    }

    @Test(dataProvider = "sumDataProviderDouble")
    public void testSumDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.sum(param1, param2));
    }
}
