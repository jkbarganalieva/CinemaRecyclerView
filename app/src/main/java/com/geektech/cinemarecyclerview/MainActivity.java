package com.geektech.cinemarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.AbstractList;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView cinemaRecyclerView;
    private ArrayList<CinemaModel> cinemaList = new ArrayList<>();
    private CinemaAdapter cinemaAdapter = new CinemaAdapter(cinemaList, this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cinemaRecyclerView = findViewById(R.id.rv_cinema);

        cinemaRecyclerView.setAdapter(cinemaAdapter);

        loadCinema();
    }

    private void loadCinema() {
        cinemaList.add(new CinemaModel(R.drawable.img_avatar, "Аватар 2. Путь воды", "После принятия образа аватара солдат Джейк Салли становится предводителем народа на`ви и берет на себя миссию по защите новых друзей от корыстных бизнесменов с Земли."));
        cinemaList.add(new CinemaModel(R.drawable.img_black_pantera, "Чурная пантера", "С первого взгляда можно решить, что Ваканда — обычная территория дикой Африки, но это не так. Здесь, в недрах пустынных земель, скрываются залежи уникального металла, способного поглощать вибрацию."));
        cinemaList.add(new CinemaModel(R.drawable.img_cat, "Кот в сапогах", "Самый уьный кот"));
        cinemaList.add(new CinemaModel(R.drawable.img_matilda, "Матильда", "Самостоятельная девочка."));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич", "Просто сказка"));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич2", "Просто сказка"));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич3", "Просто сказка"));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич4", "Просто сказка"));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич5", "Просто сказка"));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич6", "Просто сказка"));
        cinemaList.add(new CinemaModel(R.drawable.im_ivan, "Ива Царевич7", "Просто сказка"));
    }

    @Override
    public void onItemClick(CinemaModel cinemaModel) {
        Intent intent=new Intent(MainActivity.this,DescActivity.class);
        intent.putExtra( "desc",cinemaModel.desc);
        startActivity(intent);
    }
}