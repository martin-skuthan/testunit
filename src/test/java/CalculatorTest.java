import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void test() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 2);

        Assertions.assertEquals(7, result);

    }

}
