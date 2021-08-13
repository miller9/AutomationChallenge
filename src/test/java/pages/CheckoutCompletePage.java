package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage{

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    private By confirmation = By.className("complete-header");
    private String orderConfirmation = "THANK YOU FOR YOUR ORDER";

    public By getConfirmation() {
        return confirmation;
    }

    public String getOrderConfirmation() {
        return orderConfirmation;
    }

}
