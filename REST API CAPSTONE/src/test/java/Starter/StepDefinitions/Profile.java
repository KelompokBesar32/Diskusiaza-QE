package Starter.StepDefinitions;

import Starter.Profile.GetProfile;
import Starter.Profile.PutProfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Profile {
    @Steps
    GetProfile getprofile;

    @Given("user login and success auth using token")
    public void authSuccess(){
        getprofile.successAutho();
    }
    @When("user set get profile endpoints")
    public void setGetProfileEndpoints(){
        getprofile.setGetProfileEndpoints();
    }
    @And("user send get profile endpoints")
    public void sendGetProfileEndpoints(){
        getprofile.sendGetProfileEndpoints();
    }
    @Then("user get profile respon code 200")
    public void succesGetProfileResponCode200() {
        getprofile.getResponseCode200();
    }
    @And("user get valid data profile")
    public void receivevaliddataprofile(){
        getprofile.receiveValidDataProfile();
    }
}
