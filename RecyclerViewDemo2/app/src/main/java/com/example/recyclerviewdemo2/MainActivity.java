package com.example.recyclerviewdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private  MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_View);
        mAdapter = new MovieAdapter(movieList);
//        RecyclerView.LayoutManager layoutManager =
//                new LinearLayoutManager(getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road",
                "Action and Adventure", "2015");
        movieList.add(movie);
         movie = new Movie("Inside out",
                "Animation and Kids", "2015");
        movieList.add(movie);
        movie = new Movie("Inside out",
                "Animation and Kids", "2015");
        movieList.add(movie);
        movie = new Movie("Inside out",
                "Animation and Kids", "2015");
        movieList.add(movie);
        movie = new Movie("Avatar",
                "Animation and Kids", "2009");
        movieList.add(movie);
        movie = new Movie("Avatar2",
                "Animation and Kids", "2022");
        movieList.add(movie);
        movie = new Movie("Avatar3",
                "Animation and Kids", "2024");
        movieList.add(movie);
        movie = new Movie("Avatar4",
                "Animation and Kids", "2026");
        movieList.add(movie);movie = new Movie("Inside out",
                "Animation and Kids", "2015");
        movieList.add(movie);
        movie = new Movie("Inside out",
                "Animation and Kids", "2015");
        movieList.add(movie);
        mAdapter.notifyDataSetChanged();


    }
}