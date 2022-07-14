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
    private By tanggal(){return By.xpath("//form/div[4]/div[1]");}
    private By bulan(){return By.xpath("//form/div[4]/div[2]");}
    private By tahun(){return By.xpath("//form/div[4]/div[3]");}
    private By tanggalLahir(){return By.xpath("//form/div[4]/div[1]//option[15]");}
    private By bulanLahir(){return By.xpath("//form/div[4]/div[2]//option[13]");}
    private By tahunLahir(){return By.xpath("//form/div[4]/div[3]//option[2]");}
    private By jenisKelamin(){return By.xpath("//form/div[5]/div[2]");}
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
    public void pilihTanggal(){$(tanggalLahir()).click();}
    @Step
    public void pilihBulan(){$(bulanLahir()).click();}
    @Step
    public void pilihTahun(){$(tahunLahir()).click();}
    @Step
    public void clickTanggal(){$(tanggal()).click();}
    @Step
    public void clickBulan(){$(bulan()).click();}
    @Step
    public void clickTahun(){$(tahun()).click();}
    @Step
    public void gotErrorMessage(){$(gotErrorMassage()).isDisplayed();}





}
