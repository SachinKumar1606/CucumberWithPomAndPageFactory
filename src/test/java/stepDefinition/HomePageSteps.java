package stepDefinition;

import Pages.PageObject;
import com.google.gson.internal.Streams;
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

import static stepDefinition.BaseSteps.pageFactory;
import static stepDefinition.BaseSteps.driver;


public class HomePageSteps{

    @Given("^User is on Inventory Page$")
    public void User_is_on_Inventory_Page () {
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

    @When ("Click on Image and verify that user is on the right page")
    public void imageCheck(){
        pageFactory.getHomePageStdUser().setBagPackPic();
//        pageFactory.getHomePageStdUser().setBikeLightPic();
        pageFactory.getHomePageStdUser().settRedPic();
        pageFactory.getHomePageStdUser().settShirtPic();
        pageFactory.getHomePageStdUser().setOnesiePic();
        pageFactory.getHomePageStdUser().setJacketPic();
    }

    @When ("Click on add to cart and verify that user is on the right page")
    public void addToCart(){
        pageFactory.getHomePageStdUser().setBagPackCart();
        pageFactory.getHomePageStdUser().setBikeLightCart();
        pageFactory.getHomePageStdUser().settRedCart();
        pageFactory.getHomePageStdUser().settShirtCart();
        pageFactory.getHomePageStdUser().setOnesieCart();
        pageFactory.getHomePageStdUser().setJacketCart();
    }

    @When ("Click on social media verify that user is on the right page")
    public void checkingSocialMediaLinks(){
        pageFactory.getHomePageStdUser().setLinkedIn();
        pageFactory.getHomePageStdUser().setFacebook();
        pageFactory.getHomePageStdUser().setTwitter();
    }

    @Then ("^Click on logout button$")
    public void clickingOnLogoutButton(){
        pageFactory.getHomePageStdUser().setLogout();
    }



}
