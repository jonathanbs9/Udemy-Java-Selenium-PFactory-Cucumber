package org.example.pageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SignUpPage {

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //private By firstNameInput = By.xpath("//input[@type='text'][@placeholder='First Name']");
    @FindBy(xpath = "//input[@type='text'][@placeholder='First Name']")
    private WebElement firstNameInput;

    //private By lastNameInput = By.xpath("//input[@type='text'][@placeholder='Last Name']");
    @FindBy(xpath = "//input[@type='text'][@placeholder='Last Name']")
    private WebElement lastNameInput;

    //private By emailInput = By.xpath("//input[@type='email']");
    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailInput;

    //private By phoneInput = By.xpath("//input[@type='tel']");
    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phoneInput;

    //private By genderMaleRadio =  By.xpath("//input[@type='radio'][@value='Male']");
    @FindBy(xpath = "//input[@type='radio'][@value='Male']")
    private WebElement genderMaleRadio;

    //private By genderFemaleRadio = By.xpath("//input[@type='radio'][@value='Female']");;
    @FindBy(xpath = "//input[@type='radio'][@value='Female']")
    private WebElement genderFemaleRadio;

    //private By country1Select = By.id("countries");
    //private By country2Select = By.id("country");

    //private By submitButton = By.id("submitbtn");
    @FindBy(id = "submitbtn")
    private WebElement submitButton;




}
