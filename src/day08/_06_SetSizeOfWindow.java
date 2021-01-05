package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _06_SetSizeOfWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        Dimension d = driver.manage().window().getSize();
        System.out.println("Window width is " + d.width);
        System.out.println("Window height is " + d.height);
        driver.quit();
    }
}
