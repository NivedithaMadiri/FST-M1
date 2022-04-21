package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;
    WebElement element;
    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

    }
    @Test
    public  void testMethod() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
       // wait.until(ExpectedConditions.visibilityOf(element= driver.findElement(By.id("menu_directory_viewDirectory"))));
      // wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_directory_viewDirectory")));
        driver.findElement(By.id("menu_directory_viewDirectory")).click();
        Thread.sleep(5000);
        String headtext = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1")).getText();
        System.out.println("Head Text is :"+headtext);
        Assert.assertEquals(headtext,"Search Directory");
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
