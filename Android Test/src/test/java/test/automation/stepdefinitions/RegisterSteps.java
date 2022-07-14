package test.automation.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LoginScreen;
import test.automation.pages.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen regist;

    @Steps
    LoginScreen login;

    @Given("user on login page 5")
    public void onLoginPage(){
        login.onHomepage();
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

    @And("user input valid email")
    public void inputValidEmail() {
        Faker faker=new Faker();
        regist.tapEmail();
        regist.typeEmail(faker.internet().emailAddress());
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
    public void inputValidTanggal() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
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
        regist.onLoginpage();
    }
}
