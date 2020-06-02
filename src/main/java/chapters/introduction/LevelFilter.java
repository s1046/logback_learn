package chapters.introduction;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 配置了LevelFilter 此filter只会打印info
 *
 * LevelFilter filters events based on exact level matching.
 * If the event's level is equal to the configured level,
 * the filter accepts or denies the event,
 * depending on the configuration of the onMatch and onMismatch properties.
 */

public class LevelFilter {

    public static void main(String[] args) {


        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        Logger logger= LoggerFactory.getLogger(LevelFilter.class);


        logger.trace("this is trace");

        logger.debug("this is debug");

        logger.info("this is info");

        logger.error("this is error");


    }
}
