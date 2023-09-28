package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reorder9 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mikeplate.github.io/jquery-drag-drop-plugin/example/reorder.html");
        Thread.sleep(2000);


        WebElement draggable = driver.findElement(By.xpath("//li[normalize-space()='Item A']"));
        WebElement droppable = driver.findElement(By.xpath("//li[normalize-space()='Item D']"));


        Actions act = new Actions(driver);
        act.dragAndDrop(draggable, droppable).build().perform();;


        Thread.sleep(5000);
        driver.quit();

    }

}
