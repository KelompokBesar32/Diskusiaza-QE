package Starter.LikeThread;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class DeleteLikeThread {
    public static String url = "https://capstone-go.dikatest.xyz/";
    @Step
    public String deleteLikeThreadEndpoints(){
        return url + "therad/like";
    }

    @Step
    public void unlikeUsingThreadId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("therad_id", "3");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).delete(deleteLikeThreadEndpoints());
    }
    @Step
    public void  getHttpsResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step
    public void receiveMassageUnlikeSucces(){
        restAssuredThat(response -> response.body("message", equalTo("anda berhasil unlike therad ini")));
    }
}
