package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("Number of Columns :"+cols.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows :"+rows.size());
        WebElement cellValueBefore = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row Second column cell value before sorting :"+cellValueBefore.getText());
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/thead/tr/th[1]")).click();
        WebElement cellValueAfter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row Second column cell value before sorting :"+cellValueAfter.getText());
        WebElement footer =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tfoot"));
        System.out.println("Footer Values :"+footer.getText());
        driver.close();
    }
}
