package com.company;

public class Main {

    public static void main(String[] args) {

        var service = new MessageService(); // Creates service instance
        service.AddDateToMessage("Message from original service"); // Adds date to our message

        var adapter = new MessageServiceAdapter(service); // Creates adapter instance
        var resultOfAdapting = adapter.AddAuthorToMessage("Message from adapted service", "Author_1"); // Adapts message by adding author name

        System.out.println(resultOfAdapting);
    }
}
