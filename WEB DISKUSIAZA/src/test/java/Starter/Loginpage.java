package Starter;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static jnr.unixsocket.UnixServerSocketChannel.open;

public class Loginpage {
        private By emailField(){
            return By.id("email");
        }

        private By passwordField(){
            return By.id("password");
        }

        private By loginButton(){
            return By.xpath("//div//form/button");
        }

        //function

        @Step
        public void openPage(){
            open();
        }

        @Step
        public void clickLoginIcon(){
            $(loginIcon()).click();
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
        public boolean validationOnHomepage(){
            return $(onHomePage()).isDisplayed();
        }


    }


}
