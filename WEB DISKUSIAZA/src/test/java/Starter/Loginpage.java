package Starter;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Loginpage {
    package Starter.Login;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

    public class LoginPage {
        private By emailField(){
            return By.xpath("//label[contains(text(),'Email')]/following-sibling::input");
        }

        private By passwordField(){
            return By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
        }

        private By loginButton(){
            return By.xpath("(//span[@class='v-btn__content'])[3]");
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
