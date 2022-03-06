package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView displayText;

    Button add, subtract;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int number1 = intent.getIntExtra("number1",0);
        int number2 = intent.getIntExtra("number2",0);
        displayText = findViewById(R.id.textView2);
        add = findViewById(R.id.button2);
        subtract = findViewById(R.id.button3);
        displayText.setText("Numbers : " + number1 + " , " + number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = number1 + number2;
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);
                setResult(RESULT_OK, resultIntent);
                finish();

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = number1 - number2;
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}