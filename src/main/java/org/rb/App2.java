package org.rb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class App2 {
    private static  final Logger logger = LogManager.getLogger();
    String someString = null;
    public void fromApp2() throws InterruptedException {

          /*  logger.trace("This is trace");
            logger.debug("This is debug");
            logger.info("This is info");
            logger.warn("This is warn");
            logger.error("This is error");
            logger.fatal("This is fatal ");*/

            TimeUnit.SECONDS.sleep(5);
            boolean b = someString.contains("somrhin");

    }

}
