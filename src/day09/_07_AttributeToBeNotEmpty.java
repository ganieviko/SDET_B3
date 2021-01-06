package day09;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _07_AttributeToBeNotEmpty {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://css-tricks.com/examples/DynamicPage/#index.php" );

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = driver.findElement(By.id("main-content"));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(element, "style"));


        long currentTime = System.currentTimeMillis();
        String style;
        for (int i = 0; i < 50; i++) {
            style = driver.findElement(By.id("main-content")).getAttribute("style");
            System.out.println(style + " time: " + (System.currentTimeMillis() - currentTime));
        }

        driver.findElement(By.cssSelector("[href=\"about.php\"]")).click();
        System.out.println("Clicked");

        // TODO: show fluent wait, need to check every 100 milliseconds
        for (int i = 0; i < 50; i++) {
            style = driver.findElement(By.id("main-content")).getAttribute("style");
            System.out.println(style + " time: " + (System.currentTimeMillis() - currentTime));
        }

//        driver.quit();
    }
}
