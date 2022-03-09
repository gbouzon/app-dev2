package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

interface Communicator {

    void respond(int i);

}

public class FragmentAct extends AppCompatActivity implements Communicator {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        fm = getSupportFragmentManager();
    }

    @Override
    public void respond(int i) {
        ViewCounterFragment frag2 = (ViewCounterFragment) fm.findFragmentById(R.id.fragmentContainerView2);
        frag2.changeData(i);
    }
}