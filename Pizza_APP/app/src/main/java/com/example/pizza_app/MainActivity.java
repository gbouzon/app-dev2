package com.example.pizza_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button incrementPizza,decrementPizza,btnOrder;
    TextView count;
    EditText cost;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementPizza = findViewById(R.id.inr);
        decrementPizza = findViewById(R.id.dec);
        btnOrder = findViewById(R.id.placeorder);
        count = findViewById(R.id.countvalue);
        cost = findViewById(R.id.pizzacost);

        incrementPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = i + 1;
                count.setText(i + " Number of pizzas order");
                cost.setText(i * 20 + " CADs  you owned");

            }
        });

        decrementPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i <= 0)
                    i = 0;
                else
                i = i - 1;
                count.setText(i + " Number of Pizzas order");
                cost.setText(i * 20 + " CADs you owned");
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(MainActivity.this, cost.getText(), Toast.LENGTH_SHORT).show();
              // Intent is to connect the activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String message= cost.getText().toString();
                //putextra is the method that pass data between activities
                intent.putExtra("key",message);
                startActivity(intent);

            }
        });


    }
}