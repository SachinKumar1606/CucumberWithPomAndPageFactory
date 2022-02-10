package stepDefinition;

import Pages.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {
    public static ChromeDriver driver;
    public static PageObject pageFactory;
    @Before
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        pageFactory = new PageObject(driver);
        driver.manage().window().maximize();
    }

    @After
    public void closeAll(){
        driver.close();
    }
}
