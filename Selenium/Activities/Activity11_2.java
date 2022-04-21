package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Activity11_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page is :"+driver.getTitle());
        driver.findElement(By.id("confirm")).click();
        Alert confirmationalert = driver.switchTo().alert();
        System.out.println("Text in the Alert is :"+confirmationalert.getText());
        confirmationalert.accept();
        sleep(100);
        driver.findElement(By.id("confirm")).click();
        System.out.println("Text in the Alert is :"+confirmationalert.getText());
        confirmationalert.dismiss();
        driver.close();

    }
}
