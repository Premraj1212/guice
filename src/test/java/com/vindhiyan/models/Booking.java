package com.vindhiyan.models;

import com.vindhiyan.models.booking.BookingFilters;
import com.vindhiyan.models.booking.BookingPlanner;
import com.vindhiyan.models.booking.BookingType;
import lombok.*;

import static org.assertj.core.api.Assertions.assertThat;

@Getter
@Setter
@Builder(toBuilder = true) @NoArgsConstructor
@AllArgsConstructor
public class Booking implements Entity<Booking> {
    private BookingType bookingType;
    private BookingPlanner bookingPlanner;
    private BookingFilters bookingFilters;
    private String hotelName;
    private String rating;

    @Override
    public Booking init() {
        BookingType bookingType = BookingType.HOTELS;
        return this.toBuilder()
                .bookingType(bookingType)
                .bookingPlanner(bookingType.getBookingPlanner())
                .bookingFilters(bookingType.getBookingFilters())
                .build();
    }

    public void assertHotelNameIsCorrect(String hotelName) {
        assertThat(this.hotelName).isEqualTo(hotelName);
    }
}
