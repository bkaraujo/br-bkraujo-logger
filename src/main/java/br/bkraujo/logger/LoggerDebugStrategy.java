package br.bkraujo.logger;

class LoggerDebugStrategy extends LoggerInfoStrategy {

    @Override
    public void debug(String message, Object... args) {
        write(Level.DEBUG, message, args);
    }

}
