package com.vindhiyan.mmt.pages;

import com.vindhiyan.models.Booking;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetailsPage extends DetailsPage {

    @FindBy(id = "detpg_hotel_name")
    private WebElement hotelName;

    @FindBy(id = "detpg_headerright_book_now")
    private WebElement bookNow;

    @Step("booking hotel now")
    public void bookNow(Booking booking) {
        sleep();
        waitForElementToBePresent(hotelName);
        String hotel = text(hotelName);
        booking.assertHotelNameIsCorrect(hotel);
        click(bookNow, "bookNow");
    }
}
