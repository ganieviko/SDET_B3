package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/" );

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement button = driver.findElement(By.id("btn_basic_example"));
        String buttonText = button.getText();
        System.out.println(buttonText);

        button.click();

//        driver.quit();
    }
}
