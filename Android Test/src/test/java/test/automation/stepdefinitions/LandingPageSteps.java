package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LandingPageScreen;

public class LandingPageSteps {


    @Steps
    LandingPageScreen landing;

    //profile
    @Given("user login with email {} and password {}")
    public void login(String email, String password){
        landing.openLoginPage();
        landing.clickEmail();
        landing.inputEmail(email);
        landing.clickPassword();
        landing.inputPassword(password);
        landing.tapTombolLogin();
    }
    @And("user on landing page")
    public void onLandingPage() {
        landing.onLandingpage();
    }
    @When("user click profile")
    public void clickProfile(){
        landing.tapProfileButton();
    }
    @Then("user on Profile page")
    public void onProfilePage(){
        landing.onProfilePage();
    }

    //explore
    @When("user click explore")
    public void clickExplore(){
        landing.tapExploreButton();
    }
    @Then("user on explore page")
    public void onExplorePage(){
        landing.onExplorePage();
    }

    //trending
    @When("user click trending")
    public void clickTrending(){
        landing.tapTrendingButton();
    }
    @Then("user on trending page")
    public void onTrendingPage(){
        landing.onTrendingPage();
    }

    //Message
    @When("user click message button")
    public void clickmessage(){
        landing.tapMessageButton();
    }
    @Then("user on message page")
    public void onmessagePage(){
        landing.onMessagePage();
    }

    //Notification
    @When("user click notif button")
    public void clicknotif(){
        landing.tapNotifButton();
    }
    @Then("user on notif page")
    public void onNotifPage(){
        landing.onNotificationPage();
    }

    //thread
    @When("user click plus icon")
    public void clickPlus(){
        landing.tapPlus();
    }
    @And("user type judul")
    public void typeJudul() {
        landing.tapJudul();
        landing.typeJudul("aku cinta kamu");
    }
    @And("user type isi")
    public void typeIsi() {
        landing.tapIsi();
        landing.typeIsi("tapi kamu cinta yang lain:(");
    }
    @And("user click kirimkan button")
    public void clickKirim() {
        landing.tapKirim();
    }
    @Then("user succes send thread")
    public void successThread(){
        landing.onLandingpage();
    }

}
