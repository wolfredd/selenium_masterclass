package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NestedFrames1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        Thread.sleep(5000);


        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("Total frames: " + frames.size());


        driver.switchTo().frame(1);
        String bottomFrame = driver.findElement(By.tagName("body")).getText();
        System.out.println(bottomFrame);


        driver.switchTo().parentFrame();
        List<WebElement> framess = driver.findElements(By.tagName("frame"));
        System.out.println("Total frames: " + framess.size());

//        driver.switchTo().frame(0);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");


        String leftFrame = driver.findElement(By.tagName("body")).getText();
        System.out.println(leftFrame);


        driver.switchTo().defaultContent();
        List<WebElement> framesss = driver.findElements(By.tagName("frame"));
        System.out.println("Total frames: " + framesss.size());
        Thread.sleep(5000);
        driver.quit();



    }
}
