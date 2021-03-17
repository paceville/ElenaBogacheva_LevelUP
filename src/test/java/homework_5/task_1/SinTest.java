package homework_5.task_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SinTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] sinDataProviderDouble() {
        return new Object[][] {
                {-0.7055403255703919, 5.5},
                {0.7055403255703919, -5.5},
        };
    }

    @Test(dataProvider = "sinDataProviderDouble")
    public void testSinDouble(double expected, double param1) {
        Assert.assertEquals(expected, calculator.sin(param1));
    }
}
