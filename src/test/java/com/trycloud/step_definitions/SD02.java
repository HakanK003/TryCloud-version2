package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SD02 {

    LoginPage loginPage = new LoginPage();
    @When("When user enter invalid {string} and {string}")
    public void when_user_enter_invalid_and(String string, String string2) {
        loginPage.userInput.sendKeys(string);
        loginPage.passwordInput.sendKeys(string2);
        loginPage.loginBtn.click();
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        Assert.assertEquals(string,loginPage.warningMessage.getText());
    }

}
