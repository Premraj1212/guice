package com.vindhiyan.mmt.pages.components.filters;

import com.vindhiyan.mmt.pages.components.BookingFilterComponent;
import com.vindhiyan.models.booking.filters.PricePerNightFilter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class PricePerNightBookingFilterComponent extends BookingFilterComponent {

    @FindBy(css = "span[style $='left: 0%;'] div[class='input-range__slider']")
    private WebElement min;

    @FindBy(css = "span[style $='left: 100%;'] div[class='input-range__slider']")
    private WebElement max;

    public BookingFilterComponent applyPricePerNightFilter(PricePerNightFilter pricePerNightFilter) {
            setAttribute(min, "aria-valuenow", String.valueOf(pricePerNightFilter.getMoveBy()));
        return getPage(BookingFilterComponent.class);
    }
}
