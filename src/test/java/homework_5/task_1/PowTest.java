package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class PowTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] powDataProviderDouble() {
        return new Object[][] {
                {30.25, 5.5, 2},
                {1, 5.5, 0},
                {0.03305785123966942, 5.5, -2},
                {30.25, -5.5, 2},
        };
    }

    @Test(dataProvider = "powDataProviderDouble")
    public void testPowDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.pow(param1, param2));
    }
}
