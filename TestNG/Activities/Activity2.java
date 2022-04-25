package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test
    public void Testmethod1(){
        String Ttile = driver.getTitle();
        System.out.println("Title of the Page :"+Ttile);
        Assert.assertEquals(Ttile,"Target Practice");
            }
    @Test
    public void Testmethod2(){
        WebElement blackbutton = driver.findElement(By.className("black"));
        Assert.assertTrue(blackbutton.isDisplayed());
        Assert.assertEquals(blackbutton.getText(),"black");

    }
    @Test(enabled = false)
    public void Testmethod3(){
        String subheading = driver.findElement(By.className("sub")).getText();
        System.out.println("SubHeading :"+subheading);

    }
    @Test
    public void Testmethod4(){
        throw new SkipException("Skipping Testcase");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
