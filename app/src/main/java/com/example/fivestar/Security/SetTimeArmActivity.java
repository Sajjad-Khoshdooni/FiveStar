package com.example.fivestar.Security;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fivestar.R;

public class SetTimeArmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time_arm);

        if (getIntent().getStringExtra("type").equals("arm")){
            arm();
        }else {
            disarm();
        }
    }

    private void arm() {
    }

    private void disarm() {
    }
}