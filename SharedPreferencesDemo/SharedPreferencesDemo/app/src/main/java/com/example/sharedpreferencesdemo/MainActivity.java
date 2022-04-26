package com.example.sharedpreferencesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        String savFood = sharedPreferences.getString("FAVFOOD","unknown");
        txt = findViewById(R.id.textView);
        txt.setText("My Fav Food is : " + savFood);
    }

    public void setfood(View view) {
        String favfood = "Thali";
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("FAVFOOD", favfood);
        editor.commit();

    }

    public void SetColor(View view) {
        SharedPreferences sharedPreferences =
                this.getSharedPreferences("MY_APP_PREFERENCES", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("FAVCOLOR","Orange");
        editor.apply();
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);

    }
}