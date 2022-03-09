package com.example.exampractice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String s) {
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        intent.putExtra("msg", s);
        startActivity(intent);
    }

    @Override
    public void sendData() {

    }
}