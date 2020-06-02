package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Note that the above example does not reference any logback classes.
 * In most cases, as far as logging is concerned,
 * your classes will only need to import SLF4J classes.
 * Thus, the vast majority, if not all, of your classes will use the SLF4J API
 * and will be oblivious(不知道) to the existence of logback.
 *
 */
public class HelloWorld1 {

  public static void main(String[] args) {

    Logger logger = LoggerFactory.getLogger("chapters.introduction.chapters.introduction.HelloWorld1");
    logger.debug("Hello world.");

  }
}