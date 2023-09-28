package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsTabs2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        Thread.sleep(5000);


        String mainTab = driver.getWindowHandle();
        System.out.println(mainTab);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://google.com");


        System.out.println(driver.getWindowHandles());
        driver.switchTo().window(mainTab);
        System.out.println(driver.getTitle());


        Thread.sleep(5000);
        driver.quit();

    }
}
