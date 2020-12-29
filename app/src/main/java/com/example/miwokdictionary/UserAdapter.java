package com.example.miwokdictionary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    private ArrayList<User> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        TextView text2;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.text = (TextView) itemView.findViewById(R.id.text);
            this.text2 = (TextView) itemView.findViewById(R.id.text2);
            this.image = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    public UserAdapter(ArrayList<User> dataSet){
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_model, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        TextView text = holder.text;
        TextView text2 = holder.text2;
        ImageView image = holder.image;

        text.setText(dataSet.get(position).getWord());
        text2.setText(dataSet.get(position).getMeaning());
        image.setImageResource(dataSet.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
