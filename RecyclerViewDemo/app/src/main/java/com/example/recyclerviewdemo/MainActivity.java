package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> countryname = new ArrayList<>();
        countryname.add("Laos");
        countryname.add("Combodie");
        countryname.add("Vietnam");
        countryname.add("Bangladesh");
        countryname.add("SriLanka");
        countryname.add("Iledemaurice");
        countryname.add("Laos");
        countryname.add("Combodie");
        countryname.add("Vietnam");
        countryname.add("Bangladesh");
        countryname.add("SriLanka");
        countryname.add("Iledemaurice");

        //set up the recyclerview

        RecyclerView recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(this, countryname);
        recyclerView.setAdapter(adapter);


    }
}