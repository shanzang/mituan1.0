package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class SearchShopActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout back;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_searchshop);

        back = this.findViewById(R.id.searchshop_back);
        back.setOnClickListener(this);
        back.setTag(1);

        Window win = getWindow();
        StatusBarUtil.transparent(win);
        this.getSupportActionBar().hide();
    }

    @Override
    public void onClick(View v) {
        int tag = (int)v.getTag();
        switch(tag){
            case 1:
                this.finish();
        }
    }
}
