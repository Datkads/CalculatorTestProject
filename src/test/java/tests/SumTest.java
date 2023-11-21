package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static calculator.Calculator.sum;
import static org.testng.Assert.assertEquals;

public class SumTest extends BaseTest {

    @DataProvider
    public Object[][] sumData() {
        return new Object[][] {
                {1, 1, 2},
                {-1, -1, -2},
                {1, 0, 1},
        };
    }

    @Test(dataProvider = "sumData", description = "Parameterized tests for sum")
    public void sumCheck(int a, int b, int expectedSum) {
        assertEquals(sum(a, b), expectedSum, "Wrong sum result");
    }
}
