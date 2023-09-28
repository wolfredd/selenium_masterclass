package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\SeleniumDrivers\\chromedriver.exe");

//        WebDriver driver = new ChromeDriver();
        EdgeDriver edgeDriver = new EdgeDriver();

        edgeDriver.get("https://google.com");
//        driver.get("https://testingfunda.com");
        edgeDriver.quit();

    }
}
