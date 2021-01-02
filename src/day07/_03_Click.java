package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Click {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.cssSelector("#treemenu ul > li:first-child ")).click();
        driver.findElement(By.cssSelector("#treemenu ul > li:first-child > ul > li:first-child")).click();

//        driver.quit();
    }
}
