package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int checkingValue;
    private final int expectedValue;

    public FelineParametrizedTest(int checkingValue, int expectedValue) {
        this.checkingValue = checkingValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{{2, 2}, {1, 1}, {0, 0}, {-1, -1},};
    }

    @Test
    public void getKittensTest() {
        Feline cat = new Feline();
        int actual = cat.getKittens(checkingValue);
        assertEquals(expectedValue, actual);
    }
}

