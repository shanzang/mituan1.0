package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

import java.util.ArrayList;

public class AddressChoiceActivity extends AppCompatActivity{
    private String cityData[] = {"安庆市","安康市","安阳市","安顺市","澳门特别行政区"};
    private ListView listView;
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);


        Window win = getWindow();
        StatusBarUtil.transparent(win);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_choice_address);

        listView = this.findViewById(R.id.address_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.layout_choice_address_item,R.id.address_text,cityData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView)view.findViewById(R.id.address_text);
                String text = textView.getText().toString();
                Toast.makeText(getApplicationContext(),"更改成功",Toast.LENGTH_SHORT).show();
            }
        });



    }

}
