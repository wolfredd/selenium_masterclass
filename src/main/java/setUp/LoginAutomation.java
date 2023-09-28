package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);


        WebElement username = driver.findElement(By.name("username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("Admin");
        Thread.sleep(5000);


        WebElement password = driver.findElement(By.name("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("admin123");
        Thread.sleep(5000);

//        WebElement loginButton = driver.findElement(By.tagName("button"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();
        Thread.sleep(5000);


        WebElement welcome = driver.findElement(By.id("welcome"));
        String actualValue = welcome.getText();
        String expectedValue = "Welcome Paul";
        if(actualValue ==expectedValue){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        Thread.sleep(5000);




        driver.quit();

    }

}
