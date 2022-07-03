package StepDefinition;

import Starter.PagePertanyaan;
import Starter.PageRuangUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PageRuangUserSteps {
    @Steps
    PageRuangUser rUser;

    //scenario 1 success

    @Given("user on landing page")
    public void onlandingpage(){
        rUser. ;
    }

    @When("user klik salah satu ruang")
    public void kliksalahsaturuang(){
        rUser. ;
    }

    @Then("user berada di ruang diskusi")
    public void PageRuangDiskusi(){
        rUser. ;
    }
}
