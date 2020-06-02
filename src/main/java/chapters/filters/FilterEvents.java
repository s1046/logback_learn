package chapters.filters;

 import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.slf4j.MDC;
 import org.slf4j.Marker;
 import org.slf4j.MarkerFactory;
 import ch.qos.logback.classic.LoggerContext;
 import ch.qos.logback.classic.joran.JoranConfigurator;
 import ch.qos.logback.core.joran.spi.JoranException;

public class FilterEvents {

    public static void main(String[] args) throws InterruptedException {


        //buildTest("common.xml");

        //buildTest("basicEventEvaluator.xml");

        //buildTest("evaluatorWithMatcher.xml");

       // buildTest("turboFilters.xml");

        //buildTest("duplicateMessage.xml");

        buildTest("logback-access.xml");



    }


    public  static void buildTest(String fileName){
      String  path= FilterEvents.class.getResource("/filters").getPath()+"/"+fileName;

        Logger logger = (Logger) LoggerFactory.getLogger(FilterEvents.class);
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

        try {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(lc);
            lc.reset();
            configurator.doConfigure(path);
        } catch (JoranException je) {
            je.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                MDC.put("username", "sebastien");
                logger.debug("logging statement {}", i);
                MDC.remove("username");
            } else if (i == 6) {
                Marker billing = MarkerFactory.getMarker("billing");
                logger.error(billing, "billing statement {}", i);
            } else {
                logger.info("logging statement {}", i);
            }
        }


    }
}