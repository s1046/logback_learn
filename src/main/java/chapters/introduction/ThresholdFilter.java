package chapters.introduction;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *  只会打印比阈值高的信息
 * .The ThresholdFilter filters events below the specified threshold.
 * For events of level equal or above the threshold,
 * ThresholdFilter will respond NEUTRAL when its decide() method is invoked.
 * However, events with a level below the threshold will be denied.
 * Here is a sample configuration file.
 */

public class ThresholdFilter {

    public static void main(String[] args) {


        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        Logger logger= LoggerFactory.getLogger(ThresholdFilter.class);


        logger.trace("this is trace");

        logger.debug("this is debug");

        logger.info("this is info");

        logger.error("this is error");


    }
}
