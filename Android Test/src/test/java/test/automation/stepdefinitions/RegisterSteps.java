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



    //Scenario 1
    @Given("user open login page")
    public void onLoginPage() {
        regist.onLoginpage();

    }
    @And("user click sign up")
    public void clicksignupicon(){
        regist.tapSignUp();
    }

    @When("user input valid nama depan")
    public void inputValidNamaDepan(){
        Faker faker=new Faker();
        regist.tapNamaDepan();
        regist.typeNamaDepan(faker.name().firstName());
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
    public void inputValidTanggal(){
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

    //Scenario 2 input email tanpa menggunakan '@'
    @When("user input valid nama depan2 {}")
    public void inputValidNamaDepan2(String namadepan){
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user input valid nama belakang2 {}")
    public void inputValidNamaBelakang2(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input email without '@' {}")
    public void inputinValidEmail2(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid password2 {}")
    public void inputValidPassword2(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid confirm password2 {}")
    public void inputValidConfirmPassword2(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir2")
    public void inputValidTanggal2() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user pilih jenis kelamin2")
    public void inputValidKelamin2() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button2")
    public void DaftarButton2() {
        regist.tapSignUpButton();
    }

    @Then("user got message2 {}")
    public void unsuccessToLoginPage2(String message){
    }

    //Scenario 3 tidak memasukkan email
    @When("user input valid nama depan3 {}")
    public void inputValidNamaDepan3(String namadepan){
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user input valid nama belakang3 {}")
    public void inputValidNamaBelakang3(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input valid password3 {}")
    public void inputValidPassword3(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid confirm password3 {}")
    public void inputValidConfirmPassword3(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir3")
    public void inputValidTanggal3() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user pilih jenis kelamin3")
    public void inputValidKelamin3() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button3")
    public void DaftarButton3() {
        regist.tapSignUpButton();
    }

    @Then("user got message3 {}")
    public void unsuccessToLoginPage3(String message){
    }

    //Scenario 4 tidak memasukan nama depan
    @When("user input valid nama belakang4 {}")
    public void inputValidNamaBelakang4(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input valid email4 {}")
    public void inputValidEmail4(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid password4 {}")
    public void inputValidPassword4(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid confirm password4 {}")
    public void inputValidConfirmPassword4(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir4")
    public void inputValidTanggal4() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user pilih jenis kelamin4")
    public void inputValidKelamin4() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button4")
    public void DaftarButton4() {
        regist.tapSignUpButton();
    }

    @Then("user got message4 {}")
    public void unsuccessToLoginPage4(String message){
    }

    //Scenario 5 user tidak memasukkan password
    @When("user input valid nama depan5 {}")
    public void inputValidNamaDepan5(String namadepan){
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user input valid nama belakang5 {}")
    public void inputValidNamaBelakang5(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input valid email5 {}")
    public void inputValidEmail5(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid confirm password5 {}")
    public void inputValidConfirmPassword5(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir5")
    public void inputValidTanggal5() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user pilih jenis kelamin5")
    public void inputValidKelamin5() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button5")
    public void DaftarButton5() {
        regist.tapSignUpButton();
    }

    @Then("user got message5 {}")
    public void unsuccessToLoginPage5(String message){
    }

    //Scenario 6 tidak memasukan nama belakang
    @When("user input valid nama depan6 {}")
    public void inputValidNamaDepan6(String namadepan) {
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user input valid email6 {}")
    public void inputValidEmail6(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid password6 {}")
    public void inputValidPassword6(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid confirm password6 {}")
    public void inputValidConfirmPassword6(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir6")
    public void inputValidTanggal6() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user pilih jenis kelamin6")
    public void inputValidKelamin6() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button6")
    public void DaftarButton6() {
        regist.tapSignUpButton();
    }

    @Then("user got message6 {}")
    public void unsuccessToLoginPage6(String message){
    }

    //Scenario 7 user tidak memilih jenis kelamin
    @When("user input valid nama depan7 {}")
    public void inputValidNamaDepan7(String namadepan){
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user pilih nama belakang7 {}")
    public void inputValidNamaBelakang7(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input valid email7 {}")
    public void inputValidEmail7(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid password7 {}")
    public void inputValidPassword7(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid confirm password7 {}")
    public void inputValidConfirmPassword7(String Confpassword) {
        regist.tapconfirmPasswrod();
        regist.typeConfirmPassword(Confpassword);
    }

    @And("user input valid tanggal lahir7")
    public void inputValidTanggal7() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user klik Daftar button7")
    public void DaftarButton7() {
        regist.tapSignUpButton();
    }

    @Then("user got message7 {}")
    public void unsuccessToLoginPage7(String message){
    }

    //Scenario 8 user tidak mengisi confirm password
    @When("user input valid nama depan8 {}")
    public void inputValidNamaDepan8(String namadepan){
        regist.tapNamaDepan();
        regist.typeNamaDepan(namadepan);
    }

    @And("user pilih nama belakang8 {}")
    public void inputValidNamaBelakang8(String namabelakang) {
        regist.tapNamaBelakang();
        regist.typeNamaBelakang(namabelakang);
    }

    @And("user input valid email8 {}")
    public void inputValidEmail8(String email) {
        regist.tapEmail();
        regist.typeEmail(email);
    }

    @And("user input valid password8 {}")
    public void inputValidPassword8(String password) {
        regist.tapPassword();
        regist.typePassword(password);
    }

    @And("user input valid tanggal lahir8")
    public void inputValidTanggal8() {
        regist.tapTanggalLahir();
        regist.switchToManual();
        regist.inputTtl("07/09/2000");
        regist.clickOK();
    }

    @And("user input valid jenis kelamin8")
    public void inputValidKelamin8() {
        regist.tapJenisKelamin();
    }

    @And("user klik Daftar button8")
    public void DaftarButton8() {
        regist.tapSignUpButton();
    }

    @Then("user got message8 {}")
    public void unsuccessToLoginPage8(String message){
    }

}
