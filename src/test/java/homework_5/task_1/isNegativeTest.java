package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class isNegativeTest {

    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] isNegativeDataProvider() {
        return new Object[][] {
                {false, 2147483648L},
                {true, -2147483648L},
                {false, 0},
        };
    }

    @Test(dataProvider = "isNegativeDataProvider")
    public void testIsNegativeLong(boolean expected, long param1) {
        Assert.assertEquals(expected, calculator.isNegative(param1));
    }
}
