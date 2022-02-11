package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static stepDefinition.BaseSteps.driver;
import static stepDefinition.BaseSteps.pageFactory;

public class CartPageTest {

    @Given("^User is on the Inventory Page$")
    public void User_is_on_Inventory_Page () {
        driver.navigate().to("https://www.saucedemo.com/");
        pageFactory.getLoginPage().setUsername("standard_user");
        pageFactory.getLoginPage().setPassword("secret_sauce");
        pageFactory.getLoginPage().setSubmit();
    }

    @And ("Again click on the product name")
    public void onCartPage(){
        pageFactory.getHomePageStdUser().setCart();
    }

    @When ("Click on links of the product BackPack")
    public void productPageBackPack(){
        pageFactory.getHomePageStdUser().setBagPackCart();
    }

    @Then ("User is on BackPack Page")
    public void cartLogoutBackPack(){
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Backpack";
        Assert.assertEquals(act, exp);
    }

    @When ("Click on links of the product BikeLight")
    public void productPageBikeLight(){
        pageFactory.getHomePageStdUser().setBikeLightCart();
    }

    @Then ("User is on BikeLight Page")
    public void cartLogoutBikeLight(){
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Bike Light";
        Assert.assertEquals(act, exp);
    }

    @When ("Click on links of the product tShirt")
    public void productPagetShirt(){
        pageFactory.getHomePageStdUser().settShirtCart();
    }

    @Then ("User is on tShirt Page")
    public void cartLogouttShirt(){
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(act, exp);
    }


    @When ("Click on links of the product Jacket")
    public void productPageJacket(){
        pageFactory.getHomePageStdUser().setJacketCart();
    }

    @Then ("User is on Jacket Page")
    public void cartLogoutJacket(){
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Fleece Jacket";
        Assert.assertEquals(act, exp);
    }


    @When ("Click on links of the product Onesie")
    public void productPageOnesie(){
        pageFactory.getHomePageStdUser().setOnesieCart();
    }

    @Then ("User is on Onesie Page")
    public void cartLogoutOnesie(){
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Onesie";
        Assert.assertEquals(act, exp);
    }

    @When("Click on links of the product tRed")
    public void productPagetRed() {
        pageFactory.getHomePageStdUser().settRedCart();
    }

    @Then("User is on tRed Page")
    public void cartLogouttRed() {
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Test.allTheThings() T-Shirt (Red)";
        Assert.assertEquals(act, exp);
    }

    @When("Again click on the add to cart and move to cart page Bike Light")
    public void again_click_on_the_add_to_cart_and_move_to_cart_page_bike_light() {
        pageFactory.getHomePageStdUser().setCart();

    }

    @When("Click on remove button on cart page")
    public void click_on_remove_button_on_cart_page() {
        pageFactory.getCartPage().setRemove();
    }

    @When("Again click on the add to cart and move to cart page tShirt")
    public void again_click_on_the_add_to_cart_and_move_to_cart_page_t_shirt() {
        pageFactory.getHomePageStdUser().setCart();
    }

    @When("Again click on the add to cart and move to cart page Jacket")
    public void again_click_on_the_add_to_cart_and_move_to_cart_page_jacket() {
        pageFactory.getHomePageStdUser().setCart();
    }

    @When("Again click on the add to cart and move to cart page BackPack")
    public void again_click_on_the_add_to_cart_and_move_to_cart_page_back_pack() {
        pageFactory.getHomePageStdUser().setCart();
    }

    @When("Again click on the add to cart and move to cart page Onesie")
    public void again_click_on_the_add_to_cart_and_move_to_cart_page_onesie() {
        pageFactory.getHomePageStdUser().setCart();
    }

    @When("Again click on the add to cart and move to cart page tRed")
    public void again_click_on_the_add_to_cart_and_move_to_cart_page_t_red() {
        pageFactory.getHomePageStdUser().setCart();
    }

    @Then("User is on Home Page again")
    public void user_is_on_home_page_again() {
        pageFactory.getCartPage().setHome();
    }
}
