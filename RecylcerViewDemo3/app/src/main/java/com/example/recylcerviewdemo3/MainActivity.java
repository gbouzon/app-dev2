package com.example.recylcerviewdemo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mnames = new ArrayList<>();
    ArrayList<String> mImageURls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_View);
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        mImageURls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mnames.add("Horse");
        RecyclerViewAdapter adapter = new
                RecyclerViewAdapter(mnames, mImageURls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}