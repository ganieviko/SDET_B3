package day10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _02_XPathByTextSelector {
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

        String parentMenu = "//span[text()='Setup']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(parentMenu)));
        driver.findElement(By.xpath(parentMenu)).click();

        String secondLevelMenu = "//span[text()='Parameters']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(secondLevelMenu)));
        driver.findElement(By.xpath(secondLevelMenu)).click();

        String thirdLevelMenu = "//span[text()='Countries']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(thirdLevelMenu)));
        driver.findElement(By.xpath(thirdLevelMenu)).click();
//        driver.quit();
    }
}
