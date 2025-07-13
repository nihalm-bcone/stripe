package com.bristlecone.parameterized;

import com.bristlecone.Days;
import com.bristlecone.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

public class EnumSourceDemoTest {

    @ParameterizedTest
    @EnumSource(value = Days.class, names = {"MONDAY","TUESDAY","SUNDAY"})
    public void testWeekDay(Days day){

        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isWeekday(day));
    }

}
