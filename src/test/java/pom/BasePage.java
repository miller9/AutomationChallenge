package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("Couldn't click the element: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("The element: " + element + " is not displayed");
        }
    }

    public boolean isEnabled(By element) throws Exception {
        try {
            return driver.findElement(element).isEnabled();
        }catch (Exception e){
            throw new Exception("The element: " + element + " is not Enabled");
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("Couldn't find the text's element: " + element);
        }
    }

    public String getTitle() throws Exception {
        try {
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("Couldn't find the driver's title");
        }
    }

    public WebElement findElement(By element) throws Exception {
        try {
            return driver.findElement(element);
        }catch (Exception e){
            throw new Exception("Couldn't find  the element: " + element);
        }
    }

    public void clear(By element) throws Exception {
        try {
            driver.findElement(element).clear();
        } catch (Exception e) {
            throw new Exception("Error cleaning the field with element: " + element);
        }
    }

    public void sendKeys(By element, String string) throws Exception {
        try {
            driver.findElement(element).sendKeys(string);
        } catch (Exception e) {
            throw new Exception("Error sending the keys: " + element);
        }
    }

    public WebDriverWait waitFunction (By element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            return wait;
        }catch (Exception e){
            throw new Exception("Couldn't create the Wait element");
        }
    }





}
