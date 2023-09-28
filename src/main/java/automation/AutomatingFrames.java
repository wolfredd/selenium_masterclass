package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrames {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        Thread.sleep(5000);

        //driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']")).sendKeys("Some text here");
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(2000);
        WebElement iframeTextBox = driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
        Thread.sleep(2000);
        iframeTextBox.clear();
        Thread.sleep(2000);
        iframeTextBox.sendKeys("Sending text into textarea of iframe");
        Thread.sleep(2000);


        driver.switchTo().defaultContent();
        driver.quit();


    }
}
