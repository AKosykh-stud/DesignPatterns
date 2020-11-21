package com.company;

import java.util.Date;

public class Logger implements ILogger {

    public Logger() {

    }

    public void Log(String message) {
        System.out.println(message + " | " + new Date().toString());
    }
}
