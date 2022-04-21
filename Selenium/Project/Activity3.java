package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }
    @Test
    public  void testMethod(){
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("branding")));
        System.out.println("Is homepage Opened :"+driver.findElement(By.cssSelector("#branding > a:nth-child(1) > img:nth-child(1)")).isDisplayed());
            }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
