package StepDefinition;

import Starter.Loginpage;
import Starter.PageJawab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PageJawabSteps {
    @Steps
    PageJawab jawab;
    @Steps
    Loginpage login;
    //scenario 1 success

    @Given("user on page jawaban")
    public void onPageJawab(){
        jawab.onHomePage();
        login.inputEmail("ii@gmail.com");
        login.inputPassword("123");
        login.clickLoginButton();
    }

    @When("user memilih pertanyaan")
    public void pilihPertanyaan(){

    }

    @And("user klik jawab button")
    public void jawabButton(){

    }

    @And("user menulis jawaban")
    public void tulisJawaban(){

    }

    @And("user klik kirim button")
    public void kirimButton(){
    }

    @Then("user sukses menjawab pertanyaan")
    public void successMenjawabPertanyaan(){
    }
}
