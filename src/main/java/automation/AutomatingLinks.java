package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomatingLinks {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(5000);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for(int i = 0; i < links.size(); i++){
            System.out.println(links.get(i).getAttribute("href"));
            System.out.println(links.get(i).getText());
        }

        Thread.sleep(2000);

        driver.quit();



    }
}
