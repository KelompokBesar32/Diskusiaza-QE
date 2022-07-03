package StepDefinition;

import Starter.PagePertanyaan;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PagePertanyaanSteps {
        @Steps
        PagePertanyaan pertanyaan;

        //scenario 1 success

        @Given("user on page pertanyaan")
        public void onPagePertanyaan(){
            pertanyaan. ;
        }

        @When("user menulis pertanyaan")
        public void tulisPertanyaan(){
            pertanyaan. ;
        }

        @And("user memilih privasi pertanyaan")
        public void pilihPrivasiPertanyaan(){
            pertanyaan. ;
        }

        @Then("user sukses mengirim pertanyaan")
        public void successMengirimPertanyaan(){
            pertanyaan. ;
        }

}
