package com.first.ftn.liberaryManagement;

import java.util.ArrayList;

public class Library {
    private String libraryLocation;
    private ArrayList<Book> booksInLibrary;
    private ArrayList<Member> membersOfLibrary;
    private Librarian librarian;

    public String getLibraryLocation()
    {
        return libraryLocation;
    }

    public void setLibraryLocation(String libraryLocation)
    {
        this.libraryLocation = libraryLocation;
    }

    public ArrayList<Book> getBooksInLibrary()
    {
        return booksInLibrary;
    }

    public void setBooksInLibrary(ArrayList<Book> booksInLibrary)
    {
        this.booksInLibrary = booksInLibrary;
    }

    public ArrayList<Member> getMembersOfLibrary()
    {
        return membersOfLibrary;
    }

    public void setMembersOfLibrary(ArrayList<Member> membersOfLibrary)
    {
        this.membersOfLibrary = membersOfLibrary;
    }

    public Librarian getLibrarian()
    {
        return librarian;
    }

    public void setLibrarian(Librarian librarian)
    {
        this.librarian = librarian;
    }

    void getLibraryDetails() {
        System.out.println("_________________________LIBRARY DETAILS__________________________");
        System.out.println("LOCATION: " + libraryLocation);
        System.out.println("LIBRARIAN:_______________");
        librarian.getPerson();
        System.out.println("MEMBERS:__________________");
        for (Member m : membersOfLibrary)
            m.getPerson();
        System.out.println("BOOKS:____________________");
        for (Book b : booksInLibrary)
            b.getBookDetails();
    }
}