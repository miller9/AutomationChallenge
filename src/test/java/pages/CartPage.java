package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private By backpackItem = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]");
    private By fleeceItem = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]");
    private By onesieItem = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]");

    private By onesieDescription = By.className("inventory_item_desc");

    private String backpack = "Sauce Labs Backpack";
    private String fleece = "Sauce Labs Fleece Jacket";
    private String onesie = "Sauce Labs Onesie";

    private String onesieDesc = "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";

    private By checkoutButton = By.id("checkout");

    public By getBackpackItem() {
        return backpackItem;
    }

    public By getFleeceItem() {
        return fleeceItem;
    }

    public By getOnesieItem() {
        return onesieItem;
    }

    public By getOnesieDescription() { return onesieDescription; }

    public By getCheckoutButton() {
        return checkoutButton;
    }

    public String getBackpack() { return backpack; }

    public String getFleece() { return fleece; }

    public String getOnesie() { return onesie; }

    public String getOnesieDesc() { return onesieDesc; }
}
