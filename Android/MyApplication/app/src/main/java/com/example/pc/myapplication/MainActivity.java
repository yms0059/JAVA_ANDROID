package com.example.pc.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;//체크박스를 위한 import
import java.util.ArrayList;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    private SeekBar sb = null;
    private Button progressBtn = null;
    private Button resetBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = (SeekBar) findViewById(R.id.sb_01);
        progressBtn = (Button) findViewById(R.id.bt_01);
        resetBtn = (Button) findViewById(R.id.bt_02);

        progressBtn.setOnClickListener(clickListener);
        resetBtn.setOnClickListener(clickListener);

    }

    OnClickListener clickListener = new OnClickListener() {  //클릭할때 발생해준다.

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            switch (v.getId()) {
                case R.id.bt_01:
                    Toast.makeText(MainActivity.this, "Progress", Toast.LENGTH_SHORT).show();
                    sb.incrementProgressBy(10);
                    sb.incrementSecondaryProgressBy(10);
                    break;

                case R.id.bt_02:
                    Toast.makeText(MainActivity.this, "Reset", Toast.LENGTH_SHORT).show();
                    sb.setProgress(0);
                    sb.setSecondaryProgress(100);
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //옵션을 생성
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {//옵션에서 선택한 것을 리턴해준다
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

