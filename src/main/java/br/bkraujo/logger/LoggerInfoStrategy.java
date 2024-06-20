package br.bkraujo.logger;

class LoggerInfoStrategy extends LoggerWarnStrategy {

    @Override
    public void info(String message, Object... args) {
        write(Level.INFO, message, args);
    }

}
