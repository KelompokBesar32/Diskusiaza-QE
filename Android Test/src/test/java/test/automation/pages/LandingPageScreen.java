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
    private By notifIcon() {return MobileBy.xpath("//android.view.View[1]/android.widget.Button[1]");}
    private By MessageIcon(){return MobileBy.xpath("//android.view.View[1]/android.widget.Button[2]");}
    private By onProfile(){return MobileBy.AccessibilityId("ii@gmail.com");}
    private By onNotification(){return MobileBy.AccessibilityId("Notification");}
    private By onMessage(){return MobileBy.AccessibilityId("Message");}
    private By exploreIcon() {return MobileBy.xpath("//android.view.View[2]/android.widget.Button[2]\n");}
    private By trendingIcon() {return MobileBy.xpath("//android.widget.Button[3]");}
    private By onExplore(){return MobileBy.AccessibilityId("Explore");}
    private By onTrending(){return MobileBy.xpath("//android.view.View/android.view.View[1]");}
    private By landingpage(){return MobileBy.AccessibilityId("Diskusiaza");}
    private By judul(){return MobileBy.xpath("//android.widget.EditText[1]");}
    private By isi(){return MobileBy.xpath("//android.widget.EditText[2]");}
    private By kirimThread(){return MobileBy.AccessibilityId("Kirimkan");}
    private By plusThread(){return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");}
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
    public void tapNotifButton(){onClick(notifIcon());}
    @Step
    public void tapMessageButton(){onClick(MessageIcon());}
    @Step
    public boolean onMessagePage() {
        return waitUntilPresence(onMessage()).isDisplayed();
    }
    @Step
    public boolean onNotificationPage() {
        return waitUntilPresence(onNotification()).isDisplayed();
    }
    @Step
    public boolean onExplorePage() {
        return waitUntilPresence(onExplore()).isDisplayed();
    }
    @Step
    public boolean onTrendingPage() {
        return waitUntilPresence(onTrending()).isDisplayed();
    }
    @Step
    public boolean onProfilePage() {
        return waitUntilPresence(onProfile()).isDisplayed();
    }
    @Step
    public void tapJudul(){onClick(judul());}
    @Step
    public void typeJudul(String judul){onType(judul(),judul);}
    @Step
    public void tapIsi(){onClick(isi());}
    @Step
    public void typeIsi(String isi){onType(isi(),isi);}
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
