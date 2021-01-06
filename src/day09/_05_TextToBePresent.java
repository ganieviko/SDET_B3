package day09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _05_TextToBePresent {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://css-tricks.com/examples/DynamicPage/#index.php" );


        System.out.println(driver.findElement(By.id("guts")).getText());

        driver.findElement(By.cssSelector("[href=\"about.php\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("guts"), "About")); // implicit wait cannot check invisibility

        System.out.println(driver.findElement(By.id("guts")).getText());

        driver.quit();
    }
}
