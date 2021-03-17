package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SqrtTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] sqrtDataProviderDouble() {
        return new Object[][] {
                {2.345207879911715, 5.5},
                {2.345207879911715, -5.5},
        };
    }

    @Test(dataProvider = "sqrtDataProviderDouble")
    public void testSqrtDouble(double expected, double param1) {
        Assert.assertEquals(expected, calculator.sqrt(param1));
    }
}
