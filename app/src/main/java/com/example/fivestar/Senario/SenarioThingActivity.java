package com.example.fivestar.Senario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.Constant.Senario;
import com.example.fivestar.R;

public class SenarioThingActivity extends AppCompatActivity {
    private Senario senario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senario_thing);

        senario = Constant.getSenarios(Integer.valueOf(getIntent().getStringExtra("position")));
    }
}