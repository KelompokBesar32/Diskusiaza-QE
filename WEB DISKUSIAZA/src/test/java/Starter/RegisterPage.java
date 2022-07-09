package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By title(){return By.xpath("//div/h3");}
    private By firstname(){return By.xpath("//div/div/div/*[@id=\"firstname\"]");}
    private By lastname(){return By.xpath("//div/div/div/*[@id=\"lastname\"]");}
    private By email(){return By.xpath("//div/div/div/*[@id=\"email\"]");}
    private By password(){return By.xpath("//div/div/div/*[@id=\"password\"]");}
    private By confirmPassword(){return By.xpath("//div/div/div/*[@id=\"confirm_password\"]");}
    private By tanggalLahir(){return By.xpath("//*[@id=\"__BVID__54\"]/option[15]");}
    private By bulanLahir(){return By.xpath("//*[@id=\"__BVID__55\"]/option[13]");}
    private By tahunLahir(){return By.xpath("//*[@id=\"__BVID__56\"]/option[4]");}
    private By jenisKelamin(){return By.xpath("//*[@id=\"__BVID__28\"]/div[2]/label");}
    private By RegisterButton(){return By.xpath("//div/form/button");}
    private By gotErrorMassage(){return By.className("");}
    @Step
    public void onRegisterPage(){openAt("/register");}
    @Step
    public void typeFirstName(String firstname){$(firstname()).type(firstname);}
    @Step
    public void typeLastName(String lastname){$(lastname()).type(lastname);}
    @Step
    public void typeEmail(String email){$(email()).type(email);}
    @Step
    public void typePassword(String password){$(password()).type(password);}
    @Step
    public void typeConfirmPassword(String c_password){$(confirmPassword()).type(c_password);}
    @Step
    public void typeJenisKelamin(){$(jenisKelamin()).click();}
    @Step
    public void clickRegisterButton(){$(RegisterButton()).click();}
    @Step
    public void clickTanggal(){$(tanggalLahir()).click();}
    @Step
    public void clickBulan(){$(bulanLahir()).click();}
    @Step
    public void clickTahun(){$(tahunLahir()).click();}
    @Step
    public void gotErrorMessage(){$(gotErrorMassage()).isDisplayed();}





}
