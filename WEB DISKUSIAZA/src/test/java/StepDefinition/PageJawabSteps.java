package StepDefinition;

import Starter.PageJawab;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PageJawabSteps {
    @Steps
    PageJawab jawab;

    //scenario 1 success

    @Given("user on page jawaban")
    public void onPageJawab(){
        jawab. ;
    }

    @When("user memilih pertanyaan")
    public void pilihPertanyaan(){
        jawab. ;
    }

    @And("user klik jawab button")
    public void jawabButton(){
        jawab. ;
    }

    @And("user menulis jawaban")
    public void tulisJawaban(){
        jawab. ;
    }

    @And("user klik kirim button")
    public void kirimButton(){
        jawab. ;
    }

    @Then("user sukses menjawab pertanyaan")
    public void successMenjawabPertanyaan(){
        jawab. ;
    }
}
