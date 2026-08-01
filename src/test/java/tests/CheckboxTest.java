package tests;

import pages.CheckboxPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CheckboxTest {
    WebDriver driver;
    CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkboxPage = new CheckboxPage(driver);
    }

    @Test
    public void testToggleCheckbox() {
        checkboxPage.toggleCheckbox(0);
        boolean isSelected = checkboxPage.isCheckboxSelected(0);
        Assert.assertTrue(isSelected);
    }

    @AfterMethod
    public void tearDown() {
    driver.quit();
    }
}
