package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _14_PageLoadTimeout {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);

        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

        driver.quit();
    }
}
