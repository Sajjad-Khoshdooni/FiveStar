package com.example.fivestar.ADDSection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fivestar.Constant.Constant;
import com.example.fivestar.Constant.Device;
import com.example.fivestar.R;

import java.util.ArrayList;
import java.util.List;

public class IconRecycler extends RecyclerView.Adapter<IconRecycler.ViewHolder> {
    private List<Integer> devices;
    private Boolean isOn = false;
    public IconRecycler(){
        isOn = Constant.isOn();
        try {
            devices = Constant.getImages();
        } catch (Exception e) {
            devices = new ArrayList();
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IconRecycler.ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.icon_recycler_style, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int device = devices.get(position);
        holder.imageView.setImageResource(device);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOn){
                    Constant.setImageOnIcon(device);
                }else {
                    Constant.setImageOffIcon(device);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.icon_image);
        }
    }
}
