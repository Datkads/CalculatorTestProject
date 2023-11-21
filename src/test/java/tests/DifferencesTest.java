package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static calculator.Calculator.difference;
import static org.testng.Assert.assertEquals;

public class DifferencesTest {

    @DataProvider
    public Object[][] differenceData() {
        return new Object[][] {
                {2, 1, 1},
                {1, 2, -1},
                {1, 0, 1},
        };
    }

    @Test(dataProvider = "differenceData", description = "Parameterized tests for difference")
    public void differenceCheck(int a, int b, int expectedDifference) {
        assertEquals(difference(a, b), expectedDifference, "Wrong difference result");
    }
}
