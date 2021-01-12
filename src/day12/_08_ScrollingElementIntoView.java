package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_ScrollingElementIntoView {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://techno.study/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement form = driver.findElement(By.id("form-contact-us"));
        js.executeScript("arguments[0].scrollIntoView();", form);

    }
}
