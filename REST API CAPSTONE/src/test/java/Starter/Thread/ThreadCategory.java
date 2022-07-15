package Starter.Thread;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ThreadCategory {
    protected String url = "https://capstone-go.dikatest.xyz/";
    protected static String token = "";

    public JSONObject setLoginToken4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "hening@gmail.com");
        requestBody.put("password", "aiueo");
        return requestBody;
    }
    @Step
    public void successAuth4() {
        SerenityRest.given().header("Content-Type", "application/json").body(setLoginToken4().toJSONString()).get(url + "auth/login");
        Response resp = SerenityRest.lastResponse();
        token = resp.getBody().jsonPath().get("token");
    }

    @Step
    public String setGetThreadCategoryEndpoints(){
        return url + "therad/categori";
    }
    @Step
    public void sendGetThreadCategoryEndpoints(){
        SerenityRest.given().header("Authorization", "Bearer" + token).get(setGetThreadCategoryEndpoints());
    }
    @Step
    public void  getResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step
    public void receiveThreadById(){
        restAssuredThat(response -> response.body("'data','id'", equalTo("3")));
    }
}
