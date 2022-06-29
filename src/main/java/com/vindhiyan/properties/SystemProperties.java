package com.vindhiyan.properties;


import com.vindhiyan.drivers.Browser;
import com.vindhiyan.drivers.Target;

public final class SystemProperties {
    private static final String DEFAULT_ENV = System.getProperty("defaultEnv", "dev");
    public static final String ENV = System.getProperty("env", DEFAULT_ENV);
    public static final String TARGET = System.getProperty("target", Target.UI.name().toLowerCase());
    public static final String BROWSER = System.getProperty("browser", Browser.CHROME.name().toLowerCase());
}
