package com.example.fragmentdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.fragmentContainerView) != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            BlankFragment fragment1 = new BlankFragment();
            fragmentTransaction.add(R.id.fragmentContainerView, fragment1, null);
            fragmentTransaction.commit();

        }
    }
}