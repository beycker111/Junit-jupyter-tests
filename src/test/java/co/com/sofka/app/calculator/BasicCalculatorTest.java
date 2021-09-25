package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing resting: 1-1=0")
    public void resta() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing multiplicanding: 1*1=1")
    public void multiplicacion() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.multiplicacion(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing dividinding: 1/1=1")
    public void division() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);

    }

    @Test
    @DisplayName("Testing dividinding: 2/0=Exception")
    public void divisionForZero() {

        // Arrange
        Long number1 = 2L;
        Long number2 = 0L;

        // Assert
        Assertions.assertThrows(ArithmeticException.class, () -> {
            // Act
            Long result = basicCalculator.division(number1, number2);
        });

    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
