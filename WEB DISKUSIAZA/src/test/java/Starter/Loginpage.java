package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;

import static jnr.unixsocket.UnixServerSocketChannel.open;

public class Loginpage extends PageObject{
        private By emailField(){
            return By.id("email");
        }

        private By passwordField(){
            return By.id("password");
        }

        private By loginButton(){
            return By.xpath("//div//form/button");
        }
        private By homepage(){return By.id("mid");}
        private By errorMassage(){return By.id("");}
        @Step
        public void openPage(){
            open();
        }

        @Step
        public void inputEmail(String email){
            $(emailField()).type(email);
        }

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


}
