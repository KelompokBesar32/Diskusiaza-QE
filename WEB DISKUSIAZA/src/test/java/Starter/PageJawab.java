package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PageJawab extends PageObject {
    private By barHomepage(){return By.xpath("");}
    private By textJawab(){return By.xpath("");}
    private By barJawab(){return By.xpath("");}

    @Step
    public void onHomePage(){open();}
    @Step
    public void clickJawabButton(){$(textJawab()).click();}
    @Step
    public void validateOnJawabPage(){$(barJawab()).isDisplayed();}

}
