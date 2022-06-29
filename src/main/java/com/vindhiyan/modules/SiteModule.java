package com.vindhiyan.modules;

import com.google.inject.AbstractModule;
import com.vindhiyan.clients.SiteClient;

public class SiteModule extends AbstractModule {

    @Override
    public void configure() {
        bind(SiteClient.class).asEagerSingleton();
    }
}
