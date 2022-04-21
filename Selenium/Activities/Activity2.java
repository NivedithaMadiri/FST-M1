package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        //driver.getTitle();
        System.out.println("The Title of the page is :"+driver.getTitle());
        //id
        System.out.println("Text in the element is :"+driver.findElement(By.id("about-link")).getText());
        //classname
        System.out.println("Text in the element is :"+driver.findElement(By.className("green")).getText());
        //linktext
        System.out.println("Text in the element is :"+driver.findElement(By.linkText("About Us")).getText());
        //cssSelector
        System.out.println("Text in the element is :"+driver.findElement(By.cssSelector("#about-link")).getText());
        driver.close();
    }
}
