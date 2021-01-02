package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_GetAttibute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/broken_images" );

        List<WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement image:images) {
            String src = image.getAttribute("src");
            String naturalWidth = image.getAttribute("naturalWidth");
            boolean broken = naturalWidth.equals("0");
            System.out.println("broken: " + broken + " src: " + src + "  => naturalWidth: " + naturalWidth);
        }

        driver.quit();
    }
}
