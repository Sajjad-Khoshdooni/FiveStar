package com.example.fivestar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.fivestar.ADDSection.AddActivity;
import com.example.fivestar.Account.AccountManageActivity;
import com.example.fivestar.Constant.Constant;
import com.example.fivestar.Drawer.SettingPanelActivity;
import com.example.fivestar.Drawer.SimCardOption;
import com.example.fivestar.Log.LogActivity;
import com.example.fivestar.Security.PasswordActivity;
import com.example.fivestar.Senario.SenarioActivity;
import com.example.fivestar.ifThen.IfThenActivity;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initialize();
    }
    private void initialize(){
        recyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        MainActivityRecyclerAdapter adapter = new MainActivityRecyclerAdapter(MainActivity.this, Constant.getDevices());
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager ml = new GridLayoutManager(this,4);
        recyclerView.setLayoutManager(ml);
    }

    public void ifThenIntent(View view) {
        Intent myIntent = new Intent(MainActivity.this, IfThenActivity.class);
        MainActivity.this.startActivity(myIntent);
        MainActivity.this.finish();
    }

    public void senarioIntent(View view) {
        Intent myIntent = new Intent(MainActivity.this, SenarioActivity.class);
        MainActivity.this.startActivity(myIntent);
        MainActivity.this.finish();
    }

    public void cameraIntent(View view) {
        /**
         * Outer switch
         */
    }

    public void securityIntent(View view) {
        Intent my = new Intent(MainActivity.this, PasswordActivity.class);
        my.putExtra("code","1");
        startActivity(my);
    }

    public void musicIntent(View view) {
        Intent intent = new Intent(Intent.CATEGORY_APP_MUSIC);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.drawer_account:
                Intent my = new Intent(MainActivity.this, AccountManageActivity.class);
                startActivity(my);
                break;
            case R.id.drawer_sim_card:
                Intent mys = new Intent(MainActivity.this, SimCardOption.class);
                startActivity(mys);
                break;
            case R.id.drawer_add_device_group:
                Intent mya = new Intent(MainActivity.this, AddActivity.class);
                startActivity(mya);
                break;
            case R.id.drawer_panel_setting:
                Intent mym = new Intent(MainActivity.this, SettingPanelActivity.class);
                startActivity(mym);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logIntent(View view) {
        Intent my = new Intent(MainActivity.this, LogActivity.class);
        startActivity(my);
    }
}