package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page :"+driver.getTitle());
        System.out.println("Is text box enabled :"+driver.findElement(By.xpath("//*[@id=\"dynamicText\"]")).isEnabled());
        driver.findElement(By.xpath("//*[@id=\"toggleInput\"]")).click();
        System.out.println("Is text box enabled :"+driver.findElement(By.xpath("//*[@id=\"dynamicText\"]")).isEnabled());
        driver.close();

    }
}
