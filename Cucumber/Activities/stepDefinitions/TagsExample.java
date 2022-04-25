package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TagsExample extends BaseClass {
    @Given("^user is on the training page$")
    public void trainingpage(){
        driver.get("https://training-support.net");
    }
    @When("^user clicks on the AboutUs button$")
    public void AboutUs(){
        driver.findElement(By.id("about-link")).click();
    }
    @Then("^user redirects to AboutUs page$")
    public void AboutUsVerification(){
        String Title =driver.findElement(By.xpath("//h1[@class='ui header']")).getText();
        Assert.assertEquals("About Us",Title);
    }
}
