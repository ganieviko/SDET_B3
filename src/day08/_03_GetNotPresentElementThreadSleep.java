package day08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetNotPresentElementThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_loading/2" );

        driver.findElement(By.cssSelector("#start > button")).click();
        Thread.sleep(5000); // if the element appears after 3 seconds, the 2 seconds will be wasted

        String finish = driver.findElement(By.id("finish")).getText();
        System.out.println(finish);

        driver.quit();
    }
}
