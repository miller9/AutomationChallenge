package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginSteps extends TestBase {

    //1. Login with a valid user.
    @Given("^User is on the saucedemo Homepage$")
    public void userIsOnTheSaucedemoHomepage() throws Throwable {
        Assert.assertTrue(loginPage.isDisplayed(loginPage.getLoginId()));
    }

    @When("^type username on the username field$")
    public void typeUsernameOnTheUsernameField() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getValidUsername());
    }

    @When("^type password on the password field$")
    public void typePasswordOnThePasswordField() throws Throwable {
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
    }

    @Then("^should be redirected to the Products page$")
    public void shouldBeRedirectedToTheProductsPage() throws Throwable {
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(productsPage.getErrorProductsPage(), productsPage.isProductsTitleDisplayed());
    }

    //2. Login with an invalid user.
    @When("^type wrong username on the username field$")
    public void typeWrongUsernameOnTheUsernameField() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getInvalidUsername());
    }

    @When("^type right password on the password field$")
    public void typeRightPasswordOnThePasswordField() throws Throwable {
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
    }

    @Then("^the error message should be displayed$")
    public void theErrorMessageShouldBeDisplayed() throws Throwable {
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(loginPage.getErrorButtonMsn(), loginPage.isEnabled(loginPage.getErrorButton()));
        Assert.assertEquals(loginPage.getErrorExpected(), loginPage.getText(loginPage.getErrorMessage()));
    }


    //3. Logout from the home page.
    @When("^the user is logged in on the Products page$")
    public void theUserIsLoggedInOnTheProductsPage() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getValidUsername());
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(productsPage.getErrorProductsPage(), productsPage.isProductsTitleDisplayed());
    }

    @When("^selects the logout option$")
    public void selectsTheLogoutOption() throws Throwable {
        loginPage.click(loginPage.getMenuButton());
        loginPage.waitFunction(loginPage.getLogoutLink());
    }

    @Then("^should be redirected to the Login page$")
    public void shouldBeRedirectedToTheLoginPage() throws Throwable {
        Assert.assertTrue(loginPage.loginLogoIsDisplayed(loginPage.getLoginLogo()));
    }
}
