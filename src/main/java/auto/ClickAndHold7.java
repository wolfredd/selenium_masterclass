package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold7 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
        Thread.sleep(2000);


        WebElement clickAndHold = driver.findElement(By.id("1"));
        Actions act = new Actions(driver);
        act.clickAndHold(clickAndHold).build().perform();;


        Thread.sleep(10000);
        driver.quit();

    }

}
