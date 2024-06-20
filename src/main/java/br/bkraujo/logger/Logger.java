package br.bkraujo.logger;

import java.util.HashMap;
import java.util.Map;

public abstract class Logger {
    private Logger(){}

    private static Strategy strategy;
    private static final Map<Level, Strategy> strategies = new HashMap<>();

    static {
        strategies.put(Level.FATAL, new Strategy());
        strategies.put(Level.ERROR, new LoggerErrorStrategy());
        strategies.put(Level.WARN, new LoggerWarnStrategy());
        strategies.put(Level.INFO, new LoggerInfoStrategy());
        strategies.put(Level.DEBUG, new LoggerDebugStrategy());
        strategies.put(Level.TRACE, new LoggerTraceStrategy());


        strategy = strategies.get(Level.INFO);
    }

    private static Level level = Level.INFO;
    public static Level level() { return level; }
    public static void level(Level desired) {
        if (desired == null) return;

        level = desired;
        strategy = strategies.get(level);
    }

    public static void fatal(String message, Object ... args) { strategy.fatal(message, args); }
    public static void error(String message, Object ... args) { strategy.error(message, args); }
    public static void warn(String message, Object ... args) { strategy.warn(message, args); }
    public static void info(String message, Object ... args) { strategy.info(message, args); }
    public static void debug(String message, Object ... args) { strategy.debug(message, args); }
    public static void trace(String message, Object ... args) { strategy.trace(message, args); }

}
