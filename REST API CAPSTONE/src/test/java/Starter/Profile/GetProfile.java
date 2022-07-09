package Starter.Profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetProfile {
    public static String url = "https://capstone-go.dikatest.xyz/t/";
    @Step
    public String setgetprofileendpoints(){
        return url + "user/profile";
    }
    @Step
    public void sendGetTokenEndpoints(){
        SerenityRest.given().get(setgetprofileendpoints());
    }
    @Step
    public void  getprofileResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step
    public void receivevaliddataprof(){
        restAssuredThat(response -> response.body("data", equalTo("")));
    }
}
