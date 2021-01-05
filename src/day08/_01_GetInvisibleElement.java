package day08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetInvisibleElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_loading/1" );

        driver.findElement(By.id("start")).click();

        String finish = driver.findElement(By.id("finish")).getText();
        System.out.println(finish);

        driver.quit();
    }
}
