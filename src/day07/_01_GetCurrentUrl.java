package day07;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetCurrentUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://techno.study/" );
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl is " + currentUrl);
        driver.quit();
    }
}
