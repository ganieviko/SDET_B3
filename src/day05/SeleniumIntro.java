package day05;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path-to-chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://techno.study/" );
    }
}
