package com.zhiyong.findbooks.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zhiyong.findbooks.R;
import com.zhiyong.findbooks.adapters.BookArrayAdapter;
import com.zhiyong.findbooks.models.Book;

import java.util.ArrayList;

// For now, show book list.

public class HomeActivity extends AppCompatActivity {
    private ArrayList<Book> books;
    private BookArrayAdapter bookArrayAdapter;
    private RecyclerView rvBooks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupViews();

        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1034567890, false));
        books.add(new Book(1134567890, false));
        books.add(new Book(1234567890, false));
        books.add(new Book(1334567890, false));
        books.add(new Book(1434567890, false));
        books.add(new Book(1534567890, false));
        books.add(new Book(1634567890, false));
        books.add(new Book(1734567890, false));



        bookArrayAdapter.notifyDataSetChanged();
    }

    public void setupViews() {
        books = new ArrayList<>();
        bookArrayAdapter = new BookArrayAdapter(this, books);
        RecyclerView rvBooks = (RecyclerView) findViewById(R.id.rvBooks);
        bookArrayAdapter = new BookArrayAdapter(this, books);
        rvBooks.setAdapter(bookArrayAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvBooks.setLayoutManager(linearLayoutManager);

    }
}
