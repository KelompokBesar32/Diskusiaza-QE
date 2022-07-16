package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.ProfilePageScreen;

public class ProfilePageSteps {
    @Steps
    ProfilePageScreen profile;
    @Given("user login and go to homepage")
    public void onLoginAndGoHomepage(){
        profile.openPage();
        profile.clickEmail();
        profile.enterEmail("ii@gmail.com");
        profile.clickPassword();
        profile.enterPassword("123");
        profile.tapLoginButton();
    }

    @When("User tap profile button")
    public void tapProfileButton(){
        profile.tapProfileBar();
    }

    @And("user tap profile")
    public void tapProfile() {
        profile.tapProfileButton();
    }

    @Then("user can see my profile")
    public void seeMyProfile(){

    }

    //update profile
    @When("User tap profile bar")
    public void tapProfileBar(){
        profile.tapProfileBar();
    }

    @And("user click profile button")
    public void tapButtonProfile() {
        profile.tapProfileButton();
    }

    @And("user tap edit profile")
    public void tapEditProfile(){
        profile.tapEditProfile();
    }
    @And("user update data profile")
    public void updateData(){
        profile.tapEditNama();
        profile.typeUpdateNama("Cantik");
    }
    @And("user tap simpan")
    public void tapSimpan(){
        profile.tapSimpan();
    }
    @Then("user see update profile")
    public void updateDataSuccess(){

    }
}
