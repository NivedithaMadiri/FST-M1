package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title of the page :"+driver.getTitle());
        WebElement pressedkey = driver.findElement(By.id("keyPressed"));
        Action actionsequence1 = actions.sendKeys("N").build();
        actionsequence1.perform();
        System.out.println("Key Pressed is :"+pressedkey.getText());
        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        System.out.println("Key Pressed is :"+pressedkey.getText());
        driver.close();


    }
}
