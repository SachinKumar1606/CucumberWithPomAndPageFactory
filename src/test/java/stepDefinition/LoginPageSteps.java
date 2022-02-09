package stepDefinition;

import Pages.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPageSteps {

    public static WebDriver driver;
    protected PageObject pageFactory;


    @Given("^User is on Login Page$")
    public void User_is_on_Login_Page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        pageFactory = new PageObject(driver);
        driver.manage().window().maximize();
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
        driver.close();
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
