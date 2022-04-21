package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page :"+driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"))));
        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"))));
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input")).click();
        driver.close();
    }
}
