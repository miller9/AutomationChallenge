package seleniumglue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class PurchaseSteps extends TestBase{

    //7. Complete a purchase.
    @When("^user proceed to checkout$")
    public void user_proceed_to_checkout() throws Throwable {
        cartPage.click(cartPage.getCheckoutButton());
    }

    @When("^user fill the personal information$")
    public void user_fill_the_personal_information() throws Throwable {
        checkoutInformationPage.sendKeys(checkoutInformationPage.getFirstNameElem(), checkoutInformationPage.getFirstName());
        checkoutInformationPage.sendKeys(checkoutInformationPage.getLastNameElem(), checkoutInformationPage.getLastName());
        checkoutInformationPage.sendKeys(checkoutInformationPage.getPostalCode(), checkoutInformationPage.getpCode());
        Assert.assertTrue(checkoutInformationPage.getTitleExpected(), checkoutInformationPage.isDisplayed(checkoutInformationPage.getCheckoutTitle()));
        checkoutInformationPage.click(checkoutInformationPage.getContinueButton());
    }

    @When("^user review the order$")
    public void user_review_the_order() throws Throwable {
        Assert.assertTrue(checkoutOverviewPage.getOverviewTitleExpected(), checkoutOverviewPage.isDisplayed(checkoutOverviewPage.getOverviewTitle()));
        checkoutOverviewPage.click(checkoutOverviewPage.getFinishButton());
    }

    @Then("^user should be redirected to the confirmation page$")
    public void user_should_be_redirected_to_the_confirmation_page() throws Throwable {
        checkoutCompletePage.click(checkoutCompletePage.getConfirmation());
        Assert.assertTrue(checkoutCompletePage.getOrderConfirmation(), checkoutCompletePage.isDisplayed(checkoutCompletePage.getConfirmation()));
    }

}
