package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _04_SwitchingToIFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");

//        driver.switchTo().frame("frame1");
        WebElement iFrameElement = driver.findElement(By.cssSelector("iframe[src='frames1.html']"));
        driver.switchTo().frame(iFrameElement);

        driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Hello");
    }
}
