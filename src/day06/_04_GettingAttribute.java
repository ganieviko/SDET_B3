package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_GettingAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/" );

        WebElement homeLink = driver.findElement(By.linkText("Selenium Easy"));
        String href = homeLink.getAttribute("href");
        String title = homeLink.getAttribute("title");
        String rel = homeLink.getAttribute("rel");
        System.out.println("href = " + href);
        System.out.println("title = " + title);
        System.out.println("rel = " + rel);
        driver.quit();
    }
}
