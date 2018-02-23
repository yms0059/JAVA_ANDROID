package com.example.pc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList=null;
    ArrayAdapter<String> adapter=null;
    ListView lv=null;
   // ArrayAdapter<CharSequence> arrayAdapter = null;
   // ListView listView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<String>();//arrayList를 생성
        arrayList.add("월");
        arrayList.add("화");
        arrayList.add("수");
        arrayList.add("목");
        arrayList.add("금");
        arrayList.add("토");
        arrayList.add("일");

        //values->data-><string-array name="weather">-><item>월 : 맑음</item>
        //arrayAdapter = ArrayAdapter.createFromResource(this, R.array.weather, android.R.layout.simple_list_item_1);

        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        //ArrayAdapter를 생성하고 MainActivity의 context와 arrayList정보를 넣는다
        lv=(ListView)findViewById(R.id.lv_01);//xml에 id lv_01를 찾아 사용
        lv.setAdapter(adapter);//adapter정보를 보낸다.
    }
}
