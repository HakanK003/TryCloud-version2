package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SD04 {


    LoginPage loginPage=new LoginPage();
    BasePage basePage=new BasePage();
    FilesPage filesPage = new FilesPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        basePage.navigateToModule(string);
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        BrowserUtils.waitForClickablility(filesPage.firstCheckBox,5);
        filesPage.firstCheckBox.click();

    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        filesPage.allCheckBoxes.forEach(p-> Assert.assertTrue(p.getAttribute("class").contains("selected")));
    }


}
