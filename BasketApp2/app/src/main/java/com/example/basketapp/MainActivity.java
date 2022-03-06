package com.example.basketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button teamAscore3, teamBscore3, teamAscore2, teamBscore2;
    Button teamAscore1, teamBscore1, btnresult, btnreset;
    TextView scoreTeamA, scoreTeamB;
    int scoreA =0;
    int scoreB =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAscore3 = findViewById(R.id.button);
        teamBscore3 = findViewById(R.id.button2);
        teamAscore2 = findViewById(R.id.button3);
        teamBscore2 = findViewById(R.id.button4);
        teamAscore1 = findViewById(R.id.button5);
        teamBscore1 = findViewById(R.id.button6);
        btnresult = findViewById(R.id.button7);
        btnreset = findViewById(R.id.button8);
        scoreTeamA = findViewById(R.id.editTextTextPersonName3);
        scoreTeamB = findViewById(R.id.editTextTextPersonName4);

        teamAscore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA +=3;
                scoreTeamA.setText(String.valueOf(scoreA));

            }
        });

        teamBscore3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB +=3;
                scoreTeamB.setText(String.valueOf(scoreB));

            }
        });

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
            if(scoreA > scoreB)
                msg = "Team A Won";
            else if (scoreB > scoreA)
                msg = "Team B won";
               else
                   msg = "Match Drawn";
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Key",msg);
                startActivity(i);
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                scoreB = 0;
                scoreTeamA.setText(String.valueOf(scoreA));
                scoreTeamB.setText(String.valueOf(scoreB));

            }
        });
    }
}