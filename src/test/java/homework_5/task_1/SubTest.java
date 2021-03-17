package homework_5.task_1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@Tag("AllTests")
@Tag("SubDiv")
public class SubTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] subDataProviderLong() {
        return new Object[][] {
                {2147483648L ,4294967297L , 2147483649L},
                {-2147483648L, -4294967297L, -2147483649L},
                {-2147483648L, 0, 2147483648L},
        };
    }

    @DataProvider
    public Object[][] subDataProviderDouble() {
        return new Object[][] {
                {3.3, 5.5, 2.2},
                {-3.3, -5.5, -2.2},
                {5.5, 5.5, 0},
        };
    }

    @Test(dataProvider = "subDataProviderLong")
    public void testSubLong(long expected, long param1, long param2) {
        Assert.assertEquals(expected, calculator.sub(param1, param2));
    }

    @Test(dataProvider = "subDataProviderDouble")
    public void testSubDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.sub(param1, param2));
    }
}
