package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        WebElement selected =driver.findElement(By.id("single-value"));
        Select dropdown = new Select(driver.findElement(By.id("single-select")));
        dropdown.selectByVisibleText("Option 2");
        System.out.println("Text is :"+selected.getText());
        dropdown.selectByIndex(3);
        System.out.println("Text is :"+selected.getText());
        dropdown.selectByValue("4");
       System.out.println("Text is :"+selected.getText());
        List<WebElement> options = dropdown.getOptions();
        for(WebElement option : options) {
           System.out.println("Option: " + option.getText());
        }
        driver.close();
    }
}
