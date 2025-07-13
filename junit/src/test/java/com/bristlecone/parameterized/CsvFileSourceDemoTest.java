package com.bristlecone.parameterized;

import com.bristlecone.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvFileSourceDemoTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/factorial_data.csv")
    public void testFactorial(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factorial(number));
    }
}
