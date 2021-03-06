package com.example.fivestar.ADDSection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.Constant.Device;
import com.example.fivestar.Constant.Group;
import com.example.fivestar.R;

public class EditGroupActivity extends AppCompatActivity {
    private EditText name;
    private boolean edit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_group);

        name = findViewById(R.id.group_name);
        RecyclerView recyclerView = findViewById(R.id.edit_group_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if (getIntent().getStringExtra("type").equals("0")) {
            EditGroupAdapter adapter = new EditGroupAdapter();
            recyclerView.setAdapter(adapter);
        }else {
            EditGroupAdapter adapter = new EditGroupAdapter(Constant.getGroup(Integer.valueOf(getIntent().getStringExtra("position"))));
            recyclerView.setAdapter(adapter);
            name.setText(Constant.getGroup(Integer.valueOf(getIntent().getStringExtra("position"))).getName());
            edit = true;
        }
    }

    public void save(View view) {
        if (name.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Name Section is Empty!!!",Toast.LENGTH_SHORT).show();
            name.requestFocus();
            return;
        }else {
            if (Constant.getGroupDeice().size() == 0){
                Toast.makeText(getApplicationContext(),"Choose some devices",Toast.LENGTH_LONG).show();
                return;
            }else if (edit){
                Constant.changeGroup(Constant.getGroup(Integer.valueOf(getIntent().getStringExtra("position"))),
                        new Group(name.getText().toString(),Constant.getGroupDeice()));
                return;
            }
            else {
                Constant.addGroup(new Group(name.getText().toString(), Constant.getGroupDeice()));
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Constant.clearGroupDevice();
    }
}