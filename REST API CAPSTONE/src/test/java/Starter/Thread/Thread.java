package Starter.Thread;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Thread {
    public static String url = "https://capstone-go.dikatest.xyz/";

    @Step
    public String setGetThreadEndpoints(){
        return url + "therad";
    }

    @Step
    public void sendGetThreadEndpoints(){
        SerenityRest.given().get(setGetThreadEndpoints());
    }
    @Step
    public void  getResponseCode200(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step
    public void receiveMassageLikeSucces(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo("1")));
    }
}
