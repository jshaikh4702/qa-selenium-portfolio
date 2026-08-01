package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    By dropdownElement = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOption(String visibleText) {
        Select dropdown = new Select(driver.findElement(dropdownElement));
        dropdown.selectByVisibleText(visibleText);
    }

    public String getSelectedOption() {
        Select dropdown = new Select(driver.findElement(dropdownElement));
        return dropdown.getFirstSelectedOption().getText();
    }
}
