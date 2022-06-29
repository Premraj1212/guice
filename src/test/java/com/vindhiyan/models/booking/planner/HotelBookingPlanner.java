package com.vindhiyan.models.booking.planner;

import com.vindhiyan.models.booking.BookingPlanner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HotelBookingPlanner extends BookingPlanner {
    private String searchFor;
    private int rooms;
    private int guests;

    @Override
    public HotelBookingPlanner init() {
        BookingPlanner basePlanner = super.init();
        this.setSearchFor("Bengaluru,Karnataka,India");
        this.setGuests(2);
        this.setRooms(2);
        this.setCheckin(basePlanner.getCheckin());
        this.setCheckout(basePlanner.getCheckout());
        this.setTravelingFor(basePlanner.getTravelingFor());
        return this;
    }
}
