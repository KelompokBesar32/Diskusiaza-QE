package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LandingPageScreen;
import test.automation.pages.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen login;

    @Steps
    LandingPageScreen landingg;

    @Given("user on login page")
    public void onLoginPage(){
        login.onHomepage();
    }

    @When("user type valid email {} and valid password {}")
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
        landingg.onLandingpage();
    }

    //scenario 2 unsuccess invalid password
<<<<<<< HEAD
    @When("user input valid email and invalid password")
    public void inputInvalidPassword(){
        login.tapEmail();
        login.typeEmail("ii@gmail.com");
        login.tapPassword();
        login.typePassword("abd");
    }
=======

    @When("user input valid email {} and invalid password {}")
    public void inputInvalidPassword(String email, String password){
        login.tapEmail();
        login.typeEmail(email);
        login.tapPassword();
        login.typePassword(password);}
>>>>>>> 3f0c8d122b3be1e532cb16ba0344716cfe043615

    @And("user click button login2")
    public void clickLoginButton2(){
        login.tapLoginButton();
    }

    @Then("got massage2 {}")
    public void iFailedToLoginAndGetErrorMessage2(String message){
    }

    //scenario 3 unsuccess invalid email
<<<<<<< HEAD

    @When("user input invalid email and valid password")
    public void iInputInvalidEmail() {
        login.tapEmail();
        login.typeEmail("iigmail");
        login.tapPassword();
        login.typePassword("123");
    }
=======
    @When("user input invalid email {} and valid password {}")
    public void iInputInvalidEmail(String email, String password){
        login.tapEmail();
        login.typeEmail(email);
        login.tapPassword();
        login.typePassword(password);}
>>>>>>> 3f0c8d122b3be1e532cb16ba0344716cfe043615

    @And("user click button login3")
    public void clickLoginButton3(){
        login.tapLoginButton();
    }

    @Then("got massage3 {}")
    public void iFailToLoginAndGetErrorMessage3(String message) {
    }

    //scenario 4 unsuccess invalid email and password

    @When("user input invalid email {} and invalid password {}")
    public void notInputUsernamePassword4(String email, String password){
        login.tapEmail();
        login.typeEmail(email);
        login.tapPassword();
        login.typePassword(password);
    }

    @And("user click button login4")
    public void clickLoginButton4(){
        login.tapLoginButton();
    }

    @Then("got massage4 {}")
    public void iGetErrorMessage(String message) {
    }
}