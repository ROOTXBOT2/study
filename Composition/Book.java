package org.study.Composition;

/**
 * @author rua
 */
public class Book {
    String author;
    String title;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
}
