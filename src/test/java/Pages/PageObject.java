package Pages;

import org.openqa.selenium.WebDriver;

public class PageObject {

     WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }

    private LoginPage loginPage;
    private HomePageStdUser homePageStdUser;

    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePageStdUser getHomePageStdUser(){
        if(homePageStdUser == null){
            homePageStdUser = new HomePageStdUser();
        }
        return homePageStdUser;
    }
}
