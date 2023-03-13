package com.example.quan_ly_sach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FindBookActivity extends AppCompatActivity {
    private RecyclerView rcvBook;
    private BookAdapter mBookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_book);
        rcvBook = findViewById(R.id.rcv_book);
        mBookAdapter = new BookAdapter(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        rcvBook.setLayoutManager(gridLayoutManager);
        mBookAdapter.setData(getListBook());
        rcvBook.setAdapter(mBookAdapter);
    }
    private List<Book> getListBook(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(R.drawable.sach1, "sach1"));
        list.add(new Book(R.drawable.sach2, "sach2"));
        list.add(new Book(R.drawable.sach3, "sach3"));
        list.add(new Book(R.drawable.sach4, "sach4"));

        list.add(new Book(R.drawable.sach5, "sach1"));
        list.add(new Book(R.drawable.sach6, "sach2"));
        list.add(new Book(R.drawable.sach7, "sach3"));
        list.add(new Book(R.drawable.sach1, "sach4"));

        list.add(new Book(R.drawable.sach1, "sach1"));
        list.add(new Book(R.drawable.sach3, "sach2"));
        list.add(new Book(R.drawable.sach6, "sach3"));
        list.add(new Book(R.drawable.sach2, "sach4"));
        return list;
    }
}