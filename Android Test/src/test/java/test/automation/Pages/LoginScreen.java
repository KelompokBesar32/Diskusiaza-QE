package test.automation.Pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By loginIcon() {return MobileBy.xpath("//android.view.View[@content-desc=\"Login\"]");}
    private By emailField(){return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");}
    private By passwordField(){return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");}
    private By loginButton(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");}

    //private By snackbarLogin(){return MobileBy.AccessibilityId("Email atau password tidak valid.");}
    @Step
    public boolean onHomepage() {
        return waitUntilPresence(loginIcon()).isDisplayed();
    }
    @Step
    public void tapLoginButton(){onClick(loginButton());
    }
    @Step
    public void tapEmail(){onClick(emailField());}
    @Step
    public void typeEmail(String email){onType(emailField(),email);}
    @Step
    public void tapPassword(){onClick(passwordField());}
    @Step
    public void typePassword(String password){onType(passwordField(),password);}

}
