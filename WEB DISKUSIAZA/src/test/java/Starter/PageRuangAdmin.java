package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PageRuangAdmin extends PageObject {
    private By barHomepage(){return By.xpath("");}
    private By textRuang(){return By.xpath("");}
    private By barJawab(){return By.xpath("");}

    @Step
    public void onHomePage(){open();}
    @Step
    public void clickJawabButton(){$(textRuang()).click();}
    @Step
    public void validateOnJawabPage(){$(barJawab()).isDisplayed();}
}
