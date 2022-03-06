package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView txt;
    String[] festivals = {"Diwali","Pongal",
            "New Year","Happy Valentine's day",
            "St Patrick's day ", "Ramadan","Scream 4", "Diwali","Pongal",
            "New Year","Happy Valentine's day",
            "St Patrick's day ", "Ramadan","Scream 4","Diwali","Pongal",
            "New Year","Happy Valentine's day",
            "St Patrick's day ", "Ramadan","Scream 4", "Diwali","Pongal",
            "New Year","Happy Valentine's day",
            "St Patrick's day ", "Ramadan","Scream 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listviewcontainer);
        txt = findViewById(R.id.textView);

        //call the arrayadapter to connect the data to the UIComponents
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                R.layout.list_view, R.id.textView, festivals);
        lv.setAdapter(arrayAdapter);

//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//               String value = "Happy " + arrayAdapter.getItem(i);
//                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
//            }
//        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });



    }
}