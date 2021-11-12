package Loggers;

import org.testng.annotations.Test;

import java.util.logging.Logger;

public class MainLog {

private static final Logger logger = Logger.getGlobal();
    @Test
    public static void Logger (String[] args) throws Exception {
  logger.info("hello");

    }

}
