package test.automation.stepdefinitions;

import com.github.javafaker.Faker;
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
        Faker faker=new Faker();
        profile.tapEditNama();
        profile.typeUpdateNama(faker.name().firstName());
    }
    @And("user tap simpan")
    public void tapSimpan(){
        profile.tapSimpan();
    }
    @Then("user see update profile")
    public void updateDataSuccess(){

    }

    //delete thread
    @When("User tap profile bar2")
    public void tapProfileBar2(){
        profile.tapProfileBar();
    }

    @And("user click profile button2")
    public void tapButtonProfile2() {
        profile.tapProfileButton();
    }

    @And("user tap edit profile2")
    public void tapEditProfile2(){
        profile.tapEditProfile();
    }
    @And("user tap titik tiga")
    public void titikTiga(){
        profile.tapTitikTiga();
    }
    @And("user tap delete")
    public void deleteThreadd(){
        profile.tapDeleteThread();
    }
    @Then("user success delete thread")
    public void DeleteThreadSuccess(){
    }

    //edit thread
    @When("User tap profile bar3")
    public void tapProfileBar3(){
        profile.tapProfileBar();
    }

    @And("user click profile button3")
    public void tapButtonProfile3() {
        profile.tapProfileButton();
    }

    @And("user tap edit profile3")
    public void tapEditProfile3(){
        profile.tapEditProfile();
    }
    @And("user tap titik tiga2")
    public void titikTiga2(){
        profile.tapTitikTiga();
    }
    @And("user tap edit thread")
    public void editThreadd(){
        profile.tapEditThread();
        profile.clickJudul();
        profile.editJudul("kamu lapar?");
        profile.clickIsi();
        profile.editIsi("iya, aku lapar");
    }
    @Then("user success edit thread")
    public void editThreadSuccess(){
    }

    //Bookmarks
    @When("User tap profile bar4")
    public void tapProfileBar4(){
        profile.tapProfileBar();
    }

    @And("user tap Bookmarks")
    public void tapButtonBookmarks() {
        profile.tapBookmarks();
    }

    @And("user on bookmarks page")
    public void succesOnBookmarksPage(){
        profile.onBookmarkspage();
    }

    //Kebijakan Privasi
    @When("User tap profile bar5")
    public void tapProfileBar5(){
        profile.tapProfileBar();
    }

    @And("user tap Kebijakan Privasi")
    public void tapKebijakanPrivasi() {
        profile.tapKebijakan();
    }

    @And("user on kebijakan privasi page")
    public void succesOnKebijakanPage(){
        profile.onKebijakanPage();
    }

    //Ruang
    @When("User tap profile bar6")
    public void tapProfileBar6(){
        profile.tapProfileBar();
    }

    @And("user tap ruang")
    public void tapButtonRuang() {
        profile.tapRuang();
    }

    @And("user on ruang page")
    public void succesOnRuangPage(){
        profile.onRuangPage();
    }

}
