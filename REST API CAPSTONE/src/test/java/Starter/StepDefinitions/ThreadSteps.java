package Starter.StepDefinitions;
import Starter.Thread.Thread;
import Starter.Thread.ThreadById;
import Starter.Thread.ThreadCategory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ThreadSteps {
    @Steps
    Thread allThread;
    @Steps
    ThreadById byId;
    @Steps
    ThreadCategory category;
    @Given("user set get category thread endpoints")
    public void setGetCategory(){
        category.setGetThreadCategoryEndpoints();
    }
    @When("user send get category thread endpoints")
    public void sendGetCategory(){
        category.sendGetThreadCategoryEndpoints();
    }
    @Then("user get respon code 200")
    public void responseCode200() {
        category.getResponseCode200();
    }
    @And("user receive details category thread")
    public void detailsCategory(){
        category.receiveThreadById();
    }

    @Given("user set get all thread endpoints")
    public void setGetAllThread(){
        byId.setGetThreadCategoryEndpoints();
    }
    @When("user send get all thread endpoints")
    public void sendGetAllThread(){
        byId.sendGetThreadCategoryEndpoints();
    }
    @Then("user get response code2 200")
    public void getResponseCode200() {
        byId.getResponseCode200();
    }
    @And("user receive details all thread")
    public void receiveDetailsAllThread(){
        byId.receiveMassageLikeSucces();
    }

    @Given("user set get thread by id endpoints")
    public void setGetThreadById(){
        allThread.setGetThreadEndpoints();
    }
    @When("user send get thread by id endpoints")
    public void sendGetThreadById(){
        allThread.sendGetThreadEndpoints();
    }
    @Then("user get response code3 200")
    public void getResponse3Code200() {
        allThread.getResponseCode200();
    }
    @And("user receive thread by id")
    public void receiveThreadById(){
        allThread.receiveMassageLikeSucces();
    }
}
