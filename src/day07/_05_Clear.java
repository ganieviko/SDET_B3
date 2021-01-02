package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_Clear {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

//        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.id("user-message")).sendKeys("Hello");

        Thread.sleep(5000); // wait for 5 seconds

        driver.findElement(By.id("user-message")).clear();

//        driver.quit();
    }
}
