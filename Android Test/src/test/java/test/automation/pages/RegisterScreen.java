package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    private By RegisterIcon() {return MobileBy.xpath("//android.view.View[@content-desc=\"Sign Up\"]");}
    private By emailField(){return MobileBy.xpath("//android.view.View/android.widget.EditText[3]");}
    private By namaDepan(){return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");}
    private By namaBelakang(){return MobileBy.xpath("//android.view.View//android.widget.EditText[2]");}
    private By passwordField(){return MobileBy.xpath("//android.view.View/android.widget.EditText[4]");}
    private By confirmPassword(){return MobileBy.xpath("//android.view.View/android.widget.EditText[5]");}
    private By tanggalLahir(){return MobileBy.xpath("//android.view.View[4]");}
    private By JenisKelamin(){return MobileBy.AccessibilityId("Woman");}
    private By RegisterButton(){return MobileBy.AccessibilityId("Sign Up");}
    private By inputManual(){return MobileBy.AccessibilityId("Switch to input");}
    private By inputTanggal(){return MobileBy.xpath("//android.widget.EditText");}
    private By okButton(){return MobileBy.AccessibilityId("OK");}
    private By loginButton(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");}

    //private By snackbarLogin(){return MobileBy.AccessibilityId("Email atau password tidak valid.");}
    @Step
    public void tapSignUp(){onClick(RegisterIcon());
    }
    @Step
    public void tapNamaDepan(){onClick(namaDepan());}
    @Step
    public void typeNamaDepan(String namaDepan){onType(namaDepan(),namaDepan);}
    @Step
    public void tapNamaBelakang(){onClick(namaBelakang());}
    @Step
    public void typeNamaBelakang(String namaBelakang){onType(namaBelakang(),namaBelakang);}
    @Step
    public void tapEmail(){onClick(emailField());}
    @Step
    public void typeEmail(String email){onType(emailField(),email);}
    @Step
    public void tapPassword(){onClick(passwordField());}
    @Step
    public void typePassword(String password){onType(passwordField(),password);}
    @Step
    public void tapconfirmPasswrod(){onClick(confirmPassword());}
    @Step
    public void typeConfirmPassword(String Confirm){onType(confirmPassword(),Confirm);}
    @Step
    public void tapTanggalLahir(){onClick(tanggalLahir());}
    @Step
    public void tapJenisKelamin(){onClick(JenisKelamin());}
    @Step
    public void tapSignUpButton(){onClick(RegisterButton());}
    @Step
    public void switchToManual(){onClick(inputManual());}
    @Step
    public void inputTtl(String lahir){onType(inputTanggal(),lahir);}
    @Step
    public void clickOK(){onClick(okButton());}
    @Step
    public boolean onLoginpage() {
        return waitUntilPresence(loginButton()).isDisplayed();
    }
}
