package com.example.muhammed_yaseen_ezyness_technologies_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter3 extends RecyclerView.Adapter<CustomAdapter3.MyViewHolder3>{

    ArrayList catgname;
    Context context;

    public CustomAdapter3(MainActivity mainActivity, ArrayList categoryname) {
        this.catgname=categoryname;
        this.context=mainActivity;

    }


    @NonNull
    @Override
    public CustomAdapter3.MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout3,parent,false);
        CustomAdapter3.MyViewHolder3 vh=new CustomAdapter3.MyViewHolder3(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter3.MyViewHolder3 holder, int position) {

        holder.cname.setText((CharSequence) catgname.get(position));

    }

    @Override
    public int getItemCount() {
        return catgname.size();
    }

    public class MyViewHolder3 extends RecyclerView.ViewHolder {

        TextView cname;
        public MyViewHolder3(@NonNull View itemView) {
            super(itemView);

            cname=itemView.findViewById(R.id.textviewrowshopbycategory);
        }
    }
}
