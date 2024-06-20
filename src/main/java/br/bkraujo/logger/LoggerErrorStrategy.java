package br.bkraujo.logger;

class LoggerErrorStrategy extends Strategy {

    @Override
    public void error(String message, Object... args) {
        write(Level.ERROR, message, args);
    }
}
