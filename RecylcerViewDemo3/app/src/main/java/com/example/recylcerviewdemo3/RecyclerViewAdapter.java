package com.example.recylcerviewdemo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    ArrayList<String> imageNames = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();
    Context mContext;
    LayoutInflater minflator;

    public RecyclerViewAdapter(ArrayList<String> imageNames, ArrayList<String> images, Context mContext) {
        this.imageNames = imageNames;
        this.images = images;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = minflator.from(parent.getContext()).inflate(R.layout.child_row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(images.get(position))
                .into(holder.image);
        holder.ImageName.setText(imageNames.get(position));

    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView ImageName;
        LinearLayout parent;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            image = itemView.findViewById(R.id.image2);
            ImageName = itemView.findViewById(R.id.textView2);
         //   parent = itemView.findViewById(R.id.parentId);
        }
    }
}
