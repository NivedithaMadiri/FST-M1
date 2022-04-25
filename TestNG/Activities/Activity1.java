package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.accessibility.AccessibleStateSet;

public class Activity1 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }
   @Test
   public void Testmethod(){
        String Ttile = driver.getTitle();
        System.out.println("Title of the Page :"+Ttile);
       Assert.assertEquals(Ttile,"Training Support");
       driver.findElement(By.id("about-link")).click();
       String newTitle = driver.getTitle();
       System.out.println("Title of the Page :"+newTitle);
       Assert.assertEquals(newTitle,"About Training Support");
   }
    @AfterMethod
    public void tearDown(){
        driver.close();
   }
}
