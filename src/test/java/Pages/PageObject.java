package Pages;

public class PageObject {

    private LoginPage loginPage;

    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }
}
