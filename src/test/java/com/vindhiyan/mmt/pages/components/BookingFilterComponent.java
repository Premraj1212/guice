package com.vindhiyan.mmt.pages.components;

import com.vindhiyan.mmt.pages.components.filters.PricePerNightBookingFilterComponent;
import com.vindhiyan.mmt.pages.components.filters.UserRatingBookingFilterComponent;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class BookingFilterComponent extends BasePage<BookingFilterComponent> {

    @Step("Adding price per night filter")
    public PricePerNightBookingFilterComponent getPricePerNightBookingFilterComponent() {
        return getPage(PricePerNightBookingFilterComponent.class);
    }

    @Step("Adding user rating filter")
    public UserRatingBookingFilterComponent getUserRatingBookingFilterComponent() {
        return getPage(UserRatingBookingFilterComponent.class);
    }
}
