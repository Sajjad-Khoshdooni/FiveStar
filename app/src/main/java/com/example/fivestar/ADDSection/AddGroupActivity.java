package com.example.fivestar.ADDSection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fivestar.R;

public class AddGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group);
    }

    public void newGroup(View view) {
        Intent my = new Intent(AddGroupActivity.this,EditGroupActivity.class);
        my.putExtra("type","0");
        startActivity(my);
    }
}