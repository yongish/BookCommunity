package com.zhiyong.findbooks.models;

/**
 * Created by zhiyong on 9/12/16.
 */
public class Book {
    public long isbn10;
    public long isbn13;
    public String title;
    public String author;

    public Book(long isbn, boolean isISBN13) {
        if (isISBN13) this.isbn13 = isbn;
        else this.isbn10 = isbn;

        // TODO: Lookup corresponding ISBN and other missing details.
    }

    public String getTitle() { return title; }
    public String getAuthor(){ return author; }
    public Long getIsbn10() { return isbn10; }
    public Long getIsbn13() { return isbn13; }
}
