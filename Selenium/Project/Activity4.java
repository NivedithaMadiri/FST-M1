package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;
    WebDriverWait wait;
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
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("btnAdd")).click();
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".head > h1:nth-child(1)")));
        driver.findElement(By.id("firstName")).sendKeys("Niveditha");
        driver.findElement(By.id("lastName")).sendKeys("Madiri");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Niveditha");

    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
