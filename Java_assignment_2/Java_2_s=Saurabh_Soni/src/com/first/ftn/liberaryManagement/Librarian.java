package com.first.ftn.liberaryManagement;

public class Librarian implements Person {
    String librarianName;
    int librarianID;

    Librarian(String name, int id) {
        this.librarianName = name;
        this.librarianID = id;
    }

    // Interface method definition
    public void getPerson() {
        System.out.println("Name: " + librarianName);
        System.out.println("ID: " + librarianID);
    }
}
