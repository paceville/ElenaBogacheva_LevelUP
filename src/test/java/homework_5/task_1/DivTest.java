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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/* for Junit5
@Tag("AllTests")
@Tag("SubDiv")
public class DivTest {
    //private static Throwable exception;
    private Calculator calculator = new Calculator();
   // NumberFormatException exception = new NumberFormatException();

//    Throwable exception = assertThrows(NumberFormatException.class, () -> {
//        throw new NumberFormatException("Attempt to divide by zero");
//    });

    static Stream<Arguments> divDataProviderLong() {
        return Stream.of(
                arguments(1, 2147483649L, 2147483648L),
                arguments(1, -2147483649L, -2147483648L),
                arguments(0, 0, 2147483648L)
        );
    }

    static Stream<Arguments> divDataProviderDouble() {
        return Stream.of(
                arguments(2.5, 5.5, 2.2),
                arguments(-2.5, -5.5, 2.2),
                arguments(0, 0, 5.5)
        );
    }

    @ParameterizedTest
    @MethodSource("divDataProviderLong")
    public void testDivLong(long expected, long param1, long param2) {
        assertEquals(expected, calculator.div(param1, param2));
    }

    @ParameterizedTest
    @MethodSource("divDataProviderDouble")
    public void testDivDouble(double expected, double param1, double param2) {
        assertEquals(expected, calculator.div(param1, param2));
    }
}
 */

/**
 * for TestNG
 */
public class DivTest {
    private Calculator calculator = new Calculator();

    @DataProvider
    public Object[][] divDataProviderLong() {
        return new Object[][] {
                {1, 2147483649L, 2147483648L},
                {1, -2147483649L, -2147483648L},
                {0, 0, 2147483648L},
        };
    }

    @DataProvider
    public Object[][] divDataProviderDouble() {
        return new Object[][] {
                {2.5, 5.5, 2.2},
                {-2.5, -5.5, 2.2},
                {0, 0, 5.5},
        };
    }

    @Test(dataProvider = "divDataProviderLong")
    public void testDivLong(long expected, long param1, long param2) {
        Assert.assertEquals(expected, calculator.div(param1, param2));
    }

    @Test(dataProvider = "divDataProviderDouble")
    public void testDivDouble(double expected, double param1, double param2) {
        Assert.assertEquals(expected, calculator.div(param1, param2));
    }
}

