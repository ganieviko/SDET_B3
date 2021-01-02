package day07;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _13_FindInsideElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

        List<WebElement> panels = driver.findElements(By.className("panel"));
        for (WebElement panel : panels) {
            WebElement heading = panel.findElement(By.className("panel-heading"));
            System.out.println(heading.getText());
        }

        driver.quit();
    }
}
