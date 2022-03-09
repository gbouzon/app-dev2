package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button viewBtn, testBtn;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        viewBtn = findViewById(R.id.plantViewBtn);
        testBtn = findViewById(R.id.button2);
        fm = getSupportFragmentManager();

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.fragmentContainerView3, new ViewPlantFragment()).commit();
            }
        });

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.fragmentContainerView3, new ViewCounterFragment()).commit();
            }
        });
    }
}