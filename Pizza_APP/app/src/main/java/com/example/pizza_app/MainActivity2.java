package com.example.pizza_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView msgfromMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msgfromMain = findViewById(R.id.textView);

        //get the intent that started this activity and extract the string
        Intent intent = getIntent();
        //getStringextra gets the data from the sending activity with the key associated
        String message = intent.getStringExtra("key");
        msgfromMain.setText(message);
    }
}