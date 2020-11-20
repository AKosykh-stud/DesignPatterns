package com.company;

public class MessageServiceAdapter implements IMessageServiceAdapter {

    private MessageService _messageService;

    public MessageServiceAdapter(MessageService messageService) {
        _messageService = messageService;
    }

    public String AddAuthorToMessage(String message, String author) {
        var newMessage = _messageService.AddDateToMessage(message);

        return newMessage + " " + "{" + author + "}";
    }
}
