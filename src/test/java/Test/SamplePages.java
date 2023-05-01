package Test;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePages extends PageObject {

    @FindBy(id = "username")
    WebElement usernameField;
    @FindBy(id = "password") WebElement passwordField;
    @FindBy(id = "log-in") WebElement signInButton;

    public void fillUsername(String username){
        element(usernameField).waitUntilClickable();
        element(usernameField).sendKeys(username);
    }

    public void fillPassword(String password){
        element(passwordField).waitUntilClickable();
        element(passwordField).sendKeys(password);
    }

    public void clickButtonSignIn(){
        element(signInButton).click();
    }


    @FindBy(xpath = "//div[@class='logged-user-w avatar-inline']") WebElement avatarSideMenu;
    @FindBy(xpath = "//ul[@class='main-menu']") WebElement sideMenus;
    @FindBy(xpath = "//div[@class='top-bar color-scheme-bright']") WebElement topBarMenu;
    public void verifySuccessLogin(){
        element(avatarSideMenu).waitUntilVisible();
        element(sideMenus).shouldBeVisible();
        element(topBarMenu).shouldBeVisible();
    }

}
