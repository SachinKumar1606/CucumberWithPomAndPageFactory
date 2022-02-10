package stepDefinition;

import Pages.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePageSteps {

    public static WebDriver driver;
    protected PageObject pageFactory;


    @Given("^User is on Inventory Page$")
    public void User_is_on_Inventory_Page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        pageFactory = new PageObject(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        pageFactory.getLoginPage().setUsername("standard_user");
        pageFactory.getLoginPage().setPassword("secret_sauce");
        pageFactory.getLoginPage().setSubmit();
    }

    @When ("^Click on links and verify that user is on the right page$")
    public void Click_on_links(){
        pageFactory.getHomePageStdUser().setBagPack();
        pageFactory.getHomePageStdUser().setBikeLight();
        pageFactory.getHomePageStdUser().settRed();
        pageFactory.getHomePageStdUser().settShirt();
        pageFactory.getHomePageStdUser().setOnesie();
        pageFactory.getHomePageStdUser().setJacket();
    }

    @Then ("^Close the browser$")
    public void Close_the_browser(){
        driver.close();
    }

}
