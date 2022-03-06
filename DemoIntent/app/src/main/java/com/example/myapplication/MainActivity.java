package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt, txtdisplay;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.editTextTextPersonName);
        btn = findViewById(R.id.button);
        txtdisplay = findViewById(R.id.editTextTextPersonName2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   txt.setText("Welcome to Android");
                String msg = txt.getText().toString();
           //     txtdisplay.setText("Hello " + msg);
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("key",msg);
                startActivity(i);
            }
        });

    }
}