package com.example.basketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        display = findViewById(R.id.editTextTextPersonName5);
        Intent i = getIntent();
        String msg = i.getStringExtra("Key");
        display.setText(msg);
    }
}