package stepDefinitions;

import io.cucumber.java.en.And;

public class CloseBrowser extends BaseClass{
    @And("^close the browser$")
    public void closebrowser(){
        driver.close();
    }

}
