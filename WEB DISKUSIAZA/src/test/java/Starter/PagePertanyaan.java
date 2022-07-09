package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PagePertanyaan extends PageObject {
    private By barHomepage(){return By.xpath("");}
    private By textTanya(){return By.xpath("");}
    private By barPertanyaan(){return By.xpath("");}

    @Step
    public void onHomePage(){open();}
    @Step
    public void clickTanyaButton(){$(textTanya()).click();}
    @Step
    public void validateOnTanyaPage(){$(barPertanyaan()).isDisplayed();}
}
