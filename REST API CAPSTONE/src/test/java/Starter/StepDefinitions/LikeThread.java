package Starter.StepDefinitions;

import Starter.LikeThread.DeleteLikeThread;
import Starter.LikeThread.PostLikeThread;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LikeThread {
    @Steps
    PostLikeThread likeThread;
    @Steps
    DeleteLikeThread unlikeThread;
    @Given("user post like thread endpoints")
    public void postLikeThreadEndpoints(){
        likeThread.postLikeThreadEndpoints();
    }
    @When("user input thread id")
    public void likeUsingThreadId(){
        likeThread.likeUsingThreadId();
    }
    @Then("user succes like thread with respon code 200")
    public void succesLikeResponseCode() {
        likeThread.getResponseCode200();
    }
    @And("user got massage {}")
    public void gotMessage1() {
        likeThread.receiveMassageLikeSucces();
    }

    @Given("user delete like thread endpoints")
    public void deleteLikeThreadEndpoints(){
        unlikeThread.deleteLikeThreadEndpoints();
    }
    @When("user input thread id2")
    public void unlikeUsingThreadId(){
        unlikeThread.unlikeUsingThreadId();
    }
    @Then("user succes unlike thread with respon code 200")
    public void getResponseCode() {
        unlikeThread.getHttpsResponseCode200();
    }
    @And("user got massage2 {}")
    public void gotMassage() {
        unlikeThread.receiveMassageUnlikeSucces();
    }
}