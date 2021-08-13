package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends BasePage{

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    private By finishButton = By.id("finish");
    private By overviewTitle = By.className("title");
    private String overviewTitleExpected = "CHECKOUT: OVERVIEW";

    public By getFinishButton() {
        return finishButton;
    }

    public By getOverviewTitle() { return overviewTitle; }

    public String getOverviewTitleExpected() { return overviewTitleExpected; }
}
