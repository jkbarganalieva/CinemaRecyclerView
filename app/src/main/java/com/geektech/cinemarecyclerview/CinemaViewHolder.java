package com.geektech.cinemarecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CinemaViewHolder extends RecyclerView.ViewHolder {

    ImageView cinemaImageView;
    TextView cinemaTitleTextView;
    TextView cinemaDescTextView;

    public CinemaViewHolder(@NonNull View itemView) {
        super(itemView);
        cinemaImageView=itemView.findViewById(R.id.iv_cinema);
       cinemaTitleTextView=itemView.findViewById(R.id.tv_cinema_title);
        cinemaDescTextView=itemView.findViewById(R.id.tv_cinema_desc);

    }

    public void bind(int image, String title, String desc){
        cinemaImageView.setImageResource(image);
        cinemaTitleTextView.setText(title);
        cinemaDescTextView.setText(desc);

    }
}
