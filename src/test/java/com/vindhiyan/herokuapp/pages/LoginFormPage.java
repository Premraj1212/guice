package com.vindhiyan.herokuapp.pages;

import com.vindhiyan.models.Credentials;
import com.vindhiyan.models.LoginCredentials;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class LoginFormPage extends BasePage<LoginFormPage> {

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(className = "radius")
    private WebElement loginBtn;

    @Step("Customer login with {credentials.username}")
    public SecureAreaPage login(LoginCredentials credentials){
        type(userName, credentials.getUsername(), "username");
        type(password, credentials.getPassword(), "password");
        click(loginBtn, "login");
       return getPage(SecureAreaPage.class);
    }
}
