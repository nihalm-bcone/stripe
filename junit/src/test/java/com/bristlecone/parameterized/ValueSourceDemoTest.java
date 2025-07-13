package com.bristlecone.parameterized;

import com.bristlecone.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import static org.junit.jupiter.api.Assertions.*;

public class ValueSourceDemoTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 })
    public void testEven(int number) {

        MathUtils mathUtils = new MathUtils();

        assertTrue(mathUtils.isEven(number));
    }
}
