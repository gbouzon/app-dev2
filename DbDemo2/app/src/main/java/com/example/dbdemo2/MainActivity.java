package com.example.dbdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        db.addArtists("Michael Jackson");
        db.addArtists("Evanescence");
        db.addArtists(" Ed Sheeran");
        Toast.makeText(getApplicationContext(), "Data inserted successfully",
                Toast.LENGTH_SHORT).show();
    }
}