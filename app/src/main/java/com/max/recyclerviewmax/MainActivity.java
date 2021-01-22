package com.max.recyclerviewmax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
private final LinkedList<String> mWorldList= new LinkedList<>();
private RecyclerView mRecyclerView;
private WordListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<20;i++)
        {
            mWorldList.addLast("Word " + i);
        }

        mRecyclerView=findViewById(R.id.recyclerview);
        mAdapter=new WordListAdapter(this,mWorldList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}