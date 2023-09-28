package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomateDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(5000);

        Select obj = new Select(driver.findElement(By.id("dropdown")));

        obj.selectByIndex(1);
        obj.selectByValue("2");
        obj.selectByVisibleText("Option 1");

        //Count number of options available in dropdown

        List<WebElement> dropDownValuesCount = obj.getOptions();
        System.out.println(dropDownValuesCount.size());





    }
}
