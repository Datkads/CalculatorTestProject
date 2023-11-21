package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod(description = "Calculator tests setup")
    public void setup() {

    }

    @AfterMethod(description = "Calculator tests ending")
    public void shotDown() {

    }
}
