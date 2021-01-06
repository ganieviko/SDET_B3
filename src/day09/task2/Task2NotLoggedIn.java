package day09.task2;
import day09.MyConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2NotLoggedIn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://test.campus.techno.study/" );
        driver.findElement(By.cssSelector("input[data-placeholder=\"Username\"]")).sendKeys("daulet2030@gmail.com");
        driver.findElement(By.cssSelector("input[data-placeholder=\"Password\"]")).sendKeys("WrongPassword@");
        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg[data-icon=\"bars\"]")));
            System.out.println("Logged in!");
        } catch (Exception e) {
            System.out.println("Not logged in!");
        }
//        try {
//            driver.findElement(By.cssSelector("svg[data-icon=\"bars\"]"));
//            System.out.println("Logged in!");
//        } catch (Exception e) {
//            System.out.println("Not logged in!");
//        }
    }
}
