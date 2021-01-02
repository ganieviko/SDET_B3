package day07;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_GetTitleAndPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );
        String title = driver.getTitle();
        System.out.println("current title is " + title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.quit();
    }
}
