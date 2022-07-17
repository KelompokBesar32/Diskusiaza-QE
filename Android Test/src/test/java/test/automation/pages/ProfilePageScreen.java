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
    private By titikTiga(){return MobileBy.xpath("//android.widget.ScrollView//android.view.View[2]");}
    private By deleteThread(){return MobileBy.AccessibilityId("Delete");}
    private By EditThread(){return MobileBy.AccessibilityId("Edit");}
    private By bookmarksButton(){return MobileBy.AccessibilityId("Bookmarks");}
    private By judul(){return MobileBy.xpath("//android.widget.EditText[1]");}
    private By isi(){return MobileBy.xpath("//android.widget.EditText[2]");}
    private By editKiriman(){return MobileBy.AccessibilityId("Edit kiriman");}
    private By ruangButton(){return MobileBy.AccessibilityId("Ruang");}
    private By kebijakanPrivButton(){return MobileBy.AccessibilityId("Kebijakan Privasi");}
    private By onBookmarks(){return MobileBy.xpath("//android.widget.ImageView");}
    private By onRuang(){return MobileBy.AccessibilityId("Ruang anda");}
    private By onKebijakan(){return MobileBy.xpath("//android.widget.Button[2]");}
    @Step
    public boolean openPage() {
        return waitUntilPresence(loginIcon()).isDisplayed();
    }
    @Step
    public boolean onRuangPage() {
        return waitUntilPresence(onRuang()).isDisplayed();
    }
    @Step
    public boolean onKebijakanPage() {
        return waitUntilPresence(onKebijakan()).isDisplayed();
    }
    @Step
    public boolean onBookmarkspage() {
        return waitUntilPresence(onBookmarks()).isDisplayed();
    }
    @Step
    public void tapRuang(){onClick(ruangButton());
    }
    @Step
    public void tapKebijakan(){onClick(kebijakanPrivButton());
    }
    @Step
    public void tapTitikTiga(){onClick(titikTiga());
    }
    @Step
    public void tapBookmarks(){onClick(bookmarksButton());
    }
    @Step
    public void kiriman(){onClick(editKiriman());}
    @Step
    public void clickJudul(){onClick(judul());}
    @Step
    public void editJudul(String judul){onType(judul(),judul);}
    @Step
    public void clickIsi(){onClick(isi());}
    @Step
    public void editIsi(String isi){onType(isi(),isi);}
    @Step
    public void tapDeleteThread(){onClick(deleteThread());
    }
    @Step
    public void tapEditThread(){onClick(EditThread());
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
