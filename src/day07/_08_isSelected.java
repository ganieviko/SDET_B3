package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _08_isSelected {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-checkbox-demo.html" );

        boolean isAgeSelected = driver.findElement(By.id("isAgeSelected")).isSelected();
        System.out.println(isAgeSelected);

        driver.findElement(By.id("isAgeSelected")).click();
        System.out.println("Clicking the checkbox");

        isAgeSelected = driver.findElement(By.id("isAgeSelected")).isSelected();
        System.out.println(isAgeSelected);

        driver.quit();
    }
}
