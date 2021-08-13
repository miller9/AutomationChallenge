package seleniumglue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CartSteps extends TestBase{

    //5. Add multiple items to the shopping cart.
    @When("^user adds items to the shopping cart$")
    public void user_adds_items_to_the_shopping_cart() throws Throwable {
        productsPage.click(productsPage.getAddToCartBackpack());
        productsPage.click(productsPage.getAddToCartFleece());
        productsPage.click(productsPage.getAddToCartOnesie());
    }

    @Then("^user sees the items added in the shopping cart$")
    public void user_sees_the_items_added_in_the_shopping_cart() throws Throwable {
        productsPage.click(productsPage.getCartbutton());

        Assert.assertEquals(cartPage.getBackpack(), cartPage.getText(cartPage.getBackpackItem()));
        Assert.assertEquals(cartPage.getFleece(), cartPage.getText(cartPage.getFleeceItem()));
        Assert.assertEquals(cartPage.getOnesie(), cartPage.getText(cartPage.getOnesieItem()));
    }

    //6. Add the specific product ‘Sauce Labs Onesie’ to the shopping cart.
    @When("^user adds the ‘Sauce Labs Onesie’ product to the shopping cart$")
    public void user_adds_the_Sauce_Labs_Onesie_product_to_the_shopping_cart() throws Throwable {
        productsPage.click(productsPage.getAddToCartOnesie());
    }

    @Then("^user confirms that the correct product was added to the cart$")
    public void user_confirms_that_the_correct_product_was_added_to_the_cart() throws Throwable {
        productsPage.click(productsPage.getCartbutton());
        Assert.assertEquals(cartPage.getOnesieDesc(), cartPage.getText(cartPage.getOnesieDescription()));
    }
}
