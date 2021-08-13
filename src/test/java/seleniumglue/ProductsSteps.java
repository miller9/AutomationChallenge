package seleniumglue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class ProductsSteps extends TestBase {

    //4. Sort products by Price (low to high).
    @Given("^user is successfully authenticated$")
    public void user_is_successfully_authenticated() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getValidUsername());
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(productsPage.getErrorProductsPage(), productsPage.isProductsTitleDisplayed());
    }

    @When("^user sort products by low to high price$")
    public void user_sort_products_by_low_to_high_price() throws Throwable {
        productsPage.click(productsPage.getLoToHiPrice());
    }

    @Then("^user sees the products organized by price from lowest to highest$")
    public void user_sees_the_products_organized_by_price_from_lowest_to_highest() throws Throwable {
        Assert.assertEquals(productsPage.getFirstPriceExpected(), productsPage.getText(productsPage.getFirstInventoryItemPrice()));
    }

}
