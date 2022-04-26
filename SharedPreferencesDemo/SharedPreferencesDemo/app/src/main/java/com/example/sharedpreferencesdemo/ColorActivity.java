package com.example.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        SharedPreferences sharedPreferences =
                this.getSharedPreferences("MY_APP_PREFERENCES",
                        Context.MODE_PRIVATE);
        String favColor = sharedPreferences.getString("FAVCOLOR", "unKnown");
        TextView txt =  findViewById(R.id.textView2);
        txt.setText("My Fav Color " + favColor);

    }
}