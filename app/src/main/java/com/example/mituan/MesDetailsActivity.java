package com.example.mituan;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mituan.Util.RadiusUtil;
import com.example.mituan.Util.StatusBarUtil;

public class MesDetailsActivity extends AppCompatActivity {
    private LinearLayout parent;
    private LinearLayout mdetails_back;
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //获取window，并将其传给StatusBarUtil工具类中的transparent方法
        Window win;
        win = getWindow();
        StatusBarUtil.transparent(win);

        setContentView(R.layout.activity_mdetails);
        mdetails_back = this.findViewById(R.id.mdetails_back);
        mdetails_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RadiusUtil radiusUtil = new RadiusUtil();
        radiusUtil.setRadius(R.drawable.touxiang,R.id.mdetails_img1,this,1000);
        radiusUtil.setRadius(R.drawable.gg,R.id.mdetails_img2,this,1000);

    }
}
