package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id = 0;
    public static void main(String[] args) {
        // write your code here
        contacts = new ArrayList<>();
        System.out.println("Welcome to java programming world with contact application\n");
        showInitialOptions();
    }
    private static void showInitialOptions(){
        System.out.println(
                "Please select one:"
                + "\n\t1. Manage contacts"
                + "\n\t2. Messages"
                + "\n\t3. Quit"

        );
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
            default:
                break;
        }

    }

    private static void manageContacts() {
        System.out.println(
                "Please select one:"
                        + "\n\t1. Show all contacts"
                        + "\n\t2. Add a new contact"
                        + "\n\t3. Search for new contact"
                        + "\n\t4. Delete contact"
                        + "\n\t5. Go back"

        );
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void deleteContact() {
        System.out.println("Enter name for deleting in the contact list\n");
        String name = scanner.next();
        boolean check = false;
        for(Contact c:contacts){
            if (c.getName().equals(name)){
                contacts.remove(c);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("Sorry there is no contact in the list\n");
            showInitialOptions();
        }
        else {
            showInitialOptions();
        }
    }

    private static void searchContact() {
        System.out.println("Enter name for searching in the contact list\n");
        String name = scanner.next();
        boolean check = false;
        for(Contact c:contacts){
            if (c.getName().equals(name)){
                c.getDetails();
                check = true;
            }
        }
        if (check == false){
            System.out.println("Sorry there is no contact in the list\n");
        }
    }

    private static void addNewContact() {
        System.out.println("Adding new contact please provide your details\n");
        System.out.println("Enter your contact name");
        String name = scanner.next();
        System.out.println("Enter your phone number");
        String number = scanner.next();
        System.out.println("Enter your email");
        String email = scanner.next();
        if(name.equals("") || number.equals("") || email.equals("")){
            System.out.println("Please enter your details correctly\n");
            addNewContact();
        }
        else {
            boolean check = false;
            for(Contact c: contacts){
                if(c.getName().equals(name)){
                    check = true;
                }
            }
            if(check == true){
                System.out.println("Sorry with same name contact is already exists\n");
                addNewContact();
            }
            Contact contact = new Contact(name, number, email);
            contacts.add(contact);
        }
        showInitialOptions();
    }

    private static void showAllContacts() {
        for (Contact c:contacts){
            c.getDetails();
        }
        showInitialOptions();
    }

    private static void manageMessages(){
        System.out.println(
                "Please select one:"
                        + "\n\t1. Send message"
                        + "\n\t2. Add a new contact"
                        + "\n\t5. Go back"

        );
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                sendMessage();
                break;
            case 2:
                addNewContact();
                break;
            default:
                showInitialOptions();
                break;
        }

    }

    private static void sendMessage() {
//        System.out.println("Enter name of where you want to send the message\n");
//        String name = scanner.next();
//        boolean check = false;
//        for( Contact c: contacts){
//            if(c.getName().equals(name)){
//                check = true;
//            }
//        }
//        if (check == false){
//            System.out.println("Sorry there is no such name exists\n");
//            sendMessage();
//        }
//        else{
//            System.out.println("Enter your text message\n");
//            String text = scanner.next();
//            id++;
//            Message message = new Message(text, name, id);
//            for(Contact c: contacts){
//                if(c.getName().equals(name)){
//                    ArrayList<Message> messages = new c.getAllMessages();
//                }
//            }
//        }

    }

    }
