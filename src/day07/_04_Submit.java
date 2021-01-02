package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Submit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

//        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.id("user-message")).sendKeys("Hello");
        driver.findElement(By.id("get-input")).submit(); // submits the form and refreshes the page

//        driver.quit();
    }
}
