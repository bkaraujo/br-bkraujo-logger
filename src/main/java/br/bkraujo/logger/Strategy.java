package br.bkraujo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Strategy {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss,SSS");

    protected Strategy() {}

    public void trace(String message, Object ... args) {}
    public void debug(String message, Object ... args) {}
    public void warn(String message, Object ... args) {}
    public void info(String message, Object ... args) {}
    public void error(String message, Object ... args) {}
    public void fatal(String message, Object ... args) {
        write(Level.FATAL, message, args);
        System.exit(99);
    }

    protected static void write(Level level, String message, Object ... args) {
        final var now = LocalDateTime.now();
        final var frame = StackWalker
                .getInstance()
                .walk(s -> s.skip(3).findFirst())
                .get();

        System.out.printf("%s%s %-5s %s:%d - %s\033[0m%n",
                level.color,
                formatter.format(now),
                level.name(),
                frame.getClassName(),
                frame.getLineNumber(),
                message.formatted(args)
        );
    }
}
