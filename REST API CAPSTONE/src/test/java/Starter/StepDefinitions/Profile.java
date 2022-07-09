package Starter.StepDefinitions;

import Starter.Profile.GetProfile;
import Starter.Profile.PutProfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Profile {
    @Steps
    GetProfile getprof;
    @Steps
    PutProfile putprof;
    @Given("user get profile endpoints")
    public void getprofileendpoints(){
        getprof.setgetprofileendpoints();
    }
    @When("user kirim token")
    public void kirimtoken(){
        getprof.sendGetTokenEndpoints();
    }
    @Then("user get response code 200")
    public void succesgetresponcode200() {
        getprof.getprofileResponseCode200();
    }
    @And("user get valid data profile")
    public void receivevaliddataprofile(){
        getprof.receivevaliddataprof();
    }

    @Given("user put profile endpoints")
    public void setPutprofile(){
        putprof.setPutProfileEndpoints();
    }
    @When("user input update body")
    public void inputupdatebody(){
        putprof.sendInputUpdateBodyEndpoints();
    }
    @Then("user get valid response code 200")
    public void succesgetvalidresponcode200() {
        putprof.getValidResponseCode200();
    }
    @And("user get update data profile")
    public void getUpdateDataProf(){
        putprof.receiveupdatevaliddataprof();
    }

}
