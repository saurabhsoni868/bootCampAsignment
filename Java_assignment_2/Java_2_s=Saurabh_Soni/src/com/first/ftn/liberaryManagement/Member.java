package com.first.ftn.liberaryManagement;

public class Member implements Person {
    String memberName;
    int memberID;

    Member(String name, int id) {
        memberName = name;
        memberID = id;
    }

    // Interface method definition
    public void getPerson() {
        System.out.println("Name of the Library member is : " + memberName);
        System.out.println("ID of the library member is: " + memberID);
    }

}