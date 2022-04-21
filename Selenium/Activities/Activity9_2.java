package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/selects");
        WebElement mul =driver.findElement(By.id("multi-value"));
        Select multilist = new Select(driver.findElement(By.id("multi-select")));
        if (multilist.isMultiple()){
            multilist.selectByVisibleText("Javascript");
            System.out.println("Text selected is :"+mul.getText());
            multilist.selectByValue("node");
            System.out.println("Text selected is :"+mul.getText());
            for (int i=4;i<6;i++){
                multilist.selectByIndex(i);
            }
            System.out.println("Text selected is :"+mul.getText());
            multilist.deselectByValue("node");
            System.out.println("Text selected is :"+mul.getText());
            multilist.deselectByIndex(7);
            System.out.println("Text selected is :"+mul.getText());
            List<WebElement> options = multilist.getAllSelectedOptions();
            for( WebElement option : options){
                System.out.println("Selected option :"+option.getText());
            }
            multilist.deselectAll();
            System.out.println("text is :"+mul.getText());
            driver.close();
        }


    }
}
