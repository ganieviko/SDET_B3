package day05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path-to-chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://techno.study/" );
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector(".et_pb_text_inner"));
        String text = element.getText();
        System.out.println(text);
    }
}
