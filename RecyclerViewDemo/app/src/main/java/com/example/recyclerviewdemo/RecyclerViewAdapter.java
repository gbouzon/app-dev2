package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<String> mdata;
    private LayoutInflater minflator;// class that converts XML to java object

    private AdapterView.OnItemSelectedListener mclickListener;

    public RecyclerViewAdapter(Context context, List<String> mdata) {
        this.minflator = LayoutInflater.from(context);
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = minflator.inflate(R.layout.recyclerview_child, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String text = mdata.get(position);
        holder.myText.setText(text);

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView myText;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myText = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
