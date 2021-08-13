package seleniumglue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;
    private static int numberOfCase = 0;

    @Before
    public void setUp(){
        numberOfCase ++;
        System.out.println("Executed Scenario: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
