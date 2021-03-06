package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SD08 {

    FilesPage filesPage = new FilesPage();
    String beforeDeleteFolderText;

    @And("user choose the {string} option")
    public void userChooseTheOption(String str) {
        beforeDeleteFolderText=filesPage.chosenFolderForDelete.getText();
        filesPage.actionIconSubOptionsNavigate(str);
//        BrowserUtils.waitForClickablility(filesPage.deleteFolderBtn,5);
//        BrowserUtils.highlight(filesPage.deleteFolderBtn);
//        BrowserUtils.clickWithTimeOut(filesPage.deleteFolderBtn,5);
    }

    @When("the user clicks the {string} sub-module")
    public void the_user_clicks_the_sub_module(String string) {
        BrowserUtils.waitForClickablility(filesPage.deletedFilesModule,5);
        filesPage.deletedFilesModule.click();
        BrowserUtils.waitForPageToLoad(5);
    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        BrowserUtils.scrollToElement(filesPage.deletedFilesFoldersList.get(filesPage.deletedFilesFoldersList.size()-1));
        BrowserUtils.sleep(10);
        String afterDeleteFolderMovesToDeletedFilesText=filesPage.deletedFilesFoldersList.get(filesPage.deletedFilesFoldersList.size()-1).getText();
        Assert.assertEquals(beforeDeleteFolderText,afterDeleteFolderMovesToDeletedFilesText);

        BrowserUtils.scrollToElement(filesPage.restoreBtn.get(filesPage.restoreBtn.size()-1));
        BrowserUtils.waitForClickablility(filesPage.restoreBtn.get(filesPage.restoreBtn.size()-1),5);
        BrowserUtils.highlight(filesPage.restoreBtn.get(filesPage.restoreBtn.size()-1));
        filesPage.restoreBtn.get(filesPage.restoreBtn.size()-1).click();

    }


}
