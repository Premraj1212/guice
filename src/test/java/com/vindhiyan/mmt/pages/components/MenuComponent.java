package com.vindhiyan.mmt.pages.components;

import com.vindhiyan.models.booking.BookingType;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class MenuComponent extends BasePage {

    @FindBy(css = "li[data-cy^=\"menu\"]")
    private List<WebElement> menuItems;

    @Step("Navigating to menu {bookingType}")
    public BookingPlannerComponent navToMenu(BookingType bookingType) {
        init(this);
        click(findMenuItem(bookingType.name()), bookingType.name().toLowerCase());
        return getPage(BookingPlannerComponent.class);
    }
    public BookingPlannerComponent navToFlights() {
        return navToMenu(BookingType.FLIGHTS);
    }

    public BookingPlannerComponent navToHotels() {
        return navToMenu(BookingType.HOTELS);
    }

    private WebElement findMenuItem(String menuItem) {
        return findFromList(menuItems, "data-cy", menuItem).findElement(By.tagName("a"));
    }
}
