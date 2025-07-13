package com.bristlecone.parameterized;

import com.bristlecone.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CsvSourceDemoTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "3, 6",
            "5, 120",
            "4, 24"
    })
    public void testFactorial(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factorial(number));
    }
}
