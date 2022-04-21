package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {

        WebDriver driver;
        @BeforeTest
    public void setup() {
                driver = new FirefoxDriver();
                driver.get("http://alchemy.hguy.co/orangehrm");

        }
        @Test
                public  void testMethod(){
                 String Title = driver.getTitle();
                System.out.println("Title of the page is :"+Title);
                Assert.assertEquals(Title, "OrangeHRM");

        }
        @AfterTest
        public void tearDown(){
                driver.close();
        }





}
