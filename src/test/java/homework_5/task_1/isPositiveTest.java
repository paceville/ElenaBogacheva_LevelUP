package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class isPositiveTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] isPositiveDataProvider() {
        return new Object[][] {
                {true, 2147483648L},
                {false, -2147483648L},
                {false, 0},
        };
    }

    @Test(dataProvider = "isPositiveDataProvider")
    public void testIsPositiveLong(boolean expected, long param1) {
        Assert.assertEquals(expected, calculator.isPositive(param1));
    }
}
