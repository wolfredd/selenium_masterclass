package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick5 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);


        WebElement images = driver.findElement(By.xpath("//a[@aria-label='Search for Images (opens a new tab)']"));
        Actions act = new Actions(driver);
        act.contextClick(images).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();;
//        act.contextClick(images).build().perform();



        Thread.sleep(10000);
        driver.quit();

    }
}
