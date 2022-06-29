package com.vindhiyan.mmt.pages;

import com.vindhiyan.models.Booking;
import com.vindhiyan.models.booking.BookingFilters;
import com.vindhiyan.pages.BasePage;

public class ListingPage extends BasePage<HotelListingPage> {

    public ListingPage applyFilters(BookingFilters filter) {
        throw new UnsupportedOperationException();
    }

    public DetailsPage selectListing(Booking booking) {
        throw new UnsupportedOperationException();
    }
}
