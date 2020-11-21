package com.company;

public class LoggerDecorator implements ILogger {
    private ILogger _logger;

    public LoggerDecorator(ILogger logger) {
        _logger = logger;
    }

    public void Log(String message) {
        _logger.Log(message + " Message from Decorator");

    }
}
