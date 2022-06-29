package com.vindhiyan.pages;

import com.google.inject.Injector;
import com.vindhiyan.site.Constants;
import org.testng.Reporter;

public class PageInitiator {

    public static <T extends BasePage> T getPage(Class<T> tClass) {
        Injector pageInjector = (Injector) Reporter.getCurrentTestResult()
                .getAttribute(Constants.PAGE_INJECTOR);
        T page = pageInjector.getInstance(tClass);
        return (T) page.init(page);
    }
}
