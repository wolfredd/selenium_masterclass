package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick6 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.plus2net.com/jquery/msg-demo/event-dblclick.php");
        Thread.sleep(2000);


        WebElement dButton = driver.findElement(By.id("b1"));
        Actions act = new Actions(driver);
        act.doubleClick(dButton).build().perform();;


        Thread.sleep(10000);
        driver.quit();

    }

}
