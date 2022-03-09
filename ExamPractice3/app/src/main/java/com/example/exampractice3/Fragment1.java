package com.example.exampractice3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {

    EditText text;
    Button submitBtn;
    Communicator communicator;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        text = getActivity().findViewById(R.id.editText);
        submitBtn = getActivity().findViewById(R.id.sendBtn);
        communicator = (Communicator) getActivity();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainActivity2.class);
                intent.putExtra("msg", text.getText().toString());
                startActivity(intent);
                //communicator.sendData(text.getText().toString());
            }
        });
    }
}