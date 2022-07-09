package StepDefinition;

import Starter.Loginpage;
import Starter.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterSteps {
    @Steps
    RegisterPage regist;
    Loginpage login;

    //scenario 1 success

    @Given("user on register page")
    public void onRegisterPage(){
        regist.onRegisterPage();
    }

    @When("user input valid nama depan")
    public void inputValidNamaDepan(){
        Faker faker=new Faker();
        regist.typeFirstName(faker.name().firstName());
    }

    @And("user input valid nama belakang")
    public void inputValidNamaBelakang(){
        Faker faker=new Faker();
        regist.typeLastName(faker.name().lastName());
    }

    @And("user input valid email")
    public void inputValidEmail(){
        Faker faker=new Faker();
        regist.typeEmail(faker.internet().emailAddress());
    }

    @And("user input valid password {}")
    public void inputValidPassword(String password){
        regist.typePassword(password);
    }

    @And("user input confirm password {}")
    public void inputConfirmPassword(String c_password){
        regist.typeConfirmPassword(c_password);
    }

    @And("user input valid tanggal lahir")
    public void inputValidTanggalLahir(){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user pilih jenis kelamin")
    public void inputJenisKelamin(){
        regist.typeJenisKelamin();
    }

    @And("user klik Daftar button")
    public void klikDaftarButton(){
        regist.clickRegisterButton(); ;
    }

    @Then("User on Login Page")
    public void LoginPage(){
        login.openPage();
    }

    //scenario 2 invalid email

    @And("user input email {}")
    public void inputInvalidEmail(String email){
        regist.typeEmail(email);
    }

    @Then("user got message2 {}")
    public void gotMessage3(String message){

    }

    //scenario 3 email kosong

    @When("user input valid nama depan3")
    public void inputValidNamaDepan3(){
        Faker faker=new Faker();
        regist.typeFirstName(faker.name().firstName());
    }

    @And("user input valid nama belakang3")
    public void inputValidNamaBelakang3(){
        Faker faker=new Faker();
        regist.typeLastName(faker.name().lastName());
    }

    @And("user input valid password3 {}")
    public void inputValidPassword3(String password){
        regist.typePassword(password);
    }

    @And("user input confirm password3 {}")
    public void inputConfirmPassword3(String c_password){
        regist.typeConfirmPassword(c_password);
    }

    @And("user input valid tanggal lahir3 {}, {}, {}")
    public void inputValidTanggalLahir3(String tanggal, String bulan, String tahun){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user pilih jenis kelamin3")
    public void inputJenisKelamin3(){
        regist.typeJenisKelamin();
    }

    @And("user klik Daftar button3")
    public void klikDaftarButton3(){
        regist.clickRegisterButton();
    }

    @Then("user got message3 {}")
    public void gotMessage1(String message){

    }

    //scenario 4 nama depan kosong

    @When("user input valid nama belakang4")
    public void inputValidNamaBelakang4(){
        Faker faker=new Faker();
        regist.typeLastName(faker.name().lastName());
    }

    @And("user input valid email4")
    public void inputValidEmail4(){
        Faker faker=new Faker();
        regist.typeEmail(faker.internet().emailAddress());
    }

    @And("user input valid password4 {}")
    public void inputValidPassword4(String password){
        regist.typePassword(password);
    }

    @And("user input confirm password4 {}")
    public void inputConfirmPassword4(String c_password){
        regist.typeConfirmPassword(c_password);
    }

    @And("user input valid tanggal lahir4 {}, {}, {}")
    public void inputValidTanggalLahir4(String tanggal, String bulan, String tahun){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user pilih jenis kelamin4")
    public void inputJenisKelamin4(){
        regist.typeJenisKelamin();
    }

    @And("user klik Daftar button4")
    public void klikDaftarButton4(){
        regist.clickRegisterButton();
    }

    @Then("user got message4 {}")
    public void gotMessage4(String message){

    }

    //scenario 5 password kosong

    @When("user input valid nama depan5")
    public void inputValidNamaDepan5(){
        Faker faker=new Faker();
        regist.typeFirstName(faker.name().firstName());
    }

    @And("user input valid nama belakang5")
    public void inputValidNamaBelakang5(){
        Faker faker=new Faker();
        regist.typeLastName(faker.name().lastName());
    }

    @And("user input valid email5")
    public void inputValidEmail5(){
        Faker faker=new Faker();
        regist.typeEmail(faker.internet().emailAddress());
    }

    @And("user input confirm password5 {}")
    public void inputConfirmPassword5(String c_password){
        regist.typeConfirmPassword(c_password);
    }

    @And("user input valid tanggal lahir5")
    public void inputValidTanggalLahir5(){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user pilih jenis kelamin5")
    public void inputJenisKelamin5(){
        regist.typeJenisKelamin();
    }

    @And("user klik Daftar button5")
    public void klikDaftarButton5(){
        regist.clickRegisterButton();
    }

    @Then("user got message5 {}")
    public void gotMessage5(String message){

    }

    //scenario 6 nama belakang kosong

    @When("user input valid nama depan6")
    public void inputValidNamaDepan6(){
        Faker faker=new Faker();
        regist.typeFirstName(faker.name().firstName());
    }

    @And("user input valid email6")
    public void inputValidEmail6(){
        Faker faker=new Faker();
        regist.typeEmail(faker.internet().emailAddress());
    }

    @And("user input valid password6 {}")
    public void inputValidPassword6(String password){
        regist.typePassword(password);
    }

    @And("user input confirm password6 {}")
    public void inputConfirmPassword6(String c_password){
        regist.typeConfirmPassword(c_password);
    }

    @And("user input valid tanggal lahir6 {}, {}, {}")
    public void inputValidTanggalLahir6(String tanggal, String bulan, String tahun){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user pilih jenis kelamin6")
    public void inputJenisKelamin6(){
        regist.typeJenisKelamin();
    }

    @And("user klik Daftar button6")
    public void klikDaftarButton6(){
        regist.clickRegisterButton();
    }

    @Then("user got message6 {}")
    public void gotMessage6(String message){

    }

    //scenario 7 jenis kelamin kosong

    @When("user input valid nama depan7")
    public void inputValidNamaDepan7(){
        Faker faker=new Faker();
        regist.typeFirstName(faker.name().firstName());
    }

    @And("user input nama belakang7")
    public void inputNamaBelakang7(){
        Faker faker=new Faker();
        regist.typeLastName(faker.name().lastName());
    }

    @And("user input valid email7")
    public void inputValidEmail7(){
        Faker faker=new Faker();
        regist.typeEmail(faker.internet().emailAddress());
    }

    @And("user input valid password7 {}")
    public void inputValidPassword7(String password){
        regist.typePassword(password);
    }

    @And("user input confirm password7 {}")
    public void inputConfirmPassword7(String c_password){
        regist.typeConfirmPassword(c_password);
    }

    @And("user input valid tanggal lahir7 {}, {}, {}")
    public void inputValidTanggalLahir7(String tanggal, String bulan, String tahun){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user klik Daftar button7")
    public void klikDaftarButton7(){
        regist.clickRegisterButton();
    }

    @Then("user got message7 {}")
    public void gotMessage7(String message){

    }

    //scenario 8 confirm password kosong
    @When("user input valid nama depan8")
    public void inputValidNamaDepan8(){
        Faker faker=new Faker();
        regist.typeFirstName(faker.name().firstName());
    }

    @And("user input nama belakang8")
    public void inputNamaBelakang8(){
        Faker faker=new Faker();
        regist.typeLastName(faker.name().lastName());
    }

    @And("user input valid email8")
    public void inputValidEmail8(){
        Faker faker=new Faker();
        regist.typeEmail(faker.internet().emailAddress());
    }

    @And("user input valid password8 {}")
    public void inputValidPassword8(String password){
        regist.typePassword(password);
    }

    @And("user input valid tanggal lahir8 {}, {}, {}")
    public void inputValidTanggalLahir8(String tanggal, String bulan, String tahun){
        regist.clickTanggal();

        regist.clickBulan();

        regist.clickTahun();

    }

    @And("user input jenis kelamin8")
    public void inputJenisKelamin8(){
        regist.typeJenisKelamin();
    }

    @And("user klik Daftar button8")
    public void klikDaftarButton8(){
        regist.clickRegisterButton();
    }

    @Then("user got message8 {}")
    public void gotMessage8(String message){

    }



}
