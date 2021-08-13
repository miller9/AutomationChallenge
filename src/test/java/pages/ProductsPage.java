package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private By productsTitleLocator = By.className("title");
    private String productsTitlePage = "PRODUCTS";
    private String errorProductsPage = "Not redirected to Products Page";

    private String firstPriceExpected = "$7.99";

    private By loToHiPrice = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/select[1]/option[3]");
    private By firstInventoryItemPrice = By.className("inventory_item_price");

    private By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By addToCartFleece = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By addToCartOnesie = By.id("add-to-cart-sauce-labs-onesie");

    private By cartbutton = By.id("shopping_cart_container");

    public boolean isProductsTitleDisplayed()throws Exception {
        return this.isDisplayed(productsTitleLocator) && this.getText(productsTitleLocator).equals(productsTitlePage);
    }

    public String getErrorProductsPage() { return errorProductsPage; }

    public String getFirstPriceExpected() {
        return firstPriceExpected;
    }

    public By getLoToHiPrice() { return loToHiPrice; }

    public By getFirstInventoryItemPrice() { return firstInventoryItemPrice; }

    public By getAddToCartBackpack() {
        return addToCartBackpack;
    }

    public By getAddToCartFleece() {
        return addToCartFleece;
    }

    public By getAddToCartOnesie() {
        return addToCartOnesie;
    }

    public By getCartbutton() { return cartbutton; }
}
