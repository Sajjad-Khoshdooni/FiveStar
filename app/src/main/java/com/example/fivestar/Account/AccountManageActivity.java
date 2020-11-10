package com.example.fivestar.Account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.R;

public class AccountManageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_manage);

        RecyclerView recyclerView = findViewById(R.id.account_activity_recycler);
        AccountAdapter adapter = new AccountAdapter(AccountManageActivity.this, Constant.getAccounts());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void addAccount(View view) {
        Intent my = new Intent(AccountManageActivity.this, EditAccountActivity.class);
        my.putExtra("edit","0");
        startActivity(my);
    }
}