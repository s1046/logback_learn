package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * message 含有billing的的消息不会打印
 */
public class ConditionTest {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("chapters.introduction.chapters.introduction.HelloWorld1");
        logger.info("this is one");
        logger.info("this is one");
        logger.info("this is one");
        logger.info("this is one");
        logger.info("this is one");
        logger.info("this is one");
        logger.info("this is billing");
        logger.info("this is after");

    }
}
