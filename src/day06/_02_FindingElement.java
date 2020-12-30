package day06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/" );

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement button = driver.findElement(By.id("btn_basic_example"));
        String buttonText = button.getText();
        System.out.println(buttonText);

//        button.click();

        String headText = driver.findElement(By.className("head")).getText();
        System.out.println(headText);

        WebElement element = driver.findElement(By.linkText("Input Forms"));
        System.out.println(element.getText());
        element.click();

        WebElement startPracticing = driver.findElement(By.partialLinkText("Start Practising"));
        System.out.println(startPracticing.getText());
        startPracticing.click();

        System.out.println(driver.findElement(By.tagName("h3")).getText());

        String text = driver.findElement(By.cssSelector("#btn_basic_example")).getText();
        System.out.println("BTN TEXT IS: " + text);

        String text1 = driver.findElement(By.cssSelector(".head")).getText();
        System.out.println("HEAD TEXT IS: " + text1);
//        driver.quit();
    }
}
