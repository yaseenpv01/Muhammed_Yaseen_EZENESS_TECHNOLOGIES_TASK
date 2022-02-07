package com.example.muhammed_yaseen_ezyness_technologies_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList rowName;
    Context context;

    public CustomAdapter(MainActivity mainActivity, ArrayList rowname) {
        this.context=mainActivity;
        this.rowName=rowname;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        MyViewHolder vh=new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText((CharSequence) rowName.get(position));

    }

    @Override
    public int getItemCount() {
        return rowName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.textviewrow);
        }
    }
}
