package com.example.fragmentintercommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment2 f2 = (BlankFragment2) fm.findFragmentById(R.id.fragmentContainerView2);
        //this is the method that takes the action with the data , for ex, where to display the data
        f2.changeData(data);

    }

    @Override
    public void respond2(String data) {
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment  f1 = (BlankFragment) fm.findFragmentById(R.id.fragmentContainerView);
        f1.changeData2(data);

    }
}