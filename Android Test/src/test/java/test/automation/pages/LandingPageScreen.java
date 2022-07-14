package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LandingPageScreen extends BasePageObject {
    private By loginIcon() {return MobileBy.xpath("//android.view.View[@content-desc=\"Login\"]");}
    private By emailField(){return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");}
    private By passwordField(){return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");}
    private By loginButton(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");}
    private By profileIcon() {return MobileBy.xpath("//android.widget.Button[4]");}
    private By exploreIcon() {return MobileBy.xpath("//android.widget.Button[2]");}
    private By trendingIcon() {return MobileBy.xpath("//android.widget.Button[3]");}
    private By onExplore(){return MobileBy.xpath("//android.widget.EditText");}
    private By onTrending(){return MobileBy.xpath("//android.view.View/android.view.View[1]");}
    private By username(){return MobileBy.AccessibilityId("Siti Nurlatipah");}
    private By landingpage(){return MobileBy.xpath("//android.view.View/android.view.View[1]");}
    private By judul(){return MobileBy.xpath("//android.widget.ImageView//android.widget.EditText[1]");}
    private By isi(){return MobileBy.xpath("//android.widget.ImageView//android.widget.EditText[2]");}
    private By kirimThread(){return MobileBy.AccessibilityId("Kirimkan");}
    private By plusThread(){return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");}
    @Step
    public boolean onProfilepage() {
        return waitUntilPresence(username()).isDisplayed();
    }
    @Step
    public boolean onLandingpage() {
        return waitUntilPresence(landingpage()).isDisplayed();
    }
    @Step
    public void tapProfileButton(){onClick(profileIcon());}
    @Step
    public void tapExploreButton(){onClick(exploreIcon());}
    @Step
    public void tapTrendingButton(){onClick(trendingIcon());}
    @Step
    public boolean onExplorePage() {
        return waitUntilPresence(onExplore()).isDisplayed();
    }
    @Step
    public boolean onTrendingPage() {
        return waitUntilPresence(onTrending()).isDisplayed();
    }
    @Step
    public void tapJudul(){onClick(judul());}
    @Step
    public void typeIsi(String judul){onType(judul(),judul);}
    @Step
    public void tapIsi(){onClick(isi());}
    @Step
    public void typeJudul(String isi){onType(isi(),isi);}
    @Step
    public void tapKirim(){onClick(kirimThread());}
    @Step
    public void tapPlus(){onClick(plusThread());}
    @Step
    public void tapTombolLogin(){onClick(loginButton());
    }
    @Step
    public void clickEmail(){onClick(emailField());}
    @Step
    public void inputEmail(String email){onType(emailField(),email);}
    @Step
    public void clickPassword(){onClick(passwordField());}
    @Step
    public void inputPassword(String password){onType(passwordField(),password);}
    @Step
    public boolean openLoginPage() {
        return waitUntilPresence(loginIcon()).isDisplayed();
    }

}
