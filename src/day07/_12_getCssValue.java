package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _12_getCssValue {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://the-internet.herokuapp.com/dynamic_controls" );

        WebElement element = driver.findElement(By.cssSelector("#checkbox-example > button"));

        String backgroundColor = element.getCssValue("background-color");
        String paddingLeft = element.getCssValue("padding-left");
        String textAlign = element.getCssValue("text-align");

        System.out.println(backgroundColor);
        System.out.println(paddingLeft);
        System.out.println(textAlign);

//        driver.quit();
    }
}
