package com.example.test2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CounterFragment extends Fragment {

    private static int counter;
    Button incrementBtn, decrementBtn;
    Communicator communicator;

    public CounterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        counter = 0;
        incrementBtn = getActivity().findViewById(R.id.incrementBtn);
        decrementBtn = getActivity().findViewById(R.id.decrementBtn);
        communicator = (Communicator) getActivity();

        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                communicator.respond(counter);
            }
        });

        decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                communicator.respond(counter);
            }
        });
    }
}