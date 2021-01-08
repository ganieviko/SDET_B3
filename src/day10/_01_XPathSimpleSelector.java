package day10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_XPathSimpleSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://test.campus.techno.study/" );
        driver.findElement(By.xpath("//input[@data-placeholder=\"Username\"]")).sendKeys("daulet2030@gmail.com");
        driver.findElement(By.xpath("//input[@data-placeholder=\"Password\"]")).sendKeys("TechnoStudy123@");
        driver.findElement(By.xpath("//button[@aria-label=\"LOGIN\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[name()='svg'][@data-icon='bars']")));
            System.out.println("Logged in!");
        } catch (Exception e) {
            System.out.println("Not logged in!");
        }

//        driver.quit();
    }
}
