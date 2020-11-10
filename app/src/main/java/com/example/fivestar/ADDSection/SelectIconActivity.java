package com.example.fivestar.ADDSection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fivestar.R;

public class SelectIconActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_icon);
        RecyclerView recyclerView = findViewById(R.id.icon_recycler);
        recyclerView.setAdapter(new IconRecycler());
        RecyclerView.LayoutManager ml = new GridLayoutManager(this,4);
        recyclerView.setLayoutManager(ml);
    }
}