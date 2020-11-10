package com.example.fivestar.Senario;

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
import com.example.fivestar.ifThen.IfThenActivity;
import com.example.fivestar.Log.LogActivity;
import com.example.fivestar.MainActivity;
import com.example.fivestar.R;
import com.example.fivestar.Drawer.SettingPanelActivity;
import com.example.fivestar.Drawer.SimCardOption;

public class SenarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senario);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        initializeRecycler();
    }

    private void initializeRecycler() {
        RecyclerView recyclerView = findViewById(R.id.senario_recycler);
        RecyclerAdapter myAdapter = new RecyclerAdapter(getApplicationContext(), Constant.getSenarios());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

    }

    public void homeIntent(View view) {
        Intent my = new Intent(SenarioActivity.this, MainActivity.class);
        startActivity(my);
        finish();
    }

    public void ifthenIntent(View view) {
        Intent my = new Intent(SenarioActivity.this, IfThenActivity.class);
        startActivity(my);
        finish();
    }

    public void addSenario(View view) {
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.drawer_account:
                Intent my = new Intent(SenarioActivity.this, AccountManageActivity.class);
                startActivity(my);
                break;
            case R.id.drawer_sim_card:
                Intent mys = new Intent(SenarioActivity.this, SimCardOption.class);
                startActivity(mys);
                break;
            case R.id.drawer_add_device_group:
                Intent mya = new Intent(SenarioActivity.this, AddActivity.class);
                startActivity(mya);
                break;
            case R.id.drawer_panel_setting:
                Intent mym = new Intent(SenarioActivity.this, SettingPanelActivity.class);
                startActivity(mym);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logIntent(View view) {
        Intent my = new Intent(SenarioActivity.this, LogActivity.class);
        startActivity(my);
    }
}