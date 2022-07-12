package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.Pages.LoginScreen;
import test.automation.Pages.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen regist;

    @Steps
    LoginScreen loginn;

    @Given("user on login page 5")
    public void onLoginPage1(){
        loginn.onHomepage();
    }

    @And("user click sign up1")
    public void clicksignupicon(){
        regist.tapSignUp();
    }

    @When("user input valid nama depan {}")
    public void inputValidNamaDepan(String namadepan){
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user input valid nama belakang {}")
    public void inputValidNamaBelakang(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input valid email {}")
    public void inputValidEmail(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid password {}")
    public void inputValidPassword(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid confirm password {}")
    public void inputValidConfirmPassword(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir")
    public void inputValidTanggal(String Tanggal) {
        regist.tapTanggalLahir();
        regist.tapTanggal();
        regist.TypeTanggal(Tanggal);
        regist.tapButtonOK();
    }

    @And("user pilih jenis kelamin")
    public void inputValidKelamin() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button")
    public void DaftarButton() {
        regist.tapSignUpButton();
    }

    @Then("user sign up to login page")
    public void successToLoginPage(){
        loginn.onHomepage();
    }
}
