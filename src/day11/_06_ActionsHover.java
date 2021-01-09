package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _06_ActionsHover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        WebElement kids = driver.findElement(By.cssSelector("a[data-group=\"kids\"]"));
        Actions builder = new Actions(driver);
        Action action = builder
                .moveToElement(kids)
                .build();
        action.perform();


        List<WebElement> menus = driver.findElements(By.cssSelector("div[data-group=\"kids\"] li"));
        for (WebElement menu : menus) {
            System.out.println(menu.getText());
        }

//        driver.quit();
    }
}
