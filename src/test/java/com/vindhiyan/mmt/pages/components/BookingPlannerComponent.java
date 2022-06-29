package com.vindhiyan.mmt.pages.components;

import com.google.inject.Inject;
import com.vindhiyan.mmt.pages.ListingPage;
import com.vindhiyan.mmt.pages.components.planner.HotelBookingPlannerComponent;
import com.vindhiyan.models.booking.BookingPlanner;
import com.vindhiyan.models.booking.BookingType;
import com.vindhiyan.pages.BasePage;
import io.qameta.allure.Step;

import java.util.HashMap;
import java.util.Map;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class BookingPlannerComponent extends BasePage<BookingPlannerComponent> {



    @Inject
    private HotelBookingPlannerComponent hotelBookingPlannerComponent;

    @Step("Navigating to booking planner")
    public BookingPlannerComponent getBookingPlannerComponent(BookingType bookingType) {
        return bookingPlannerComponents().get(bookingType);
    }

    public ListingPage makeBooking(BookingPlanner bookingPlanner) {
        throw new UnsupportedOperationException();
    }


    public Map<BookingType, BookingPlannerComponent> bookingPlannerComponents() {
        Map<BookingType, BookingPlannerComponent> bookingPlannerComponentMap = new HashMap<>();
        bookingPlannerComponentMap.put(BookingType.HOTELS, getPage(HotelBookingPlannerComponent.class));
        return bookingPlannerComponentMap;
    }
}
