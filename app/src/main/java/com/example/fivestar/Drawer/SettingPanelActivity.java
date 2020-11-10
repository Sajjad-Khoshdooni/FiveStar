package com.example.fivestar.Drawer;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fivestar.BlueTooth.BluetoothTestActivity;
import com.example.fivestar.Constant.Constant;
import com.example.fivestar.R;
import com.example.fivestar.Security.SetPasswordActivity;

public class SettingPanelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_panel);
    }

    public void backup(View view) {
        Constant.backup();
        Toast.makeText(getApplicationContext(),"Successfully Backup",Toast.LENGTH_SHORT).show();
    }

    public void restore(View view) {
        Constant.restore();
        Toast.makeText(getApplicationContext(),"Successfully Restore",Toast.LENGTH_SHORT).show();
    }

    public void changePassword(View view) {
        Intent my = new Intent(SettingPanelActivity.this, SetPasswordActivity.class);
        my.putExtra("code","0");
        startActivity(my);
    }

    public void connection(View view) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(getApplicationContext());
        builder1.setMessage("Connection Type");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Internet",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
//                        Intent my = new Intent(SettingPanelActivity.this,Internet.class);
//                        startActivity(my);
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "Bluetooth",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent my = new Intent(SettingPanelActivity.this, BluetoothTestActivity.class);
                        startActivity(my);
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
