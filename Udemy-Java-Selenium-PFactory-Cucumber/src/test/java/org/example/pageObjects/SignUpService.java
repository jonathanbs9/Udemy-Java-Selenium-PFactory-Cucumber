package org.example.pageObjects;

import org.openqa.selenium.WebDriver;


public class SignUpService {
    private WebDriver driver;
    private SignUpPage signUpPage;

    public SignUpService(WebDriver driver){
        this.driver=driver;
        signUpPage = new SignUpPage(driver);
    }

    public void navigate(String url){
        driver.get(url);
        signUpPage = new SignUpPage(driver);
    }

    public void writeFirstName(String firstName){
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

    public void selectGenderMale(){
        signUpPage.getGenderMaleRadio().click();
    }

    public void selectGenderFemale(){
        signUpPage.getGenderFemaleRadio().click();
    }

    public void clickSubmit(){
        signUpPage.getSubmitButton().click();
    }
}
