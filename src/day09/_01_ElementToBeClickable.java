package day09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_ElementToBeClickable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "not clickable example url" );
        // TODO: show a good example of not clickable
        driver.findElement(By.cssSelector("#button")).click();

        driver.quit();
    }
}
