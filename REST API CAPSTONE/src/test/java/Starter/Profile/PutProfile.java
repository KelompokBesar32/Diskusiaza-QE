package Starter.Profile;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutProfile {
    public static String url = "https://capstone-go.dikatest.xyz/t/";
    @Step
    public String setPutProfileEndpoints(){
        return url + "user/profile";
    }
    @Step
    public void sendInputUpdateBodyEndpoints(){
        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname", "siti");
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toJSONString()).put(setPutProfileEndpoints());
    }
    @Step
    public void  getValidResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step
    public void receiveupdatevaliddataprof(){
        restAssuredThat(response -> response.body("data", equalTo("{}")));
    }
}
