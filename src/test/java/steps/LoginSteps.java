package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginSteps extends TestBase {

    //1. Login with a valid user.
    @Given("^User is on the saucedemo Homepage$")
    public void user_is_on_the_saucedemo_Homepage() throws Throwable {
        Assert.assertTrue(loginPage.isDisplayed(loginPage.getLoginId()));
    }

    @When("^type username on the username field$")
    public void type_username_on_the_username_field() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getValidUsername());
    }

    @When("^type password on the password field$")
    public void type_password_on_the_password_field() throws Throwable {
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
    }

    @Then("^should be redirected to the Products page$")
    public void should_be_redirected_to_the_Products_page() throws Throwable {
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(productsPage.getErrorProductsPage(), productsPage.isProductsTitleDisplayed());
    }

    //2. Login with an invalid user.
    @When("^type wrong username on the username field$")
    public void type_wrong_username_on_the_username_field() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getInvalidUsername());
    }

    @When("^type right password on the password field$")
    public void type_right_password_on_the_password_field() throws Throwable {
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
    }

    @Then("^the error message should be displayed$")
    public void the_error_message_should_be_displayed() throws Throwable {
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(loginPage.getErrorButtonMsn(), loginPage.isEnabled(loginPage.getErrorButton()));
        Assert.assertEquals(loginPage.getErrorExpected(), loginPage.getText(loginPage.getErrorMessage()));
    }


    //3. Logout from the home page.
    @When("^the user is logged in on the Products page$")
    public void the_user_is_logged_in_on_the_Products_page() throws Throwable {
        loginPage.clear(loginPage.getInputUsername());
        loginPage.sendKeys(loginPage.getInputUsername(), loginPage.getValidUsername());
        loginPage.clear(loginPage.getInputPassword());
        loginPage.sendKeys(loginPage.getInputPassword(), loginPage.getValidPassword());
        loginPage.click(loginPage.getLoginButton());
        Assert.assertTrue(productsPage.getErrorProductsPage(), productsPage.isProductsTitleDisplayed());
    }

    @When("^selects the logout option$")
    public void selects_the_logout_option() throws Throwable {
        loginPage.click(loginPage.getMenuButton());
        loginPage.waitFunction(loginPage.getLogoutLink());
    }

    @Then("^should be redirected to the Login page$")
    public void should_be_redirected_to_the_Login_page() throws Throwable {
        Assert.assertTrue(loginPage.loginLogoIsDisplayed(loginPage.getLoginLogo()));
    }
}
