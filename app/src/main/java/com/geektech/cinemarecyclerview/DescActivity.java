package com.geektech.cinemarecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {
TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        textView=findViewById(R.id.tv_cinema_info);

        Intent intent= getIntent();
        textView.setText(intent.getStringExtra("desc"));
    }
}