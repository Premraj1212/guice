package com.vindhiyan.herokuapp.loginform;

import com.google.inject.Inject;
import com.vindhiyan.BaseTest;
import com.vindhiyan.TestGroups;
import com.vindhiyan.herokuapp.pages.HerokuHomePage;
import com.vindhiyan.models.HerokuCustomer;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static com.vindhiyan.pages.PageInitiator.getPage;


@Test(groups = TestGroups.SMOKE)
@Epic("LoginForm")
@Feature("Login to heroku application")
public class LoginFormTest extends BaseTest {

    @Inject
    HerokuCustomer herokuCustomer;

    @Description("Login to heroku application successfully")
    public void customerShouldBeAbleLoginToHerokuApp(){
        HerokuHomePage homePage = getPage(HerokuHomePage.class);
        HerokuCustomer customer = herokuCustomer.init();
        homePage.getLoginFormComponent()
                .navToLoginForm()
                .login(customer.getLoginCredentials())
                .assertCustomerSuccessfullyLoggedIn();
    }
}
