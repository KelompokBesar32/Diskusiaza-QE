package Starter;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PageRuangAdmin {
    private By barHomepage(){return By.xpath("");}
    private By textRuang(){return By.xpath("");}
    private By barJawab(){return By.xpath("");}

    @Step
    public void onHomePage(){openAt("/auth/login");}
    @Step
    public void clickJawabButton(){}
    @Step
    public void validateOnJawabPage(){}
}
