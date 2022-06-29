package com.vindhiyan.mmt.pages;

import com.vindhiyan.mmt.pages.components.MenuComponent;
import com.vindhiyan.mmt.pages.components.UserSectionComponent;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;
import lombok.Setter;

import static com.vindhiyan.pages.PageInitiator.getPage;

@Setter
public class HomePage extends BasePage<HomePage> {

    @Step("Navigating to user section")
    public UserSectionComponent getUserSectionComponent() {
        log("navigates to user section");
        return getPage(UserSectionComponent.class);
    }

    @Step("Navigating to menu section")
    public MenuComponent getMenuComponent() {
        log("navigates to menu section");
        return getPage(MenuComponent.class);
    }
}
