package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_Scrolling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 2000)");

    }
}
