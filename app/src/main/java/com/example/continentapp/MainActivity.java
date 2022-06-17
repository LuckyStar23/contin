package com.example.continentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Continent> continents;
    private ContinentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        loadData();
        adapter = new ContinentAdapter(continents);
        recyclerView.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        continents = new ArrayList<>();
        continents.add(new Continent("Eurasia","s"));
        continents.add(new Continent("Australia","s"));
        continents.add(new Continent("South America","s"));
        continents.add(new Continent("North America","s"));
        continents.add(new Continent("Antarctica","s"));
        continents.add(new Continent("Africa","s"));
    }
}