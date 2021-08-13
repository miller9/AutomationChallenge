package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By loginId = By.id("login_credentials");
    private By loginLogo = By.className("login_logo");
    private By inputUsername = By.id("user-name");
    private By inputPassword = By.id("password");
    private By loginButton = By.id("login-button");

    private String validUsername = "standard_user";
    private String validPassword = "secret_sauce";

    private String invalidUsername = "some-wrong-username";
    private String invalidPassword = "some-wrong-password";

    private By errorButton = By.className("error");
    private By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    private String errorButtonMsn = "Error button not found";
    private String errorExpected = "Epic sadface: Username and password do not match any user in this service";

    private By menuButton = By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div");
    private By menuWrap = By.className("bm-menu-wrap");
    private By logoutLink = By.id("logout_sidebar_link");


    public boolean loginLogoIsDisplayed(By element) throws Exception {
        return this.findElement(element).isDisplayed();
    }

    public By getLoginId() { return loginId; }

    public By getInputUsername() { return inputUsername;    }
    public By getInputPassword() { return inputPassword;    }

    public By getLoginButton() {  return loginButton;    }
    public By getErrorButton() {  return errorButton;    }
    public By getErrorMessage() { return errorMessage; }

    public String getValidUsername() { return validUsername; }
    public String getValidPassword() { return validPassword; }

    public By getMenuButton() {
        return menuButton;
    }

    public By getLogoutLink() {
        return logoutLink;
    }

    public By getMenuWrap() {
        return menuWrap;
    }

    public By getLoginLogo() { return loginLogo; }

    public String getInvalidUsername() { return invalidUsername; }

    public String getErrorButtonMsn() { return errorButtonMsn; }

    public String getErrorExpected() { return errorExpected; }

}
