package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TgTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] tgDataProviderDouble() {
        return new Object[][] {
                {1.0, 5.5},
                {1.0, -5.5},
        };
    }

    @Test(dataProvider = "tgDataProviderDouble")
    public void testTgDouble(double expected, double param1) {
        Assert.assertEquals(expected, calculator.tg(param1));
    }
}
