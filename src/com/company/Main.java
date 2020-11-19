package com.company;

public class Main {

    public static void main(String[] args) {

        var service = new MessageService();
        service.AddDateToMessage("Message from original service");

        var adapter = new MessageServiceAdapter(service);
        var resultOfAdapting = adapter.AddAuthorToMessage("Message from adapted service", "Author_1");

        System.out.println(resultOfAdapting);
    }
}
