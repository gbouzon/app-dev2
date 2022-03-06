package com.example.radiobtndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogenderGroup;
    RadioButton radiobtn;
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogenderGroup = findViewById(R.id.gender);
        btnDisplay = findViewById(R.id.button);
        chooseGender();
    }

    private void chooseGender() {
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectId = radiogenderGroup.getCheckedRadioButtonId();
                radiobtn = (RadioButton) findViewById(selectId);
                Toast.makeText(MainActivity.this,
                        radiobtn.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}