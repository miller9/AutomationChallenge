package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage extends BasePage{

    public CheckoutInformationPage(WebDriver driver) {
        super(driver);
    }

    private By firstNameElem = By.id("first-name");
    private By lastNameElem = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private String firstName = "Jonh";
    private String lastName = "Doe";
    private String pCode = "12345";
    private By continueButton = By.id("continue");

    private By checkoutTitle = By.className("title");
    private String titleExpected = "CHECKOUT: YOUR INFORMATION";

    public By getFirstNameElem() {
        return firstNameElem;
    }

    public By getLastNameElem() {
        return lastNameElem;
    }

    public By getPostalCode() {
        return postalCode;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getpCode() { return pCode; }

    public By getContinueButton() { return continueButton; }

    public By getCheckoutTitle() { return checkoutTitle; }

    public String getTitleExpected() { return titleExpected; }
}
