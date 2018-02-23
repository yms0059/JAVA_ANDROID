package com.example.pc.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.content.*;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;

/**
 * Created by pc on 2018-02-23.
 */

public class WeatherAdapter extends BaseAdapter {  //Weather는 BaseAdapter를 상속받는다.

    private Context mContext=null;
    private int layout =0;
    private ArrayList<Weather>data=null;
    private LayoutInflater inflater =null;
    /*Inflate 는 사전적 의미로 "부풀리다" 라는 뜻입니다.
안드로이드에서 inflate 를 사용하면 xml 에 씌여져 있는 view 의 정의를 실제 view 객체로 만드는 역할을 합니다.
마치 건물의 설계도( xml 정의 )를 쭉~ 그려놓고 inflate ( 부풀리다 ) 하면 펑~ 하고 실제 건물 ( view ) 가 완성된다는 데서 inflate 라는 단어를 사용한 것 같습니다.*/

    public WeatherAdapter(Context c, int l, ArrayList<Weather> d) {
        this.mContext = c;
        this.layout = l;
        this.data = d;
        this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getDay();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
        }

        TextView tv_day = (TextView) convertView.findViewById(R.id.tv_day);
        ImageView iv_icon = (ImageView) convertView.findViewById(R.id.iv_weather);
        TextView tv_comment = (TextView) convertView.findViewById(R.id.tv_comment);
        Button bt_select = (Button) convertView.findViewById(R.id.bt_select);

        tv_day.setText(data.get(position).getDay() + " | ");
        iv_icon.setImageResource(data.get(position).getIcon());
        tv_comment.setText(data.get(position).getComment());

        if((position%2) == 1) {
            convertView.setBackgroundColor(0x5000ff00);
        } else {
            convertView.setBackgroundColor(0x2000ff00);
        }

        return convertView;
    }
}

