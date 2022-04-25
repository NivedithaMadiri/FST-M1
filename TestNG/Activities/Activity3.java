package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity3 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void Testmethod1(){
        String Ttile = driver.getTitle();
        System.out.println("Title of the Page :"+Ttile);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();
        String confirmationmsg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Welcome message :"+confirmationmsg);
        Assert.assertEquals(confirmationmsg,"Welcome Back, admin");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
