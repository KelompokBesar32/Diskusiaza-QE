package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Loginpage extends PageObject {
        private By emailField(){
            return By.xpath("//div/*[@id=\"email\"]");
        }

        private By passwordField(){
            return By.xpath("//div/*[@id=\"password\"]");
        }

        private By loginButton(){
            return By.xpath("//div//form/button");
        }
        private By homepage(){
            return By.id("mid");}
        private By errorMassage(){
            return By.id("");}

        @Step
        public void openPage(){
            openAt("/login");
        }

        @Step
        public void inputEmail(String email){$(emailField()).type(email);}

        @Step
        public void inputPassword(String password){
            $(passwordField()).type(password);
        }

        @Step
        public void clickLoginButton(){
            $(loginButton()).click();
        }

        @Step
        public void validationOnHomepage(){$(homepage()).isDisplayed();
        }
    }



