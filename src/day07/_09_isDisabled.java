package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_isDisabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_controls" );

        boolean enabled = driver.findElement(By.cssSelector("#input-example > input")).isEnabled();
        System.out.println(enabled);

        driver.findElement(By.cssSelector("#input-example > button")).click();

        Thread.sleep(3000);
        enabled = driver.findElement(By.cssSelector("#input-example > input")).isEnabled();
        System.out.println(enabled);

//        driver.quit();
    }
}
