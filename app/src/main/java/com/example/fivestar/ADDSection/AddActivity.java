package com.example.fivestar.ADDSection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fivestar.R;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void addDevice(View view) {
        Intent my = new Intent(AddActivity.this, AddDeviceActivity.class);
        startActivity(my);
    }

    public void addGroup(View view) {
        Intent my = new Intent(AddActivity.this, AddGroupActivity.class);
        startActivity(my);
    }
}