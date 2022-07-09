package StepDefinition;

import Starter.PageRuangAdmin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PageRuangAdminSteps {
    @Steps
    PageRuangAdmin rAdmin;

    //scenario 1 success

    @Given("user on home page")
    public void onLandingPage(){

    }

    @When("user klik buat ruang")
    public void buatRuangButton(){

    }

    @And("user input nama ruang")
    public void namaRuang(){

    }

    @And("user input deskripsi")
    public void namaDeskripsi(){

    }

    @Then("user sukses buat ruang")
    public void successBuatRuang(){

    }

    @And("user berada di page ruang admin")
    public void PageRuangAdmin(){

    }
}
