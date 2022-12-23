package com.geektech.cinemarecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        textView=findViewById(R.id.tv_book_info);

        Intent intent=new Intent();
        textView.setText(intent.getStringExtra("desc"));
    }
}