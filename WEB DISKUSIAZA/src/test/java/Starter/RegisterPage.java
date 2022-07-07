package Starter;

import net.thucydides.core.annotations.Step;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;

public class RegisterPage {
    private By title(){return By.xpath("//div/h3");}
    private By firstname(){return By.id("firstname");}
    private By lastname(){return By.id("lastname");}
    private By email(){return By.id("email");}
    private By password(){return By.id("password");}
    private By confirmEmail(){return By.id("confirm_password")}
    private By  tanggalLahir(){return By.id("__BVID__54");}
    private By  bulanLahir(){return By.id("__BVID__55");}
    private By  tahunLahir(){return By.id("__BVID__56");}
    private By jenisKelamin(){return By.xpath();}
    private By RegisterButton(){return By.xpath("//div/form/button");}
    private By gotErrorMassage(){return By.className();}
    @Step
    public void onRegisterPage(){openAt("/auth/register");}
    @Step
    public void typeFirstName(){}
    @Step
    public void typeLastName(){}
    @Step
    public void typeEmail(){}
    @Step
    public void typePassword(){}
    @Step
    public void typeConfirmPassword(){}
    @Step
    public void typeTanggalLahir(){}
    @Step
    public void typeJenisKelamin(){}
    @Step
    public void clickRegisterButton(){}
    @Step
    public void gotErrorMessage(){}





}
