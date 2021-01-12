package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class _01_OpeningWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.cssSelector("a[target=_blank]"));

        for (WebElement link : links) {
            link.click();
        }

        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle: windowHandles) {
            System.out.println(handle);
        }

//        driver.quit();
        driver.close();

    }
}
