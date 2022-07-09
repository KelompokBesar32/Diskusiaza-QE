package Starter.Thread;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ThreadById {
    public static String url = "https://capstone-go.dikatest.xyz/t/";
    @Step
    public String setGetThreadCategoryEndpoints(){
        return url + "therad/1";
    }
    @Step
    public void sendGetThreadCategoryEndpoints(){
        SerenityRest.given().get(setGetThreadCategoryEndpoints());
    }
    @Step
    public void  getResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step
    public void receiveMassageLikeSucces(){
        restAssuredThat(response -> response.body("'data','id''", equalTo("3")));
    }
}
