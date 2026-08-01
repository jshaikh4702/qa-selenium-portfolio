package tests;

import pages.DropdownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DropdownTest {
    WebDriver driver;
    DropdownPage dropdownPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void testSelectDropdownOption() {
        dropdownPage.selectOption("Option 2");
        String selected = dropdownPage.getSelectedOption();
        Assert.assertEquals(selected, "Option 2");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}