package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableElements11 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable");
        Thread.sleep(2000);


        driver.switchTo().frame(0);
        WebElement resizable = driver.findElement(By.xpath(""));


        Actions act = new Actions(driver);
        act.dragAndDropBy(resizable, 50, 50).build().perform();;
        act.dragAndDropBy(resizable, 100, 50).build().perform();;
        act.dragAndDropBy(resizable, 150, 50).build().perform();;
        act.dragAndDropBy(resizable, 200, 50).build().perform();;
        act.dragAndDropBy(resizable, 250, 50).build().perform();;
        act.dragAndDropBy(resizable, 300, 50).build().perform();;


        Thread.sleep(5000);
        driver.quit();

    }
}
