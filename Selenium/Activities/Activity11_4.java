package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of the page :"+driver.getTitle());
        System.out.println("Handle of the tab :"+driver.getWindowHandle());
        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("All window handles:"+driver.getWindowHandles());
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Title of the page :"+driver.getTitle());
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println("All window handles:"+driver.getWindowHandles());
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Title of the page :"+driver.getTitle());
        driver.quit();


    }
}
