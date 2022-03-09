package com.example.exampractice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

interface Communicator {

    public void sendData(int i);
}

public class MainActivity extends AppCompatActivity implements Communicator {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
    }

    @Override
    public void sendData(int i) {
        Fragment2 frag2 = (Fragment2) fm.findFragmentById(R.id.fragmentContainerView2);
        frag2.changeData(i);
    }
}