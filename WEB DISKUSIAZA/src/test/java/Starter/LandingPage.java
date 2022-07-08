package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class LandingPage extends PageObject {
    private By barlandingpage(){return By.xpath("//*[@id=\"mid\"]/span");}
    private By jawab(){return By.xpath("//*[@id=\"profile\"]//div/button[2]");}
    private By tanya(){return By.xpath("//*[@id=\"profile\"]//div/button[1]");}
    private By thread(){return By.id("button-thread");}
    private By message(){return By.xpath("//*[@id=\"button-sidebar\"][5]");}
    private By trending(){return By.xpath("//*[@id=\"button-sidebar\"][3]");}
    private By notif(){return By.xpath("//*[@id=\"button-sidebar\"][4]");}
    private By search(){return By.xpath("");}
    private By profile(){return By.xpath("//*[@id=\"button-sidebar\"][9]");}
    private By bookmark(){return By.xpath("//*[@id=\"button-sidebar\"][6]");}
    private By tulis(){return By.xpath("//*[@id=\"profile\"]//div/button[3]");}
    private By textJawab(){return By.xpath("");}
    private By textTanya(){return By.xpath("");}
    private By textThread(){return By.xpath("");}
    private By textMessage(){return By.xpath("");}
    private By textTrending(){return By.xpath("");}
    private By textNotifikasi(){return By.xpath("//*[@id=\"mid\"]/span");}
    private By textSearch(){return By.id("__BVID__43");}
    private By textProfile(){return By.xpath("//*[@id=\"mid\"]/div/div[2]/div[1]");}
    private By textBookmark(){return By.xpath("");}
    private By textTulis(){return By.xpath("");}



    @Step
    public void onLandingPage(){open();}
    @Step
    public void clickJawabButton(){$(jawab()).click();}
    @Step
    public void clickTanyaButton(){$(tanya()).click();}
    @Step
    public void clickTulisButton(){$(tulis()).click();}
    @Step
    public void clickTrendingButton(){$(trending()).click();}
    @Step
    public void clickThreadButton(){$(thread()).click();}
    @Step
    public void clickNotifikasiButton(){$(notif()).click();}
    @Step
    public void clickSearchButton(){$(search()).click();}
    @Step
    public void clickBookmarkButton(){$(bookmark()).click();}
    @Step
    public void clickProfileButton(){$(profile()).click();}
    @Step
    public void clickMassageButton(){$(message()).click();}
    @Step
    public void validateOnJawabPage(){$(jawab()).click();}
    @Step
    public void validateOnTanyaPage(){}
    @Step
    public void validateOnTulisPage(){}
    @Step
    public void validateOnTrendingPage(){}
    @Step
    public void validateOnThreadPage(){}
    @Step
    public void validateOnNotifikasiPage(){$(textNotifikasi()).click();}
    @Step
    public void validateOnSearchPage(){}
    @Step
    public void validateOnBookmarkPage(){}
    @Step
    public void validateOnProfilePage(){}
    @Step
    public void validateOnMassagePage(){}
}
