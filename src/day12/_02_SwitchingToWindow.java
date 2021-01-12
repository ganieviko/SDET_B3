package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class _02_SwitchingToWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        String originalWindowHandle = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.cssSelector("a[target=_blank]"));

        for (WebElement link : links) {
            link.click();
        }

        Set<String> windowHandles = driver.getWindowHandles();
        for(String handle: windowHandles) {
            System.out.println(handle);
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }

        driver.switchTo().window(originalWindowHandle);
        System.out.println("Original windows : " + driver.getTitle());

//        driver.quit();
//        driver.close();

    }
}
