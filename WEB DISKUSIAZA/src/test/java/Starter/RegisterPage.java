package Starter;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By title(){return By.xpath("//div/h3");}
    private By firstname(){return By.id("firstname");}
    private By lastname(){return By.id("lastname");}
    private By email(){return By.id("email");}
    private By password(){return By.id("password");}
    private By confirmPassword(){return By.id("confirm_password");}
    private By  tanggalLahir(){return By.id("__BVID__54");}
    private By  bulanLahir(){return By.id("__BVID__55");}
    private By  tahunLahir(){return By.id("__BVID__56");}
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
    public void typeTanggalLahir(String tanggal){$(tanggalLahir()).type(tanggal);}
    @Step
    public void typeBulanLahir(String bulan){$(bulanLahir()).type(bulan);}
    @Step
    public void typeTahunLahir(String tahun){$(tahunLahir()).type(tahun);}

    @Step
    public void typeJenisKelamin(){$(jenisKelamin()).click();}
    @Step
    public void clickRegisterButton(){$(RegisterButton()).click();}
    @Step
    public void gotErrorMessage(){$(gotErrorMassage()).isDisplayed();}





}
