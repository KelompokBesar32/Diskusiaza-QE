package Starter;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LandingPage {
    private By barlandingpage(){return By.xpath("");}
    private By jawab(){return By.xpath("");}
    private By tanya(){return By.xpath("");}
    private By thread(){return By.xpath("");}
    private By message(){return By.xpath("");}
    private By trending(){return By.xpath("");}
    private By explore(){return By.xpath("");}
    private By search(){return By.xpath("");}
    private By profile(){return By.xpath("");}
    private By bookmark(){return By.xpath("");}
    private By tulis(){return By.xpath("");}
    private By textJawab(){return By.xpath("");}
    private By textTanya(){return By.xpath("");}
    private By textThread(){return By.xpath("");}
    private By textMessage(){return By.xpath("");}
    private By textTrending(){return By.xpath("");}
    private By textExplore(){return By.xpath("");}
    private By textSearch(){return By.xpath("");}
    private By textProfile(){return By.xpath("");}
    private By textBookmark(){return By.xpath("");}
    private By textTulis(){return By.xpath("");}



    @Step
    public void onLandingPage(){openAt("/auth/login");}
    @Step
    public void clickJawabButton(){}
    @Step
    public void clickTanyaButton(){}
    @Step
    public void clickTulisButton(){}
    @Step
    public void clickTrendingButton(){}
    @Step
    public void clickThreadButton(){}
    @Step
    public void clickExploreButton(){}
    @Step
    public void clickSearchButton(){}
    @Step
    public void clickBookmarkButton(){}
    @Step
    public void clickProfileButton(){}
    @Step
    public void clickMassageButton(){}
    @Step
    public void validateOnJawabPage(){}
    @Step
    public void validateOnTanyaPage(){}
    @Step
    public void validateOnTulisPage(){}
    @Step
    public void validateOnTrendingPage(){}
    @Step
    public void validateOnThreadPage(){}
    @Step
    public void validateOnExplorePage(){}
    @Step
    public void validateOnSearchPage(){}
    @Step
    public void validateOnBookmarkPage(){}
    @Step
    public void validateOnProfilePage(){}
    @Step
    public void validateOnMassagePage(){}
}
