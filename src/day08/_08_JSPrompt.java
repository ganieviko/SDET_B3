package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_JSPrompt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);

        driver.switchTo().alert().sendKeys("Hello Techno Study!");

        driver.switchTo().alert().accept();

        System.out.println(driver.findElement(By.id("result")).getText());

//        driver.quit();
    }
}
