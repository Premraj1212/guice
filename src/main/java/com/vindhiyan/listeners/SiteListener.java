package com.vindhiyan.listeners;

import com.google.inject.Injector;
import com.vindhiyan.clients.SiteClient;
import com.vindhiyan.io.LogWriter;
import com.vindhiyan.modules.PropertyModule;
import com.vindhiyan.modules.SiteModule;
import com.vindhiyan.site.Constants;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import java.util.logging.Logger;

import static com.vindhiyan.reports.ReportLogger.log;

public class SiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        Injector siteInjector = suite.getParentInjector().createChildInjector(new SiteModule(), new PropertyModule());
        Logger logger = siteInjector.getInstance(Logger.class);
        log("Verifying if site is up");
        siteInjector.getInstance(SiteClient.class).terminateIfSiteIsDown();
        String logFolder = siteInjector.getInstance(LogWriter.class).createLogFolder();
        suite.setAttribute(Constants.LOG_FOLDER, logFolder);
    }
}
