package regression_tests;

import framework.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UITests {

    @AfterMethod
    public void afterMethod() {
        DriverFactory.quite();
    }


    @Test
    public void uiTest1() {
        DriverFactory.setUp();
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://novaposhta.ua/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo("Nova poshta"));
    }


}
