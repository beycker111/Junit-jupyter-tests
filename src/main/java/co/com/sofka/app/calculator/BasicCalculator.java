package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2) {
        logger.info( "Resting {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicacion(Long number1, Long number2) {
        logger.info( "Multiplicanding {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) throws ArithmeticException {
        logger.info( "Dividinding {} + {}", number1, number2 );
        return number1 / number2;
    }
}
