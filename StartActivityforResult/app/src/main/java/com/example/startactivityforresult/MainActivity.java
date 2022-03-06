package com.example.startactivityforresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultText;
    EditText numberOne, numberTwo;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.textView);
        numberOne = findViewById(R.id.editTextTextPersonName);
        numberTwo = findViewById(R.id.editTextTextPersonName3);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(numberOne.getText().toString());
                int number2 = Integer.parseInt(numberTwo.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("number1",number1);
                intent.putExtra("number2",number2);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1) {
            if (resultCode == RESULT_OK) {

                int result = data.getIntExtra("result", 0);
                resultText.setText(" " + result);

            }

        }
    }
}