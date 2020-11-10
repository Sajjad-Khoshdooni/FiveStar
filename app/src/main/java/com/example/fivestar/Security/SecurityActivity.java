package com.example.fivestar.Security;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.R;

public class SecurityActivity extends AppCompatActivity {
    Button arm,disarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        initialize();
    }

    private void initialize() {
        arm = findViewById(R.id.armbtn);
        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constant.sendMessage("SSA#",getApplicationContext());
            }
        });

        disarm = findViewById(R.id.disarmbtn);
        disarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constant.sendMessage("SDA#",getApplicationContext());
            }
        });
    }

    public void armTime(View view) {
        Intent my = new Intent(SecurityActivity.this, SetTimeArmActivity.class);
        my.putExtra("type","arm");
        startActivity(my);
    }

    public void disarmTime(View view) {
        Intent my = new Intent(SecurityActivity.this, SetTimeArmActivity.class);
        my.putExtra("type","disarm");
        startActivity(my);
    }

    public void sendCode(View view) {
        switch (view.getId()){
            case R.id.armbtn:
//                Constant.sendMessage();
                return;
            case R.id.disarmbtn:
//                Constant.sendMessage();
                return;
            case R.id.gasvalvebtn:
//                Constant.sendMessage();
                return;
            case R.id.waterbtn:
//                Constant.sendMessage();
                return;
        }
    }
}