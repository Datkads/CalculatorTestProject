package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static calculator.Calculator.division;
import static org.testng.Assert.assertEquals;

public class DivisionTest extends BaseTest {

    @DataProvider
    public Object[][] divisionData() {
        return new Object[][] {
                {2, 1, 2},
                {1, 2, 0},
                {0, 1, 0},
        };
    }

    @Test(dataProvider = "divisionData", description = "Parameterized tests for divisions")
    public void divisionCheck(int a, int b, int expectedDivision) {
        assertEquals(division(a, b), expectedDivision, "Wrong division result");
    }
}
