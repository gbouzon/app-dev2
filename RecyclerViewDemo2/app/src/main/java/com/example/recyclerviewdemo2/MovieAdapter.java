package com.example.recyclerviewdemo2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_child_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      Movie movie = moviesList.get(position);
      holder.title.setText(movie.getTitle());
      holder.genre.setText(movie.getGenre());
      holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, year, genre;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.textView);
            genre = (TextView) itemView.findViewById(R.id.textView2);
            year = (TextView) itemView.findViewById(R.id.textView3);

        }
    }

    public MovieAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }
}
