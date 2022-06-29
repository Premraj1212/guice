package com.vindhiyan.modules;

import com.google.inject.AbstractModule;
import com.vindhiyan.drivers.Browser;
import com.vindhiyan.drivers.Target;
import com.vindhiyan.drivers.browserManager.ChromeDriverManager;
import com.vindhiyan.drivers.browserManager.FirefoxDriverManager;
import com.vindhiyan.drivers.browserManager.HeadSpinDriverManager;
import com.vindhiyan.drivers.wait.Waits;
import com.vindhiyan.properties.SystemProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserModule extends AbstractModule {

    @Override
    public void configure() {
        if(SystemProperties.TARGET.equals(Target.HEADSPIN.name().toLowerCase())) {
            bind(WebDriver.class).toProvider(HeadSpinDriverManager.class).asEagerSingleton();
        }else {
            bind(WebDriver.class).toProvider(getBrowserManager()).asEagerSingleton();
        }
        bind(WebDriverWait.class).toProvider(Waits.class).asEagerSingleton();
    }


    private Class getBrowserManager() {
        Browser browser = Browser.valueOf(SystemProperties.BROWSER.toUpperCase());
        return browserProviderMap().get(browser);
    }

    private Map<Browser, Class> browserProviderMap() {
        Map<Browser, Class> browserProviderMap = new LinkedHashMap<>();
        browserProviderMap.put(Browser.CHROME, ChromeDriverManager.class);
        browserProviderMap.put(Browser.FIREFOX, FirefoxDriverManager.class);
        return browserProviderMap;
    }
}
