package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the Page :"+driver.getTitle());
        System.out.println("Is checkbox displayed :"+driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        System.out.println("Is checkbox displayed :"+driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input")).isDisplayed());
        driver.close();



    }
}
