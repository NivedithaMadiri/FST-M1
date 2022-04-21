package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of the page :"+driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Karthi");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Karthi");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcd123@test.com");
        driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9874567987");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
