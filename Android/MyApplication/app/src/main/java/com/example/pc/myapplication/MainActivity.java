package com.example.pc.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Weather>data =null;
    private WeatherAdapter adapter=null;
    private ListView lv=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data=new ArrayList<Weather>();
        data.add(new Weather("월",R.drawable.w_icon_01,"맑음"));
        data.add(new Weather("화", R.drawable.w_icon_02, "흐림"));
        data.add(new Weather("수", R.drawable.w_icon_03, "흐림/비"));
        data.add(new Weather("목", R.drawable.w_icon_04, "비"));
        data.add(new Weather("금", R.drawable.w_icon_02, "흐림"));
        data.add(new Weather("토", R.drawable.w_icon_01, "맑음"));
        data.add(new Weather("일", R.drawable.w_icon_03, "흐림/비"));

        adapter=new WeatherAdapter(MainActivity.this,R.layout.custom_layout,data);
        //WeatherAdapter(사용자가 만든 어댑터)에 MainActivity의 Context와 리스트뷰를 뿌릴 cusotm_layout경로 와 data(날짜,이미지아이콘,날씨)설정
        lv=(ListView)findViewById(R.id.lv_weather);
        lv.setAdapter(adapter);
    }
}
