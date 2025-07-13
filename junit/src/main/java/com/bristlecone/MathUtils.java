package com.bristlecone;

public class MathUtils {

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public boolean isWeekday(Days days) {
        return days != Days.SATURDAY && days != Days.SUNDAY;
    }

    public long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
