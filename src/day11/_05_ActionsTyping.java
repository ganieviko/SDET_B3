package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsTyping {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/auto-complete");

        WebElement autoCompleteMultipleInput = driver.findElement(By.id("autoCompleteMultipleInput"));
        Actions builder = new Actions(driver);
        Action action = builder
                .moveToElement(autoCompleteMultipleInput)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("hello")
                .keyUp(Keys.SHIFT)
                .sendKeys("hello")
                .build();
        action.perform();
//            autoCompleteMultipleInput.sendKeys("HELLOhello");

//        driver.quit();
    }
}
