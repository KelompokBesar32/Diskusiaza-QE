package Starter.Thread;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ThreadCategory {
    public static String url = "https://capstone-go.dikatest.xyz/";
    @Step
    public String setGetThreadCategoryEndpoints(){
        return url + "therad/categori";
    }
    @Step
    public void sendGetThreadCategoryEndpoints(){
        SerenityRest.given().get(setGetThreadCategoryEndpoints());
    }
    @Step
    public void  getResponseCode200(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step
    public void receiveThreadById(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo("3")));
    }
}
