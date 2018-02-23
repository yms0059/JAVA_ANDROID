package com.example.pc.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;//체크박스를 위한 import
import java.util.ArrayList;

public class MainActivity extends Activity {

    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.ch_01);
        cb2 = (CheckBox) findViewById(R.id.ch_02);
        cb3 = (CheckBox) findViewById(R.id.ch_03);
        cb4 = (CheckBox) findViewById(R.id.ch_04);

        cb1.setOnCheckedChangeListener(checkedChangeListener); //아이템을 클릭(터치) 할때 생기는 이벤트
        cb2.setOnCheckedChangeListener(checkedChangeListener);
        cb3.setOnCheckedChangeListener(checkedChangeListener);
        cb4.setOnCheckedChangeListener(checkedChangeListener);
    }

    OnCheckedChangeListener checkedChangeListener = new OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            // TODO Auto-generated method stub
            switch (buttonView.getId()) {
                case R.id.ch_01://들어온 값이 ch_01이라면
                    //밑에 토스트창을 띄어준다
                    Toast.makeText(MainActivity.this, buttonView.getText() + ", " + isChecked, Toast.LENGTH_SHORT).show();
                    break;

                case R.id.ch_02:
                    Toast.makeText(MainActivity.this, buttonView.getText() + ", " + isChecked, Toast.LENGTH_SHORT).show();
                    break;

                case R.id.ch_03:
                    Toast.makeText(MainActivity.this, buttonView.getText() + ", " + isChecked, Toast.LENGTH_SHORT).show();
                    break;

                case R.id.ch_04:
                    Toast.makeText(MainActivity.this, buttonView.getText() + ", " + isChecked, Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

}

