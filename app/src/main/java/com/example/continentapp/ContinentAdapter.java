package com.example.continentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {


    ArrayList<Continent> continents;

    public ContinentAdapter(ArrayList<Continent> continents) {
        this.continents = continents;

    }


    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
    holder.bind(continents.get(position));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    class ContinentViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.country_view);
        imageView = itemView.findViewById(R.id.imageView);
    }
    public void bind(Continent continent){
        textView.setText(continent.getName());

    }
}

}
