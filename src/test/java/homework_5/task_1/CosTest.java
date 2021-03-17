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

/* for Junit5
@Tag("allTests")
@Tag("Trigonometry")
public class CosTest {
    private Calculator calculator = new Calculator();

    static Stream<Arguments> cosDataProviderDouble() {
        return Stream.of(
                arguments(-0.7055403255703919, 5.5),
                arguments(0.7055403255703919, -5.5)
        );
    }

    @ParameterizedTest
    @MethodSource("cosDataProviderDouble")
    public void cosDoubleTest(double expected, double param1) {
        assertEquals(expected, calculator.cos(param1));
    }
}
 */

/**
 * for TestNG
 */

public class CosTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] cosDataProviderDouble() {
        return new Object[][] {
                {-0.7055403255703919, 5.5},
                {0.7055403255703919, -5.5},
        };
    }

    @Test(dataProvider = "cosDataProviderDouble")
    public void cosDoubleTest(double expected, double param1) {
        Assert.assertEquals(expected, calculator.cos(param1));
    }
}