package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _05_GetNotPresentElementImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.cssSelector("#start > button")).click();
        // if the element appears after 3 seconds, the 2 seconds will NOT be wasted
        // because the script will continue right away, after it found the element

        // if the element is never found, it will not wait forever, it will wait just for 5 seconds only

        String finish = driver.findElement(By.id("finish")).getText();;

        System.out.println(finish);

        driver.quit();
    }
}
