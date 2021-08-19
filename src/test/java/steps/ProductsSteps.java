package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class ProductsSteps extends TestBase {

    //4. Sort products by Price (low to high).
    @Given("^user is successfully authenticated$")
    public void userIsSuccessfullyAuthenticated() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getValidUsername());
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(productsPage.getErrorProductsPage(), productsPage.isProductsTitleDisplayed());
    }

    @When("^user sort products by low to high price$")
    public void userSortProductsByLowToHighPrice() throws Throwable {
        productsPage.click(productsPage.getLoToHiPrice());
    }

    @Then("^user sees the products organized by price from lowest to highest$")
    public void userSeesTheProductsOrganizedByPriceFromLowestToHighest() throws Throwable {
        Assert.assertEquals(productsPage.getFirstPriceExpected(), productsPage.getText(productsPage.getFirstInventoryItemPrice()));
    }

}
