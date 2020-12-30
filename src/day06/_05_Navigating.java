package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Navigating {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/" );

        driver.get("https://google.com");
//        driver.navigate().to("https://google.com");

        driver.navigate().back();

//        driver.navigate().forward();
    }
}
