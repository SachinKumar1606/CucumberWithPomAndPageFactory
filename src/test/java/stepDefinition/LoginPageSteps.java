package stepDefinition;

import io.cucumber.java.en.*;
import org.testng.Assert;
import static stepDefinition.BaseSteps.driver;
import static stepDefinition.BaseSteps.pageFactory;

public class LoginPageSteps {

    @Given("^User is on Login Page$")
    public void User_is_on_Login_Page() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("User enter {string} and {string}")
    public void User_enter_username_and_password(String uname, String pass) {
        pageFactory.getLoginPage().setUsername(uname);
        pageFactory.getLoginPage().setPassword(pass);
    }

    @And("^User click on login button$")
    public void User_click_on_login_button() {
        pageFactory.getLoginPage().setSubmit();
    }

    @Then("^User is on Inventory page$")
    public void User_is_on_Inventory_page() {
        String act = driver.getCurrentUrl();
        String ext = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(ext, act);
    }

    @Then("^User is on Home page$")
    public void User_is_on_Home_page() {
        String act = driver.getCurrentUrl();
        String ext = "https://www.saucedemo.com/";
        driver.navigate().back();
        Assert.assertEquals(ext, act);
    }
}
