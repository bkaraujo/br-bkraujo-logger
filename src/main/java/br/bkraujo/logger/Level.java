package br.bkraujo.logger;

public enum Level {
    FATAL("\033[1;91m"),
    ERROR("\033[1;91m"),
    WARN("\033[1;93m"),
    INFO("\033[1;92m"),
    DEBUG("\033[1;94m"),
    TRACE("\033[1;95m");

    public String color;
    Level(String color) {
        this.color = color;
    }
}
