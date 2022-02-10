package Pages;

import org.openqa.selenium.WebDriver;

public class PageObject {

     WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    private LoginPage loginPage;
    private HomePageStdUser homePageStdUser;
    private Cart_Page cartPage;

    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePageStdUser getHomePageStdUser() {
        if(homePageStdUser == null){
            homePageStdUser = new HomePageStdUser();
        }
        return homePageStdUser;
    }

    public Cart_Page getCartPage() {
        if(cartPage == null){
            cartPage = new Cart_Page();
        }
        return cartPage;
    }
}
