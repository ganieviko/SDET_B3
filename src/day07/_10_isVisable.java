package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _10_isVisable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_controls" );

        List<WebElement> loadingElements = driver.findElements(By.id("loading"));
        for (WebElement loadingElement: loadingElements) {
            System.out.println(loadingElement.isDisplayed());
        }

        driver.findElement(By.cssSelector("#input-example > button")).click();

        loadingElements = driver.findElements(By.id("loading"));
        for (WebElement loadingElement: loadingElements) {
            System.out.println(loadingElement.isDisplayed());
        }

        Thread.sleep(3000);
        System.out.println("After 3 seconds");

        loadingElements = driver.findElements(By.id("loading"));
        for (WebElement loadingElement: loadingElements) {
            System.out.println(loadingElement.isDisplayed());
        }

//        driver.quit();
    }
}
