package com.example.myandroidfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // call the Button class and create an instance btn
    Button btn, btnconnect;
    ImageView imgLion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // btn object is linked to xml button view by findviewbyID
        btn = findViewById(R.id.login);
        imgLion = findViewById(R.id.lion);
        btnconnect = findViewById(R.id.ConnecttoNew);


        // to make the object onclicklistener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Password", Toast.LENGTH_SHORT).show();
            }
        });

     imgLion.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Toast.makeText(MainActivity.this,
                     "Lion", Toast.LENGTH_SHORT).show();
         }
     });

     btnconnect.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             //Class Intent is the one to communicate between activities
             // takes 2 parameters source and destination and connect the activity

             Intent i = new Intent(MainActivity.this, MainActivity2.class);
             startActivity(i);

         }
     });

    }

    //    public void toastMessage(View view) {
//        Toast.makeText(MainActivity.this,
//                "Welcome user",Toast.LENGTH_SHORT).show();
//
//
//    }

//    public void pwd(View view) {
//        Toast.makeText(MainActivity.this,
//                "Enter the pwd",Toast.LENGTH_SHORT).show();
//    }
}