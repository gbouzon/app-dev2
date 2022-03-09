package com.example.test2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Array;
import java.util.ArrayList;

public class ViewPlantFragment extends Fragment {

    ArrayList<String> plantNames = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();

    public ViewPlantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_plant, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerView = getActivity().findViewById(R.id.recyclerView);

        images.add("@drawable/plant1");
        plantNames.add("Plant 1");
        images.add("@drawable/plant2");
        plantNames.add("Plant 2");
        images.add("@drawable/plant3");
        plantNames.add("Plant 3");
        images.add("@drawable/plant4");
        plantNames.add("Plant 4");
        images.add("@drawable/plant5");
        plantNames.add("Plant 5");

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(plantNames, images, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }
}