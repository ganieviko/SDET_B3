package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_EnteringText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement inputElement = driver.findElement(By.id("user-message"));
        inputElement.sendKeys("Test");
    }
}
