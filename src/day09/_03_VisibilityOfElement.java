package day09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03_VisibilityOfElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_loading/1" );

        driver.findElement(By.cssSelector("#start > button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish"))); // implicit wait cannot check visibility

        System.out.println(driver.findElement(By.id("finish")).getText());
        driver.quit();
    }
}
