package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/" );

        List<WebElement> liElements = driver.findElements(By.cssSelector("#treemenu li"));
        for (WebElement element: liElements) {
            System.out.println(element.getText());
        }
//        driver.quit();
    }
}
