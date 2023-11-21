package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static calculator.Calculator.multiplication;
import static org.testng.Assert.assertEquals;

public class MultiplicationTest {
    @DataProvider
    public Object[][] multiplicationData() {
        return new Object[][] {
                {1, 2, 2},
                {2, 0, 0},
                {-1, -2, 2},
        };
    }

    @Test(dataProvider = "multiplicationData", description = "Parameterized tests for multiplication")
    public void multiplicationCheck(int a, int b, int expectedMultiplication) {
        assertEquals(multiplication(a, b), expectedMultiplication, "Wrong multiplication result");
    }
}
