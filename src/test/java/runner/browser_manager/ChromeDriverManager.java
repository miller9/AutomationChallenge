package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/linux/chromedriver");
        driver = new ChromeDriver();
    }
}
