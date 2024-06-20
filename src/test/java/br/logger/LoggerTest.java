package br.logger;

import br.bkraujo.logger.Level;
import br.bkraujo.logger.Logger;
import org.junit.jupiter.api.Test;

class LoggerTest {

    @Test
    public void testLevelTrace() {
        Logger.level(Level.TRACE);
        Logger.trace("message");
        Logger.debug("message");
        Logger.info("message");
        Logger.warn("message");
        Logger.error("message");
    }

    @Test
    public void testLevelDebug() {
        Logger.level(Level.DEBUG);
        Logger.trace("message");
        Logger.debug("message");
        Logger.info("message");
        Logger.warn("message");
        Logger.error("message");
    }

    @Test
    public void testLevelInfo() {
        Logger.level(Level.INFO);
        Logger.trace("message");
        Logger.debug("message");
        Logger.info("message");
        Logger.warn("message");
        Logger.error("message");
    }

    @Test
    public void testLevelWarn() {
        Logger.level(Level.WARN);
        Logger.trace("message");
        Logger.debug("message");
        Logger.info("message");
        Logger.warn("message");
        Logger.error("message");
    }

    @Test
    public void testLevelError() {
        Logger.level(Level.ERROR);
        Logger.trace("message");
        Logger.debug("message");
        Logger.info("message");
        Logger.warn("message");
        Logger.error("message");
    }

}