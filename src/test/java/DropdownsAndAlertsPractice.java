import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

import static java.lang.Thread.sleep;

public class DropdownsAndAlertsPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Part 1: Dropdown
        driver.get("https://the-internet.herokuapp.com/dropdown");
        // your dropdown code goes here
        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Option 2");
        // Part 2: Alerts
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // your alert code goes here
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText()); // read the alert's message
        alert.accept();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
