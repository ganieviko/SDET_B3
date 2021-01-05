package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _10_SelectByClicking {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

//        driver.findElement(By.cssSelector("select[name=state] > :nth-child(3)")).click();

        List<WebElement> options = driver.findElements(By.cssSelector("select[name=state] > option"));

        for (int i = 0; i < options.size(); i++) {
            if(options.get(i).getText().equals("Mississippi")) {
                options.get(i).click();
                break;
            }
        }

//        driver.quit();
    }
}
