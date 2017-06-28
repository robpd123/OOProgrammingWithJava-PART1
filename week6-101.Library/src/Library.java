/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchList = new ArrayList<Book>();

        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)) {
                searchList.add(book);
            }
        }

        return searchList;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchList = new ArrayList<Book>();

        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                searchList.add(book);
            }
        }
        return searchList;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchList = new ArrayList<Book>();

        for (Book book : this.books) {
            if (book.year() == year) {
                searchList.add(book);
            }
        }
        return searchList;
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
}
