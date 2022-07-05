package Starter;

import net.thucydides.core.annotations.Step;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;

public class RegisterPage {
    private By title(){}
    private By firstname(){}
    private By lastname(){}
    private By email(){}
    private By password(){return By.xpath();}
    private By confirmEmail(){();}
    private By  tanggalLahir(){}
    private By jenisKelamin(){return By.xpath();}
    private By RegisterButton(){return By.xpath();}
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
