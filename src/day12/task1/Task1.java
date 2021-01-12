package day12.task1;

import day12.MyConstants;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

import java.util.Set;

public class Task1 {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        String originalWindowHandle = driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();


        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle: windowHandles) {
            if(!handle.equals(originalWindowHandle))
                driver.switchTo().window(handle); // switch to second window
        }

//        String pageSource = driver.getPageSource();
//        if(pageSource.contains("This is a sample page")) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Failure");
//        }

        boolean found = false;
        try {
            driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]"));
            found = true;
        } catch (Exception e){
            found = false;
        }

        Assert.assertTrue("The element not found", found);
    }

    @Test
    public void test2() {

    }
}
