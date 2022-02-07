package com.example.muhammed_yaseen_ezyness_technologies_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList rowname=new ArrayList<>(Arrays.asList("Main Category2","Main Category3","Main Category4","Main Category5"));

    ArrayList userimage=new ArrayList<>(Arrays.asList(R.drawable.user2,R.drawable.user4,R.drawable.user6,R.drawable.user2,R.drawable.user4,R.drawable.user6,R.drawable.user4,R.drawable.user6,R.drawable.user2));

    ArrayList categoryname=new ArrayList<>(Arrays.asList("Sub Category","Sub Category","Sub Category","Sub Category","Sub Category","Sub Category"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerViewCategory);

        RecyclerView recyclerView2=findViewById(R.id.recyclerviewstories);

        RecyclerView recyclerView3=findViewById(R.id.recyclerviewshopbycategory);

        //category
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,rowname);
        recyclerView.setAdapter(customAdapter);

        //stories

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        CustomAdapter2 customAdapter2=new CustomAdapter2(MainActivity.this,userimage);
        recyclerView2.setAdapter(customAdapter2);

        //shopbycategory

        LinearLayoutManager linearLayoutManager3=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        CustomAdapter3 customAdapter3=new CustomAdapter3(MainActivity.this,categoryname);
        recyclerView3.setAdapter(customAdapter3);




    }
}