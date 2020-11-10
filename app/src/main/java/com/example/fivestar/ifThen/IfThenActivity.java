package com.example.fivestar.ifThen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.fivestar.ADDSection.AddActivity;
import com.example.fivestar.Account.AccountManageActivity;
import com.example.fivestar.Constant.Constant;
import com.example.fivestar.Log.LogActivity;
import com.example.fivestar.MainActivity;
import com.example.fivestar.R;
import com.example.fivestar.Senario.SenarioActivity;
import com.example.fivestar.Drawer.SettingPanelActivity;
import com.example.fivestar.Drawer.SimCardOption;

public class IfThenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_then);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initialize();
    }

    private void initialize() {
        RecyclerView recyclerView = findViewById(R.id.if_then_recycler);
        IfThenAdapter adapter = new IfThenAdapter(Constant.getIfThens());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void homeIntent(View view) {
        Intent my = new Intent(IfThenActivity.this, MainActivity.class);
        startActivity(my);
        finish();
    }

    public void senarioIntent(View view) {
        Intent my = new Intent(IfThenActivity.this, SenarioActivity.class);
        startActivity(my);
        finish();
    }

    public void addIfThen(View view) {
        /**
         * Do something
         */
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.drawer_account:
                Intent my = new Intent(IfThenActivity.this, AccountManageActivity.class);
                startActivity(my);
                break;
            case R.id.drawer_sim_card:
                Intent mys = new Intent(IfThenActivity.this, SimCardOption.class);
                startActivity(mys);
                break;
            case R.id.drawer_add_device_group:
                Intent mya = new Intent(IfThenActivity.this, AddActivity.class);
                startActivity(mya);
                break;
            case R.id.drawer_panel_setting:
                Intent mym = new Intent(IfThenActivity.this, SettingPanelActivity.class);
                startActivity(mym);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logIntent(View view) {
        Intent my = new Intent(IfThenActivity.this, LogActivity.class);
        startActivity(my);
    }
}