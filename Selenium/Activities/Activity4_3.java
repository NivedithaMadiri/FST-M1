package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the page :"+driver.getTitle());
        System.out.println("Third header on the page"+driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText());
        System.out.println("Fifth header on the page"+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color"));
        System.out.println("Violet button classes are :"+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class"));
        System.out.println("grey button text is :"+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
        Thread.sleep(2000);
        driver.close();
    }
}
