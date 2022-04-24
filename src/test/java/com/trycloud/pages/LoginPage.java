package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement LogInBTN;

    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(css = ".warning")
    public WebElement warningMessage;


    public void logInWithSuccess() {
        this.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        this.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        this.LogInBTN.click();
    }

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        userInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
    }

}
