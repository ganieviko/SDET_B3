package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class _07_RobotNotificationsPopup {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cleartrip.com/");

        Thread.sleep(2000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

//        driver.quit();
    }
}
