package com.example.basketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    TextView txt1,txt2;
    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        txt1 = findViewById(R.id.editTextTextPersonName3);
        txt2 = findViewById(R.id.editTextTextPersonName4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = scoreA + 3;
                txt1.setText(scoreA + "");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB = scoreB + 3;
                txt2.setText(scoreB + "");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = scoreA + 2;
                txt1.setText(scoreA + "");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB = scoreB + 2;
                txt2.setText(scoreB + "");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = scoreA + 1;
                txt1.setText(scoreA + "");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB = scoreB + 1;
                txt2.setText(scoreB + "");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(scoreA > scoreB)
                    Toast.makeText(getApplicationContext(),"Team A won",Toast.LENGTH_LONG).show();
                else if(scoreB > scoreA)
                    Toast.makeText(getApplicationContext(),"Team B won",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Drawn",Toast.LENGTH_LONG).show();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                scoreB = 0;
                txt1.setText(String.valueOf(scoreA));
                txt2.setText(scoreB + "");
            }
        });

    }
}