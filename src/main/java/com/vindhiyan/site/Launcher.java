package com.vindhiyan.site;

import com.vindhiyan.pages.LaunchPage;

import static com.vindhiyan.pages.PageInitiator.getPage;

public class Launcher {

    public void launch() {
        LaunchPage launchPage = getPage(LaunchPage.class);
        launchPage.launch();
        launchPage.getSiteDetails().assertThatSiteIsUp();
    }
}
