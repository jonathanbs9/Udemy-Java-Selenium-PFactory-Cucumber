package org.example.pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.conf.DriverConfig;
import org.example.enums.Gender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpService {
    @Autowired
    private SignUpPage signUpPage;
    @Autowired
    private WebDriver driver;

    @Autowired
    WebDriverWait wait;

    public void navigate(String url){
        this.driver.get(url);
    }

    public void writeFirstName(String firstName){
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPage.getFirstNameInput()));
        signUpPage.getFirstNameInput().sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        signUpPage.getLastNameInput().sendKeys(lastName);
    }

    public void writeEmail(String email){
        signUpPage.getEmailInput().sendKeys(email);
    }

    public void writePhone(String phoneNumber){
        signUpPage.getPhoneInput().sendKeys(phoneNumber);
    }

    private void selectGenderMale(){
        signUpPage.getGenderMaleRadio().click();
    }

    private void selectGenderFemale(){
        signUpPage.getGenderFemaleRadio().click();
    }

    public void selectGender(Gender gender){
        if (gender == Gender.male){
            selectGenderMale();
        } else {
            selectGenderFemale();
        }
    }

    public void clickSubmit(){
        signUpPage.getSubmitButton().click();
    }
}
