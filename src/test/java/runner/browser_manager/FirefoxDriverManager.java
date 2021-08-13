package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/firefox/linux/geckodriver");
        driver = new FirefoxDriver();
    }
}
