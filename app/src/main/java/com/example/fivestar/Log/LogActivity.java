package com.example.fivestar.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.R;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        initiale();
    }

    private void initiale() {
        RecyclerView recyclerView = findViewById(R.id.log_recycler);
        LogAdapter adapter = new LogAdapter(Constant.getLogs());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void clearLog(View view) {
        Constant.clearLog();
        initiale();
    }
}