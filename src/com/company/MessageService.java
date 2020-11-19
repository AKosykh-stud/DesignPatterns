package com.company;

import java.util.Date;

public class MessageService {

    public String AddDateToMessage(String message) {
        return "{" + new Date().toString() + "} " + message;
    }
}
