package com.rb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.rb.App2;

import java.util.concurrent.TimeUnit;

public class Application {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            while (true) {
                try {

                    new App2().fromApp2();

                } catch (Exception e) {
                    logger.error("Exception ", e);
                }
            }
        };
        Thread th = new Thread(r);
        th.start();

        while (true) {
            logger.trace("This is trace");
            logger.debug("This is debug");
            logger.info("This is info");
            logger.warn("This is warn");
            logger.error("This is error");
            logger.fatal("This is fatal ");
            TimeUnit.SECONDS.sleep(3);
        }
    }

}
