package dev.nklab.example;

import org.apache.logging.log4j.LogManager;

public class MyLib {
    public static void log(String msg) {
        var logger = LogManager.getLogger();
        logger.error(msg);
    }
}
