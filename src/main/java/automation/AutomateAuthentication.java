package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAuthentication {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(5000);


        //or
        String username = "admin";
        String password = "admin";
        String URL = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
    }
}
