package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class SearchFriendActivity extends AppCompatActivity {
    private RelativeLayout searchfriend_back;
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //获取window，并将其传给StatusBarUtil工具类中的transparent方法
        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);
        this.getSupportActionBar().hide();

        setContentView(R.layout.activity_searchfriend);

        searchfriend_back = this.findViewById(R.id.searchfriend_back);
        searchfriend_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.searchfriend_img1,this,1000);
    }
}
