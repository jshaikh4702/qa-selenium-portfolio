package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CheckboxPage {
    WebDriver driver;
    By checkboxes = By.cssSelector("input[type='checkbox']");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void toggleCheckbox(int index) {
        driver.findElements(checkboxes).get(index).click();
    }

    public boolean isCheckboxSelected(int index) {
        return driver.findElements(checkboxes).get(index).isSelected();
    }
}