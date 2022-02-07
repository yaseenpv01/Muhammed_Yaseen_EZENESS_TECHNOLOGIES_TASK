package com.example.muhammed_yaseen_ezyness_technologies_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.MyViewHolder2> {

    ArrayList userImage;
    Context context;

    public CustomAdapter2(MainActivity mainActivity, ArrayList userimage) {
        this.context=mainActivity;
        this.userImage=userimage;

    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout2,parent,false);
        CustomAdapter2.MyViewHolder2 vh=new CustomAdapter2.MyViewHolder2(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        holder.imageView.setImageResource((Integer) userImage.get(position));

    }

    @Override
    public int getItemCount() {
        return userImage.size();
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {

        ImageView imageView;
        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.userimageview);
        }
    }
}
