package com.example.week3part1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notify("onCreate");
    }

    @Override
    protected void onPause(){
        super.onPause();
        notify("onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        notify("onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        notify("onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        notify("onDestroy");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        notify("onRestoreInstanceState");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        notify("onSaveInstanceState");

    }

    private void notify(String methodName) {
        Toast.makeText(this, methodName, Toast.LENGTH_LONG).show();
    }

}