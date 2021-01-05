package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_GetNotPresentElementTryCatch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.cssSelector("#start > button")).click();

        String finish = "";

        while (finish.equals("")) {
            try {
                finish = driver.findElement(By.id("finish")).getText();
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
        System.out.println(finish);

        driver.quit();
    }
}
