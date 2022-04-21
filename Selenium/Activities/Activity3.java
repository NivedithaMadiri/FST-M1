package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page :"+driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Niveditha");
        driver.findElement(By.id("lastName")).sendKeys("Madiri");
        driver.findElement(By.id("email")).sendKeys("abc123@test.com");
        driver.findElement(By.id("number")).sendKeys("12345678");
        driver.findElement(By.className("green")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
