package com.vindhiyan.herokuapp.pages;

import com.vindhiyan.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class SecureAreaPage extends BasePage<SecureAreaPage> {

    @FindBy(id = "flash")
    private WebElement flashMsg;

    public void assertCustomerSuccessfullyLoggedIn(){
        assertThat(get_text_exclude_children(flashMsg).trim())
                .isEqualTo("You logged into a secure area!");
    }
}
