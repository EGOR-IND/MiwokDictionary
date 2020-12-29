package com.example.miwokdictionary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class phrasesAdapter extends RecyclerView.Adapter<phrasesAdapter.MyViewHolder> {
    private ArrayList<phrases> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        TextView text2;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.text = (TextView) itemView.findViewById(R.id.text);
            this.text2 = (TextView) itemView.findViewById(R.id.text2);
        }
    }

    public phrasesAdapter(ArrayList<phrases> dataSet){
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public phrasesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_model_phrases, parent, false);

        phrasesAdapter.MyViewHolder myViewHolder = new phrasesAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final phrasesAdapter.MyViewHolder holder, final int position) {
        TextView text = holder.text;
        TextView text2 = holder.text2;

        text.setText(dataSet.get(position).getWord());
        text2.setText(dataSet.get(position).getMeaning());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
