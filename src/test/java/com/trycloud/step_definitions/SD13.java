package com.trycloud.step_definitions;

import com.trycloud.pages.HomePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SD13 {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();



    @Given("{string} is log in and user is on the dashboard page")
    public void is_log_in_and_user_is_on_the_dashboard_page(String username) {

        Driver.getDriver().get( ConfigurationReader.getProperty("environment") );

//        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys( ConfigurationReader.getProperty("password") );
        loginPage.LogInBTN.click();

    }

    @When("User clicks the contact module")
    public void user_clicks_the_contact_module() {

//        HomePage homePage = new HomePage();

 //       homePage.contactButton.click();

        BrowserUtils.waitForVisibility(By.cssSelector("div[class='full-name']"), 10);

    }

    @Then("Verify the contact names in the list")
    public void verify_the_contact_names_in_the_list() {

//        HomePage homePage = new HomePage();
//        HomePage homePage = new HomePage();

        Assert.assertTrue("Contact list doesn't contains at least 2 person", homePage.contactList.size()>=2);

        for (WebElement each : homePage.contactList) {

            System.out.println(each.getText());

        }

    }


}
