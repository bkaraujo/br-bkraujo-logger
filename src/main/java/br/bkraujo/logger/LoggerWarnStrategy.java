package br.bkraujo.logger;

class LoggerWarnStrategy extends LoggerErrorStrategy {

    @Override
    public void warn(String message, Object... args) {
        write(Level.WARN, message, args);
    }

}
