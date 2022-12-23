package com.geektech.cinemarecyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CinemaAdapter extends RecyclerView.Adapter<CinemaViewHolder> {

    private ArrayList<CinemaModel> cinemaList;
    private ItemClickListener clickListener;
    public CinemaAdapter(ArrayList<CinemaModel> cinemaList, MainActivity mainActivity){
        this.cinemaList=cinemaList;
        this.clickListener=clickListener;
    }

    @NonNull
    @Override
    public CinemaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CinemaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cinema,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CinemaViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.bind(cinemaList.get(position).image,cinemaList.get(position).title,cinemaList.get(position).desc);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            clickListener.onItemClick(cinemaList.get(position));
        }
    });
    }

    @Override
    public int getItemCount() {
        return cinemaList.size();
    }
}
