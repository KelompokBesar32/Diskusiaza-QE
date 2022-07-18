package StepDefinition;

import Starter.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginSteps {
    @Steps
    Loginpage login;

    //scenario 1

    @Given("user on login page")
    public void onLoginPage(){
        login.openPage();
    }

    @When("user input valid email {} and valid password {}")
    public void inputValidEmail(String email, String password){
        login.inputEmail(email);
        login.inputPassword(password);
    }

    @And("user click button login")
    public void clickLoginButton(){
        login.clickLoginButton();
    }

    @Then("user success to landing page")
    public void successLogin(){
        login.validationOnHomepage();
    }

    //scenario 2 unsuccess invalid password
    @When("user input valid email {} and invalid password {}")
    public void inputInvalidPassword(String email, String password){
        login.inputEmail(email);
        login.inputPassword(password);
    }

    @And("user click button login2")
    public void clickLoginButton2(){
        login.clickLoginButton();
    }

    @Then("got massage2 {}")
    public void iFailedToLoginAndGetErrorMessage2(String message) {
        login.getErrorPage();
    }

    //scenario 3 unsuccess invalid email

    @When("user input invalid email {} and valid password {}")
    public void iInputInvalidEmail(String email, String password) {
        login.inputEmail(email);
        login.inputPassword(password);
    }

    @And("user click button login3")
    public void clickLoginButton3(){
        login.clickLoginButton();
    }

    @Then("got massage3 {}")
    public void iFailToLoginAndGetErrorMessage(String message) {
        login.getErrorPage();
    }

    //scenario 4 unsuccess invalid email and password

    @When("user input invalid email {} and invalid password {}")
    public void notInputUsernamePassword4(String email, String password){
        login.inputEmail(email);
        login.inputPassword(password);
    }

    @And("user click button login4")
    public void clickLoginButton4(){
        login.clickLoginButton();
    }


    @Then("got massage4 {}")
    public void iGetErrorMessage(String message) {
        login.getErrorPage();
    }
}
