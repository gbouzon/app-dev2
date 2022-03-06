package com.example.fabdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    TextView addtext, searchText, storeText;
    boolean isAllFabvisible;

    FloatingActionButton mainFab, addFab, searchFab, storeFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addtext = findViewById(R.id.textView3);
        searchText = findViewById(R.id.textView2);
        storeText = findViewById(R.id.textView);
        mainFab = findViewById(R.id.floatingActionButton);
        storeFab = findViewById(R.id.floatingActionButton2);
        searchFab = findViewById(R.id.floatingActionButton3);
        addFab = findViewById(R.id.floatingActionButton4);
        isAllFabvisible = false;

        mainFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isAllFabvisible) {
                    searchFab.show();
                    storeFab.show();
                    addFab.show();
                    addtext.setVisibility(View.VISIBLE);
                    searchText.setVisibility(View.VISIBLE);
                    storeText.setVisibility(View.VISIBLE);
                    isAllFabvisible = true;
                } else {
                    searchFab.hide();
                    storeFab.hide();
                    addFab.hide();
                    addtext.setVisibility(View.GONE);
                    searchText.setVisibility(View.GONE);
                    storeText.setVisibility(View.GONE);
                    isAllFabvisible = false;

                }
            }
        });

        addFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Click something to add", Toast.LENGTH_LONG).show();
            }
        });


    }
}