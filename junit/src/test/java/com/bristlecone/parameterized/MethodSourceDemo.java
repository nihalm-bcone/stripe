package com.bristlecone.parameterized;

import com.bristlecone.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodSourceDemo {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    public void testFactorial(int number, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.factorial(number));
    }

    public static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.arguments(0, 1),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 2),
                Arguments.arguments(3, 6)
        );
    }
}
