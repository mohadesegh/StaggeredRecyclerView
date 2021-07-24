package com.example.recyclerviewstaggered;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // creating recyclerviewadapter object
    RecyclerViewAdapter recyclerViewAdapter;

    // creating arrayList
    ArrayList<Integer> ImageList;

    // creating recycler view object
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // adding values to arrayList
        ImageList = new ArrayList<>(Arrays.asList(
                R.drawable.ten, R.drawable.two,
                R.drawable.three, R.drawable.four,
                R.drawable.five, R.drawable.six,
                R.drawable.seven, R.drawable.eight,
                R.drawable.nine )
        );

        recyclerView = findViewById(R.id.recyclerv_view);

        // setting recyclerView layoutManager
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(this, ImageList);

        // setting recycle view adapter
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}

