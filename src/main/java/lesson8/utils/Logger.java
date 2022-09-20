package lesson8.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class Logger {

  private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Logger.class);

  private Logger() {
    throw new IllegalStateException("Utility Logger class");
  }

  public static void info(String message) {
    logger.info(message);
  }

  public static void restrictNettyLogger() {
    LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
    Configuration config = ctx.getConfiguration();
    LoggerConfig loggerConfig = config.getLoggerConfig("io.netty.logging.LoggingHandler");
    loggerConfig.setLevel(Level.INFO);
    ctx.updateLoggers();
  }
}
