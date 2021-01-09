package day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionsRightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://demoqa.com/buttons" );

        WebElement button = driver.findElement(By.xpath("//button[text()='Right Click Me']"));

        Actions builder = new Actions(driver);
        Action action = builder.moveToElement(button).contextClick().build();
        action.perform();

        String message = driver.findElement(By.id("rightClickMessage")).getText();
        System.out.println(message);
//        driver.quit();
    }
}
