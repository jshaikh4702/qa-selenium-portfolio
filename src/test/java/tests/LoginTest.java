package tests;

import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        String message = loginPage.getFlashMessage();
        Assert.assertTrue(message.contains("You logged into a secure area!"));
    }

    @Test
    public void testInvalidLogin() {
        loginPage.enterUsername("wronguser");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLogin();

        String message = loginPage.getFlashMessage();
        Assert.assertTrue(message.contains("Your username is invalid!"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}