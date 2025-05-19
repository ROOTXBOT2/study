package org.study.Composition;

import java.util.ArrayList;

/**
 * @author rua
 */
public class Library {
    private ArrayList<Book> books;
    private String name;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(String author, String title) {
        Book book = new Book(author,title);
        books.add(book);
    }

    public void printBooks() {
        System.out.println(this.name+" 도서관");
        for(Book book : books) {
            System.out.println("책 제목: "+book.getTitle() + ", 지은이: "+book.getAuthor());
        }
    }
}
