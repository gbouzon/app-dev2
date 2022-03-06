package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn, btn2;
    TextView txt;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this is the method used to call the designed view over the base view
        // which is found on my resource subfolder layout by file name activity_main.xml
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.loginbtn);
        image = findViewById(R.id.imageView3);
        btn2 = findViewById(R.id.pwdbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "this is my first app toast", Toast.LENGTH_LONG).show();
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "this is Lion", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent is the class to connect different/multiple activity
                // first parameter is the source class/activity and second is my destination activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                //once created the intent, start the activity which is an intent object
                startActivity(intent);
            }
        });

    }


}