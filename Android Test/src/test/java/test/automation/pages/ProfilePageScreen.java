package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ProfilePageScreen extends BasePageObject {
    private By loginIcon() {return MobileBy.xpath("//android.view.View[@content-desc=\"Login\"]");}
    private By emailField(){return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");}
    private By passwordField(){return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");}
    private By loginButton(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");}
    private By barProfile(){return MobileBy.xpath("//android.widget.Button[4]");}
    private By profileButton(){return MobileBy.AccessibilityId("Profile");}
    private By editProfile(){return MobileBy.AccessibilityId("Edit Profil");}
    private By editNama(){return MobileBy.xpath("//android.widget.EditText[1]");}
    private By simpan(){return MobileBy.AccessibilityId("Simpan");}
    private By updatedata(){return MobileBy.AccessibilityId("");}

    @Step
    public boolean openPage() {
        return waitUntilPresence(loginIcon()).isDisplayed();
    }

    @Step
    public void tapLoginButton(){onClick(loginButton());
    }
    @Step
    public void clickEmail(){onClick(emailField());}
    @Step
    public void enterEmail(String email){onType(emailField(),email);}
    @Step
    public void clickPassword(){onClick(passwordField());}
    @Step
    public void enterPassword(String password){onType(passwordField(),password);}
    @Step
    public void tapProfileBar(){onClick(barProfile());}
    @Step
    public void tapProfileButton(){onClick(profileButton());}
    @Step
    public void tapEditProfile(){onClick(editProfile());}
    @Step
    public void tapEditNama(){onClick(editNama());}
    @Step
    public void typeUpdateNama(String nama){onType(editNama(),nama);}
    @Step
    public void tapSimpan(){onClick(simpan());}


}
