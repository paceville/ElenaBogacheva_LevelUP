package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class CtgTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] ctgDataProviderDouble() {
        return new Object[][] {
                {0.9999665971563038, 5.5},
                {-0.9999665971563038, -5.5},
        };
    }

    @Test(dataProvider = "ctgDataProviderDouble")
    public void testCtgDouble(double expected, double param1) {
        Assert.assertEquals(expected, calculator.ctg(param1));
    }
}
