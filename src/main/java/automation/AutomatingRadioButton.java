package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingRadioButton {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(5000);


        WebElement radioButton = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        radioButton.click();
        radioButton.isEnabled();
        radioButton.isDisplayed();
        radioButton.isSelected();

        System.out.println(radioButton.getText());
        System.out.println(radioButton.getAttribute("class"));
        System.out.println(radioButton.getTagName());

        driver.quit();

    }
}
