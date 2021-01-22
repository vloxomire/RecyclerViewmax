package com.max.recyclerviewmax;

import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>{

    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context,LinkedList<String> wordList)
    {
        mInflater=LayoutInflater.from(context);
        this.mWordList=wordList;
    }
    @NonNull
    @NotNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View mItemView= mInflater.inflate(R.layout.worldlist_item,parent,false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent=mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    //VIEWHOLDER
    class WordViewHolder extends RecyclerView.ViewHolder
    {
        //Variables
        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        //Constructor llama al padre
        public WordViewHolder(View itemView,WordListAdapter adapter)
        {
            super(itemView);
            wordItemView=itemView.findViewById(R.id.word);
            this.mAdapter=adapter;
        }

    }
}
