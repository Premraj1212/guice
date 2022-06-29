package com.vindhiyan.models.booking;

import com.vindhiyan.models.booking.filters.FlightBookingFilters;
import com.vindhiyan.models.booking.filters.HotelBookingFilters;
import com.vindhiyan.models.booking.planner.FlightBookingPlanner;
import com.vindhiyan.models.booking.planner.HotelBookingPlanner;

public enum BookingType {
    FLIGHTS(new FlightBookingPlanner().init(), new FlightBookingFilters().init()),
    HOTELS(new HotelBookingPlanner().init(), new HotelBookingFilters().init());

    private BookingPlanner bookingPlanner;
    private BookingFilters bookingFilters;

    BookingType(BookingPlanner bookingPlanner, BookingFilters bookingFilters) {
        this.bookingPlanner = bookingPlanner;
        this.bookingFilters = bookingFilters;
    }

    public BookingPlanner getBookingPlanner() {
        return bookingPlanner;
    }

    public BookingFilters getBookingFilters() {
        return bookingFilters;
    }
}
