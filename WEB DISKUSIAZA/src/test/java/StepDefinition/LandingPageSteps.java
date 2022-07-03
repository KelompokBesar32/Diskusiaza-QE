package StepDefinition;

import Starter.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LandingPageSteps {
    @Steps
    LandingPage landing;

    //scenario 1 success ke halaman tambah pertanyaan

    @Given("user on landing page")
    public void onLandingPage(){
        landing. ;
    }

    @When("user klik 'tanya' button")
    public void tanyaButton(){
        landing. ;
    }

    @Then("user sukses ke halaman tambah pertanyaan")
    public void succesKeHalTambahPertanyaan(){
        landing. ;
    }

    //scenario 2 success ke halaman tulis
    @When("user klik 'tulis' button")
    public void tulisButton(){
        landing. ;
    }

    @Then("user sukses ke halaman tulis")
    public void successKeHalTulis(){
        landing. ;
    }

    //scenario 3 success ke halaman notifikasi

    @When("user klik sidebar notifikasi")
    public void klikSidebarNotifikasi() {
        landing. ;
    }

    @Then("user sukses ke halaman notifikasi")
    public void successKeHalamanNotifikasi() {
        landing. ;
    }

    //scenario 4 user on search page

    @When("user klik search field")
    public void klikSearchField(){
        landing. ;
    }

    @Then("user on search page")
    public void onSearchPage() {
        landing. ;
    }

    //scenario 5 user on explore page

    @When("user klik sidebar explore")
    public void klikSidebarexplore(){
        landing. ;
    }

    @Then("user on explore page")
    public void onExplorePage() {
        landing. ;
    }

    //scenario 6 user on trending page

    @When("user klik sidebar trending")
    public void klikSidebarTrending(){
        landing. ;
    }

    @Then("user on trending page")
    public void onTrendingPage() {
        landing. ;
    }

    //scenario 7 user on message page

    @When("user klik sidebar massage")
    public void klikSidebarMassage(){
        landing. ;
    }

    @Then("user on massage page")
    public void onMassagePage() {
        landing. ;
    }

    //scenario 8 user on bookmark page

    @When("user klik sidebar Bookmark")
    public void klikSidebarBookmark(){
        landing. ;
    }

    @Then("user on bookmarks page")
    public void onBookmarksPage() {
        landing. ;
    }

    //scenario 9 user on jawab page

    @When("user klik sidebar jawab")
    public void klikSidebarJawab(){
        landing. ;
    }

    @Then("user on jawab page")
    public void onJawabPage() {
        landing. ;
    }

    //scenario 10 user on ruang page

    @When("user klik sidebar ruang")
    public void klikSidebarRuang(){
        landing. ;
    }

    @Then("user on ruang page")
    public void onRuangPage() {
        landing. ;
    }

    //scenario 11 user on profil page

    @When("user klik sidebar profile")
    public void klikSidebarProfil(){
        landing. ;
    }

    @Then("user on Profil Page")
    public void onProfilPage() {
        landing. ;
    }

    //scenario 12 user on thread page

    @When("user klik Buat Thread")
    public void klikBuatThread(){
        landing. ;
    }

    @Then("user on thread page")
    public void onThreadPage() {
        landing. ;
    }
}
