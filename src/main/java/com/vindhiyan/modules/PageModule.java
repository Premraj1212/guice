package com.vindhiyan.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.vindhiyan.annotations.Screenshot;
import com.vindhiyan.interceptors.screenshot.ScreenshotInterceptor;
import com.vindhiyan.interceptors.screenshot.ScreenshotTaker;

import static com.google.inject.matcher.Matchers.annotatedWith;
import static com.google.inject.matcher.Matchers.any;

public class PageModule extends AbstractModule {

    @Inject
    ScreenshotTaker screenshotTaker;

    @Override
    public void configure() {
        ScreenshotInterceptor screenshotInterceptor = new ScreenshotInterceptor();
        requestInjection(screenshotInterceptor);
        bindInterceptor(any(), annotatedWith(Screenshot.class), screenshotInterceptor);
    }
}
