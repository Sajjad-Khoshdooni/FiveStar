package com.example.fivestar.Drawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.MQTT.MQTT;
import com.example.fivestar.R;

public class SimCardOption extends AppCompatActivity {
    private TextView anten;
    private EditText charge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_card_option);

        anten = findViewById(R.id.anten_power);
        charge = findViewById(R.id.charge_code);
        MQTT.getInstance().subscribe(Constant.getMainAccount().getIMEI() + "/Ant1");
    }

    public void recharge(View view) {
        if (charge.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Charge code is Empty!!!",Toast.LENGTH_SHORT).show();
            charge.requestFocus();
            return;
        }
        Constant.sendMessage(charge.getText().toString(),getApplicationContext());
    }

    public void balance(View view) {
//        Constant.sendMessage();
    }
}