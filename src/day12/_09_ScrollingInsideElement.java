package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_ScrollingInsideElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollArea = driver.findElement(By.className("wrapper"));
        js.executeScript("arguments[0].scrollBy(1000, 0);", scrollArea);

    }
}
