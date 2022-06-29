package com.vindhiyan.herokuapp.pages;

import com.vindhiyan.herokuapp.pages.components.LoginFormComponent;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class HerokuHomePage extends BasePage<HerokuHomePage> {

    @Step("Navigating to LoginForm section")
    public LoginFormComponent getLoginFormComponent(){
        log("navigates to LoginForm section");
        return getPage(LoginFormComponent.class);
    }

}
