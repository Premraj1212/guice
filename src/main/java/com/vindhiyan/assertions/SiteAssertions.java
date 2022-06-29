package com.vindhiyan.assertions;

import com.google.inject.Inject;
import com.vindhiyan.models.Site;

import static com.vindhiyan.reports.ReportLogger.log;
import static org.assertj.core.api.Assertions.assertThat;

public class SiteAssertions {
    @Inject
    Site expSiteDetails;


    public void assertThatSiteIsLoadedSuccessfully(Site siteDetails) {
        assertThat(siteDetails.equals(expSiteDetails.get())).isTrue();
        log("Site is loaded correctly");
    }
}
