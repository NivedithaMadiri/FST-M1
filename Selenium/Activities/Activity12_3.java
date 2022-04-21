package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Title of the page :"+driver.getTitle());
        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        builder.moveToElement(button).pause(Duration.ofSeconds(3)).build().perform();
        System.out.println("Message on tool tip is :"+button.getAttribute("data-tooltip"));
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/button")).click();
        System.out.println("Text on the page :"+driver.findElement(By.id("action-confirmation")).getText());
        driver.close();


    }
}
