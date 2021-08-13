package steps;

import org.openqa.selenium.WebDriver;
import pages.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPage loginPage = new LoginPage(driver);
    protected ProductsPage productsPage = new ProductsPage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(driver);
    protected CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
    protected CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

}
