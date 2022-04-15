package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.StatusBarUtil;

public class WantPlayActivity extends AppCompatActivity {
    private RelativeLayout wantplay_back;
    public void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        //获取window，并将其传给StatusBarUtil工具类中的transparent方法
        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_wantplay);

        wantplay_back = this.findViewById(R.id.wantplay_back);
        wantplay_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
