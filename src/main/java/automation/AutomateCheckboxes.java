package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCheckboxes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(5000);


        WebElement checkbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        checkbox.click();
        Thread.sleep(2000);
        checkbox.click();

        System.out.println(checkbox.getText());

    }
}
