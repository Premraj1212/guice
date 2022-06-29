package com.vindhiyan;

import com.vindhiyan.mmt.pages.HomePage;
import com.vindhiyan.modules.PropertyModule;
import com.vindhiyan.modules.SiteModule;
import org.testng.annotations.Guice;

@Guice(modules = {SiteModule.class, PropertyModule.class})
public class BaseTest {


}
