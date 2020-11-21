package com.company;

public class Main {

    public static void main(String[] args) {

        var logger = new Logger();
        logger.Log("First message");

        var loggerDecorator = new LoggerDecorator(logger);
        loggerDecorator.Log("Second message");
    }
}
