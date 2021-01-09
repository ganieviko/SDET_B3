package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _09_RobotFileUploadAlternative {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/upload/");

        String path = "C:\\Users\\Dake\\Desktop\\upload.txt";

        driver.findElement(By.id("uploadfile_0")).sendKeys(path);

        driver.findElement(By.id("submitbutton")).click();

//        driver.quit();
    }
}
