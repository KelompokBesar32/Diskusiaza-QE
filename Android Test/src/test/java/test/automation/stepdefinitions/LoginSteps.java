package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen login;
    @Given("user on login page")
    public void onLoginPage(){
        login.onHomepage();
    }

    @When("user input valid email {} and valid password {}")
    public void inputValidEmailandValidPassword(String email, String password){
        login.tapEmail();
        login.typeEmail(email);
        login.tapPassword();
        login.typePassword(password);
    }

    @And("user click button login")
    public void clickLoginButton() {
        login.tapLoginButton();
    }

    @Then("user success to landing page")
    public void successLogin(){
    }

    //scenario 2 unsuccess invalid password
    @When("user input email {} and invalid password {}")
    public void inputInvalidPassword(){

    }

    @And("user click button login2")
    public void clickLoginButton2(){

    }

    @Then("got massage2 {}")
    public void iFailedToLoginAndGetErrorMessage2(String message) {

    }

    //scenario 3 unsuccess invalid email

    @When("user input invalid email and password")
    public void iInputInvalidEmail() {

    }

    @And("user click button login3")
    public void clickLoginButton3(){

    }

    @Then("got massage3 {}")
    public void iFailToLoginAndGetErrorMessage(String message) {

    }

    //scenario 4 unsuccess invalid email and password

    @When("user input invalid email and invalid password")
    public void notInputUsernamePassword4(){

    }

    @And("user click button login4")
    public void clickLoginButton4(){

    }

    @Then("got massage4 {}")
    public void iGetErrorMessage(String message) {

    }

}
