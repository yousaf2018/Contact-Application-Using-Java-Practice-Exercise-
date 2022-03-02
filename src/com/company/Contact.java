package com.company;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String number;
    private String email;
    private ArrayList<Message> allMessages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Message> getAllMessages() {
        return allMessages;
    }

    public void setAllMessages(ArrayList<Message> messages) {
        this.allMessages = messages;
    }

    public Contact(String name, String number, String email, ArrayList<Message> messages) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.allMessages = messages;
    }

    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.allMessages = new ArrayList<>();
    }
    public void getDetails(){
        System.out.println("Name: "+name +
                "\nNumber: "+number+
                "\nEmail: "+email);
    }
}
