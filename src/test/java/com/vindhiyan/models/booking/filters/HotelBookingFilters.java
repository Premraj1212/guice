package com.vindhiyan.models.booking.filters;


import com.vindhiyan.models.Entity;
import com.vindhiyan.models.booking.BookingFilters;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true) @NoArgsConstructor
@AllArgsConstructor
public class HotelBookingFilters extends BookingFilters implements Entity<HotelBookingFilters> {
    private PricePerNightFilter pricePerNightFilter;
    private UserRatingFilter userRatingFilter;

    @Override
    public HotelBookingFilters init() {
        return this.toBuilder()
                .pricePerNightFilter(new PricePerNightFilter().init())
                .userRatingFilter(new UserRatingFilter().init())
                .build();
    }
}
