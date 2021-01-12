package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_SwitchingToNestedIFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame("frame1");
//        WebElement iFrameElement = driver.findElement(By.cssSelector("iframe[src='checkbox.html']"));
        driver.switchTo().frame("frame3");

        driver.findElement(By.cssSelector("input[type=checkbox]")).click();
    }
}
