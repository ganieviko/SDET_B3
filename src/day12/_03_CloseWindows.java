package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _03_CloseWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        String originalWindowHandle = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.cssSelector("a[target=_blank]"));

        List<String> orderedWindowHandle = new ArrayList<String>();
        orderedWindowHandle.add(originalWindowHandle);

        for (WebElement link : links) {
            link.click();
            for (String handle: driver.getWindowHandles()) {
                if(!orderedWindowHandle.contains(handle)) {
                    orderedWindowHandle.add(handle);
                }
            }
        }

        for (String handle : orderedWindowHandle) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }

        driver.switchTo().window(orderedWindowHandle.get(1));
        driver.close(); // close only second window

        driver.switchTo().window(orderedWindowHandle.get(2)); // switching focus to another windows
        driver.findElement(By.cssSelector("a[target=_blank]")); // this will give you an error if you don't switch focus,
        // because driver does not have focus
    }
}
