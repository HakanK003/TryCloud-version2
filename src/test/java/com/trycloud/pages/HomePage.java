package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

//    public HomePage(){
//        PageFactory.initElements(Driver.getDriver(), this);
//    }


    @FindBy(css = "div[class='full-name']")
    public List<WebElement> contactList;


}
