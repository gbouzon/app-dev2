package com.example.week5part1testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChange = (Button) findViewById(R.id.btnChange);
        EditText editTextToChange = (EditText) findViewById(R.id.editTextToChange);
        TextView textViewChangedText = (TextView) findViewById(R.id.textViewChangedText);

        btnChange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textViewChangedText.setText(editTextToChange.getText());
            }
        });

    }
}