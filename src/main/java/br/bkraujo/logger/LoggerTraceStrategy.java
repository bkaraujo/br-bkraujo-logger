package br.bkraujo.logger;

class LoggerTraceStrategy extends LoggerDebugStrategy {

    @Override
    public void trace(String message, Object... args) {
        write(Level.TRACE, message, args);
    }

}
