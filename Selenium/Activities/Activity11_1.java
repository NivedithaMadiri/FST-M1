package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page:"+driver.getTitle());
        driver.findElement(By.id("simple")).click();
        Alert simplealert=driver.switchTo().alert();
        System.out.println("Text in the Alert is :"+simplealert.getText());
        simplealert.accept();
        driver.close();
    }
}
