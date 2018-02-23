package com.example.pc.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> adapter = null;
    ListView lv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = ArrayAdapter.createFromResource(this, R.array.weather, android.R.layout.simple_list_item_checked);

        lv = (ListView) findViewById(R.id.lv_01);
        lv.setAdapter(adapter);

//		lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);//리스트를 선택을 여러개 가능하다
        lv.setDivider(new ColorDrawable(Color.GREEN));//선택을 하면 초록색으로 체크표시
        lv.setDividerHeight(3);
    }
}
