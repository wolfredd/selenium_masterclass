package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload4 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(5000);


        WebElement uploadFile = driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys("C:\\Users\\wilfr\\Desktop\\selenium.txt");
        driver.findElement(By.id("file-submit")).click();


        Thread.sleep(10000);
        driver.quit();

    }
}
