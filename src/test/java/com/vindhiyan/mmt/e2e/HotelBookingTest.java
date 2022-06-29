package com.vindhiyan.mmt.e2e;

import com.google.inject.Inject;
import com.vindhiyan.BaseTest;
import com.vindhiyan.TestGroups;
import com.vindhiyan.mmt.pages.HomePage;
import com.vindhiyan.models.Customer;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static com.vindhiyan.pages.PageInitiator.getPage;

@Test(groups = TestGroups.HACKATHON)
@Epic("Booking")
@Feature("Book any hotel")
public class HotelBookingTest extends BaseTest {

    @Inject
    Customer customerProvider;

    @Description("Book a hotel using valid customer booking details")
    public void customerShouldBeAbleToBookAHotel() throws InterruptedException {
        HomePage homePage = getPage(HomePage.class);
        Customer customer = customerProvider.init();
        homePage.getUserSectionComponent()
                .navToLogin()
                .login(customer.getCredentials())
                .getMenuComponent()
                .navToMenu(customer.getBookingDetails().getBookingType())
                .getBookingPlannerComponent(customer.getBookingDetails().getBookingType())
                .makeBooking(customer.getBookingDetails().getBookingType().getBookingPlanner())
                .applyFilters(customer.getBookingDetails().getBookingFilters())
                .selectListing(customer.getBookingDetails())
                .bookNow(customer.getBookingDetails());

    }
}
