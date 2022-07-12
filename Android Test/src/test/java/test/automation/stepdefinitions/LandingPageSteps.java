package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.LoginScreen;
import test.automation.pages.LandingPageScreen;

public class LandingPageSteps {
    @Steps
    LoginScreen login;
    @Steps
    LandingPageScreen landing;
    //profile
    @Given("user login with email {} and password {}")
    public void login(String email, String password){
        login.onHomepage();
        login.tapEmail();
        login.typeEmail(email);
        login.tapPassword();
        login.typePassword(password);
        login.tapLoginButton();
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
        landing.onProfilepage();
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

    //thread
    @Given("user login email ii@gmail.com and password 123")
    public void loginUser(String email, String password){
        login.onHomepage();
        login.tapEmail();
        login.typeEmail(email);
        login.tapPassword();
        login.typePassword(password);
        login.tapLoginButton();
    }
    @And("user go to landing page")
    public void goLandingPage() {
        landing.onLandingpage();
    }
    @When("user click plus icon")
    public void clickPlus(){
        landing.tapPlus();
    }
    @And("user type judul {}")
    public void typeJudul(String judul) {
        landing.tapJudul();
        landing.typeJudul(judul);
    }
    @And("user type isi {}")
    public void typeIsi(String isi) {
        landing.tapIsi();
        landing.typeIsi(isi);
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
