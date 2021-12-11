package dev.nklab.example;

import org.apache.logging.log4j.LogManager;

public class App {
    public static void main(String[] args) {
        var logger = LogManager.getLogger();
        logger.error("Hello Log4j2");
    }
}
