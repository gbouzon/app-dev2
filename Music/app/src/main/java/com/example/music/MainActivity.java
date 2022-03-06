package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button btn, btnSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });

        btnSnackBar = findViewById(R.id.button4);
        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snack =
                        Snackbar.make(v," Hello world", Snackbar.LENGTH_INDEFINITE);
                        snack.setAction("Close", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                snack.dismiss();
                            }
                        }).setActionTextColor(getResources().getColor(android.R.color.holo_orange_dark)).show();



            }
        });
    }

    public void Play(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.sample1);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
            }
        });
        mediaPlayer.start();
    }

    public void Pause(View view) {
        mediaPlayer.pause();
    }



//    public void stop(View view) {
//        mediaPlayer.stop();
//    }
}