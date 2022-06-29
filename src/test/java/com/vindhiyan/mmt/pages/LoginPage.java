package com.vindhiyan.mmt.pages;

import com.vindhiyan.models.Credentials;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class LoginPage extends BasePage<LoginPage> {

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(css = "button[data-cy='continueBtn']")
    private WebElement continueBtn;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "button[data-cy='login']")
    private WebElement loginBtn;

    @Step("Customer login with {credentials.username}")
    public HomePage login(Credentials credentials) {
        type(username, credentials.getUsername(), "username");
        click(continueBtn, "continue");
        type(password, credentials.getPassword(), "password");
        click(loginBtn, "login");
        sleep();
        return getPage(HomePage.class);
    }


}
