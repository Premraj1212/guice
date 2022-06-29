package com.vindhiyan.drivers.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeadspinConfig {
    private String url;
    private Capabilities caps;

    @Getter @Setter
    public static class Capabilities {
        private String browserName;
        private String browserVersion;
        private ScreenSize screenSize;

    }

    @Getter @Setter
    public static class ScreenSize {
        private int width;
        private int height;
    }


}
