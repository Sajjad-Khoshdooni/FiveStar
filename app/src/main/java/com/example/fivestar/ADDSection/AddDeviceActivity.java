package com.example.fivestar.ADDSection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.R;

public class AddDeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_device);

        RecyclerView recyclerView = findViewById(R.id.add_device_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AddDeviceAdapter adapter = new AddDeviceAdapter(AddDeviceActivity.this, Constant.getDevices());
        recyclerView.setAdapter(adapter);

    }

    public void addDevices(View view) {
        Intent my = new Intent(AddDeviceActivity.this, EditDeviceActivity.class);
        my.putExtra("edit","0");
        startActivity(my);
    }
}