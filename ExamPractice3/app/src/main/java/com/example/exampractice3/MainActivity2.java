package com.example.exampractice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements Communicator {

    FragmentManager fm;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fm = getSupportFragmentManager();
        Intent intent = getIntent();
        text = intent.getStringExtra("msg");
    }

    @Override
    public void sendData(String s) {}

    @Override
    public void sendData() {
        Fragment2 frag = (Fragment2) fm.findFragmentById(R.id.fragmentContainerView2);
        Bundle bundle = new Bundle();
        bundle.putString("msg", text);
        frag.setArguments(bundle);
        frag.changeData();

    }
}