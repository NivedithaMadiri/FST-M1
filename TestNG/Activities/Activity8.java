package activities;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity8 {
    WebDriver driver;
    Actions builder;
    @BeforeClass
    public void setupmethod(){
        driver = new FirefoxDriver();
        builder = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
    }
    @Test(priority = 0)
    public void testmethod1(){
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();
        String volumelevel = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(volumelevel,"50");

    }
    @Test(priority = 1)
    public void testmethod2(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(75,0).release().build().perform();
        String volumelevel = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(volumelevel,"100");

    }
    @Test(priority = 2)
    public void testmethod3(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(-75,0).release().build().perform();
        String volumelevel = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(volumelevel,"0");

    }
    @Test(priority = 3)
    public void testmethod4(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(-30,0).release().build().perform();
        String volumelevel = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(volumelevel,"30");

    }
    @Test(priority = 4)
    public void testmethod5(){
        WebElement slider = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider).moveByOffset(45,0).release().build().perform();
        String volumelevel = driver.findElement(By.id("value")).getText();
        Assert.assertEquals(volumelevel,"80");

    }
    @AfterClass
    public  void teardown(){
       driver.close();
    }
}
