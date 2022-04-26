package com.example.week9part1animations;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean bartIsShowing = true;

    public void fade(View view) {
        Log.i("Info", "Imageview tapped");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

//        if(bartIsShowing) {
//            bartIsShowing = false;
//            bartImageView.animate().alpha(0).setDuration(2000);
//            homerImageView.animate().alpha(1).setDuration(2000);
//        } else {
//            bartIsShowing = true;
//            bartImageView.animate().alpha(1).setDuration(2000);
//            homerImageView.animate().alpha(0).setDuration(2000);
//        }

        // bartImageView.animate().translationYBy(1000).setDuration(2000);
        // bartImageView.animate().translationXBy(-1000).setDuration(2000);
        // bartImageView.animate().rotation(180).setDuration(2000);
        // bartImageView.animate().rotation(1800).alpha(0).setDuration(2000);
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        // bartImageView.animate().translationXBy(-1000);

        bartImageView.setX(-1000);
        bartImageView.animate().translationXBy(1000).rotation(1800).setDuration(2000);
    }
}