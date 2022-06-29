package com.vindhiyan.herokuapp.pages.components;

import com.vindhiyan.herokuapp.pages.LoginFormPage;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class LoginFormComponent extends BasePage<LoginFormComponent> {

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthentication;


    @Step("Navigating to login")
    public LoginFormPage navToLoginForm(){
        click(formAuthentication, "Login Form");
        return getPage(LoginFormPage.class);
    }
}
