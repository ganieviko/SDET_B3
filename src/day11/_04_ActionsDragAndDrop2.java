package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsDragAndDrop2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement account = driver.findElement(By.id("bank"));

        Actions builder = new Actions(driver);
        Action action = builder.moveToElement(bank).clickAndHold().moveToElement(account).release().build();
        action.perform();


//        driver.quit();
    }
}
