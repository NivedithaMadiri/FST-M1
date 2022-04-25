package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver= new FirefoxDriver();
        Reporter.log("Starting Test!");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @BeforeMethod
    public void beforemethod(){
        driver.switchTo().defaultContent();
    }
    @Test
    public  void simpleAlertTestcase(){
        driver.findElement(By.id("simple")).click();
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Alert Message :"+simpleAlert.getText());
        simpleAlert.accept();

    }
    @Test
    public void confirmAlertTestcase(){
        driver.findElement(By.id("confirm")).click();
        Alert confirmationAlert =driver.switchTo().alert();
        System.out.println("Alert Message :"+confirmationAlert.getText());
        confirmationAlert.accept();

    }
    @Test
    public void promptAlertTestcase(){
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Alert Message :"+promptAlert.getText());
        promptAlert.sendKeys("I am here");
        promptAlert.accept();

    }

    @AfterTest
    public  void close(){
        driver.close();
    }
}
